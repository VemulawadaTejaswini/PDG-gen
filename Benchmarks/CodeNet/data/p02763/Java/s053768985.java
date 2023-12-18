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
 * @author KharYusuf
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ESimpleStringQueries solver = new ESimpleStringQueries();
        solver.solve(1, in, out);
        out.close();
    }

    static class ESimpleStringQueries {
        public void solve(int testNumber, FastReader s, PrintWriter w) {
            int n = s.nextInt();
            char[] c = s.next().toCharArray();
            int q = s.nextInt();
            segtree seg = new segtree(n, c);
            seg.build(0, n - 1, 1);
            while (q-- > 0) {
                if (s.nextInt() == 1) seg.modify(0, n - 1, s.nextInt() - 1, s.nextChar(), 1);
                else {
                    int[] f = seg.query(s.nextInt() - 1, s.nextInt() - 1, 0, n - 1, 1);
                    int ans = 0;
                    for (int i = 0; i < 26; i++) if (f[i] > 0) ans++;
                    w.println(ans);
                }
            }
        }

        public class segtree {
            public final int n;
            public int[][] t;
            char[] a;

            public segtree(int n, char[] a) {
                this.n = n;
                t = new int[n << 2][26];
                this.a = a;
            }

            public void build(int s, int e, int n) {
                if (s == e) {
                    t[n][a[s] - 'a'] = 1;
                    return;
                }
                int mid = s + e >> 1;
                build(s, mid, n << 1);
                build(mid + 1, e, n << 1 | 1);
                t[n] = combine(t[n << 1], t[n << 1 | 1]);
            }

            public void modify(int s, int e, int pos, char val, int n) {
                if (s > pos || e < pos) return;
                if (s == e) {
                    t[n] = new int[26];
                    t[n][val - 'a'] = 1;
                    return;
                }
                int mid = s + e >> 1;
                modify(s, mid, pos, val, n << 1);
                modify(mid + 1, e, pos, val, n << 1 | 1);
                t[n] = combine(t[n << 1], t[n << 1 | 1]);
            }

            public int[] query(int qs, int qe, int s, int e, int n) {
                if (s > qe || e < qs) return new int[26];
                if (s >= qs && e <= qe) return t[n];
                int mid = s + e >> 1;
                return combine(query(qs, qe, s, mid, n << 1), query(qs, qe, mid + 1, e, n << 1 | 1));
            }

            public int[] combine(int[] a, int[] b) {
                int[] f = new int[26];
                for (int i = 0; i < 26; i++) f[i] = a[i] + b[i];
                return f;
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

            if (numChars == -1)
                throw new InputMismatchException();

            if (curChar >= numChars) {

                curChar = 0;

                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (numChars <= 0)
                    return -1;
            }

            return buf[curChar++];
        }

        public int nextInt() {

            int c = read();

            while (isSpaceChar(c))
                c = read();

            int sgn = 1;

            if (c == '-') {
                sgn = -1;
                c = read();
            }

            int res = 0;

            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();

                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));

            return res * sgn;
        }

        public char nextChar() {

            int c = read();

            while (isSpaceChar(c))
                c = read();

            return (char) c;
        }

        public String next() {

            int c = read();

            while (isSpaceChar(c))
                c = read();

            StringBuilder res = new StringBuilder();

            do {
                res.appendCodePoint(c);
                c = read();
            }
            while (!isSpaceChar(c));

            return res.toString();
        }

        public boolean isSpaceChar(int c) {

            if (filter != null)
                return filter.isSpaceChar(c);

            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

