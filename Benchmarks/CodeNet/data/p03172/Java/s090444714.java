/*
[ ( ^ _ ^ ) ]
*/

// problem: atc/dp_m

import java.io.*;
import java.util.*;


public class Main {
    int INF = (int)1e9;
    long MOD = 1000000007;


    void solve(InputReader in, PrintWriter out) throws IOException {
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n+1];
        for(int i=1; i<=n; i++) {
            a[i] = in.nextInt();
        }
        if(k==0) {
            out.println(1);
            return;
        }
        long[][] dp = new long[n+1][k+1];
        dp[0][0] = 1;
        long[][] p = new long[2][k+1];
        for(int i=0; i<=k; i++) {
            p[0][i] = 1;
        }
        // show("", dp[0], p[0]);
        for(int i=1; i<=n; i++) {
            for(int j=0; j<=k; j++) {
                int l = (i+1)%2;
                int x = Math.min(j, a[i]);
                dp[i][j] = p[l][j] - (j-x-1>=0 ? p[l][j-x-1] : 0);
                dp[i][j] = (dp[i][j]%MOD + MOD) %MOD;
                p[i%2][j] = (dp[i][j] + (j-1>=0?p[i%2][j-1]:0))%MOD;
            }
            // show("", dp[i], p[i%2]);
        }
        long rs = dp[n][k];
        out.println(rs%MOD);
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