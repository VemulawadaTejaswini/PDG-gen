import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.PrimitiveIterator;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
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
        ExtendedScanner s = new ExtendedScanner(System.in);
        Out o = new Out(System.out);
        solve(s, o);
        o.flush();
        o.close();
    }

    public static void solve(ExtendedScanner sc, Out out) {
        int n = sc.nextInt();
        long d = sc.nextLong();
        long[] a = sc.longs(n);
        long[] hc = new long[n];
        long[] tc = new long[n];
        for (int i = 0; i < n; i++) {
            hc[i] = i * d + a[i];
            tc[i] = (n - i + 1) * d + a[i];
        }
        int[] hmin = new int[n];
        hmin[n - 1] = n - 1;
        for (int i = n - 1; i > 0; i--) {
            hmin[i - 1] = hc[hmin[i]] < hc[i] ? hmin[i] : i;
        }
        int[] tmin = new int[n];
        tmin[0] = 0;
        for (int i = 0; i < n - 1; i++) {
            tmin[i + 1] = tc[tmin[i]] < tc[i] ? tmin[i] : i;
        }
        Graph<WeightedEdge> g = new Graph<>(n);
        for (int i = 0; i < n; i++) {
            int j;
            if (i > 0) {
                j = tmin[i];
                WeightedEdge el = new WeightedEdge(i, j, 2 * a[i] + tc[j] - tc[i]);
                g.addEdge(el);
            }
            if (i < n - 1) {
                j = hmin[i];
                WeightedEdge er = new WeightedEdge(i, j, 2 * a[i] + hc[j] - hc[i]);
                g.addEdge(er);
            }
        }
        MinimumSpanningTree<WeightedEdge> t = Kruskal.solve(g, WeightedEdge.class);
        out.writeln(t.sum());
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
final class IntPair {
    public int fst, snd;
    public IntPair(final int fst, final int snd) {this.fst = fst; this.snd = snd;}
    @Override @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof IntPair)) return false;
        final IntPair p = (IntPair) o;
        return this.fst == p.fst && this.snd == p.snd;
    }
    @Override
    public int hashCode() {return Objects.hash(this.fst, this.snd);}
    @Override
    public String toString() {return "(" + this.fst + ", " + this.snd + ")";}
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



/**
 * @author https://atcoder.jp/users/suisen
 */
abstract class AbstractGraph<T extends Edge> {
    final int n;
    int m = 0;
    private final ArrayList<T>[] adj;
    private final int[] in;
    private HashMap<Integer, IntArrayList> components;
    private final UnionFindTree uft;
    @SuppressWarnings("unchecked")
    AbstractGraph(final int n) {
        this.n = n;
        this.in = new int[n];
        this.adj = new ArrayList[this.n];
        for (int i = 0; i < this.n; i++) this.adj[i] = new ArrayList<>();
        this.uft = new UnionFindTree(this.n);
    }
    void addEdge(final T e) {
        adj[e.from].add(e);
        in[e.to]++;
        uft.unite(e.from, e.to);
    }
    public final int in(final int i) {return in[i];}
    public final int out(final int i) {return adj[i].size();}
    public final T getEdge(final int from, final int index) {return adj[from].get(index);}
    public final ArrayList<T> getEdges(final int i) {return adj[i];}
    public final int getV() {return n;}
    public final int getE() {return m;}
    public final int getRoot(final int i) {return uft.root(i);}
    public final HashMap<Integer, IntArrayList> getComponents() {
        generateComponentsIfAbsent();
        return this.components;
    }
    public final IntArrayList getComponent(final int i) {return getComponents().get(getRoot(i));}
    public final Set<Integer> getRoots() {return getComponents().keySet();}
    public final Collection<IntArrayList> getComponentSet() {return getComponents().values();}
    public final boolean isConnected() {return getComponents().size() == 1;}
    public final boolean isConnected(final int u, final int v) {return uft.isSame(u, v);}
    private final void generateComponentsIfAbsent() {
        if (this.components == null) {
            final HashMap<Integer, IntArrayList> components = new HashMap<>();
            for (int i = 0; i < n; i++) {
                if (!components.containsKey(getRoot(i))) components.put(getRoot(i), new IntArrayList());
                components.get(getRoot(i)).add(i);
            }
            this.components = components;
        }
    }
    abstract public boolean isBipartite();
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
    public int removeLast() {return a[--tail];}
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
    public void clear() {tail = 0;}
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
    public PrimitiveIterator.OfInt iterator() {return new IntArrayListIterator();}
    private class IntArrayListIterator implements PrimitiveIterator.OfInt {
        private int i = 0;
        public boolean hasNext() {return i < tail;}
        public int nextInt() {return a[i++];}
    }
}


class WeightedTreeBuilder<T extends WeightedEdge> {
    private final WeightedTree<T> t;
    public WeightedTreeBuilder(int n, int root) {this.t = new WeightedTree<>(n, root);}
    public WeightedTreeBuilder(int n) {this(n, 0);}
    public void addEdge(T e) {t.addEdge(e);}
    public WeightedTree<T> build() {t.build(); return t;}
}


/**
 * @author https://atcoder.jp/users/suisen
 */
final class Graph<T extends Edge> extends AbstractGraph<T> {
    public Graph(final int n) {super(n);}
    @Override @SuppressWarnings("unchecked")
    public void addEdge(final T e) {
        super.addEdge(e);
        super.addEdge((T) e.reverse());
        this.m++;
    }
    @Override
    public boolean isBipartite() {
        final byte[] color = new byte[n];
        final IntDeque dq = new IntDeque(n);
        for (final int root : getRoots()) {
            dq.addLast(root);
            color[root] = 1;
        }
        while (dq.size() > 0) {
            final int now = dq.removeFirst();
            for (final Edge e : getEdges(now)) {
                final int next = e.to;
                if (color[next] == 0) {
                    color[next] = (byte) -color[now];
                    dq.addLast(next);
                } else if (color[now] == color[next]) return false;
            }
        }
        return true;
    }
}



class Kruskal {
    private Kruskal() {}
    @SuppressWarnings("unchecked")
    public static <T extends WeightedEdge> MinimumSpanningTree<T> solve(final AbstractGraph<T> g, Class<T> clazz) {
        final int n = g.n;
        final UnionFindTree t = new UnionFindTree(n);
        final PriorityQueue<T> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) for (final T e : g.getEdges(i)) pq.add(e);
        final T[] ret = (T[]) Array.newInstance(clazz, n - 1);
        int index = 0;
        while (pq.size() > 0 && index < n - 1) {
            final T e = pq.poll();
            if (!t.isSame(e.from, e.to)) {
                t.unite(e.from, e.to);
                ret[index++] = e;
            }
        }
        if (index < n - 1) return null;
        return new MinimumSpanningTree<T>(ret);
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
final class WeightedTree<T extends WeightedEdge> {
    public final int n;
    public final int root;
    private final ArrayList<T>[] adj;
    private final int[] par;
    private final int[] dep;
    private final long[] dst;
    @SuppressWarnings("unchecked")
    WeightedTree(final int n, final int root) {
        this.n = n;
        this.root = root;
        this.adj = new ArrayList[n];
        for (int i = 0; i < n; i++) adj[i] = new ArrayList<>();
        this.par = new int[n];
        this.dep = new int[n];
        this.dst = new long[n];
        Arrays.fill(dst, -1l);
    }
    WeightedTree(final int n) {this(n, 0);}
    @SuppressWarnings("unchecked")
    void addEdge(final T e) {
        adj[e.from].add(e);
        adj[e.to].add((T) e.reverse());
    }
    public ArrayList<T> getEdges(int i) {return adj[i];}
    public int    degree(int i) {return adj[i].size();}
    public int    parent(int i) {return par[i];}
    public int[]  parent()      {return par;}
    public int    dep(int i) {return dep[i];}
    public int[]  dep()      {return dep;}
    public long   dst(int i) {return dst[i];}
    public long[] dst()      {return dst;}
    void build() {
        final IntDeque que = new IntDeque(n);
        que.addLast(root);
        par[root] = root;
        while (que.size() > 0) {
            final int v = que.removeFirst();
            for (final T e : getEdges(v)) {
                final int u = e.to;
                if (u != par[v]) {
                    dep[u] = dep[v] + 1;
                    dst[u] = dst[v] + e.cost;
                    par[u] = v;
                    que.addLast(u);
                }
            }
        }
    }
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
    public static void reverse(final int[] a, int begin, int end) {
        while (end - begin > 1) swap(a, begin++, --end);
    }
    public static void reverse(final int[] a) {reverse(a, 0, a.length);}
    public static void sortDescending(final int[] a) {Arrays.sort(a); reverse(a);}
    public static int fold(final int[] a, final IntBinaryOperator op) {
        int ret = a[0]; for (int i = 1; i < a.length; i++) ret = op.applyAsInt(ret, a[i]);
        return ret;
    }
    public static int sum(final int[] a) {return fold(a, Integer::sum);}
    public static int max(final int[] a) {return fold(a, Integer::max);}
    public static int min(final int[] a) {return fold(a, Integer::min);}
    public static IntPair maxWithIndex(final int[] a) {
        int max = max(a); return new IntPair(find(a, max), max);
    }
    public static IntPair minWithIndex(final int[] a) {
        int min = min(a); return new IntPair(find(a, min), min);
    }
    public static int find(final int[] a, final int v) {
        for (int i = 0; i < a.length; i++) if (a[i] == v) return i;
        return -1;
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
final class UnionFindTree {
    private final int[] data;
    public UnionFindTree(final int n) {this.data = new int[n]; Arrays.fill(data, -1);}
    public int root(final int x) {return data[x] < 0 ? x : (data[x] = root(data[x]));}
    public boolean isSame(final int x, final int y) {return root(x) == root(y);}
    public boolean unite(int x, int y) {
        x = root(x); y = root(y);
        if (x == y) return false;
        if (data[x] > data[y]) {int tmp = x; x = y; y = tmp;}
        data[x] += data[y];
        data[y] = x;
        return true;
    }
    public int size(final int x) {return -data[root(x)];}
    public boolean isRoot(final int x) {return data[x] < 0;}
    public void reset() {Arrays.fill(data, -1);}
}

class Edge {
    public final int from, to;
    public Edge(final int from, final int to) {this.from = from; this.to = to;}
    public Edge reverse() {return new Edge(to, from);}
}


/**
 * @author https://atcoder.jp/users/suisen
 * 
 * Implementation of deque for primitive int type, using Ring Buffer.
 */
final class IntDeque implements Iterable<Integer> {
    private static final int DEFAULT_CAPACITY = 64;
    private int[] ringBuffer;
    private int head;
    private int tail;
    private int len;
    private int mask;
    private int size;
    public IntDeque(int capacity) {
        initialize(capacity);
    }
    public IntDeque() {
        this(DEFAULT_CAPACITY);
    }
    public void addFirst(int val) {
        if (size == len) grow();
        head = (head - 1 + len) & mask;
        ringBuffer[head] = val;
        size++;
    }
    public void addLast(int val) {
        if (size == len) grow();
        ringBuffer[tail] = val;
        tail = (tail + 1) & mask;
        size++;
    }
    public int removeFirst() {
        if (size == 0) throw new NoSuchElementException("Deque is empty.");
        int ret = ringBuffer[head];
        head = (head + 1) & mask;
        size--;
        return ret;
    }
    public int removeLast() {
        if (size == 0) throw new NoSuchElementException("Deque is empty.");
        tail = (tail - 1 + len) & mask;
        int ret = ringBuffer[tail];
        size--;
        return ret;
    }
    public int get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + size);
        return ringBuffer[(head + index) & mask];
    }
    public int getFirst() {
        if (size == 0) throw new NoSuchElementException("Deque is empty.");
        return ringBuffer[head];
    }
    public int getLast() {
        if (size == 0) throw new NoSuchElementException("Deque is empty.");
        return ringBuffer[(tail - 1 + len) & mask];
    }
    public int size() {
        return size;
    }
    public void clear() {
        head = tail = 0;
    }
    public void clear(int newCapacity) {
        initialize(newCapacity);
    }
    public PrimitiveIterator.OfInt iterator() {
        return new DequeIterator();
    }
    public PrimitiveIterator.OfInt descendingIterator() {
        return new DescendingDequeIterator();
    }
    public int[] toArray() {
        int[] ret = new int[size];
        for (int i = 0; i < size; i++) ret[i] = ringBuffer[(head + i) & mask];
        return ret;
    }
    private void grow() {
        int len1 = len - head, len2 = len - len1;
        int[] newArray = new int[len << 1];
        System.arraycopy(ringBuffer, head, newArray, 0, len1);
        System.arraycopy(ringBuffer, 0, newArray, len1, len2);
        ringBuffer = newArray;
        len <<= 1;
        mask = len - 1;
        head = 0; tail = size;
    }
    private void initialize(int capacity) {
        int k = 1; while (k < capacity) k <<= 1;
        this.len = k;
        this.mask = k - 1;
        this.ringBuffer = new int[k];
        this.head = 0;
        this.tail = 0;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < size; i++) {
            sb.append(ringBuffer[(head + i) & mask]);
            if (i < size - 1) sb.append(',');
        }
        sb.append(']');
        return sb.toString();
    }

    private class DequeIterator implements PrimitiveIterator.OfInt {
        private int it;
        public boolean hasNext() {return it < size;}
        public int nextInt() {return ringBuffer[(head + it++) & mask];}
    }
    private class DescendingDequeIterator implements PrimitiveIterator.OfInt {
        private int it = size;
        public boolean hasNext() {return it > 0;}
        public int nextInt() {return ringBuffer[(head + --it) & mask];}
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
class MinimumSpanningTree<T extends WeightedEdge> {
    private final T[] edges;
    private final int n;
    protected MinimumSpanningTree(T[] edges) {
        this.edges = edges;
        this.n = edges.length + 1;
    }
    public T[] getEdges() {return edges;}
    public long sum() {
        long sum = 0; for (T e : edges) sum += e.cost;
        return sum;
    }
    public WeightedTree<T> buildTree(int root) {
        WeightedTreeBuilder<T> tb = new WeightedTreeBuilder<>(n, root);
        for (T e : edges) tb.addEdge(e);
        return tb.build();
    }
    public WeightedTree<T> buildTree() {return buildTree(0);}
}

class WeightedEdge extends Edge implements Comparable<WeightedEdge> {
    public final long cost;
    public WeightedEdge(final int from, final int to, final long cost) {
        super(from, to);
        this.cost = cost;
    }
    public WeightedEdge(final int from, final int to) {this(from, to, 1);}
    public int compareTo(WeightedEdge e) {
        return cost > e.cost ? 1 : -1;
    }
    public WeightedEdge reverse() {return new WeightedEdge(to, from, cost);}
}
