// package other2019.yahoo2019.qual;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
    static long __startTime = System.currentTimeMillis();

    static final int MOD = 998244353;

    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        char[] s = in.nextToken().toCharArray();

        int n = s.length;
        int[][] dp = new int[2][2*n];

        int red = 0;
        int blue = 0;

        dp[0][0] = 1;
        for (int i = 0; i < 2*n ; i++) {
            int fr = i%2;
            int to = 1-fr;
            Arrays.fill(dp[to], 0);

            if (i < n) {
                if (s[i] == '0') {
                    red += 2;
                } else if (s[i] == '1') {
                    red += 1;
                    blue += 1;
                } else {
                    blue += 2;
                }
            }
            for (int u = 0 ; u < 2*n ; u++) {
                int base = dp[fr][u];
                if (base == 0) {
                    continue;
                }
                int lr = red-u;
                int lb = blue-(i-u);
                if (lr >= 1) {
                    dp[to][u+1] += base;
                    dp[to][u+1] %= MOD;
                }
                if (lb >= 1) {
                    dp[to][u] += base;
                    dp[to][u] %= MOD;
                }
            }
        }

        out.println(dp[0][red]);
        out.flush();
    }

    private static void printTime(String label) {
        debug(label, System.currentTimeMillis() - __startTime);
    }

    private static void debug(Object... o) {
        System.err.println(Arrays.deepToString(o));
    }

    public static class InputReader {
        private static final int BUFFER_LENGTH = 1 << 12;
        private InputStream stream;
        private byte[] buf = new byte[BUFFER_LENGTH];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        private int next() {
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
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public char nextChar() {
            return (char) skipWhileSpace();
        }

        public String nextToken() {
            int c = skipWhileSpace();
            StringBuilder res = new StringBuilder();
            do {
                res.append((char) c);
                c = next();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public int nextInt() {
            return (int) nextLong();
        }

        public long nextLong() {
            int c = skipWhileSpace();
            long sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = next();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = next();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public double nextDouble() {
            return Double.valueOf(nextToken());
        }

        int skipWhileSpace() {
            int c = next();
            while (isSpaceChar(c)) {
                c = next();
            }
            return c;
        }

        boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
    }
}