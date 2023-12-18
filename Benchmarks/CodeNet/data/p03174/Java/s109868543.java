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
        OMatching solver = new OMatching();
        solver.solve(1, in, out);
        out.close();
    }

    static class OMatching {
        int mod = 1000000007;

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();

            int[][] a = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = in.nextInt();
                }
            }

            long[][] dp = new long[n][(1 << n)];

            for (int i = 0; i < n; i++) {
                if (a[0][i] == 1) {
                    dp[0][1 << i]++;
                }
            }

            int[] pow = new int[n + 1];

            for (int i = 0; i <= n; i++)
                pow[i] = 1 << i;

            for (int i = 1; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int fp = 0;
                    int sp = 0;
                    for (int k = 0; k < j; k++) {
                        fp |= pow[k];
                    }
                    for (int k = j; k < n; k++) {
                        sp |= pow[k];
                    }
                    if (a[i][j] == 1) {
                        for (int set = 0; set < pow[n - 1]; set++) {
                            int aset = ((set & sp) << 1) + (set & fp);
                            int sset = aset | pow[j];
                            dp[i][sset] += dp[i - 1][aset];
                            if (dp[i][sset] >= mod)
                                dp[i][sset] -= mod;
                        }
                    }
                }
            }

            out.println(dp[n - 1][(1 << n) - 1]);
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

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
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

