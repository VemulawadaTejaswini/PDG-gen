/*
[ ( ^ _ ^ ) ]
*/

import java.io.*;
import java.util.*;


public class Main {
    int INF = (int)1e9;
    long MOD = 1000000007;

    long max(long...x) {long rs = x[0]; for(long y: x) rs = Math.max(rs, y); return rs;}
    long min(long...x) {long rs = x[0]; for(long y: x) rs = Math.min(rs, y); return rs;}
    


    void solve(InputReader in, PrintWriter out) throws IOException {
        int n = in.nextInt();
        long[] a = new long[n];
        long[] p = new long[n];
        for(int i=0; i<n; i++) {
            a[i] = in.nextInt();
            if(i==0) p[i] = a[i];
            else p[i] = a[i] + p[i-1];
        }
        long[][] dp = new long[n][n];
        for(int i=n-2; i>=0; i--) {
            for(int j=i+1; j<n; j++) {
                dp[i][j] = Long.MAX_VALUE;
                for(int k=i; k<j; k++) {
                    // show("cut", i, k, j, dp[i][k], dp[k][j], p[j]-(i>0?p[i-1]:0));
                    dp[i][j] = min(dp[i][j], dp[i][k] + dp[k+1][j] + p[j]-(i>0?p[i-1]:0));
                }
            }
        }
        // for(long[] x: dp) show("", x);
        out.println(dp[0][n-1]);
    }
    

    public static void main(String[] args) throws IOException {
        if(args.length>0 && args[0].equalsIgnoreCase("d")) {
            DEBUG_FLAG = true;
        }
        InputReader in = new InputReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = 1;//in.nextInt();
        long start = System.nanoTime();
        while(t-- >0) {
            new Main().solve(in, out);
        }
        long end = System.nanoTime();
        debug("\nTime: " + (end-start)/1e6 + " \n\n");
        out.close();
    }
    
    static boolean DEBUG_FLAG = false;
    static void debug(String s) {
        if(DEBUG_FLAG) System.out.print(s);
    }
    
    public static void show(Object... o) {
        System.out.println(Arrays.deepToString(o));
    }
    
    static class InputReader {
        static BufferedReader br;
        static StringTokenizer st;
    
        public InputReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        
        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        
        int nextInt() {
            return Integer.parseInt(next());
        }
        
        long nextLong() {
            return Long.parseLong(next());
        }
        
        double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}