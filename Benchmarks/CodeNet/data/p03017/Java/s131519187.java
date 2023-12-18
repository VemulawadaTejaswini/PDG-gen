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
 * @author Ribhav
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AKenkenRace solver = new AKenkenRace();
        solver.solve(1, in, out);
        out.close();
    }

    static class AKenkenRace {
        public void solve(int testNumber, FastReader s, PrintWriter out) {
            int n = s.nextInt();
            int a = s.nextInt() - 1;
            int b = s.nextInt() - 1;
            int c = s.nextInt() - 1;
            int d = s.nextInt() - 1;
            String str = s.nextString();

            if (str.charAt(c) == '#' || str.charAt(d) == '#') {
                out.println("No");
                return;
            }
            if (c < d) {
                boolean possible = true;
                for (int i = a; i < d - 1; i++) {
                    if (str.charAt(i) == '#' && str.charAt(i + 1) == '#') {
                        possible = false;
                        break;
                    }
                }

                if (!possible) {
                    out.println("No");
                } else {
                    out.println("Yes");
                }
            } else {
                boolean possible = false;
                for (int i = b; i < d - 1; i++) {
                    if (str.charAt(i - 1) == '.' && str.charAt(i) == '.' && str.charAt(1 + i) == '.') {
                        possible = true;
                        break;
                    }
                }

                for (int i = a; i < c - 1; i++) {
                    if (str.charAt(i) == '#' && str.charAt(i + 1) == '#') {
                        possible = false;
                        break;
                    }
                }

                if (!possible) {
                    out.println("No");
                } else {
                    out.println("Yes");
                }
            }
        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private FastReader.SpaceCharFilter filter;

        public FastReader(InputStream stream) {
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

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

