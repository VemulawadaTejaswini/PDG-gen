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
        BKleeneInversion solver = new BKleeneInversion();
        solver.solve(1, in, out);
        out.close();
    }

    static class BKleeneInversion {
        private long arithmeticProgressionSum(long a, long d, long n) {
            return (n * (2 * a + (n - 1) * d)) / 2;
        }

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            final int MAX = 2000;
            final int MOD = (int) 1e9 + 7;

            int n = in.nextInt();
            int m = in.nextInt();
            int[] a = in.nextIntArray(n);

            int[] straight = new int[MAX + 1];
            for (int i = 0; i + 1 < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (a[i] > a[j]) {
                        straight[a[i]]++;
                    }
                }
            }
            int[] back = new int[MAX + 1];
            for (int i = n - 1; i >= 1; i--) {
                for (int j = i - 1; j >= 0; j--) {
                    if (a[i] > a[j]) {
                        back[a[i]]++;
                    }
                }
            }

            long ret = 0;
            for (int num = 1; num <= MAX; num++) {
                int count = straight[num];
                if (count > 0) {
                    ret += arithmeticProgressionSum(count, count, m);
                    ret %= MOD;
                }
                count = back[num];
                if (count > 0) {
                    ret += arithmeticProgressionSum(count, count, m - 1);
                    ret %= MOD;
                }
            }

            out.println(ret);
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

        public int[] nextIntArray(int n) {
            int[] array = new int[n];
            for (int i = 0; i < n; ++i) array[i] = nextInt();
            return array;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

