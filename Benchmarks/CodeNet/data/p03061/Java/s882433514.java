package main.atcoder;

import fastIO.InputReader;

import java.io.PrintWriter;
import java.util.*;

public class CGCDOnBlackboard {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int[] arr = new int[n];
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int min = Integer.MAX_VALUE;
        if (n == 2) {
            out.println(Math.max(arr[0], arr[1]));
            return;
        }
        int val = 0;
        int val2 = 0;
        int res2 = Integer.MAX_VALUE;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list1.add(arr[i]);
            list2.add(arr[i]);
        }

        for (int i = 0; i < n - 1; i++) {
            int gcd = GCD(arr[i], arr[i + 1]);
            if (gcd < min) {
                val = arr[i];
                val2 = arr[i + 1];
                min = gcd;
            }
        }
        list1.remove(Integer.valueOf(val));
        list2.remove(Integer.valueOf(val2));
        for (Integer value : list2) {
            int gcd = GCD(value, val);
            res = Math.min(res, gcd);
        }
        for (Integer integer : list1) {
            int gcd = GCD(integer, val2);
            res2 = Math.min(res2, gcd);

        }
        out.println(Math.max(res, res2));
    }

    private int GCD(int a, int b) {
        return b == 0 ? a : GCD(b, a % b);
    }

}
