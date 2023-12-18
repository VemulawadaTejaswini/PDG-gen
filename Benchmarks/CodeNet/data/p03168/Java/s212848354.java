//package atcoder.dpContest;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        try {
//            FastScanner in = new FastScanner(new FileInputStream("src/input.in"));
//            PrintWriter out = new PrintWriter(new FileOutputStream("src/output.out"));

        FastScanner in = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        solve(1, in, out);

//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    private static void solve(int q, FastScanner in, PrintWriter out) {
        for (int qq = 0; qq < q; qq++) {
            int N = in.nextInt();
            double[] p = new double[N];
            for(int i = 0; i < N; i++) {
                p[i] = in.nextDouble();
            }

            double[][] dp = new double[N + 1][N + 1];   //dp[i][j]: the probability of getting j heads with i coins tossed
            dp[0][0] = 1.0;
            dp[0][1] = 0.0;

            for(int i = 1; i <= N; i++) {
                dp[i][0] = dp[i - 1][0] * (1 - p[i - 1]);
                for(int j = 1; j <= i; j++) {
                    dp[i][j] = dp[i - 1][j - 1] * p[i - 1] + dp[i - 1][j] * (1 - p[i - 1]);
                }
            }

            double ans = 0.0;

            for(int i =  (N - 1) / 2 + 1; i <= N; i++) {
                ans += dp[N][i];
            }
            out.println(ans);
        }
        out.close();
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
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


