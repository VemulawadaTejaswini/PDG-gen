import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Pradyumn
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
            int n = in.nextInt();
            int[] a = in.nextIntArray(n);
            boolean neg = true;
            for (int aa : a) neg &= aa <= 0;

            int max = Integer.MIN_VALUE;
            for (int aa : a) max = Math.max(max, aa);
            int ind = -1;
            for (int i = 0; i < n; ++i) {
                if (a[i] == max) {
                    ind = i;
                    break;
                }
            }
            ArrayList<int[]> addpairs = new ArrayList<>();
            for (int i = 0; i + 1 < n && !neg; ++i) {
                if (a[i + 1] < a[i]) {
                    while (a[i + 1] < a[i]) {
                        addpairs.add(new int[]{ind + 1, i + 1});
                        a[i + 1] += max;
                    }
                }
            }

            int min = Integer.MAX_VALUE;
            for (int aa : a) min = Math.min(aa, min);
            for (int i = 0; i < n; ++i) {
                if (a[i] == min) {
                    ind = i;
                    break;
                }
            }
            if (neg) {
                addpairs.clear();
                for (int i = 0; i + 1 < n; ++i) {
                    if (a[i + 1] < a[i]) {
                        while (a[i + 1] < a[i]) {
                            addpairs.add(new int[]{ind + 1, i + 1});
                            a[i] += min;
                        }
                    }
                }
            }
            out.println(addpairs.size());
            for (int[] aa : addpairs) {
                out.println(aa[0] + " " + aa[1]);
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

