//package main;

import java.io.*;
import java.util.*;
import java.math.*;

public final class Main {
    BufferedReader br;
    StringTokenizer stk;
    
    public static void main(String[] args) throws Exception {
        new Main().run();
    }
    
    {
        stk = null;
        br = new BufferedReader(new InputStreamReader(System.in));
    }
    
    long mod = 998244353;
    StringBuilder res = new StringBuilder(1000005);
    void run() throws Exception {
        int n = ni();
        long[] a = new long[n];
        long ans = 0;
        for(int i = 0; i < n; i++) {
            a[i] = nl();
        }
        for(int i = 1; i < n; i++) {
            long diff = a[i] - a[i - 1];
            if(diff < 0) {
                ans += -diff;
                a[i] += -diff;
            }
        }
        System.out.println(ans);
    }
    
    //Reader & Writer
    String nextToken() throws Exception {
        if (stk == null || !stk.hasMoreTokens())
            stk = new StringTokenizer(br.readLine(), " ");
        return stk.nextToken();
    }

    String nt() throws Exception {
        return nextToken();
    }

    int ni() throws Exception {
        return Integer.parseInt(nextToken());
    }

    long nl() throws Exception {
        return Long.parseLong(nextToken());
    }
    
    double nd() throws Exception {
        return Double.parseDouble(nextToken());
    }
    
    //Some Misc methods
    int get(int l, int r, int[] a) {
        return l == 0 ? a[r] : a[r] - a[l - 1];
    }
    
    void shuffle(long[] a) {
        Random r = new Random();
        for(int i = 0; i < a.length; i++) {
            int idx = r.nextInt(a.length);
            long temp = a[i];
            a[i] = a[idx];
            a[idx] = temp;
        }
    }
    
    void reverse(int[] a) {
        for(int i = 0, j = a.length - 1; i < j; i++, j--) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }
}