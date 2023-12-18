import java.io.*;
import java.util.*;


public class Main {

    static int segtree[];
    
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter w = new PrintWriter(System.out);

        int n = in.nextInt();
        int a[] = in.nextIntArray(n);
        long inv = find_inv(a, n);
        w.println(inv);
        
        w.close();
    }
    
    static long find_inv(int[] a, int n) {
        long ans = 0;
        segtree = new int[4 * n];
        Pair2 p[] = new Pair2[n];
        for (int i = 0; i < n; i++)
            p[i] = new Pair2(i, a[i]);
        Arrays.sort(p);
        for (int i = 0; i < n; i++) {
            if( (i % 2) != (p[i].idx % 2) )
                ans++;
        }
        return ans / 2;
    }
    
    public static void update(int s, int e, int c, int x, int v) {
        if (s == e) {
            segtree[c] += v;
            return;
        }
        int m = (s + e) >> 1;
        if (x <= m)
            update(s, m, 2 * c + 1, x, v);
        else
            update(m + 1, e, 2 * c + 2, x, v);
        segtree[c] = merge(segtree[2 * c + 1], segtree[2 * c + 2]);
    }

    public static int find(int s, int e, int c, int l, int r) {
        if (s == l && e == r)
            return segtree[c];
        int m = (s + e) >> 1;
        if (r <= m)
            return find(s, m, 2 * c + 1, l, r);
        if (l > m)
            return find(m + 1, e, 2 * c + 2, l, r);
        return merge(find(s, m, 2 * c + 1, l, m), find(m + 1, e, 2 * c + 2, m + 1, r));
    }

    public static int merge(int a, int b) {
        return a + b;
    }
    
    static class Pair2 implements Comparable<Pair2> {
        int idx, val;

        Pair2(int i, int v) {
            idx = i;
            val = v;
        }

        public int compareTo(Pair2 o) {
            if (val != o.val)
                return Integer.compare(val, o.val);
            return Integer.compare(idx, o.idx);
        }

        public String toString() {
            return idx + " " + val;
        }
    }
    

    static class InputReader {

        private final InputStream stream;
        private final byte[] buf = new byte[8192];
        private int curChar, snumChars;
        private SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int snext() {
            if (snumChars == -1)
                throw new InputMismatchException();
            if (curChar >= snumChars) {
                curChar = 0;
                try {
                    snumChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (snumChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = snext();
            while (isSpaceChar(c)) {
                c = snext();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = snext();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = snext();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public long nextLong() {
            int c = snext();
            while (isSpaceChar(c)) {
                c = snext();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = snext();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = snext();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public int[] nextIntArray(int n) {
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            return a;
        }

        public String readString() {
            int c = snext();
            while (isSpaceChar(c)) {
                c = snext();
            }
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = snext();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public String nextLine() {
            int c = snext();
            while (isSpaceChar(c))
                c = snext();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = snext();
            } while (!isEndOfLine(c));
            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        private boolean isEndOfLine(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
        }
    }
}