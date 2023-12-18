import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        Long[][] memo;
        boolean[][] first;
        boolean[][] last;
        int a;
        int b;
        long best;

        private long rec(int from, int to) {
            if (memo[from][to] != null)
                return memo[from][to];
            if (to - from == 1) {
                if (first[from][to])
                    return memo[from][to] = 0L;
                else
                    return memo[from][to] = best;
            }
            if (first[from][to])
                return memo[from][to] = rec(from + 1, to);
            else if (last[from][to])
                return memo[from][to] = rec(from, to - 1);
            return memo[from][to] = Math.min(rec(from + 1, to) + b, rec(from, to - 1) + a);
        }

        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.ni();
            a = in.ni();
            b = in.ni();
            best = Math.min(a, b);


            int[] p = new int[n];
            int[] pinv = new int[n];
            for (int i = 0; i < n; i++) {
                p[i] = in.ni() - 1;
                pinv[p[i]] = i;
            }
            if (n == 1) {
                out.println(0);
                return;
            }

            first = new boolean[n][n];

            last = new boolean[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (pinv[j] < pinv[i])
                        break;
                    first[i][j] = true;
                }
            }
            for (int i = n - 1; i >= 0; i--) {
                for (int j = i - 1; j >= 0; j--) {
                    if (pinv[j] > pinv[i])
                        break;
                    last[j][i] = true;
                }
            }
            memo = new Long[n][n];
            long ans = rec(0, n - 1);
            out.println(ans);


        }

    }

    static class FastScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public FastScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String ns() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String rl = in.readLine();
                    if (rl == null) {
                        return null;
                    }
                    st = new StringTokenizer(rl);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int ni() {
            return Integer.parseInt(ns());
        }

    }
}

