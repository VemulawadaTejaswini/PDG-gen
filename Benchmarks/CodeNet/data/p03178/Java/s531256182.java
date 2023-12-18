import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author prakharjain
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        SDigitSum solver = new SDigitSum();
        solver.solve(1, in, out);
        out.close();
    }

    static class SDigitSum {
        int mod = 1000000007;

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            String s = in.next();

            int d = in.nextInt();

            int n = s.length();
            long[][][] dp = new long[n][d][2];

            //1 - restric

            int num = s.charAt(0) - '0';

            for (int i = 0; i < num; i++) {
                dp[0][i % d][0]++;
            }

            dp[0][num % d][1]++;

            for (int i = 1; i < n; i++) {
                //1

                num = s.charAt(i) - '0';

                for (int j = 0; j < d; j++) {
                    dp[i][(j + num) % d][1] += dp[i - 1][j][1];
                    dp[i][(j + num) % d][1] %= mod;
                }

                //0

                for (int j = 0; j < 10; j++) {
                    for (int k = 0; k < d; k++) {
                        dp[i][(k + j) % d][0] += dp[i - 1][k][0];
                        dp[i][(k + j) % d][0] %= mod;
                    }
                }

                for (int j = 0; j < num; j++) {
                    for (int k = 0; k < d; k++) {
                        dp[i][(k + j) % d][0] += dp[i - 1][k][1];
                        dp[i][(k + j) % d][0] %= mod;
                    }
                }
            }

            long ans = dp[n - 1][0][0] + dp[n - 1][0][1];

            ans--;

            ans %= mod;

            if (ans < 0)
                ans += mod;

            out.println(ans);
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
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

        public String nextString() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                if (Character.isValidCodePoint(c)) {
                    res.appendCodePoint(c);
                }
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public String next() {
            return nextString();
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void close() {
            writer.close();
        }

        public void println(long i) {
            writer.println(i);
        }

    }
}

