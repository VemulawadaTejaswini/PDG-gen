//package atcoder.dpContest;

import java.io.*;
import java.util.*;

/*
    Knapsack weight is changed from 10^5 to 10^9, so O(N * W) solution is not feasible anymore
    dp[i]: the min total weight of items with total value exactly i

    similar with coin change 2?
 */
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
            int N = in.nextInt(), W = in.nextInt();
            int[] w = new int[N], v = new int[N];
            int valueSum = 0;
            for(int i = 0; i < N; i++) {
                w[i] = in.nextInt();
                v[i] = in.nextInt();
                valueSum += v[i];
            }

            long[] dp = new long[valueSum + 1];
            Arrays.fill(dp, (long)1e18);
            dp[0] = 0;

            for(int item = 0; item < N; item++) {
                for(int value_already = valueSum - v[item]; value_already >= 0; value_already--) {
                    dp[value_already + v[item]] = Math.min(dp[value_already + v[item]], dp[value_already] + w[item]);
                }
            }
            int ans = 0;
            for(int i = valueSum; i > 0; i--) {
                if(dp[i] <= W) {
                    ans = i;
                    break;
                }
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


