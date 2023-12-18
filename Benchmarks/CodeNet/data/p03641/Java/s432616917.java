import static java.lang.Math.min;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.PrimitiveIterator;
import java.util.PriorityQueue;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

public class Main implements Runnable {
    public static void main(String[] args) {
        new Thread(null, new Main(), "", 32 * 1024 * 1024).start();
    }

    public void run() {
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
    static int[] q;
    static int idx;

    public static void solve(StringBuilder out) {
        n = In.ni();
        p = In.ni(n);
        q = new int[n];
        e = new int[n / 2];
        o = new int[n / 2];
        for (int i = 0; i < n; i += 2) {
            e[i / 2] = p[i];
            o[i / 2] = p[i + 1];
        }
        te = new RMQ(e);
        to = new RMQ(o);
        part(0, n);
        int[] pr = new int[n];
        int[] f = new int[n / 2];
        int[] s = new int[n / 2];
        for (int i = 0; i < n; i += 2) {
            f[i / 2] = q[i];
            s[i / 2] = q[i + 1];
            pr[q[i]] = q[i + 1];
            pr[q[i + 1]] = q[i];
        }
        IntStack st = new IntStack(n / 2);
        IntArrayList[] g = new IntArrayList[n];
        for (int i = 0; i < n; i++) {
            g[i] = new IntArrayList();
        }
        int[] in = new int[n];
        for (int i = 0; i < n; i++) {
            if (i < pr[i]) {
                if (st.size() > 0) {
                    g[st.peek()].add(i);
                    in[i]++;
                }
                st.add(i);
            } else {
                st.poll();
            }
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((i, j) -> p[i] - p[j]);
        for (int i = 0; i < n; i++) {
            if (i < pr[i] && in[i] == 0) {
                pq.add(i);
            }
        }
        int[] ans = new int[n];
        int idx = 0;
        while (pq.size() > 0) {
            int u = pq.poll();
            ans[idx++] = p[u];
            ans[idx++] = p[pr[u]];
            g[u].iterator().forEachRemaining((int v) -> {
                if (--in[v] == 0) {
                    pq.add(v);
                }
            });
        }
        out.append(IntArrays.join(ans, " "));
    }
    public static void part(int l, int r) {
        if (r - l == 0) {
            return;
        }
        if (r - l == 2) {
            q[idx++] = l;
            q[idx++] = l + 1;
            return;
        }
        int t1, t2;
        int m1, m2;
        if ((l & 1) == 0) {
            t1 = te.query(l / 2, r / 2);
            int k1 = te.indexOfMin(l / 2, r / 2, t1);
            t2 = to.query(k1, r / 2);
            int k2 = to.indexOfMin(k1, r / 2, t2);
            m1 = k1 * 2;
            m2 = k2 * 2 + 1;
        } else {
            t1 = to.query(l / 2, r / 2);
            int k1 = to.indexOfMin(l / 2, r / 2, t1);
            t2 = te.query(k1 + 1, r / 2 + 1);
            int k2 = te.indexOfMin(k1 + 1, r / 2 + 1, t2);
            m1 = k1 * 2 + 1;
            m2 = k2 * 2;
        }
        q[idx++] = m1;
        q[idx++] = m2;
        part(l, m1);
        part(m1 + 1, m2);
        part(m2 + 1, r);
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

    public int indexOfMin(int l, int r, int min) {
        l += n; r += n;
        int k = -1;
        while (l < r) {
            if ((l & 1) != 0) {
                if (t[l] == min) {k = l; break;}
                l++;
            }
            if ((r & 1) != 0) {
                r--;
                if (t[r] == min) {k = r; break;}
            }
            l >>= 1; r >>= 1;
        }
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
 * 
 * 1. DESTRUCTIVE methods for int arrays.
 * 2. methods that receives arrays and return some results (except for int arrays).
 */
final class IntArrays {
    private IntArrays(){}
    public static void swap(final int[] a, final int u, final int v) {
        final int tmp = a[u]; a[u] = a[v]; a[v] = tmp;
    }
    public static void reverse(final int[] a, final int begin, final int end) {
        for (int i = begin; i < begin + (end - begin) / 2; i++) swap(a, i, begin + end - i - 1);
    }
    public static void reverse(final int[] a) {reverse(a, 0, a.length);}
    public static void sortDescending(final int[] a) {Arrays.sort(a); reverse(a);}
    public static int reduce(final int[] a, final IntBinaryOperator op) {
        int ret = a[0]; for (int i = 1; i < a.length; i++) ret = op.applyAsInt(ret, a[i]);
        return ret;
    }
    public static void map(final int[] a, final IntUnaryOperator op) {Arrays.setAll(a, i -> op.applyAsInt(a[i]));}
    public static int filter(final int[] src, final int[] dst, final IntPredicate p) {
        int idx = 0;
        for (final int e : src) if (p.test(e)) dst[idx++] = e;
        return idx;
    }
    public static int filterIndex(final int[] dst, final int beginIndex, final int endIndex, final IntPredicate p) {
        int idx = 0;
        for (int i = beginIndex; i < endIndex; i++) if (p.test(i)) dst[idx++] = i;
        return idx;
    }
    public static int filterIndex(final int dst[], final int endIndex, final IntPredicate p) {
        return filterIndex(dst, 0, endIndex, p);
    }
    public static void accumulate(final int[] a, final IntBinaryOperator op) {
        for (int i = 1; i < a.length; i++) a[i] = op.applyAsInt(a[i - 1], a[i]);
    }
    public static void accumulate(final int[] a) {
        for (int i = 1; i < a.length; i++) a[i] += a[i - 1];
    }
    public static void permute(int[] a, int[] p) {
        int n = p.length;
        boolean[] settled = new boolean[n];
        for (int i = 0; i < n; i++) {
            for (int j = i; !settled[j]; j = p[j]) {
                if (p[j] == i) {
                    settled[j] = true;
                    break;
                }
                swap(a, j, p[j]);
                settled[j] = true;
            }
        }
    }
    public static int compare(final int[] a, final int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (i >= b.length) return -1;
            if (a[i] > b[i]) return 1;
            if (a[i] < b[i]) return -1;
        }
        return a.length < b.length ? 1 : 0;
    }
    public static boolean equals(final int[] a, final int[] b) {return compare(a, b) == 0;}
    public static String join(final int[] a, final String sep) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
            if (i < a.length - 1) sb.append(sep);
        }
        return sb.toString();
    }
    public static String joinWithPrefixAndSuffix(final int[] a, final IntFunction<String> idxToPre, final IntFunction<String> idxToSuf, final String sep) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(idxToPre.apply(i)).append(a[i]).append(idxToSuf.apply(i));
            if (i < a.length - 1) sb.append(sep);
        }
        return sb.toString();
    }
}



/**
 * @author https://atcoder.jp/users/suisen
 */
final class IntArrayList implements Iterable<Integer> {
    private int[] a;
    private int tail = 0;
    private static final int DEFAULT_SIZE = 64;
    public IntArrayList(final int capacity) {this.a = new int[Math.max(1, capacity)];}
    public IntArrayList() {this(DEFAULT_SIZE);}
    public void add(final int v) {
        if (tail == a.length) grow();
        a[tail++] = v;
    }
    public int removeLast() {return a[tail--];}
    public int get(final int i) {
        if (i >= tail) throw new IndexOutOfBoundsException("Index " + i + " out of bounds for length " + size());
        return a[i];
    }
    public void set(final int i, final int v) {
        if (i >= tail) throw new IndexOutOfBoundsException("Index " + i + " out of bounds for length " + size());
        a[i] = v;
    }
    private void grow() {
        final int[] b = new int[a.length << 1];
        System.arraycopy(a, 0, b, 0, a.length);
        a = b;
    }
    public int size() {return tail;}
    public void reverse(final int begin, final int end) {IntArrays.reverse(a, begin, end);}
    public void reverse() {IntArrays.reverse(a, 0, tail);}
    public int[] toArray() {
        final int[] ret = new int[tail];
        System.arraycopy(a, 0, ret, 0, tail);
        return ret;
    }
    public boolean addIf(final int v, final IntPredicate p) {
        if (p.test(v)) {add(v); return true;}
        return false;
    }
    public void clear() {tail = 0;}
    public PrimitiveIterator.OfInt iterator() {return new IntArrayListIterator();}
    private class IntArrayListIterator implements PrimitiveIterator.OfInt {
        private int i = 0;
        public boolean hasNext() {return i < tail;}
        public int nextInt() {return a[i++];}
    }
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
