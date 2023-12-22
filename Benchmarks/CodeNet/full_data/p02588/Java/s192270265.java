import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;


public class Main {
    public static void main(String[] args) throws Exception {
        Field f = System.out.getClass().getDeclaredField("autoFlush");
        f.setAccessible(true);
        f.set(System.out, false);
        execute(System.in, System.out);
    }

    public static void execute(InputStream in, OutputStream out) {
        ExtendedScanner s = new ExtendedScanner(in);
        Out o = new Out(out);
        solve(s, o);
        o.flush();
        o.close();
    }

    public static void solve(ExtendedScanner sc, Out out) {
        int n = sc.nextInt();
        int[] t = new int[n];
        int[] f = new int[n];
        for (int i = 0; i < n; i++) {
            String a = sc.next();
            if (a.contains(".")) {
                String[] as = a.split("\\.");
                long v0 = Long.parseLong(as[0]);
                long v1 = Long.parseLong(as[1]);
                int l = as[1].length();
                long ai = v0;
                for (int k = 0; k < l; k++) {
                    ai *= 10;
                }
                ai += v1;
                while (ai % 2 == 0) {
                    ai /= 2;
                    t[i]++;
                }
                while (ai % 5 == 0) {
                    ai /= 5;
                    f[i]++;
                }
                t[i] -= l;
                f[i] -= l;
            } else {
                int ai = Integer.parseInt(a);
                while (ai % 2 == 0) {
                    ai /= 2;
                    t[i]++;
                }
                while (ai % 5 == 0) {
                    ai /= 5;
                    f[i]++;
                }
            }
        }
        int bias = 64;
        long[][] a = new long[128][128];
        for (int i = 0; i < n; i++) {
            a[t[i] + bias][f[i] + bias]++;
        }
        long[][] s = CumulativeSum.build(a);
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += CumulativeSum.sum(s, -t[i] + bias, -f[i] + bias, 128, 128);
            if (t[i] >= 0 && f[i] >= 0) ans--;
        }
        out.writeln(ans / 2);
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
class BasicScanner {
    private final InputStream in;
    private final byte[] buf = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    public BasicScanner(InputStream in) {this.in = in;}
    private boolean hasNextByte() {
        if (ptr < buflen) return true;
        ptr = 0;
        try {buflen = in.read(buf);}
        catch (final IOException e) {e.printStackTrace();}
        return buflen > 0;
    }
    private int readByte() {return hasNextByte() ? buf[ptr++] : -1;}
    public boolean hasNext() {
        while (hasNextByte() && !(33 <= buf[ptr] && buf[ptr] <= 126)) ptr++;
        return hasNextByte();
    }
    private StringBuilder nextSequence() {
        if (!hasNext()) throw new NoSuchElementException();
        final StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (33 <= b && b <= 126) {sb.appendCodePoint(b); b = readByte();}
        return sb;
    }
    public char nextChar() {
        return (char) readByte();
    }
    public String next() {
        return nextSequence().toString();
    }
    public String next(int len) {
        return new String(nextChars(len));
    }
    public char[] nextChars() {
        final StringBuilder sb = nextSequence();
        int l = sb.length();
        char[] dst = new char[l];
        sb.getChars(0, l, dst, 0);
        return dst;
    }
    public char[] nextChars(int len) {
        if (!hasNext()) throw new NoSuchElementException();
        char[] s = new char[len];
        int i = 0;
        int b = readByte();
        while (33 <= b && b <= 126 && i < len) {s[i++] = (char) b; b = readByte();}
        if (i != len) throw new NoSuchElementException(String.format("length %d is longer than the sequence.", len));
        return s;
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {minus = true; b = readByte();}
        if (b < '0' || '9' < b) throw new NumberFormatException();
        while (true) {
            if ('0' <= b && b <= '9') n = n * 10 + b - '0';
            else if (b == -1 || !(33 <= b && b <= 126)) return minus ? -n : n;
            else throw new NumberFormatException();
            b = readByte();
        }
    }
    public int nextInt() {return Math.toIntExact(nextLong());}
    public double nextDouble() {return Double.parseDouble(next());}
}

/**
 * @author https://atcoder.jp/users/suisen
 */
final class CumulativeSum {
    /**
     * s[i] is the sum of {a[x] | 0 <= x < i}.
     * @param a
     * @return cumulative sum array of a.
     */
    public static int[] build(final int[] a) {
        final int n = a.length;
        final int[] s = new int[n + 1];
        for (int i = 1; i <= n; i++) s[i] = s[i - 1] + a[i - 1];
        return s;
    }
    /**
     * s[i][j] is the sum of {a[x][y] | 0 <= x < i and 0 <= y < j}.
     * @param a
     * @return
     */
    public static int[][] build(final int[][] a) {
        final int n = a.length;
        final int m = a[0].length;
        final int[][] s = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) for (int j = 1; j <= m; j++) {
            s[i][j] = s[i - 1][j] + s[i][j - 1] - s[i - 1][j - 1] + a[i - 1][j - 1];
        }
        return s;
    }
    public static int[][][] build(final int[][][] a) {
        final int n = a.length;
        final int m = a[0].length;
        final int l = a[0][0].length;
        final int[][][] s = new int[n + 1][m + 1][l + 1];
        for (int i = 1; i <= n; i++) for (int j = 1; j <= m; j++) for (int k = 1; k <= l; k++) {
            s[i][j][k] = a[i - 1][j - 1][k - 1] + s[i - 1][j][k] + s[i][j - 1][k] + s[i][j][k - 1]
                - s[i - 1][j - 1][k] - s[i][j - 1][k - 1] - s[i - 1][j][k - 1] + s[i - 1][j - 1][k - 1];
        }
        return s;
    }
    /**
     * s[i] is the sum of {a[x] | 0 <= x < i}.
     * @param a
     * @return cumulative sum array of a.
     */
    public static long[] build(final long[] a) {
        final int n = a.length;
        final long[] s = new long[n + 1];
        for (int i = 1; i <= n; i++) s[i] = s[i - 1] + a[i - 1];
        return s;
    }
    /**
     * s[i][j] is the sum of {a[x][y] | 0 <= x < i and 0 <= y < j}.
     * @param a
     * @return
     */
    public static long[][] build(final long[][] a) {
        final int n = a.length;
        final int m = a[0].length;
        final long[][] s = new long[n + 1][m + 1];
        for (int i = 1; i <= n; i++) for (int j = 1; j <= m; j++) {
            s[i][j] = s[i - 1][j] + s[i][j - 1] - s[i - 1][j - 1] + a[i - 1][j - 1];
        }
        return s;
    }

    public static long[][][] build(final long[][][] a) {
        final int n = a.length;
        final int m = a[0].length;
        final int l = a[0][0].length;
        final long[][][] s = new long[n + 1][m + 1][l + 1];
        for (int i = 1; i <= n; i++) for (int j = 1; j <= m; j++) for (int k = 1; k <= l; k++) {
            s[i][j][k] = a[i - 1][j - 1][k - 1] + s[i - 1][j][k] + s[i][j - 1][k] + s[i][j][k - 1]
                - s[i - 1][j - 1][k] - s[i][j - 1][k - 1] - s[i - 1][j][k - 1] + s[i - 1][j - 1][k - 1];
        }
        return s;
    }
    public static int sum(final int[] s, final int l, final int r) {return s[r] - s[l];}
    public static long sum(final long[] s, final int l, final int r) {return s[r] - s[l];}
    public static int sum(final int[][] s, final int y1, final int x1, final int y2, final int x2) {
        return s[y2][x2] - s[y1][x2] - s[y2][x1] + s[y1][x1];
    }
    public static long sum(final long[][] s, final int y1, final int x1, final int y2, final int x2) {
        return s[y2][x2] - s[y1][x2] - s[y2][x1] + s[y1][x1];
    }
    public static int sum(final int[][][] s, final int i1, final int j1, final int k1, final int i2, final int j2,
            final int k2) {
        final int p0 = s[i2][j2][k2];
        final int n1 = s[i1][j2][k2] + s[i2][j1][k2] + s[i2][j2][k1];
        final int p2 = s[i1][j1][k2] + s[i2][j1][k1] + s[i1][j2][k1];
        final int n3 = s[i1][j1][k1];
        return p0 - n1 + p2 - n3;
    }
    public static long sum(final long[][][] s, final int i1, final int j1, final int k1, final int i2, final int j2,
            final int k2) {
        final long p0 = s[i2][j2][k2];
        final long n1 = s[i1][j2][k2] + s[i2][j1][k2] + s[i2][j2][k1];
        final long p2 = s[i1][j1][k2] + s[i2][j1][k1] + s[i1][j2][k1];
        final long n3 = s[i1][j1][k1];
        return p0 - n1 + p2 - n3;
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
class Out {
    private final OutputStream out;
    private byte[] buf = new byte[1024];
    private int ptr = 0;
    private static final int AUTO_FLUSH_THRETHOLD = 1 << 17;

    public Out(OutputStream out) {
        this.out = out;
    }

    public void flush() {
        try {
            out.write(buf, 0, ptr);
            out.flush();
            ptr = 0;
        } catch (IOException e) {e.printStackTrace();}
    }

    public void close() {
        try {out.close();} catch (IOException e) {e.printStackTrace();}
    }

    public Out writeln() {return write('\n');}
    public Out writeln(Object o) {return write(o).write('\n');}
    public Out writeln(String s) {return write(s).write('\n');}
    public Out writeln(char[] c) {return write(c).write('\n');}
    public Out writeln(char   c) {return write(c).write('\n');}
    public Out writeln(byte   b) {return write(b).write('\n');}
    public Out writeln(int    x) {return write(x).write('\n');}
    public Out writeln(long   x) {return write(x).write('\n');}
    public Out writeln(double d) {return write(d).write('\n');}

    public Out writeSpace() {return write(' ');}
    
    public Out write(Object o) {
        return write(o.toString());
    }

    public Out write(String s) {
        try {
            Field strValueField = s.getClass().getDeclaredField("value");
            strValueField.setAccessible(true);
            byte[] b = (byte[]) strValueField.get(s);
            int l = s.length();
            if (l > AUTO_FLUSH_THRETHOLD) {
                flush();
                int i = 0;
                while (i + AUTO_FLUSH_THRETHOLD < l) {
                    out.write(b, i, AUTO_FLUSH_THRETHOLD);
                    out.flush();
                    i += AUTO_FLUSH_THRETHOLD;
                }
                ensureCapacity(l - i);
                System.arraycopy(b, i, buf, 0, l - i);
                ptr = l - i;
            } else {
                ensureCapacity(ptr + l);
                System.arraycopy(b, 0, buf, ptr, l);
                ptr += l;
            }
        } catch (Exception e) {e.printStackTrace();}
        return this;
    }

    public Out write(char[] c) {
        int l = c.length;
        if (l > AUTO_FLUSH_THRETHOLD) {
            flush();
            ensureCapacity(AUTO_FLUSH_THRETHOLD);
            int i = 0;
            while (i + AUTO_FLUSH_THRETHOLD < l) {
                for (int j = 0; j < AUTO_FLUSH_THRETHOLD; j++) {
                    buf[ptr++] = (byte) c[i + j];
                }
                flush();
                i += AUTO_FLUSH_THRETHOLD;
            }
            for (; i < l; i++) {
                buf[ptr++] = (byte) c[i];
            }
        } else {
            ensureCapacity(ptr + l);
            for (char ch : c) buf[ptr++] = (byte) ch;
        }
        return this;
    }

    public Out write(char c) {
        ensureCapacity(ptr + 1);
        buf[ptr++] = (byte) c;
        return this;
    }

    public Out write(byte b) {
        ensureCapacity(ptr + 1);
        buf[ptr++] = b;
        return this;
    }

    public Out write(int x) {
        if (x == 0) {
            ensureCapacity(ptr + 1);
            buf[ptr++] = '0';
            return this;
        }
        int d = stringSize(x);
        ensureCapacity(ptr + d);
        if (x < 0) {
            buf[ptr++] = '-';
            x = -x;
            d--;
        }
        int j = ptr + d; 
        while (x > 0) {
            buf[--j] = (byte) ('0' + (x % 10));
            x /= 10;
        }
        ptr += d;
        return this;
    }

    public Out write(long x) {
        if (x == 0) {
            ensureCapacity(ptr + 1);
            buf[ptr++] = '0';
            return this;
        }
        int d = stringSize(x);
        ensureCapacity(ptr + d);
        if (x < 0) {
            buf[ptr++] = '-';
            x = -x;
            d--;
        }
        int j = ptr + d; 
        while (x > 0) {
            buf[--j] = (byte) ('0' + (x % 10));
            x /= 10;
        }
        ptr += d;
        return this;
    }

    public Out write(double d) {
        return write(Double.toString(d));
    }

    private void ensureCapacity(int cap) {
        if (cap > AUTO_FLUSH_THRETHOLD) {
            flush();
        }
        if (cap >= buf.length) {
            int newLength = buf.length;
            while (newLength < cap) newLength <<= 1;
            byte[] newBuf = new byte[newLength];
            System.arraycopy(buf, 0, newBuf, 0, buf.length);
            buf = newBuf;
        }
    }
    private static int stringSize(long x) {
        int d = 1;
        if (x >= 0) {d = 0; x = -x;}
        long p = -10;
        for (int i = 1; i < 19; i++, p *= 10) if (x > p) return i + d;
        return 19 + d;
    }
    private static int stringSize(int x) {
        int d = 1;
        if (x >= 0) {d = 0; x = -x;}
        int p = -10;
        for (int i = 1; i < 10; i++, p *= 10) if (x > p) return i + d;
        return 10 + d;
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
final class ExtendedScanner extends BasicScanner {
    public ExtendedScanner(InputStream in) {super(in);}
    public int[] ints(final int n) {
        final int[] a = new int[n];
        Arrays.setAll(a, $ -> nextInt());
        return a;
    }
    public int[] ints(final int n, final IntUnaryOperator f) {
        final int[] a = new int[n];
        Arrays.setAll(a, $ -> f.applyAsInt(nextInt()));
        return a;
    }
    public int[][] ints(final int n, final int m) {
        final int[][] a = new int[n][];
        Arrays.setAll(a, $ -> ints(m));
        return a;
    }
    public int[][] ints(final int n, final int m, final IntUnaryOperator f) {
        final int[][] a = new int[n][];
        Arrays.setAll(a, $ -> ints(m, f));
        return a;
    }
    public long[] longs(final int n) {
        final long[] a = new long[n];
        Arrays.setAll(a, $ -> nextLong());
        return a;
    }
    public long[] longs(final int n, final LongUnaryOperator f) {
        final long[] a = new long[n];
        Arrays.setAll(a, $ -> f.applyAsLong(nextLong()));
        return a;
    }
    public long[][] longs(final int n, final int m) {
        final long[][] a = new long[n][];
        Arrays.setAll(a, $ -> longs(m));
        return a;
    }
    public long[][] longs(final int n, final int m, final LongUnaryOperator f) {
        final long[][] a = new long[n][];
        Arrays.setAll(a, $ -> longs(m, f));
        return a;
    }
    public char[][] charArrays(final int n) {
        final char[][] c = new char[n][];
        Arrays.setAll(c, $ -> nextChars());
        return c;
    }
    public char[][] charArrays(final int n, final int m) {
        final char[][] c = new char[n][];
        Arrays.setAll(c, $ -> nextChars(m));
        return c;
    }
    public double[] doubles(final int n) {
        final double[] a = new double[n];
        Arrays.setAll(a, $ -> nextDouble());
        return a;
    }
    public double[][] doubles(final int n, final int m) {
        final double[][] a = new double[n][];
        Arrays.setAll(a, $ -> doubles(m));
        return a;
    }
    public String[] strings(final int n) {
        final String[] s = new String[n];
        Arrays.setAll(s, $ -> next());
        return s;
    }
    public String[] strings(final int n, final int m) {
        final String[] s = new String[n];
        Arrays.setAll(s, $ -> next(m));
        return s;
    }
}
