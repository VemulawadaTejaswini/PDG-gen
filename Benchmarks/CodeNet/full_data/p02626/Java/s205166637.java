import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Sparsh Sanchorawala
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FUnfairNim solver = new FUnfairNim();
        solver.solve(1, in, out);
        out.close();
    }

    static class FUnfairNim {
        public void solve(int testNumber, InputReader s, PrintWriter w) {
            int n = s.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = s.nextLong();
            long xor = 0;
            for (int i = 2; i < n; i++)
                xor ^= a[i];
            if (a[0] + a[1] < xor || (a[0] + a[1] - xor) % 2 == 1) {
                w.println(-1);
                return;
            }
            long v = (a[0] + a[1] - xor) / 2;
            long v1 = 0, v2 = 0;
            for (int i = 40; i >= 0; i--) {
                if (((v >> i) & 1) == 1) {
                    v -= 1L << i;
                    v1 += 1L << i;
                    v2 += 1L << i;
                }
            }
            if (v1 > a[0]) {
                w.println(-1);
                return;
            }
            for (int i = 40; i >= 0; i--) {
                if (((xor >> i) & 1) == 1) {
                    if (v1 + (1L << i) <= a[0]) {
                        v1 += 1L << i;
                    } else {
                        v2 += 1L << i;
                    }
                }
            }
            //w.println(v1 + " " + v2);
            if (v1 != 0 && v1 + v2 == a[0] + a[1])
                w.println(a[0] - v1);
            else
                w.println(-1);
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

        public long nextLong() {
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
}

