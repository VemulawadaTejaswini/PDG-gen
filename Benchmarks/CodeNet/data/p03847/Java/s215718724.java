import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.stream.LongStream;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        DXorSum solver = new DXorSum();
        solver.solve(1, in, out);
        out.close();
    }

    static class DXorSum {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            long n = in.readLong();
            int l = Long.toBinaryString(n).length();

            Modulo m = new Modulo(MiscUtils.MOD7);
            long[][] dp = new long[l + 1][3];
            dp[0][0] = 1;
            for (int i = 1; i <= l; i++) {
                if ((n >> (l - i) & 1) == 1) {
                    dp[i][0] = dp[i - 1][0];
                    dp[i][1] = m.add(dp[i - 1][0], dp[i - 1][1]);
                    dp[i][2] = m.add(m.mlt(dp[i - 1][1], 2), m.mlt(dp[i - 1][2], 3));
                } else {
                    dp[i][0] = m.add(dp[i - 1][0], dp[i - 1][1]);
                    dp[i][1] = dp[i - 1][1];
                    dp[i][2] = m.add(dp[i - 1][1], m.mlt(dp[i - 1][2], 3));
                }
            }

            out.printLine(Arrays.stream(dp[l]).sum());
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

        public long readLong() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
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

        public void close() {
            writer.close();
        }

        public void printLine(long i) {
            writer.println(i);
        }

    }

    static class Modulo {
        long m;

        public Modulo(long m) {
            this.m = m;
        }

        public long add(long a, long b) {
            return (a + b) % m;
        }

        public long mlt(long a, long b) {
            return (a * b) % m;
        }

    }

    static class MiscUtils {
        public static final int MOD7 = (int) (1e9 + 7);

    }
}

