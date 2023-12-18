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
 * @author Rustam Musin (t.me/musin)
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        DChristmas solver = new DChristmas();
        solver.solve(1, in, out);
        out.close();
    }

    static class DChristmas {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
//        test();
            int n = in.readInt();
            long k = in.readLong();
            out.print(solve(n, k));
        }

        long solve(int n, long k) {
            long[] patties = new long[n + 1];
            long[] size = new long[n + 1];
            patties[0] = 1;
            size[0] = 1;
            for (int i = 1; i <= n; i++) {
                patties[i] = patties[i - 1] * 2 + 1;
                size[i] = size[i - 1] * 2 + 3;
            }
            long ans = 0;
            for (int curN = n; k > 0; curN--) {
                //full
                if (k == size[curN]) {
                    ans += patties[curN];
                    k -= size[curN];
                    break;
                }

                //left0
                if (--k == 0) {
                    break;
                }

                //left
                if (k < size[curN - 1]) {
                    continue;
                }
                k -= size[curN - 1];
                ans += patties[curN - 1];

                //middle0
                if (k == 0) {
                    break;
                }
                k--;
                ans++;

                //right
                if (k < size[curN - 1]) {
                    continue;
                }
                k -= size[curN - 1];
                ans += patties[curN - 1];

                //right0
                if (--k == 0) {
                    break;
                }
            }
            return ans;
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

        public int readInt() {
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

        public void print(long i) {
            writer.print(i);
        }

    }
}

