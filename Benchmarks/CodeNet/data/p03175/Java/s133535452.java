import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        inclass in = new inclass(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        PIndependentSet solver = new PIndependentSet();
        solver.solve(1, in, out);
        out.close();
    }

    static class PIndependentSet {
        ArrayList<Integer>[] g;
        int mod = (int) 1e9 + 7;
        int[][] dp;

        public void solve(int testNumber, inclass in, PrintWriter out) {
            int n = in.nextInt();
            dp = new int[n][2];
            for (int[] x : dp) {
                Arrays.fill(x, -1);
            }
            g = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                g[i] = new ArrayList<>();
            }
            for (int i = 0; i < n - 1; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                a--;
                b--;
                g[a].add(b);
                g[b].add(a);
            }
            int ans = ((rec(0, 0, -1) % mod) + (rec(0, 1, -1) % mod)) % mod;
            out.println(ans);
        }

        public int rec(int u, int col, int parent) {
            if (dp[u][col] != -1) return dp[u][col];
            int ans = 1;
            if (col == 0) {
                for (int v : g[u]) {
                    if (v != parent)
                        ans = ((ans % mod) * ((rec(v, 0, u) % mod + rec(v, 1, u) % mod) % mod)) % mod;
                }
            } else {
                for (int v : g[u]) {
                    if (v != parent)
                        ans = ((ans % mod) * (rec(v, 0, u) % mod)) % mod;
                }
            }
            return dp[u][col] = ans % mod;
        }

    }

    static class inclass {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private inclass.SpaceCharFilter filter;

        public inclass(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

