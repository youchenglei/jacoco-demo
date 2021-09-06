package com.ycl.jacocodemo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author youchenglei
 * @date 2021/9/6
 */
@RestController
public class CountController {

    @PostMapping(value = "/test1")
    @ResponseBody
    public boolean caseCount(@RequestBody Map<String, Integer> params) {
        if (params.get("count") > 0) {
            return true;
        } else {
            return false;
        }
    }

    @PostMapping(value = "/test2")
    @ResponseBody
    public boolean caseCount1(@RequestBody Map<String, Integer> params) {
        if (params.get("count") > 0) {
            return true;
        } else {
            return false;
        }
    }
}