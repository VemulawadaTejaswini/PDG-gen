package main;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Solution solver = new Solution();
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);
        solver.solve(1, in, out);
        out.close();
    }

    private static class Solution {
        static int INF = (int) 1e8;
        int[][] mem;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            mem = new int[m][(1 << (n + 1)) + 9];
            for (int[] x : mem) Arrays.fill(x, -1);
            int[] cost = new int[m];
            int[] keyMask = new int[m];
            for (int i = 0; i < m; ++i) {
                cost[i] = in.nextInt();
                int keys = in.nextInt();
                int mask = 0;
                for (int j = 0; j < keys; ++j) {
                    int box = in.nextInt() - 1;
                    mask |= (1 << box);
                }
                keyMask[i] = mask;
            }
            int res = solve(0, 0, n, cost, keyMask);
            if (res == INF) {
                out.println("-1");
            } else {
                out.println(res);
            }
        }

        private int solve(int idx, int mask, int n, int[] cost, int[] keyMask) {
            if (allOnes(mask, n)) {
                return 0;
            }
            if (idx >= cost.length) return INF;
            if (mem[idx][mask] != -1) return mem[idx][mask];
            int res = solve(idx + 1, mask, n, cost, keyMask);
            res = Math.min(res, cost[idx] + solve(idx + 1, mask | keyMask[idx], n, cost, keyMask));
            mem[idx][mask] = res;
            return res;
        }

        private boolean allOnes(int mask, int n) {
            for (int i = 0; i < n; ++i) {
                if ((mask & (1 << i)) == 0) return false;
            }
            return true;
        }


    }

    private static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 23434);
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

        public long nextLong() {
            return Long.parseLong(next());
        }
    }

}
