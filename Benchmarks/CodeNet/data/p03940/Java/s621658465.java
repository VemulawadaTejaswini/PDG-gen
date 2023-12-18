import java.io.*;
import java.math.BigInteger;
import java.util.*;

/**
 * Created by fcdkbear on 15.10.16.
 */
public class Main {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        new Task().solve(in, out);
        out.close();
    }


    static class Task {

        int n,E,T;
        final int MAGIC = 100;

        long dp[];
        boolean wasInState[];
        int[] x;
        int[] next;

        long rec(int p) {
            if (wasInState[p]) {
                return dp[p];
            }
            wasInState[p] = true;
            if (p == n - 1) {
                dp[p] = (long)T + E - x[p];
                return dp[p];
            }
            long res = T + (long)x[p + 1] - x[p] + rec(p + 1);
            int from = Math.max(p + 1, next[p] - MAGIC);
            int to = Math.min(n, next[p] + MAGIC);
            for (int i = from; i < to; ++i) {
                if (i + 1 != n) {
                    res = Math.min(res, (long)(x[i] - x[p]) + Math.max(T - x[i] + x[p], x[i] - x[p]) + x[i + 1] - x[p] + rec(i + 1));
                } else {
                    res = Math.min(res, (long)(x[i] - x[p]) + Math.max(T - x[i] + x[p], x[i] - x[p]) + E - x[p]);
                }
            }
            dp[p] = res;
            return res;
            /*long res = Long.MAX_VALUE;
            if (last == p) {
                if (p + 1 != n) {
                    res = Math.min(res, T + x[p + 1] - x[p] + rec(last + 1, p + 1));
                    res = Math.min(res, x[p + 1] - x[p] + rec(p, p + 1));
                } else {
                    res = Math.min(res, T + E - x[p]);
                }
            } else {
                if (p + 1 != n) {
                    res = Math.min(res, x[p + 1] - x[p] + rec(last, p + 1));
                    res = Math.min(res, Math.max(T - x[p] + x[last], x[p] - x[last]) + x[p] - x[last] + x[p + 1] - x[p] + rec(p + 1, p + 1));
                } else {
                    res = Math.min(res, Math.max(T - x[p] + x[last], x[p] - x[last]) + x[p] - x[last] + E - x[p]);
                }
            }
            dp[last][p] = res;
            return res;*/
        }

        public void solve(InputReader in, PrintWriter out) {

            n = in.nextInt();
            E = in.nextInt();
            T = in.nextInt();
            x = new int[n];
            next = new int[n];
            for (int i = 0; i < n; ++i) {
                x[i] = in.nextInt();
            }
            int p = 0;
            for (int i = 0; i < n; ++i) {
                while ((p < n) && (x[p] - x[i] <= T)) {
                    p++;
                }
                next[i] = p;
            }
            dp = new long[n];
            wasInState = new boolean[n];
            long res = rec(0);
            out.println(res + x[0]);
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

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

    }

}
