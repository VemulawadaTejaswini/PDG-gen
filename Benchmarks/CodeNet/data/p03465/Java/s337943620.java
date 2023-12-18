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
        agc020c solver = new agc020c();
        solver.solve(1, in, out);
        out.close();
    }

    static class agc020c {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();

            int[] a = new int[n];

            int ts = 0;
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                ts += a[i];
            }

            int clsz = (ts + 64) / 64;

            long[][] dp = new long[n][clsz];

            dp[0][0] = 1;
            dp[0][a[0] / 64] |= (1l << (63 - (a[0] % 64)));

            for (int i = 1; i < n; i++) {
                for (int j = 0; j < clsz; j++) {
                    dp[i][j] = dp[i - 1][j];
                }
                //BitSet clone = (BitSet) dp[i - 1].clone();

                long[] clone = dp[i - 1];

                int words = (a[i] + 63) / 64;

                long[] newclone = new long[clsz + 1];

                for (int j = words; j <= clsz; j++) {
                    newclone[j] = clone[j - words];
                }

                if (words * 64 > a[i]) {
                    long diff = words * 64 - a[i];

                    long mask = ((1l << diff) - 1) << (64 - diff);
                    for (int j = words - 1; j < clsz; j++) {
                        newclone[j] <<= diff;
                        newclone[j] |= ((newclone[j + 1] & mask) >>> (64 - diff));
                    }
                }

                for (int j = 0; j < clsz; j++) {
                    dp[i][j] |= newclone[j];
                }
            }

            int sum = (ts + 1) / 2;

            int ans = -1;
            for (int i = sum; i <= ts; i++) {
                if ((dp[n - 1][i / 64] & ((1l << (63 - (i % 64))))) != 0) {
                    ans = i;
                    break;
                }
            }

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

        public void println(int i) {
            writer.println(i);
        }

    }
}

