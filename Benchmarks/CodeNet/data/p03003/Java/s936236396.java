import java.util.*;
import java.io.*;

public class Main {
    static long mod = (long) 1e9 + 7;
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt(); int m = sc.nextInt();
        int [] s = new int[n + 1];
        int [] t = new int[m + 1];
        for (int i = 1; i <= n; i++) s[i] = sc.nextInt();
        for (int i = 1; i <= m; i++) t[i] = sc.nextInt();
        long [][] dp = new long[n + 1][m + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= n; i++) dp[i][0] = 1;
        for (int i = 1; i <= m; i++) dp[0][i] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s[i] == t[j]) {
                    dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % mod;
                } else {
                    dp[i][j] = (dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1]) % mod;
                }
                if (dp[i][j] < 0) dp[i][j] += mod;
            }
        }
        out.println(dp[n][m]);
        out.close();
    }


    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
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

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }


    }

}