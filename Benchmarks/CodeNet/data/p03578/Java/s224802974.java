package com.wkodate.atcoder.code_festival_2017_qualb.b;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] d = new long[n];
        Map<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            d[i] = sc.nextLong();
            map.put(d[i], map.getOrDefault(d[i], 0) + 1);
        }
        int m = sc.nextInt();
        long[] t = new long[m];
        for (int i = 0; i < m; i++) {
            t[i] = sc.nextLong();
            if (!map.containsKey(t[i]) || map.get(t[i]) <= 0) {
                System.out.println("NO");
                return;
            }
            map.put(t[i], map.get(t[i]) - 1);
        }
        System.out.println("YES");
    }

}
