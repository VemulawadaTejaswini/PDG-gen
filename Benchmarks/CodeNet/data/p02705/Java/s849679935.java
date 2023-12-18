import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.NoSuchElementException;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;
import static java.lang.Math.PI;



public class Main {
    public static void main(String[] args) throws Exception {
        execute(System.in, System.out);
    }

    public static void execute(InputStream in, OutputStream out) {
        FastScanner s = new FastScanner(in);
        Out o = new Out(out);
        solve(s, o);
        o.write();
        o.flush();
        o.close();
    }

    public static void solve(FastScanner sc, Out out) {
        int r = sc.nextInt();
        out.append(2 * r * PI);
    }
}


class Out {
    private final OutputStream out;
    private byte[] buf;
    private int idx = 0;
    private static final int AUTO_WRITE_THRETHOLD = 100000;

    public Out(OutputStream out) {
        this.out = out;
        this.buf = new byte[16];
    }

    public void write() {
        try {
            out.write(buf, 0, idx);
            idx = 0;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void flush() {
        try {
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Out append(Object o) {
        return append(o.toString());
    }

    public Out append(String s) {
        int l = s.length();
        ensureCapacity(l);
        try {
            byte[] b = s.getBytes("US-ASCII");
            System.arraycopy(b, 0, buf, idx, l);
            idx += l;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return this;
    }

    public Out append(char[] c) {
        int d = c.length;
        ensureCapacity(d);
        System.arraycopy(c, 0, buf, idx, d);
        idx += d;
        return this;
    }

    public Out append(char c) {
        ensureCapacity(1);
        buf[idx++] = (byte) c;
        return this;
    }

    public Out append(int x) {
        if (x == 0) {
            ensureCapacity(1);
            buf[idx++] = '0';
            return this;
        }
        int d = stringSize(x);
        ensureCapacity(d);
        if (x < 0) {
            buf[idx++] = '-';
            x = -x;
            d--;
        }
        int j = idx + d; 
        while (x > 0) {
            buf[--j] = (byte) ('0' + (x % 10));
            x /= 10;
        }
        idx += d;
        return this;
    }

    public Out append(long x) {
        if (x == 0) {
            ensureCapacity(1);
            buf[idx++] = '0';
            return this;
        }
        int d = stringSize(x);
        ensureCapacity(d);
        if (x < 0) {
            buf[idx++] = '-';
            x = -x;
            d--;
        }
        int j = idx + d; 
        while (x > 0) {
            buf[--j] = (byte) ('0' + (x % 10));
            x /= 10;
        }
        idx += d;
        return this;
    }

    public Out append(double d) {
        return append(Double.toString(d));
    }

    private void ensureCapacity(int cap) {
        if (idx + cap > AUTO_WRITE_THRETHOLD) {
            write();
        } else if ((cap += idx) >= buf.length) {
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
final class FastScanner {
    private final InputStream in;
    private final ScannerBase sc;
    public FastScanner(InputStream in) {
        this.in = in;
        this.sc = new ScannerBase();
    }
    public int nextInt() {return sc.nextInt();}
    public int[] intArray(final int n) {
        final int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        return a;
    }
    public int[] intArray(final int n, final IntUnaryOperator f) {
        final int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = f.applyAsInt(sc.nextInt());
        return a;
    }
    public int[][] intArray(final int n, final int m) {
        final int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) a[i] = intArray(m);
        return a;
    }
    public int[][] intArray(final int n, final int m, final IntUnaryOperator f) {
        final int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) a[i] = intArray(m, f);
        return a;
    }
    public long nextLong() {return sc.nextLong();}
    public long[] longArray(final int n) {
        final long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextLong();
        return a;
    }
    public long[] longArray(final int n, final LongUnaryOperator f) {
        final long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = f.applyAsLong(sc.nextLong());
        return a;
    }
    public long[][] longArray(final int n, final int m) {
        final long[][] a = new long[n][m];
        for (int i = 0; i < n; i++) a[i] = longArray(m);
        return a;
    }
    public long[][] longArray(final int n, final int m, final LongUnaryOperator f) {
        final long[][] a = new long[n][m];
        for (int i = 0; i < n; i++) a[i] = longArray(m, f);
        return a;
    }
    public char[] charArray() {return sc.next().toCharArray();}
    public char[][] charArray(final int n) {
        final char[][] c = new char[n][];
        for (int i = 0; i < n; i++) c[i] = charArray();
        return c;
    }
    public double nextDouble() {return sc.nextDouble();}
    public double[] doubleArray(final int n) {
        final double[] a = new double[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextDouble();
        return a;
    }
    public double[][] doubleArray(final int n, final int m) {
        final double[][] a = new double[n][m];
        for (int i = 0; i < n; i++) a[i] = doubleArray(m);
        return a;
    }
    public String string() {return sc.next();}
    public String[] string(final int n) {
        final String[] s = new String[n];
        for (int i = 0; i < n; i++) s[i] = sc.next();
        return s;
    }
    public boolean[][] grid(final int h, final int w, final char trueCharacter) {
        final boolean[][] grid = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            final char[] s = sc.next().toCharArray();
            for (int j = 0; j < w; j++) grid[i][j] = s[j] == trueCharacter;
        }
        return grid;
    }

    private final class ScannerBase {
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
}
