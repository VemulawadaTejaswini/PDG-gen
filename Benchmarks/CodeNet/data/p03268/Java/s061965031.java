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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
//        for (int nn = 1; nn <= 100; nn++) {
//            for (int kk = 1; kk <= 100; kk++) {
//                long smart = smart(nn, kk);
//                long stupid = stupid(nn, kk);
//                if (smart != stupid) {
//                    System.err.println(Arrays.toString(new long[]{nn, kk, smart, stupid}));
//                    throw new AssertionError();
//                }
//            }
//        }
//        System.err.println("OK");

            int n = in.readInt();
            int k = in.readInt();
            long smart = smart(n, k);
            out.printLine(smart);
        }

        private long smart(int n, int k) {
            long ans = 0;
            for (int a = 1; a <= n; a++) {
                int rem = k - a % k;
//            int kk = (k % 2 == 0) ? k / 2 : k;
                int cnt = get(n, rem, k);
//            System.err.println("a = " + a + ", rem = " + rem + ", cnt = " + cnt);
                boolean good = false;
                if (k % 2 == 0) {
                    if (rem % (k / 2) == 0) good = true;
                } else {
                    if (rem % k == 0) good = true;
                }
                if (good) {
                    ans += (long) cnt * cnt;
                }
            }
            return ans;
        }

        private int get(int n, int rem, int k) {
            int l = 1, r = n, ans = 0;
            while (l <= r) {
                int mid = (l + r) / 2;
                if (rem + (mid - 1) * k <= n) {
                    ans = mid;
                    l = mid + 1;
                } else {
                    r = mid - 1;
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
}

