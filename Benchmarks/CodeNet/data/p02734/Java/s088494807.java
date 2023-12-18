/*
[ ( ^ _ ^ ) ]
*/

import java.io.*;
import java.util.*;


public class Main {
    int INF = (int)1e9;
    long MOD = 1000000007;


    void solve(InputReader in, PrintWriter out) throws IOException {
        int n = in.nextInt();
        int s = in.nextInt();
        int[] a = new int[n+1];
        for(int i=1; i<=n; i++) {
            a[i] = in.nextInt();
        }
        int[][] dp = new int[n+1][s+1];
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=s; j++) {
                if(a[i]==j) {
                    dp[i][j] = i;
                }
                // else {
                    // dp[i][j] += (j-a[i]>0)?dp[j-a[i]]:0;
                    if(j-a[i]>0) for(int k=1; k<i; k++) {
                        dp[i][j] += dp[k][j-a[i]];
                    }
                // }
            }
            // show("i", i, dp);
        }
        int rs = 0;
        for(int i=1; i<=n; i++) {
            rs += dp[i][s] * (n - i + 1);
        }
        out.println(rs);
    }
    

    public static void main(String[] args) throws IOException {
        InputReader in = new InputReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = 1;//in.nextInt();
        while(t-- >0) {
            new Main().solve(in, out);
        }
        out.close();
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