import java.io.*;
import java.util.*;

public class Main {
    private static InputStream is;
    private static PrintWriter out;
    private static String INPUT = "";

    public class UnionFind {
        private static final int MAX = 400 * 400 + 5;
        int[] par = new int[MAX], rank = new int[MAX], cnt = new int[MAX];

        void init() {
            init(MAX);
        }

        void init(int n) {
            for (int i = 0; i < n; ++i) {
                par[i] = i;
            }
            Arrays.fill(rank, 0);
            Arrays.fill(cnt, 1);
        }

        int find(int x) {
            if (par[x] == x) return x;
            else {
                return par[x] = find(par[x]);
            }
        }

        void unite(int x, int y) {
            x = find(x);
            y = find(y);
            if (x == y) return;
            cnt[x] = cnt[y] = cnt[x] + cnt[y];
            if (rank[x] < rank[y]) {
                par[x] = y;
            } else {
                par[y] = x;
                if (rank[x] == rank[y]) ++rank[x];
            }
        }

        boolean same(int x, int y) {
            return find(x) == find(y);
        }

        int count(int x) {
            return cnt[find(x)];
        }
    }

    void solve() {
        int n = ni(), m = ni();
        UnionFind unionFind = new UnionFind();
        unionFind.init(n);
        for (int i = 0; i < m; ++i) {
            int x = ni() - 1, y = ni() - 1, z = ni();
            unionFind.unite(x, y);
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; ++i) {
            set.add(unionFind.find(i));
        }
        out.println(set.size());
    }

    public static void main(String[] args) throws Exception {
        is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
        out = new PrintWriter(System.out);
        new Main().solve();
        out.flush();
    }

    private static boolean eof() {
        if (lenbuf == -1) return true;
        int lptr = ptrbuf;
        while (lptr < lenbuf)
            if (!isSpaceChar(inbuf[lptr++])) return false;

        try {
            is.mark(1000);
            while (true) {
                int b = is.read();
                if (b == -1) {
                    is.reset();
                    return true;
                } else if (!isSpaceChar(b)) {
                    is.reset();
                    return false;
                }
            }
        } catch (IOException e) {
            return true;
        }
    }

    private static byte[] inbuf = new byte[1024];
    static int lenbuf = 0, ptrbuf = 0;

    private static int readByte() {
        if (lenbuf == -1) throw new InputMismatchException();
        if (ptrbuf >= lenbuf) {
            ptrbuf = 0;
            try {
                lenbuf = is.read(inbuf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (lenbuf <= 0) return -1;
        }
        return inbuf[ptrbuf++];
    }

    private static boolean isSpaceChar(int c) {
        return !(c >= 33 && c <= 126);
    }

    private static int skip() {
        int b;
        while ((b = readByte()) != -1 && isSpaceChar(b))
            ;
        return b;
    }

    private static double nd() {
        return Double.parseDouble(ns());
    }

    private static char nc() {
        return (char) skip();
    }

    private static String ns() {
        int b = skip();
        StringBuilder sb = new StringBuilder();
        while (!(isSpaceChar(b))) { // when nextLine, (isSpaceChar(b) && b != ' ')
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    private static char[] ns(int n) {
        char[] buf = new char[n];
        int b = skip(), p = 0;
        while (p < n && !(isSpaceChar(b))) {
            buf[p++] = (char) b;
            b = readByte();
        }
        return n == p ? buf : Arrays.copyOf(buf, p);
    }

    private static char[][] nm(int n, int m) {
        char[][] map = new char[n][];
        for (int i = 0; i < n; i++)
            map[i] = ns(m);
        return map;
    }

    private static int[] na(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = ni();
        return a;
    }

    private static long[] nal(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = nl();
        return a;
    }

    private static int ni() {
        int num = 0, b;
        boolean minus = false;
        while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
            ;
        if (b == '-') {
            minus = true;
            b = readByte();
        }

        while (true) {
            if (b >= '0' && b <= '9') {
                num = num * 10 + (b - '0');
            } else {
                return minus ? -num : num;
            }
            b = readByte();
        }
    }

    private static long nl() {
        long num = 0;
        int b;
        boolean minus = false;
        while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
            ;
        if (b == '-') {
            minus = true;
            b = readByte();
        }

        while (true) {
            if (b >= '0' && b <= '9') {
                num = num * 10 + (b - '0');
            } else {
                return minus ? -num : num;
            }
            b = readByte();
        }
    }

    private class XorShift {
        int x = 123456789;
        int y = 362436069;
        int z = 521288629;
        int w = 88675123;

        int nextInt(int n) {
            final int t = x ^ (x << 11);
            x = y;
            y = z;
            z = w;
            w = (w ^ (w >>> 19)) ^ (t ^ (t >>> 8));
            final int r = w % n;
            return r < 0 ? r + n : r;
        }
    }

    private static void tr(Object... o) {
        System.err.println(Arrays.deepToString(o));
    }
}