//Created by Aminul on 8/29/2020.

import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int mod = (int) 1e9 + 7;
        int n = in.nextInt();
        int[] arr = new int[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            sum += arr[i];
            sum %= mod;
        }

        long res = 0;
        for (int i : arr) {
            sum -= i;
            sum = (sum + mod) % mod;
            res += (i * sum) % mod;
            res %= mod;
        }

        pw.println(res);


        pw.close();
    }

    static long burte(int n, int[] arr) {
        int mod = (int) 1e9 + 7;
        long res = 0;
        for (int i = 0; i < n; i++) {
            long tmp = 0;
            for(int j = i + 1; j < n; j++) {
                tmp += (arr[i] * 1l * arr[j]) % mod;
                tmp %= mod;
            }
            res = (res + tmp) % mod;
            debug(i, tmp, res);
        }
        return res;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}