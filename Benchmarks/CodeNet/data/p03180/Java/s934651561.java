import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    static long[] dp;

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        int n = in.nextInt();
        dp = new long[1 << n];
        int[][] w = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                w[i][j] = in.nextInt();
            }
        }

        long[] costMask = new long[1 << n];
        for (int mask = 0; mask < (1 << n); mask++) {
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (((mask & (1 << i)) != 0) && ((mask & (1 << j)) != 0)) {
                        costMask[mask] += w[i][j];
                    }
                }
            }
        }

        Arrays.fill(dp, Long.MIN_VALUE / 2);
        dp[0] = 0;
        for (int mask = 0; mask < (1 << n); mask++) {
            int antiMask = ((1 << n) - 1) ^ mask;
            solve(mask, antiMask, costMask);
        }
        out.println(dp[(1 << n) - 1]);
        out.close();
    }

    private static void solve(int mask, int antiMask, long[] costMask) {
        for (int x = antiMask; ; x = x - 1 & antiMask) {
            dp[mask ^ x] = Math.max(dp[mask ^ x], dp[mask] + costMask[x]);
            if (x == 0) break;
        }
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}