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
            int h = in.nextInt();
            int w = in.nextInt();
            int n = in.nextInt();
            int[] a = in.nextIntArray(n);
            int r = 0, c = 0;
            int[][] map = new int[h][w];
            boolean right = true;
            for (int i = 0; i < n; i++) {
                while (a[i] != 0) {
                    if (right) {
                        map[r][c] = i + 1;
                        c++;
                    } else {
                        map[r][c] = i + 1;
                        c--;
                    }
                    if (c == -1) {
                        c = 0;
                        right = true;
                        r++;
                    } else if (c == w) {
                        c = w - 1;
                        right = false;
                        r++;
                    }
                    a[i] -= 1;
                }
            }
            ArrayUtils.printMap(out, map);
        }

    }

    static class ArrayUtils {
        public static void printArray(PrintWriter out, int[] array) {
            for (int i = 0; i < array.length; i++) {
                if (i != 0) out.print(" ");
                out.print(array[i]);
            }
            out.println();
        }

        public static void printMap(PrintWriter out, int[][] map) {
            for (int i = 0; i < map.length; i++) {
                printArray(out, map[i]);
            }
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

        public int[] nextIntArray(int n) {
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = nextInt();
            }
            return array;
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

        private interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

