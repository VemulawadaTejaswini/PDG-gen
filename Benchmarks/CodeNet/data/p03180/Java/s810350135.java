import java.io.*;
import java.util.*;
import java.lang.*;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
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
        for (int i = 0; i < 1 << n; i++) {
            int mask = (1 << n) - 1 ^ i;
            int low = mask & -mask;
            mask &= mask - 1;
            for (int x = mask; ; x = x - 1 & mask) {
                dp[i | x ^ low] = Math.max(dp[i | x ^ low], dp[i] + costMask[x ^ low]);
                if (x == 0) break;
            }
        }
        out.println(dp[(1 << n) - 1]);

        //Arrays.fill(dp, Long.MIN_VALUE / 2);
       /* for (int mask = 0; mask < (1 << n); mask++) {
            List<Integer> avlbl = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int temp = (1 << i);
                if ((temp & mask) == 0) {
                    avlbl.add(i);
                }
            }
            solve(mask, avlbl, 0, 0, costMask, dp[mask]);
        }
        out.println(dp[(1 << n) - 1]);*/
        out.close();
    }

    private static void solve(int mask, List<Integer> avlbl, int rem, int start, long[] costMask, long cost) {
        if (start == avlbl.size()) {
            dp[mask] = Math.max(dp[mask], cost + costMask[rem]);
            return;
        }
        for (int i = start; i < avlbl.size(); i++) {
            solve(mask, avlbl, rem, start + 1, costMask, cost);
            solve(mask ^ (1 << avlbl.get(i)), avlbl, rem ^ (1 << avlbl.get(i)), start + 1, costMask, cost);
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