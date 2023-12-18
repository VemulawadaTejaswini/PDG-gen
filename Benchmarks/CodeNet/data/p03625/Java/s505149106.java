import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.SplittableRandom;
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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, FastReader in, PrintWriter out) {
            int n = in.nextInt();
            long[] a = in.nextLongArray(n);
            ArrayUtils.sort(a);
            long f = -1;
            for (int i = n - 1; i >= 0; i--) {
                int j = i;
                int ct = 0;
                while (j >= 0 && a[j] == a[i]) {
                    j -= 1;
                    ct += 1;
                }
                if (ct >= 4) {
                    if (f == -1) {
                        out.println(a[i] * a[i]);
                        return;
                    } else {
                        out.println(a[i] * f);
                        return;
                    }
                } else if (ct >= 2 && ct < 4) {
                    if (f == -1) {
                        f = a[i];
                    } else {
                        out.println(a[i] * f);
                        return;
                    }
                }
                i = j + 1;
            }
            out.println(0);
        }

    }

    static class ArrayUtils {
        public static long[] sort(long[] a) {
            a = shuffle(a, new SplittableRandom());
            Arrays.sort(a);
            return a;
        }

        public static long[] shuffle(long[] a, SplittableRandom gen) {
            for (int i = 0, n = a.length; i < n; i++) {
                int ind = gen.nextInt(n - i) + i;
                long d = a[i];
                a[i] = a[ind];
                a[ind] = d;
            }
            return a;
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

        public long nextLong() {
            int c = pread();
            while (isSpaceChar(c))
                c = pread();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = pread();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = pread();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public long[] nextLongArray(int n) {
            long[] array = new long[n];
            for (int i = 0; i < n; i++) {
                array[i] = nextLong();
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

