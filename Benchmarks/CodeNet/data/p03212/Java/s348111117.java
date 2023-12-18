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
        C755 solver = new C755();
        solver.solve(1, in, out);
        out.close();
    }

    static class C755 {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            String s = in.next();

            int n = s.length();

            int ans = 0;

            for (int t = n - 3; t >= 0; t--) {
                int[][][] dp = new int[n][2][8];

                for (int i = t; i < n; i++) {
                    int cn = s.charAt(i) - '0';
                    for (int j = 0; j < 8; j++) {
                        for (int k = 0; k < 3; k++) {
                            int nj = j | (1 << k);

                            int num = 3 + k * 2;

                            //0
                            if (i > t) {
                                dp[i][0][nj] += (dp[i - 1][0][j]);
                                if (cn > num) {
                                    dp[i][0][nj] += dp[i - 1][1][j];
                                }
                            } else {
                                if (j == 0) {
                                    if (t > 0 || cn > num)
                                        dp[i][0][nj]++;
                                }
                            }

                            //1

                            if (i > t) {
                                if (cn == num) {
                                    dp[i][1][nj] += dp[i - 1][1][j];
                                }
                            } else {
                                if (cn == num && j == 0) {
                                    dp[i][1][nj]++;
                                }
                            }
                        }
                    }
                }

                ans += dp[n - 1][0][7] + dp[n - 1][1][7];
            }

//        int ans = 0;
//
//        for (int i = 2; i < n; i++) {
//            ans += dp[i][1][7] + dp[i][0][7];
//        }

            out.println(ans);
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
}

