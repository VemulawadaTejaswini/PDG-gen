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
        ESimpleStringQueries solver = new ESimpleStringQueries();
        solver.solve(1, in, out);
        out.close();
    }

    static class ESimpleStringQueries {
        int[] tree;

        void update(int n, int nL, int nR, int idx, int a) {
            if (nR < idx || idx < nL)
                return;
            if (nL == idx && nR == idx) {
                tree[n] = (1 << a);
                return;
            }
            update(2 * n + 1, nL, (nL + nR) / 2, idx, a);
            update(2 * n + 2, (nL + nR) / 2 + 1, nR, idx, a);
            tree[n] = tree[2 * n + 1] | tree[2 * n + 2];
        }

        int query(int n, int nL, int nR, int l, int r) {
            if (nR < l || r < nL)
                return 0;
            if (l <= nL && nR <= r)
                return tree[n];
            return (query(2 * n + 1, nL, (nL + nR) / 2, l, r) | query(2 * n + 2, (nL + nR) / 2 + 1, nR, l, r));
        }

        public void solve(int testNumber, InputReader s, PrintWriter w) {
            int n = s.nextInt();
            char[] c = s.next().toCharArray();
            int[] a = new int[n];
            int sz = (int) Math.pow(2, (int) Math.ceil(Math.log(n) / Math.log(2)) + 1);
            tree = new int[sz];
            for (int i = 0; i < n; i++) {
                a[i] = c[i] - 'a';
                update(0, 0, n - 1, i, a[i]);
            }
            for (int i = 0; i < n - 1; i++) {
                int val = query(0, 0, n - 1, i, i + 1);
                int res = 0;
                while (val > 0) {
                    res += val & 1;
                    val = val >> 1;
                }
            }
            int q = s.nextInt();
            while (q-- > 0) {
                if (s.nextInt() == 1) {
                    int i = s.nextInt() - 1, ch = s.next().charAt(0) - 'a';
                    update(0, 0, n - 1, i, ch);
                } else {
                    int l = s.nextInt() - 1, r = s.nextInt() - 1;
                    int val = query(0, 0, n - 1, l, r);
                    int res = 0;
                    while (val > 0) {
                        res += val & 1;
                        val = val >> 1;
                    }
                    w.println(res);
                }
            }
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

        public String next() {
            return nextString();
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

