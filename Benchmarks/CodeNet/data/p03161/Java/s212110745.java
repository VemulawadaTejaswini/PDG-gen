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

    void solve(InputReader in, PrintWriter out) throws IOException {
        int n = in.nextInt();
        int k = in.nextInt();
        long[] h = new long[n];
        long[] dp = new long[n];
        for(int i=0; i<n; i++) {
            h[i] = in.nextInt();
        }
        Arrays.fill(dp, INF);
        dp[0] = 0;
        for(int i=0; i<n; i++) {
            for(int j=1; j<=k; j++) {
                if(i+j<n) {
                    dp[i+j] = Math.min(dp[i+j], dp[i] + abs(h[i] - h[i+j]));
                    // show("ij", i, j, dp[i+j]);
                } else break;
            }
        }
        out.println(dp[n-1]);
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