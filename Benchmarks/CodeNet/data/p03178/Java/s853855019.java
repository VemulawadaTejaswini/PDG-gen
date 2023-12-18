import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
 * @author lewin
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
        int[][][] dp;
        int mod = 1000000007;
        char[] k;
        int d;

        int count(int cnum, boolean less, int cs) {
            if (cnum == k.length) return cs == 0 ? 1 : 0;
            if (dp[less ? 1 : 0][cs][cnum] != -1) return dp[less ? 1 : 0][cs][cnum];

            int ans = 0;
            for (int digit = 0; digit < 10; digit++) {
                if (!less && digit > k[cnum] - '0') continue;
                boolean nless = less || (digit < k[cnum] - '0');
                ans += count(cnum + 1, nless, (cs + digit) % d);
                if (ans >= mod) ans -= mod;
            }
            return dp[less ? 1 : 0][cs][cnum] = ans;
        }

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            k = in.next().toCharArray();
            d = in.nextInt();
            dp = new int[2][d + 1][k.length + 1];
            AUtils.deepFill(dp, -1);
            out.println((count(0, false, 0) + mod - 1) % mod);
        }

    }

    static class AUtils {
        public static void deepFill(int[][][] x, int val) {
            for (int[][] y : x) deepFill(y, val);
        }

        public static void deepFill(int[][] x, int val) {
            for (int[] y : x) deepFill(y, val);
        }

        public static void deepFill(int[] x, int val) {
            Arrays.fill(x, val);
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1 << 16];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (this.numChars == -1) {
                throw new InputMismatchException();
            } else {
                if (this.curChar >= this.numChars) {
                    this.curChar = 0;

                    try {
                        this.numChars = this.stream.read(this.buf);
                    } catch (IOException var2) {
                        throw new InputMismatchException();
                    }

                    if (this.numChars <= 0) {
                        return -1;
                    }
                }

                return this.buf[this.curChar++];
            }
        }

        public int nextInt() {
            int c;
            for (c = this.read(); isSpaceChar(c); c = this.read()) {
                ;
            }

            byte sgn = 1;
            if (c == 45) {
                sgn = -1;
                c = this.read();
            }

            int res = 0;

            while (c >= 48 && c <= 57) {
                res *= 10;
                res += c - 48;
                c = this.read();
                if (isSpaceChar(c)) {
                    return res * sgn;
                }
            }

            throw new InputMismatchException();
        }

        public String next() {
            int c;
            while (isSpaceChar(c = this.read())) {
                ;
            }

            StringBuilder result = new StringBuilder();
            result.appendCodePoint(c);

            while (!isSpaceChar(c = this.read())) {
                result.appendCodePoint(c);
            }

            return result.toString();
        }

        public static boolean isSpaceChar(int c) {
            return c == 32 || c == 10 || c == 13 || c == 9 || c == -1;
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

        public void println(int i) {
            writer.println(i);
        }

    }
}

