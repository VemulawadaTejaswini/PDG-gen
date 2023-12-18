/*
[ ( ^ _ ^ ) ]
*/

// problem: atc/dp_o

import java.io.*;
import java.util.*;


public class Main {
    int INF = (int)1e9;
    long MOD = 1000000007;

    long[][] dp;
    boolean[][] vis;

    long go(int[][] a, int n, int i, int m) {
        if(i==n) {
            return 1;
        }
        if(dp[m][i]!=-1) return dp[m][i];
        long rs = 0;
        for(int j=0; j<n; j++) {
            int x = (1<<j);
            if(a[i][j]==1 && (m&x)==0) {
                m = m ^ x;
                rs += go(a, n, i+1, m);
                rs %= MOD;
                m = m ^ x;
            }
        }
        // vis[m][i] = true;
        return dp[m][i] = rs;
    }

    void solve(InputReader in, PrintWriter out) throws IOException {
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                a[i][j] = in.nextInt();
            }
        }
        dp = new long[1<<n][n];
        // vis = new boolean[1<<n][n];
        for(int i=0; i<(1<<n); i++) {
            Arrays.fill(dp[i], -1);
        }
        long rs = go(a, n, 0, 0);
        out.println(rs);
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