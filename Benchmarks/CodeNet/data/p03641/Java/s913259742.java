import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;
import static java.lang.Math.min;



public class Main {
    public static void main(String[] args) {
        StringBuilder out = new StringBuilder();
        solve(out);
        PrintWriter pw = new PrintWriter(System.out);
        pw.println(out);
        pw.flush();
        pw.close();
    }

    static int n;
    static int[] p;
    static int[] e, o;
    static RMQ te, to;

    public static void solve(StringBuilder out) {
        n = In.ni();
        p = In.ni(n, e -> e - 1);
        e = new int[n / 2];
        o = new int[n / 2];
        for (int i = 0; i < n; i += 2) {
            e[i / 2] = p[i];
            o[i / 2] = p[i + 1];
        }
        te = new RMQ(e);
        to = new RMQ(o);
        long[] ql = part(0, n);
        for (int i = 0; i < n / 2; i++) {
            out.append((ql[i] >>> 32) + 1).append(' ').append((ql[i] & 0xffff_ffffl) + 1).append(' ');
        }
    }

    public static long[] part(int l, int r) {
        if (r - l == 2) return new long[]{(((long) p[l]) << 32) | p[l + 1]};
        int m = (r - l) / 2;
        long[] ret = new long[m];
        int s, t;
        if ((l & 1) == 0) {
            ret[0] = ((long) te.query(l / 2, r / 2)) << 32;
            int k1 = te.indexOfMin(l / 2, r / 2);
            te.putInf(k1);
            ret[0] |= to.query(k1, r / 2);
            int k2 = to.indexOfMin(k1, r / 2);
            to.putInf(k2);
            s = k1 * 2;
            t = k2 * 2 + 1;
        } else {
            ret[0] = ((long) to.query(l / 2, r / 2)) << 32;
            int k1 = to.indexOfMin(l / 2, r / 2);
            to.putInf(k1);
            ret[0] |= te.query(k1 + 1, r / 2 + 1);
            int k2 = te.indexOfMin(k1 + 1, r / 2 + 1);
            te.putInf(k2);
            s = k1 * 2 + 1;
            t = k2 * 2;
        }
        int idx = 1;
        long[] pl, pm, pr;
        if (s != l) {
            pl = part(l, s);
            System.arraycopy(pl, 0, ret, idx, pl.length);
            idx += pl.length;
        } else pl = new long[0];
        if (t - s > 1) {
            pm = part(s + 1, t);
            System.arraycopy(pm, 0, ret, idx, pm.length);
            idx += pm.length;
        } else pm = new long[0];
        if (t != r - 1) {
            pr = part(t + 1, r);
            System.arraycopy(pr, 0 , ret, idx, pr.length);
            idx += pr.length;
        } else pr = new long[0];
        int i1 = 0, i2 = 0, i3 = 0;
        for (int i = 1; i < m; i++) {
            long v1 = i1 == pl.length ? Const.LINF : pl[i1];
            long v2 = i2 == pm.length ? Const.LINF : pm[i2];
            long v3 = i3 == pr.length ? Const.LINF : pr[i3];
            long min = min(v1, min(v2, v3));
            if (min == v1) {
                ret[i] = v1;
                i1++;
            } else if (min == v2) {
                ret[i] = v2;
                i2++;
            } else {
                ret[i] = v3;
                i3++;
            }
        }
        return ret;
    }
}

class RMQ {
    private final int[] t;
    private final int n;
    private final int e = Const.IINF;

    public RMQ(final int[] a) {
        int nn = 1;
        while (nn < a.length) nn <<= 1;
        this.n = nn;
        this.t = new int[n << 1];
        System.arraycopy(a, 0, t, n, a.length);
        Arrays.fill(t, n + a.length, n << 1, e);
        for (int i = n - 1; i > 0; i--) t[i] = min(t[i << 1], t[(i << 1) | 1]);
    }

    public void putInf(int i) {
        i += n;
        t[i] = e;
        while ((i >>= 1) > 0) t[i] = min(t[i << 1], t[(i << 1) | 1]);
    }

    public int query(int l, int r) {
        int min = e;
        l += n; r += n;
        while (l < r) {
            if ((l & 1) != 0) min = min(min, t[l++]);
            if ((r & 1) != 0) min = min(t[--r], min);
            l >>= 1; r >>= 1;
        }
        return min;
    }

    public int indexOfMin(int l, int r) {
        int min = query(l, r);
        int k = 1;
        while (k < n) {
            k <<= 1;
            if (t[k] != min) k |= 1;
        }
        return k - n;
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
final class In {
    public static final FastScanner fsc = new FastScanner();
    public static int ni() {return fsc.nextInt();}
    public static int[] ni(final int n) {
        final int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = fsc.nextInt();
        return a;
    }
    public static int[] ni(final int n, final IntUnaryOperator f) {
        final int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = f.applyAsInt(fsc.nextInt());
        return a;
    }
    public static int[][] ni(final int n, final int m) {
        final int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) a[i] = ni(m);
        return a;
    }
    public static int[][] ni(final int n, final int m, final IntUnaryOperator f) {
        final int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) a[i] = ni(m, f);
        return a;
    }
    public static long nl() {return fsc.nextLong();}
    public static long[] nl(final int n) {
        final long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = fsc.nextLong();
        return a;
    }
    public static long[] nl(final int n, final LongUnaryOperator f) {
        final long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = f.applyAsLong(fsc.nextLong());
        return a;
    }
    public static long[][] nl(final int n, final int m) {
        final long[][] a = new long[n][m];
        for (int i = 0; i < n; i++) a[i] = nl(m);
        return a;
    }
    public static long[][] nl(final int n, final int m, final LongUnaryOperator f) {
        final long[][] a = new long[n][m];
        for (int i = 0; i < n; i++) a[i] = nl(m, f);
        return a;
    }
    public static char[] nc() {return fsc.next().toCharArray();}
    public static char[][] nc(final int n) {
        final char[][] c = new char[n][];
        for (int i = 0; i < n; i++) c[i] = nc();
        return c;
    }
    public static double nd() {return fsc.nextDouble();}
    public static double[] nd(final int n) {
        final double[] a = new double[n];
        for (int i = 0; i < n; i++) a[i] = fsc.nextDouble();
        return a;
    }
    public static double[][] nd(final int n, final int m) {
        final double[][] a = new double[n][m];
        for (int i = 0; i < n; i++) a[i] = nd(m);
        return a;
    }
    public static String ns() {return fsc.next();}
    public static String[] ns(final int n) {
        final String[] s = new String[n];
        for (int i = 0; i < n; i++) s[i] = fsc.next();
        return s;
    }
    public static boolean[][] grid(final int h, final int w, final char trueCharacter) {
        final boolean[][] grid = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            final char[] s = fsc.next().toCharArray();
            for (int j = 0; j < w; j++) grid[i][j] = s[j] == trueCharacter;
        }
        return grid;
    }
}


final class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) return true;
        ptr = 0;
        try {buflen = in.read(buffer);}
        catch (final IOException e) {e.printStackTrace();}
        return buflen > 0;
    }
    private int readByte() {return hasNextByte() ? buffer[ptr++] : -1;}
    public boolean hasNext() {
        while (hasNextByte() && !(33 <= buffer[ptr] && buffer[ptr] <= 126)) ptr++;
        return hasNextByte();
    }
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        final StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (33 <= b && b <= 126) {sb.appendCodePoint(b); b = readByte();}
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {minus = true; b = readByte();}
        if (b < '0' || '9' < b) throw new NumberFormatException();
        for (; ; b = readByte()) {
            if ('0' <= b && b <= '9') n = n * 10 + b - '0';
            else if (b == -1 || !(33 <= b && b <= 126)) return minus ? -n : n;
            else throw new NumberFormatException();
        }
    }
    public int nextInt() {return Math.toIntExact(nextLong());}
    public double nextDouble() {return Double.parseDouble(next());}
}

/**
 * @author https://atcoder.jp/users/suisen
 */
class Const {
    public static final long MOD7 = 1_000_000_007;
    public static final long MOD9 = 1_000_000_009;
    public static final long MOD99 = 998_244_353;

    public static final long LINF = Long.MAX_VALUE >> 2;
    public static final int IINF = Integer.MAX_VALUE >> 1;
    public static final double DINF = 1e150;

    public static final double SDELTA = 1e-12;
    public static final double DELTA = 1e-9;
    public static final double LDELTA = 1e-6;

    public static final int[] dx8 = {1, 0, -1, 0, 1, -1, -1, 1};
    public static final int[] dy8 = {0, 1, 0, -1, 1, 1, -1, -1};
    public static final int[] dx4 = {1, 0, -1, 0};
    public static final int[] dy4 = {0, 1, 0, -1};

    private Const(){}
}
