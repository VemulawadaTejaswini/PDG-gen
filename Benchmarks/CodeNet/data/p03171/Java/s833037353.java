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
            int[] a = new int[N];
            long sum = 0;
            for(int i = 0; i < N; i++) {
                a[i] = in.nextInt();
                sum += a[i];
            }
            long[][] dp = new long[N][N];    //dp[i][j]: the resulting max value of X for a[i,j]
            for(int i = 0; i < N; i++) {
                dp[i][i] = a[i];
            }
            for(int i = 0; i < N - 1; i++) {
                dp[i][i + 1] = Math.max(a[i], a[i + 1]);
            }
            for(int l = 3; l <= N; l++) {
                for(int left = 0; left <= N - l; left++) {
                    int right = left + l - 1;
                    dp[left][right] = Math.max(Math.min(dp[left + 2][right], dp[left + 1][right - 1]) + a[left],
                                                Math.min(dp[left][right - 2], dp[left + 1][right - 1]) + a[right]);
                }
            }
            out.println(dp[0][N - 1] * 2 - sum);
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


