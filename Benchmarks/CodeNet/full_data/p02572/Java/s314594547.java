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
            res += (i * sum) % mod;
            res %= mod;
        }

        pw.println(res);
        
        pw.close();
    }
    

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}