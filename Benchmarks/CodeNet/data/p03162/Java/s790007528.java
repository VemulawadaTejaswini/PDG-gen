/*
[ ( ^ _ ^ ) ]
*/

import java.io.*;
import java.util.*;


public class Main {
    int INF = (int)1e9;
    long MOD = 1000000007;

    long abs(long x) {
        return Math.abs(x);
    }

    long max(long ... x) {
        long rs = x[0];
        for(long y: x) rs = Math.max(rs, y);
        return rs;
    }

    void solve(InputReader in, PrintWriter out) throws IOException {
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = in.nextInt();
            b[i] = in.nextInt();
            c[i] = in.nextInt();
        }
        long[][] dp = new long[n][3];
        dp[0][0] = a[0];
        dp[0][1] = b[0];
        dp[0][2] = c[0];
        for(int i=1; i<n; i++) {
            dp[i][0] = a[i] + max(dp[i-1][1], dp[i-1][2]);
            dp[i][1] = b[i] + max(dp[i-1][0], dp[i-1][2]);
            dp[i][2] = c[i] + max(dp[i-1][0], dp[i-1][1]);
        }
        out.println(max(dp[n-1]));
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