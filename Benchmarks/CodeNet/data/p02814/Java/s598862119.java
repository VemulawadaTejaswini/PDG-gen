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
        DSemiCommonMultiple solver = new DSemiCommonMultiple();
        solver.solve(1, in, out);
        out.close();
    }

    static class DSemiCommonMultiple {
        long gcd(long a, long b) {
            if (b == 0)
                return a;
            return (gcd(b, a % b));
        }

        public void solve(int testNumber, InputReader s, PrintWriter w) {
            int n = s.nextInt(), m = s.nextInt();
            int[] a = new int[n];
            a[0] = s.nextInt();
            int k = 0;
            while (a[0] % 2 == 0) {
                a[0] /= 2;
                k++;
            }
            boolean check = true;
            for (int i = 1; i < n; i++) {
                a[i] = s.nextInt();
                int twos = 0;
                while (a[i] % 2 == 0) {
                    a[i] /= 2;
                    twos++;
                }
                if (twos != k) {
                    check = false;
                }
            }
            if (!check) {
                w.println(0);
                return;
            }
            long lcm = (long) Math.pow(2, k - 1);
            if (lcm > m) {
                w.println(0);
                return;
            }
            for (int i = 0; i < n; i++) {
                long gcd = gcd(lcm, a[i]);
                if (lcm * (a[i] / gcd) > m) {
                    check = false;
                    break;
                }
                lcm *= (a[i] / gcd);
            }
            if (!check) {
                w.println(0);
                return;
            }
            w.println(1 + (m - lcm) / (2 * lcm));
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
}

