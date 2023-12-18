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
 * @author Pradyumn Agrawal coderbond007  PLEASE!! PLEASE!! HACK MY SOLUTION!!
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, FastReader in, PrintWriter out) {
            int m = in.nextInt();
            char[][] map = in.nextCharacterMap(2, m);
            long ret = 1;
            int pre = 0;
            int mod = 1000000007;
            for (int i = 0; i < m; i++) {
                if (map[0][i] == map[1][i]) {
                    if (pre == 0) {
                        ret = ret * 3 % mod;
                    } else if (pre == 1) {
                        ret = ret * 2 % mod;
                    } else {
                    }
                    pre = 1;
                } else {
                    if (pre == 0) {
                        ret = ret * 6 % mod;
                    } else if (pre == 1) {
                        ret = ret * 2 % mod;
                    } else {
                        ret = ret * 3 % mod;
                    }
                    pre = 2;
                    i++;
                }
            }
            out.println(ret);
        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[8192];
        private int curChar;
        private int pnumChars;
        private FastReader.SpaceCharFilter filter;

        public FastReader(InputStream stream) {
            this.stream = stream;
        }

        private int pread() {
            if (pnumChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= pnumChars) {
                curChar = 0;
                try {
                    pnumChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (pnumChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = pread();
            while (isSpaceChar(c))
                c = pread();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = pread();
            }
            int res = 0;
            do {
                if (c == ',') {
                    c = pread();
                }
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = pread();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        private boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        private static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public char nextCharacter() {
            int c = pread();
            while (isSpaceChar(c))
                c = pread();
            return (char) c;
        }

        public char[] nextCharacterArray(int n) {
            char[] chars = new char[n];
            for (int i = 0; i < n; i++) {
                chars[i] = nextCharacter();
            }
            return chars;
        }

        public char[][] nextCharacterMap(int n, int m) {
            char[][] map = new char[n][];
            for (int i = 0; i < n; i++) {
                map[i] = nextCharacterArray(m);
            }
            return map;
        }

        private interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}