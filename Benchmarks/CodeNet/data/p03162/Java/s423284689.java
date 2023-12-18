//package solution;

import java.io.*;
import java.util.*;
import java.math.*;
import java.awt.Point;

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
    
    void run() throws Exception {
        int n = ni();
        long[][] dp = new long[n][3];
        for(int i=0; i<n; i++)
            for(int j=0; j<3; j++)
                dp[i][j] = nl();
        if(n == 1) {
            pl(Math.max(dp[0][0], Math.max(dp[0][1], dp[0][2])));
            return;
        }
        for(int i=1; i<n; i++) {
            dp[i][0] += Math.max(dp[i-1][1], dp[i-1][2]);
            dp[i][1] += Math.max(dp[i-1][0], dp[i-1][2]);
            dp[i][2] += Math.max(dp[i-1][0], dp[i-1][1]);
        }
        pl(Math.max(dp[n-1][0], Math.max(dp[n-1][1], dp[n-1][2])));
    }
    
    //Reader & Writer
    String nextToken() throws Exception {
        if (stk == null || !stk.hasMoreTokens()) {
            stk = new StringTokenizer(br.readLine(), " ");
        }
        return stk.nextToken();
    }

    String nt() throws Exception {
        return nextToken();
    }

    String ns() throws Exception {
        return br.readLine();
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

    void p(Object o) {
        System.out.print(o);
    }

    void pl(Object o) {
        System.out.println(o);
    }
    
    void selector() {
        Random rd = new Random();
        String[] s = new String[] {"Strings", "Sorting", "Search"
                , "Graph theory", "Greedy", "Dynamic programming"
                , "Constructive algos", "Bit manipulation", "Recursion"};
        pl(s[rd.nextInt(s.length)] + " " + (rd.nextInt(5)+1));
    }
}