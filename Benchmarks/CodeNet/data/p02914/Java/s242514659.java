import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;


public class Main {
    public static void main(String[] args) {
        StringBuilder out = new StringBuilder();
        solve(out);
        PrintWriter pw = new PrintWriter(System.out);
        pw.println(out);
        pw.flush();
        pw.close();
    }

    public static void solve(StringBuilder out) {
        int n = In.ni();
        long[] a = In.nl(n);
        long x = 0;
        for (long e : a) x ^= e;
        int[] rs = new int[64 - Long.bitCount(x)];
        int[] rm = new int[64 - rs.length];
        long ans = 0;
        for (int i = 63, mi = 0, si = 0; i >= 0; i--) {
            if (BitUtil.test(x, i)) {
                ans |= 1l << i;
                rm[mi++] = i;
            } else {
                rs[si++] = i;
            }
        }
        long[] b = new long[n];
        for (int i = 0; i < n; i++) {
            b[i] = a[i];
            for (int j : rm) b[i] = removeBit(b[i], j);
        }
        ArrayList<Long> bases = new ArrayList<>();
        for (long e : b) {
            for (long v : bases) e = Math.min(e, e ^ v);
            if (e != 0) bases.add(e);
        }
        Collections.sort(bases, Collections.reverseOrder());
        long y = 0;
        for (long e : bases) y = Math.max(y, y ^ e);
        long h = 0;
        for (int i = 0; i < rs.length; i++) if (BitUtil.test(y, i)) h |= 1l << rs[rs.length - 1 - i];
        out.append(ans + (h << 1));
    }

    public static long removeBit(long e, int i) {
        long maskl = ((1l << i) - 1);
        long masku = ~maskl;
        return ((e >> 1) & masku) | (e & maskl);
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
final class BitUtil {
    private static final int[] INT_MASK = {
        0x0000_0000, 
        0x0000_0001, 0x0000_0003, 0x0000_0007, 0x0000_000f, 
        0x0000_001f, 0x0000_003f, 0x0000_007f, 0x0000_00ff, 
        0x0000_01ff, 0x0000_03ff, 0x0000_07ff, 0x0000_0fff,
        0x0000_1fff, 0x0000_3fff, 0x0000_7fff, 0x0000_ffff, 
        0x0001_ffff, 0x0003_ffff, 0x0007_ffff, 0x000f_ffff, 
        0x001f_ffff, 0x003f_ffff, 0x007f_ffff, 0x00ff_ffff, 
        0x01ff_ffff, 0x03ff_ffff, 0x07ff_ffff, 0x0fff_ffff, 
        0x1fff_ffff, 0x3fff_ffff, 0x7fff_ffff, 0xffff_ffff
    };
    private static final long[] LONG_MASK = {
        0x0000_0000_0000_0000l, 
        0x0000_0000_0000_0001l, 0x0000_0000_0000_0003l, 0x0000_0000_0000_0007l, 0x0000_0000_0000_000fl, 
        0x0000_0000_0000_001fl, 0x0000_0000_0000_003fl, 0x0000_0000_0000_007fl, 0x0000_0000_0000_00ffl, 
        0x0000_0000_0000_01ffl, 0x0000_0000_0000_03ffl, 0x0000_0000_0000_07ffl, 0x0000_0000_0000_0fffl,
        0x0000_0000_0000_1fffl, 0x0000_0000_0000_3fffl, 0x0000_0000_0000_7fffl, 0x0000_0000_0000_ffffl, 
        0x0000_0000_0001_ffffl, 0x0000_0000_0003_ffffl, 0x0000_0000_0007_ffffl, 0x0000_0000_000f_ffffl, 
        0x0000_0000_001f_ffffl, 0x0000_0000_003f_ffffl, 0x0000_0000_007f_ffffl, 0x0000_0000_00ff_ffffl, 
        0x0000_0000_01ff_ffffl, 0x0000_0000_03ff_ffffl, 0x0000_0000_07ff_ffffl, 0x0000_0000_0fff_ffffl, 
        0x0000_0000_1fff_ffffl, 0x0000_0000_3fff_ffffl, 0x0000_0000_7fff_ffffl, 0x0000_0000_ffff_ffffl,
        0x0000_0001_ffff_ffffl, 0x0000_0003_ffff_ffffl, 0x0000_0007_ffff_ffffl, 0x0000_000f_ffff_ffffl, 
        0x0000_001f_ffff_ffffl, 0x0000_003f_ffff_ffffl, 0x0000_007f_ffff_ffffl, 0x0000_00ff_ffff_ffffl, 
        0x0000_01ff_ffff_ffffl, 0x0000_03ff_ffff_ffffl, 0x0000_07ff_ffff_ffffl, 0x0000_0fff_ffff_ffffl,
        0x0000_1fff_ffff_ffffl, 0x0000_3fff_ffff_ffffl, 0x0000_7fff_ffff_ffffl, 0x0000_ffff_ffff_ffffl, 
        0x0001_ffff_ffff_ffffl, 0x0003_ffff_ffff_ffffl, 0x0007_ffff_ffff_ffffl, 0x000f_ffff_ffff_ffffl, 
        0x001f_ffff_ffff_ffffl, 0x003f_ffff_ffff_ffffl, 0x007f_ffff_ffff_ffffl, 0x00ff_ffff_ffff_ffffl, 
        0x01ff_ffff_ffff_ffffl, 0x03ff_ffff_ffff_ffffl, 0x07ff_ffff_ffff_ffffl, 0x0fff_ffff_ffff_ffffl, 
        0x1fff_ffff_ffff_ffffl, 0x3fff_ffff_ffff_ffffl, 0x7fff_ffff_ffff_ffffl, 0xffff_ffff_ffff_ffffl
    };
    private BitUtil(){}
    public static boolean test(final long n, final int bit) {return (n & (1l << bit)) != 0;}
    public static boolean test(final int n, final int bit) {return (n & (1 << bit)) != 0;}
    public static long set(final long n, final int bit) {return n | (1l << bit);}
    public static int set(final int n, final int bit) {return n | (1 << bit);}
    public static long set(final long n, final int from, final int to) {return n | (LONG_MASK[to - from] << from);}
    public static int set(final int n, final int from, final int to) {return n | (INT_MASK[to - from] << from);}
    public static long set(final long n, final int bit, final boolean b) {return b ? n | (1l << bit) : n & ~(1l << bit);}
    public static int set(final int n, final int bit, final boolean b) {return b ? n | (1 << bit) : n & ~(1 << bit);}
    public static long set(final long n, final int from, final int to, final boolean b) {return b ? n | (LONG_MASK[to - from] << from) : n & ~(LONG_MASK[to - from] << from);}
    public static int set(final int n, final int from, final int to, final boolean b) {return b ? n | (INT_MASK[to - from] << from) : n & ~(INT_MASK[to - from] << from);}
    public static long clear(final long n, final int bit) {return n & ~(1l << bit);}
    public static int clear(final int n, final int bit) {return n & ~(1 << bit);}
    public static long clear(final long n, final int from, final int to) {return n & ~(LONG_MASK[to - from] << from);}
    public static int clear(final int n, final int from, final int to) {return n & ~(INT_MASK[to - from] << from);}
    public static long mask(final long n, final int bit) {return n & (1l << bit);}
    public static int mask(final int n, final int bit) {return n & (1 << bit);}
    public static long mask(final long n, final int from, final int to) {return n & (LONG_MASK[to - from] << from);}
    public static int mask(final int n, final int from, final int to) {return n & (INT_MASK[to - from] << from);}
    public static int get(final long n, final int bit) {return (n & (1l << bit)) == 0 ? 1 : 0;}
    public static int get(final int n, final int bit) {return (n & (1 << bit)) == 0 ? 1 : 0;}
    public static long flip(final long n, final int bit) {return n ^ (1l << bit);}
    public static int flip(final int n, final int bit) {return n ^ (1 << bit);}
    public static long flip(final long n, final int from, final int to) {return n ^ (LONG_MASK[to - from] << from);}
    public static int flip(final int n, final int from, final int to) {return n ^ (INT_MASK[to - from] << from);}
    public static ArrayList<Integer> ones(final long n) {
        final ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0; i < Long.SIZE; i++) if (test(n, i)) l.add(i);
        return l;
    }
    public static ArrayList<Integer> ones(final int n) {
        final ArrayList<Integer> set = new ArrayList<>();
        for (int i = 0; i < Integer.SIZE; i++) if (test(n, i)) set.add(i);
        return set;
    }
    public static int msbPlace(final long n) {return Long.SIZE - Long.numberOfLeadingZeros(n) - 1;}
    public static int msbPlace(final int n) {return Integer.SIZE - Integer.numberOfLeadingZeros(n) - 1;}
    public static int lsbPlace(final long n) {return Long.numberOfTrailingZeros(n);}
    public static int lsbPlace(final int n) {return Integer.numberOfTrailingZeros(n);}
}
