/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.cbn;

import java.util.HashMap;

public class Endpoint {
    public static HashMap<String, String> endpointMap = new HashMap<String, String>() {
        {
            put("cn-shenzhen", "cbn.aliyuncs.com");
            put("cn-beijing", "cbn.aliyuncs.com");
            put("ap-south-1", "cbn.aliyuncs.com");
            put("eu-west-1", "cbn.aliyuncs.com");
            put("ap-northeast-1", "cbn.aliyuncs.com");
            put("me-east-1", "cbn.aliyuncs.com");
            put("cn-chengdu", "cbn.aliyuncs.com");
            put("cn-qingdao", "cbn.aliyuncs.com");
            put("cn-shanghai", "cbn.aliyuncs.com");
            put("cn-hongkong", "cbn.aliyuncs.com");
            put("ap-southeast-1", "cbn.aliyuncs.com");
            put("ap-southeast-2", "cbn.aliyuncs.com");
            put("ap-southeast-3", "cbn.aliyuncs.com");
            put("eu-central-1", "cbn.aliyuncs.com");
            put("cn-huhehaote", "cbn.aliyuncs.com");
            put("ap-southeast-5", "cbn.aliyuncs.com");
            put("us-east-1", "cbn.aliyuncs.com");
            put("cn-zhangjiakou", "cbn.aliyuncs.com");
            put("us-west-1", "cbn.aliyuncs.com");
            put("cn-hangzhou", "cbn.aliyuncs.com");
        }
    };

    public static String endpointRegionalType = "regional";
}
