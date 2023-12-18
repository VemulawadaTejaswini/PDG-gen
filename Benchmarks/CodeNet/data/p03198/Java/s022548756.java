import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.PrimitiveIterator;
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
        long[] dsc = new long[n + 1];
        IntStack ds = new IntStack(n);
        for (int i = 1; i < n; i++) {
            dsc[i + 1] = dsc[i];
            if (a[i - 1] >= a[i]) {
                long v = a[i];
                while (a[i - 1] >= v << 2) {
                    ds.add(i);
                    v <<= 2;
                }
            } else {
                long v = a[i - 1];
                while (a[i] > v) {
                    v <<= 2;
                    int j = ds.size() > 0 ? ds.poll() : 0;
                    dsc[i + 1] += i - j;
                }
            }
        }
        long[] asc = new long[n + 1];
        IntStack as = new IntStack(n);
        for (int i = n - 2; i >= 0; i--) {
            asc[i] = asc[i + 1];
            if (a[i] <= a[i + 1]) {
                long v = a[i];
                while (v << 2 <= a[i + 1]) {
                    as.add(i);
                    v <<= 2;
                }
            } else {
                long v = a[i + 1];
                while (a[i] > v) {
                    v <<= 2;
                    int j = as.size() > 0 ? as.poll() : n - 1;
                    asc[i] += j - i;
                }
            }
        }
        long min = Const.LINF;
        for (int i = 0; i <= n; i++) {
            min = Math.min(min, dsc[i] * 2 + asc[i] * 2 + i);
        }
        out.append(min);
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
 * 
 * Stack for int type.
 */
final class IntStack implements Iterable<Integer> {
    private static final int DEFAULT_SIZE = 64;
    private int[] s;
    private int tail = 0;
    public IntStack(final int capacity) {this.s = new int[capacity];}
    public IntStack() {this(DEFAULT_SIZE);}
    public int peek() {
        if (tail == 0) throw new NoSuchElementException("No Elements.");
        return s[tail - 1];
    }
    public int getFromHead(int index) {
        if (index >= tail || index < 0) throw new NoSuchElementException("index out of Bounds.");
        return s[index];
    }
    public int getFromTail(int index) {
        if (index >= tail || index < 0) throw new NoSuchElementException("index out of Bounds.");
        return s[tail - 1 - index];
    }
    public void add(final int v) {
        if (tail == s.length) grow();
        s[tail++] = v;
    }
    public void add(final int... vals) {for (int v : vals) add(v);}
    public int poll() {
        if (tail == 0) throw new NoSuchElementException("No Elements.");
        return s[--tail];
    }
    public int size() {return tail;}
    private void grow() {
        final int[] grown = new int[s.length << 1];
        System.arraycopy(s, 0, grown, 0, tail);
        s = grown;
    }
    public PrimitiveIterator.OfInt iterator() {return new IntStackIterator();}
    private class IntStackIterator implements PrimitiveIterator.OfInt {
        private int i = tail - 1;
        public boolean hasNext() {return i >= 0;}
        public int nextInt() {return s[i--];}
    }
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
