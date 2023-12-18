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

    int max(int ... x) {
        int rs = x[0];
        for(int y: x) rs = Math.max(rs, y);
        return rs;
    }


    void solve(InputReader in, PrintWriter out) throws IOException {
        char[] s = in.next().trim().toCharArray();
        char[] t = in.next().trim().toCharArray();
        int n = s.length;
        int m = t.length;

        int[][] dp = new int[n+1][m+1];
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=m; j++) {
                dp[i][j] = max(dp[i-1][j], dp[i][j-1]);
                if(s[i-1]==t[j-1]) {
                    dp[i][j] = max(dp[i][j], dp[i-1][j-1]+1);
                }
            }
        }
        char[] a = new char[n+m+10];
        int p = 0;
        int i = n, j = m;
        while(i>0 && j>0) {
            if(s[i-1]==t[j-1] && dp[i][j]==dp[i-1][j-1]+1) {
                a[p++] = s[i-1];
                i--;
                j--;
            } else {
                if(dp[i][j]==dp[i-1][j]) i--;
                else j--;
            }
        }
        for(i=p-1; i>=0; i--) {
            out.print(a[i]);
        }
        out.println();
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