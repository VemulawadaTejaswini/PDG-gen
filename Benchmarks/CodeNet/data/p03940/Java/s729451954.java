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

        long dp[][];
        boolean wasInState[][];
        int[] x;

        long rec(int last, int p) {
            if (wasInState[last][p]) {
                return dp[last][p];
            }
            wasInState[last][p] = true;
            long res = Long.MAX_VALUE;
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
            return res;
        }

        public void solve(InputReader in, PrintWriter out) {

            n = in.nextInt();
            E = in.nextInt();
            T = in.nextInt();
            x = new int[n];
            for (int i = 0; i < n; ++i) {
                x[i] = in.nextInt();
            }
            dp = new long[n][n];
            wasInState = new boolean[n][n];
            long res = rec(0, 0);
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
