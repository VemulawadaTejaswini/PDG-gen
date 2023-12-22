import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.PrimitiveIterator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;
import static java.lang.Math.max;



public class Main {
    public static void main(String[] args) {
        StringBuilder out = new StringBuilder();
        solve(out);
        PrintWriter pw = new PrintWriter(System.out);
        pw.println(out);
        pw.flush();
        pw.close();
    }

    public static long[][] dp = new long[18][100001];

    public static void solve(StringBuilder out) {
        int n = In.ni();
        int[] v = new int[0x4ffff];
        int[] w = new int[0x4ffff];
        for (int i = 1; i <= n; i++) {
            v[i] = In.ni();
            w[i] = In.ni();
        }
        int lmax = 100001;
        int[] memo = new int[0x200 * lmax];
        for (int i = 1; i < 0x200; i++) {
            for (int j = 1; j < lmax; j++) {
                if (j >= w[i]) {
                    memo[i * lmax + j] = max(memo[(i >> 1) * lmax + j], memo[(i >> 1) * lmax + j - w[i]] + v[i]);
                } else {
                    memo[i * lmax + j] = memo[(i >> 1) * lmax + j];
                }
                memo[i * lmax + j] = max(memo[i * lmax + j], memo[i * lmax + j - 1]);
            }
        }
        int q = In.ni();
        LongQueue que = new LongQueue(0x200);
        try {
        for (int i = 0; i < q; i++) {
            int x = In.ni();
            int m = In.ni();
            if (x < 0x200) {
                out.append(memo[x * lmax + m]).append('\n');
                continue;
            }
            que.add(0);
            int max = 0;
            for (; x >= 0x200; x >>= 1) {
                int sz = que.size();
                while (sz --> 0) {
                    long vw = que.poll();
                    if ((vw & 0xffff_ffffl) + w[x] <= m) que.add(vw + ((long) v[x] << 32) + w[x]);
                    que.add(vw);
                }
            }
            while (que.size() > 0) {
                long vw = que.poll();
                int vs = (int) (vw >>> 32);
                int ws = (int) (vw & 0xffff_ffffl);
                max = max(max, vs + memo[x * lmax + m - ws]);
            }
            out.append(max).append('\n');
        }
        } catch (IndexOutOfBoundsException e) {return;}
        
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
 * Queue for long type.
 */
final class LongQueue implements Iterable<Long> {
    private static final int DEFAULT_SIZE = 64;
    private long[] q;
    private int head = 0, tail = 0;
    public LongQueue(final int capacity) {this.q = new long[capacity];}
    public LongQueue() {this(DEFAULT_SIZE);}
    public long peek() {
        if (head == tail) throw new NoSuchElementException("No Elements.");
        return q[head];
    }
    public long getFromHead(int index) {
        if (head + index >= tail || index < 0) throw new NoSuchElementException("Index out of bounds.");
        return q[head + index];
    }
    public long getFromTail(int index) {
        if (head + index >= tail || index < 0) throw new NoSuchElementException("Index out of bounds.");
        return q[tail - 1 - index];
    }
    public void add(final long v) {
        if (tail == q.length) grow();
        q[tail++] = v;
    }
    public void add(final long... vals) {for (long v : vals) add(v);}
    public long poll() {
        if (head == tail) throw new NoSuchElementException("No Elements.");
        return q[head++];
    }
    public int size() {return tail - head;}
    private void grow() {
        final long[] grown = new long[q.length << 1];
        final int len = size();
        System.arraycopy(q, head, grown, 0, len);
        q = grown;
        tail = len;
        head = 0;
    }
    public PrimitiveIterator.OfLong iterator() {return new LongQueueIterator();}
    private class LongQueueIterator implements PrimitiveIterator.OfLong {
        private int i = head;
        public boolean hasNext() {return i < tail;}
        public long nextLong() {return q[i++];}
    }
}
