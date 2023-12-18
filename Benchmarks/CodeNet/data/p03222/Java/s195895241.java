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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        int mod = 1000000007;

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int h = in.nextInt();
            int w = in.nextInt();
            int k = in.nextInt();

            if (w == 1) {
                out.println(1);
                return;
            }

            long[][][] dp = new long[h + 1][1 << (w - 1)][w];

            for (int i = 0; i < w; i++) {
                for (int j = 0; j < (1 << (w - 1)); j++) {
                    if (valid(j, w)) {
                        if (i == k - 1) {
                            dp[h][j][i] = 1;
                        }
                    }
                }
            }

            for (int i = h - 1; i >= 0; i--) {
                for (int j = 0; j < (1 << (w - 1)); j++) {
                    if (!valid(j, w))
                        continue;
                    for (int l = 0; l < w; l++) {
                        for (int m = 0; m < (1 << (w - 1)); m++) {
                            if (!valid(m, w))
                                continue;

                            if (l == w - 1) {
                                if ((m & (1 << (l - 1))) != 0) {
                                    dp[i][j][l] += dp[i + 1][m][l - 1];
                                    dp[i][j][l] %= mod;
                                } else {
                                    dp[i][j][l] += dp[i + 1][m][l];
                                    dp[i][j][l] %= mod;
                                }
                            } else if (l == 0) {
                                if ((m & (1 << l)) != 0) {
                                    dp[i][j][l] += dp[i + 1][m][l + 1];
                                    dp[i][j][l] %= mod;
                                } else {
                                    dp[i][j][l] += dp[i + 1][m][l];
                                    dp[i][j][l] %= mod;
                                }
                            } else {
                                if ((m & (1 << l)) != 0) {
                                    dp[i][j][l] += dp[i + 1][m][l + 1];
                                    dp[i][j][l] %= mod;
                                } else if ((m & (1 << (l - 1))) != 0) {
                                    dp[i][j][l] += dp[i + 1][m][l - 1];
                                    dp[i][j][l] %= mod;
                                } else {
                                    dp[i][j][l] += dp[i + 1][m][l];
                                    dp[i][j][l] %= mod;
                                }
                            }
                        }
                    }
                }
            }

            out.println(dp[0][0][0]);
        }

        boolean valid(int num, int w) {
            int cnum = num;

            int co = 0;
            for (int i = 0; i < w; i++) {
                if (((1 << i) & num) != 0) {
                    co++;
                    if (co > 1) {
                        return false;
                    }
                } else {
                    co = 0;
                }
            }

            return true;
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

        public void println(int i) {
            writer.println(i);
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
}

