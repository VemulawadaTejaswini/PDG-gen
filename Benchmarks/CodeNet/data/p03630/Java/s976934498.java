import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Iterator;
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
        int h = In.ni();
        int w = In.ni();
        boolean[][] g = In.grid(h, w, '#');
        for (int i = h - 1; i > 0; i--) for (int j = 0; j < w; j++) {
            g[i][j] = !(g[i][j] ^ g[i - 1][j]);
        }
        for (int j = 0; j < w; j++) g[0][j] = true;
        for (int j = w - 1; j > 0; j--) for (int i = 0; i < h; i++) {
            g[i][j] = !(g[i][j] ^ g[i][j - 1]);
        }
        for (int i = 0; i < h; i++) g[i][0] = false;
        int[][] hst = new int[h][w];
        for (int j = 0; j < w; j++) hst[h - 1][j] = g[h - 1][j] ? 1 : 0;
        for (int i = h - 2; i >= 0; i--) for (int j = 0; j < w; j++) {
            hst[i][j] = g[i][j] ? hst[i + 1][j] + 1 : 0;
        }
        int max = 0;
        for (int i = 0; i < h; i++) max = Math.max(max, histRectMax(hst[i]));
        out.append(max);
    }

    public static int histRectMax(int[] h) {
        final int n = h.length;
        Stack<int[]> s = new Stack<>();
        int max = 0;
        for (int j = 0; j < n; j++) {
            int hj = h[j];
            if (s.size() == 0) {
                s.add(new int[]{j, hj});
            } else {
                int[] top = s.peek();
                if (top[1] < hj) {
                    s.add(new int[]{j, hj});
                } else if (top[1] > hj) {
                    while (s.size() > 0 && s.peek()[1] >= hj) {
                        top = s.poll();
                        max = Math.max(max, top[1] * (j - top[0] + 1));
                    }
                    s.add(new int[]{top[0], hj});
                }
            }
        }
        int[] top;
        while (s.size() > 0) {
            top = s.poll();
            max = Math.max(max, top[1] * (n - top[0] + 1));
        }
        return max;
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


@SuppressWarnings("unchecked")
class Stack<T> {
    private static final int DEFAULT_SIZE = 64;
    private T[] s;
    private int size;
    private int tail = 0;
    public Stack(final int capacity) {this.s = (T[]) new Object[capacity];this.size = capacity;}
    public Stack() {this(DEFAULT_SIZE);}
    public T peek() {
        if (tail == 0) throw new NoSuchElementException("No Elements.");
        return s[tail - 1];
    }
    public T getFromHead(int index) {
        if (index >= tail || index < 0) throw new NoSuchElementException("index out of Bounds.");
        return s[index];
    }
    public T getFromTail(int index) {
        if (index >= tail || index < 0) throw new NoSuchElementException("index out of Bounds.");
        return s[tail - 1 - index];
    }
    public void add(final T v) {
        if (tail == size) grow();
        s[tail++] = v;
    }
    public void add(final T... vals) {for (T v : vals) add(v);}
    public T poll() {
        if (tail == 0) throw new NoSuchElementException("No Elements.");
        return s[--tail];
    }
    public int size() {return tail;}
    private void grow() {
        final T[] grown = (T[]) new Object[size << 1];
        System.arraycopy(s, 0, grown, 0, tail);
        s = grown;
        size <<= 1;
    }
    public Iterator<T> iterator() {return new StackIterator();}
    private class StackIterator implements Iterator<T> {
        private int i = tail - 1;
        public boolean hasNext() {return i >= 0;}
        public T next() {return s[i--];}
    }
}
