import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.TreeMap;
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
        ESpaceshipSolitaire solver = new ESpaceshipSolitaire();
        solver.solve(1, in, out);
        out.close();
    }

    static class ESpaceshipSolitaire {
        public void solve(int testNumber, FastReader s, PrintWriter w) {
            int n = s.nextInt();
            long[] goal = new long[n];
            for (int i = 0; i < n; i++) goal[i] = s.nextInt();

            segtree seg = new segtree(n, goal);
            seg.build(0, n - 1, 1);

            TreeMap<pair<Integer, Integer>, Integer> t = new TreeMap<>();
            int q = s.nextInt();
            while (q-- > 0) {
                pair<Integer, Integer> p = new pair<>(s.nextInt(), s.nextInt());
                int u = s.nextInt() - 1;
                if (t.containsKey(p)) seg.modify(0, n - 1, t.remove(p), 1, 1);
                if (u >= 0) {
                    t.put(p, u);
                    seg.modify(0, n - 1, u, -1, 1);
                }
                w.println(seg.t[1]);
            }
        }

        public class segtree {
            public int n;
            public long[] t;
            public long[] a;

            public segtree(int n, long[] a) {
                this.n = n;
                t = new long[n << 2];
                this.a = a;
            }

            public void build(int s, int e, int n) {
                if (s == e) {
                    t[n] = a[s];
                    return;
                }
                int mid = s + e >> 1;
                build(s, mid, n << 1);
                build(mid + 1, e, n << 1 | 1);
                t[n] = t[n << 1] + t[n << 1 | 1];
            }

            public void modify(int s, int e, int pos, int val, int n) {
                if (s > pos || e < pos) return;
                if (s == e) {
                    a[s] += val;
                    t[n] = Math.max(a[s], 0);
                    return;
                }
                int mid = s + e >> 1;
                modify(s, mid, pos, val, n << 1);
                modify(mid + 1, e, pos, val, n << 1 | 1);
                t[n] = t[n << 1] + t[n << 1 | 1];
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

        public boolean isSpaceChar(int c) {

            if (filter != null)
                return filter.isSpaceChar(c);

            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }

    static class pair<U extends Comparable<U>, V extends Comparable<V>> implements Comparable<pair<U, V>> {
        public U x;
        public V y;

        public pair(U x, V y) {
            this.x = x;
            this.y = y;
        }

        public int compareTo(pair<U, V> other) {
            int i = x.compareTo(other.x);
            if (i != 0) return i;
            return y.compareTo(other.y);
        }

        public String toString() {
            return x.toString() + " " + y.toString();
        }

        public boolean equals(Object obj) {
            if (this.getClass() != obj.getClass()) return false;
            pair<U, V> other = (pair<U, V>) obj;
            return x.equals(other.x) && y.equals(other.y);
        }

        public int hashCode() {
            return 31 * x.hashCode() + y.hashCode();
        }

    }
}

