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

//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    private static void solve(int q, FastScanner in, PrintWriter out) {
        for(int qq = 0; qq < q; qq++) {
            int n = in.nextInt();
            int[] a = new int[n], b = new int[n], c = new int[n];
            for(int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                b[i] = in.nextInt();
                c[i] = in.nextInt();
            }

            int[][] dp = new int[n][3];
            dp[0][0] = a[0];
            dp[0][1] = b[0];
            dp[0][2] = c[0];

            for(int i = 1; i < n; i++) {
                dp[i][0] = Math.max(dp[i - 1][1], dp[i - 1][2]) + a[i];
                dp[i][1] = Math.max(dp[i - 1][0], dp[i - 1][2]) + b[i];
                dp[i][2] = Math.max(dp[i - 1][0], dp[i - 1][1]) + c[i];
            }
            out.println(Math.max(Math.max(dp[n - 1][0], dp[n - 1][1]), dp[n - 1][2]));
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


