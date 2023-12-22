import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Reader sc = new Reader();
        PrintWriter pw = new PrintWriter(System.out);
        
        try {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int[][] val = new int[n+1][m+1];
            for(int i=0 ; i<k ; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                int z = sc.nextInt();
                val[x][y] = z;
            }

            long[][][] dp = new long[n+1][m+1][4];

            for(int i=1 ; i<=n ; i++) {
                for(int j=1 ; j<=m ; j++) {
                    for(int x=0 ; x<=3 ; x++) {
                        dp[i][j][x] = dp[i][j-1][x];
                    }

                    for(int x=1 ; x<=3 ; x++) {
                        dp[i][j][x] = Math.max(dp[i][j][x], val[i][j] + dp[i][j-1][x-1]);
                    }

                    long max = 0;
                    for(int x=0 ; x<=3 ; x++) {
                        max = Math.max(max, dp[i-1][j][x]);
                    }

                    for(int x=0 ; x<=3 ; x++) {
                        dp[i][j][x] = Math.max(max, dp[i][j][x]);
                    }
                    dp[i][j][1] = Math.max(max + val[i][j], dp[i][j][1]);
                }
            }

            long ans = 0;
            for(int i=0 ; i<=3 ; i++) {
                ans = Math.max(ans, dp[n][m][i]);
            }
            pw.println(ans);

        }
        finally {
            pw.flush();
            pw.close();
        }
    }
    
    static class Reader {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while(!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch(IOException io) {
                    io.printStackTrace();
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
    }
}
