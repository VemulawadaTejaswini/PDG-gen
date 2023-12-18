/*
[ ( ^ _ ^ ) ]
*/

// problem: atc/dp_s

import java.io.*;
import java.util.*;


public class Main {
    int INF = (int)1e9;
    long MOD = 1000000007;


    void solve(InputReader in, PrintWriter out) throws IOException {
        String s = in.next().trim();
        int n = s.length();
        int[] k = new int[n+1];
        for(int i=1; i<=n; i++) {
            k[i] = s.charAt(i-1) - '0';
        }
        int d = in.nextInt();

        int[][][] dp = new int[n+1][d][2];
        dp[0][0][0] = 1;
        for(int i=1; i<=n; i++) {
            for(int j=0; j<d; j++) {
                int x = ((j - k[i]) % d + d) % d;
                dp[i][j][0] = dp[i-1][x][0];

                for(int l=0; l<10; l++) {
                    x = ((j - l) % d + d) % d;
                    dp[i][j][1] += dp[i-1][x][1];
                    if(l<k[i]) {
                        dp[i][j][1] += dp[i-1][x][0];
                    }
                    dp[i][j][1] %= MOD;
                }
            }
        }
        int rs = dp[n][0][0] + dp[n][0][1];
        if(rs>=MOD) rs -= MOD;
        rs -= 1;
        if(rs==-1) rs += MOD;
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