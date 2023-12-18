import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.LinkedList;
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
        O_Matching solver = new O_Matching();
        solver.solve(1, in, out);
        out.close();
    }

    static class O_Matching {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            long mod = (int) 1e9 + 7;
            int n = in.ni();
            int[][] g = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    g[i][j] = in.ni();
                }
            }

            long[] dp = new long[1 << n];
            dp[0] = 1;
            LinkedList<Integer>[] masks = new LinkedList[n + 1];
            for (int i = 0; i < n + 1; i++) {
                masks[i] = new LinkedList<>();
            }
            for (int i = 0; i < 1 << n; i++) {
                masks[Integer.bitCount(i)].add(i);
            }
            for (int i = 0; i < n; i++) {
                for (int mask : masks[i]) {
                    for (int j = 0; j < n; j++) {
                        if (g[i][j] == 1 && (mask & (1 << j)) == 0) {
                            dp[mask | (1 << j)] = (dp[mask | (1 << j)] + dp[mask]) % mod;
                        }
                    }
                }

            }

            out.println(dp[(1 << n) - 1]);
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

