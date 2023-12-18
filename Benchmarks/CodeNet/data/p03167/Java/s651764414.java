import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.Reader;
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
        H_Grid solver = new H_Grid();
        solver.solve(1, in, out);
        out.close();
    }

    static class H_Grid {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int h = in.ni(), w = in.ni();
            char[][] map = in.nm(h, w);
            long[][] dp = new long[h + 1][w + 1];
            long mod = (int) 1e9 + 7;
            dp[0][0] = 1;
            for (int r = 0; r < h; r++) {
                for (int c = 0; c < w; c++) {
                    if (map[r][c] == '.') {
                        if (r > 0) {
                            dp[r][c] += dp[r - 1][c];
                        }
                        if (c > 0)
                            dp[r][c] += dp[r][c - 1];
                        dp[r][c] %= mod;
                    }
                }
            }
            out.println(dp[h - 1][w - 1]);

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

        public char[] ns(int n) {
            char[] buf = new char[n];
            try {
                in.read(buf);
            } catch (IOException e) {
                throw new RuntimeException();
            }
            return buf;
        }

        public char[][] nm(int n, int m) {
            char[][] map = new char[n][];
            for (int i = 0; i < n; i++) {
                map[i] = ns(m);
                readLine();
            }
            return map;
        }

        public String readLine() {
            try {
                return in.readLine();
            } catch (IOException e) {
                throw new RuntimeException();
            }
        }

    }
}

