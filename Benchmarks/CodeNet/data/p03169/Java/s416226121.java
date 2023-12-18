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
 * @author gaidash
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        JSushi solver = new JSushi();
        solver.solve(1, in, out);
        out.close();
    }

    static class JSushi {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();
            int cnt1 = 0, cnt2 = 0, cnt3 = 0;
            for (int i = 0; i < n; i++) {
                int cnt = in.nextInt();
                if (cnt == 1) cnt1++;
                else if (cnt == 2) cnt2++;
                else cnt3++;
            }

            double[][][] dp = new double[n + 2][n + 2][n + 2];
            for (int s3 = 0; s3 <= cnt3; s3++) {
                for (int s2 = 0; s2 <= n; s2++) {
                    for (int s1 = 0; s1 <= n; s1++) {
                        if (s1 + s2 + s3 == 0) continue;
                        double p1 = 1.0 * s1 / n;
                        double p2 = 1.0 * s2 / n;
                        double p3 = 1.0 * s3 / n;
                        dp[s1][s2][s3] = 1.0;
                        if (s1 > 0) dp[s1][s2][s3] += dp[s1 - 1][s2][s3] * p1;
                        if (s2 > 0) dp[s1][s2][s3] += dp[s1 + 1][s2 - 1][s3] * p2;
                        if (s3 > 0) dp[s1][s2][s3] += dp[s1][s2 + 1][s3 - 1] * p3;
                        dp[s1][s2][s3] *= 1.0 * n / (s1 + s2 + s3);
                    }
                }
            }

            out.println(dp[cnt1][cnt2][cnt3]);
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

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void print(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(objects[i]);
            }
        }

        public void println(Object... objects) {
            print(objects);
            writer.println();
        }

        public void close() {
            writer.close();
        }

    }
}

