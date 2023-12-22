import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.OptionalInt;
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
        ExtendedScanner s = new ExtendedScanner(in);
        Out o = new Out(out);
        solve(s, o);
        o.flush();
        o.close();
    }

    public static void solve(ExtendedScanner sc, Out out) {
        int n = sc.nextInt();
        char[][] s = new char[n][];
        long[] c = new long[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextChars();
            c[i] = sc.nextLong();
        }
        int m = 21;
        Digraph<WeightedEdge> g = new Digraph<>(2 * m * n + 2);
        IntBinaryOperator sliceBack = (i, k) -> m * i + k;
        IntBinaryOperator sliceFront = (i, k) -> m * (n + i) + k;
        int beg = 2 * m * n, end = 2 * m * n + 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int li = s[i].length;
                int lj = s[j].length;
                for (int ki = 0; ki < li; ki++) {
                    if (lj - (li - ki) >= 0) {
                        int kj = lj - (li - ki);
                        String fi = cut(s[i], ki, li);
                        String bj = cutAndReverse(s[j], kj, lj);
                        if (fi.equals(bj)) {
                            g.addEdge(new WeightedEdge(sliceBack.applyAsInt(i, ki), sliceFront.applyAsInt(j, kj), c[j]));
                        }
                    } else {
                        String fi = cut(s[i], ki, ki + lj);
                        String bj = cutAndReverse(s[j], 0, lj);
                        if (fi.equals(bj)) {
                            g.addEdge(new WeightedEdge(sliceBack.applyAsInt(i, ki), sliceBack.applyAsInt(i, ki + lj), c[j]));
                        }
                    }
                }
                for (int ki = 1; ki <= li; ki++) {
                    if (lj >= ki) {
                        int kj = ki;
                        String bi = cutAndReverse(s[i], 0, ki);
                        String fj = cut(s[j], 0, kj);
                        if (bi.equals(fj)) {
                            g.addEdge(new WeightedEdge(sliceFront.applyAsInt(i, ki), sliceBack.applyAsInt(j, kj), c[j]));
                        }
                    } else {
                        String bi = cutAndReverse(s[i], ki - lj, ki);
                        String fj = cut(s[j], 0, lj);
                        if (bi.equals(fj)) {
                            g.addEdge(new WeightedEdge(sliceFront.applyAsInt(i, ki), sliceFront.applyAsInt(i, ki - lj), c[j]));
                        }
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            g.addEdge(new WeightedEdge(beg, sliceFront.applyAsInt(i, s[i].length) , c[i]));
            g.addEdge(new WeightedEdge(beg, sliceBack.applyAsInt(i, 0), c[i]));
            g.addEdge(new WeightedEdge(sliceFront.applyAsInt(i, 0), end, 0));
            g.addEdge(new WeightedEdge(sliceFront.applyAsInt(i, 1), end, 0));
            g.addEdge(new WeightedEdge(sliceBack.applyAsInt(i, s[i].length), end, 0));
            g.addEdge(new WeightedEdge(sliceBack.applyAsInt(i, s[i].length - 1), end, 0));
        }
        var res = Dijkstra.solve(g, beg);
        if (res.reachable(end)) {
            out.writeln(res.getDistance(end));
        } else {
            out.writeln(-1);
        }
    }

    static String cutAndReverse(char[] s, int from, int to) {
        int l = to - from;
        char[] cut = new char[l];
        for (int i = 0; i < l; i++) {
            cut[i] = s[to - i - 1];
        }
        CharArrays.reverse(cut);
        return String.valueOf(cut);
    }

    static String cut(char[] s, int from, int to) {
        int l = to - from;
        char[] cut = new char[l];
        for (int i = 0; i < l; i++) {
            cut[i] = s[to - i - 1];
        }
        return String.valueOf(cut);
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
    public void sort() {Arrays.sort(a, 0, tail);}
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


/**
 * @author https://atcoder.jp/users/suisen
 */
class Digraph<T extends Edge> extends AbstractGraph<T> {
    private Digraph<T> reverse;
    public Digraph(final int n) {super(n);}
    @Override
    public final void addEdge(final T e) {
        super.addEdge(e);
        this.m++;
    }
    @Override
    public final boolean isBipartite() {
        generateReversedGraphIfAbsent();
        final byte[] color = new byte[n];
        final IntDeque dq = new IntDeque(n);
        for (final int root : getRoots()) {
            dq.addLast(root);
            color[root] = 1;
        }
        while (dq.size() > 0) {
            final int now = dq.removeLast();
            for (final T e : getEdges(now)) {
                final int next = e.to;
                if (color[next] == 0) {
                    color[next] = (byte) -color[now];
                    dq.addLast(next);
                } else if (color[now] == color[next]) return false;
            }
            for (final T e : reverse.getEdges(now)) {
                final int next = e.to;
                if (color[next] == 0) {
                    color[next] = (byte) -color[now];
                    dq.addLast(next);
                } else if (color[now] == color[next]) return false;
            }
        }
        return true;
    }
    public final Digraph<T> reversed() {
        generateReversedGraphIfAbsent();
        return this.reverse;
    }
    @SuppressWarnings("unchecked")
    private final void generateReversedGraphIfAbsent() {
        if (this.reverse == null) {
            this.reverse = new Digraph<>(n);
            for (int i = 0; i < n; i++) for (final T e : getEdges(i)) {
                this.reverse.addEdge((T) e.reverse());
            }
        }
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
 * SSSP (Single Sourse Shortest Path) problem solver, implementing Dijkstra's
 * algorithm.
 * 
 * @author https://atcoder.jp/users/suisen
 */
final class Dijkstra {
    /**
     * INF means there does not exist any path from s to t.
     */
    public static final long INF = Infty.LONG;

    /**
     * Constructor. Class Dijkstra is not instantiable.
     */
    private Dijkstra() {
    }

    /**
     * **************** costs must be non-negative integers ********************* *
     * Solving SSSP (Single Sourse Shortest Path) problem in O((V + E) log V).*
     * **************************************************************************
     * 
     * @param <T> Type parameter of the graph. This must extend
     *            {@code WeightedEdge}.
     * @param g   Graph Object.
     * @param s   Starting Vertex.
     * @return Result Object.
     */
    public static <T extends WeightedEdge> Result solve(final AbstractGraph<T> g, final int s) {
        final class State implements Comparable<State> {
            private final int v;
            private final long d;

            private State(int v, long d) {
                this.v = v;
                this.d = d;
            }

            public int compareTo(State other) {
                if (d == other.d)
                    return v - other.v;
                return d > other.d ? 1 : -1;
            }
        }
        final int n = g.n;
        final long[] dist = new long[n];
        final int[] prev = new int[n];
        Arrays.fill(dist, INF);
        final PriorityQueue<State> pq = new PriorityQueue<>();
        dist[s] = 0;
        prev[s] = -1;
        pq.add(new State(s, 0l));
        while (pq.size() > 0) {
            final State st = pq.poll();
            final int u = st.v;
            if (st.d != dist[u])
                continue;
            for (final T e : g.getEdges(u)) {
                final int v = e.to;
                final long c = e.cost;
                if (dist[u] + c < dist[v]) {
                    dist[v] = dist[u] + c;
                    prev[v] = u;
                    pq.add(new State(v, dist[v]));
                }
            }
        }
        return new Result(s, dist, prev);
    }

    /**
     * ************ costs must be non-negative integers *************** * Solving
     * SSSP (Single Sourse Shortest Path) problem in O(V^2).*
     * ****************************************************************
     * 
     * @param edge edge[i][j] contains the cost of edge i -> j.
     * @param s    Starting Vertex.
     * @return Result Object.
     */
    public Result solve(final long[][] edge, final int s) {
        final int n = edge.length;
        final long[] dist = new long[n];
        final int[] prev = new int[n];
        Arrays.fill(dist, INF);
        final boolean[] settled = new boolean[n];
        while (true) {
            int u = -1;
            long min = INF;
            for (int i = 0; i < n; i++)
                if (dist[i] < min && !settled[i]) {
                    u = i;
                    min = dist[i];
                }
            if (u < 0)
                break;
            settled[u] = true;
            for (int v = 0; v < n; v++) {
                if (edge[u][v] >= 0 && dist[u] + edge[u][v] < dist[v]) {
                    dist[v] = dist[u] + edge[u][v];
                    prev[v] = u;
                }
            }
        }
        return new Result(s, dist, prev);
    }

    /**
     * ************ costs must be non-negative integers *************** * Solving
     * SSSP (Single Sourse Shortest Path) problem in O(V^2).*
     * ****************************************************************
     * 
     * @param edge edge[i][j] contains the cost of edge i -> j.
     * @param s    Starting Vertex.
     * @return Result Object.
     */
    public Result solve(final int[][] edge, final int s) {
        final int n = edge.length;
        final long[] dist = new long[n];
        final int[] prev = new int[n];
        Arrays.fill(dist, INF);
        final boolean[] settled = new boolean[n];
        while (true) {
            int u = -1;
            long min = INF;
            for (int i = 0; i < n; i++)
                if (dist[i] < min && !settled[i]) {
                    u = i;
                    min = dist[i];
                }
            if (u < 0)
                break;
            settled[u] = true;
            for (int v = 0; v < n; v++) {
                if (edge[u][v] >= 0 && dist[u] + edge[u][v] < dist[v]) {
                    dist[v] = dist[u] + edge[u][v];
                    prev[v] = u;
                }
            }
        }
        return new Result(s, dist, prev);
    }

    public static final class Result {
        private final int s;
        private final long[] dist;
        private final int[] prev;

        private Result(int s, long[] dist, int[] prev) {
            this.s = s;
            this.dist = dist;
            this.prev = prev;
        }

        /**
         * return if there exists a path from s to t.
         * 
         * @param t target vertex.
         * @return if there exists a path from s to t then true else false.
         */
        public boolean reachable(final int t) {
            return dist[t] != INF;
        }

        /**
         * return if there does NOT exist a path from s to t.
         * 
         * @param t target vertex.
         * @return if there does NOT exist a path from s to t then true else false.
         */
        public boolean unreachable(final int t) {
            return dist[t] == INF;
        }

        /**
         * return the minimum cost from s to t. if there does not exist any path,
         * returns {@code Dijkstra.INF = Infty.LONG}.
         * 
         * @param t target vertex.
         * @return if there exists paths from s to t then the minimum cost of them else
         *         {@code Dijkstra.INF = Infty.LONG}.
         */
        public long getDistance(int t) {
            return dist[t];
        }

        /**
         * return the minimum costs from s to 0, 1, ..., N-1.
         * 
         * @return the array that contains the minimum costs from s. if there does not
         *         exist paths from s to t then
         *         {@code dist[t] = Dijkstra.INF = Infty.LONG}.
         */
        public long[] getDistances() {
            return dist;
        }

        /**
         * return one of the shortest paths from s to t. Let l be the size of the array
         * {@code path}, then {@code path[0] = s, ..., path[l - 1] = t}.
         * 
         * @param t target vertex.
         * @return one of the shortest paths from s to t.
         */
        public int[] path(final int t) {
            final IntArrayList rev = new IntArrayList();
            for (int v = t; v != s; v = prev[v])
                rev.add(v);
            rev.add(s);
            rev.reverse();
            return rev.toArray();
        }
    }
}

final class Infty {
    public static final long   LONG   = 1l << 59;
    public static final int    INT    = 1  << 30;
    public static final double DOUBLE = 1e150;
    private Infty(){}
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
    public static void permute(int[] p, int[] a) {
        int n = p.length;
        boolean[] settled = new boolean[n];
        for (int i = 0; i < n; i++) {
            for (int j = i; !settled[j]; j = p[j]) {
                if (p[j] == i) {
                    settled[j] = true;
                    break;
                }
                int tmp = a[j]; a[j] = a[p[j]]; a[p[j]] = tmp;
                settled[j] = true;
            }
        }
    }
    public static void permute2(int[] p, int[] a, int[] b) {
        int n = p.length;
        boolean[] settled = new boolean[n];
        for (int i = 0; i < n; i++) {
            for (int j = i; !settled[j]; j = p[j]) {
                if (p[j] == i) {
                    settled[j] = true;
                    break;
                }
                int tmp;
                tmp = a[j]; a[j] = a[p[j]]; a[p[j]] = tmp;
                tmp = b[j]; b[j] = b[p[j]]; b[p[j]] = tmp;
                settled[j] = true;
            }
        }
    }
    public static void permute3(int[] p, int[] a, int[] b, int[] c) {
        int n = p.length;
        boolean[] settled = new boolean[n];
        for (int i = 0; i < n; i++) {
            for (int j = i; !settled[j]; j = p[j]) {
                if (p[j] == i) {
                    settled[j] = true;
                    break;
                }
                int tmp;
                tmp = a[j]; a[j] = a[p[j]]; a[p[j]] = tmp;
                tmp = b[j]; b[j] = b[p[j]]; b[p[j]] = tmp;
                tmp = c[j]; c[j] = c[p[j]]; c[p[j]] = tmp;
                settled[j] = true;
            }
        }
    }
    public static void permuteN(int[] p, int[]... as) {
        for (int[] a : as) permute(p, a);
    }
    public static int lowerBound(int[] sorted, int key) {
        int n = sorted.length;
        int l = -1, r = n;
        while (r - l > 1) {
            int m = (l + r) >> 1;
            if (sorted[m] < key) l = m;
            else r = m;
        }
        return r;
    }
    public static int upperBound(int[] sorted, int key) {
        int n = sorted.length;
        int l = -1, r = n;
        while (r - l > 1) {
            int m = (l + r) >> 1;
            if (sorted[m] <= key) l = m;
            else r = m;
        }
        return r;
    }
    public static int countRange(int[] sorted, int fromKey, int toKey) {
        return lowerBound(sorted, toKey) - lowerBound(sorted, fromKey);
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


/**
 * @author https://atcoder.jp/users/suisen
 * 
 * 1. DESTRUCTIVE methods for char arrays.
 * 2. methods that receives arrays and return some results (except for char arrays).
 */
final class CharArrays {
    private CharArrays(){}
    public static void swap(final char[] a, final int u, final int v) {
        final char tmp = a[u]; a[u] = a[v]; a[v] = tmp;
    }
    public static void reverse(final char[] a, int begin, int end) {
        while (end - begin > 1) swap(a, begin++, --end);
    }
    public static void reverse(final char[] a) {reverse(a, 0, a.length);}
    public static void sortDescending(final char[] a) {Arrays.sort(a); reverse(a);}
    public static void transpose(char[][] a) {
        final int n = a.length, m = a[0].length;
        final char[][] ret = new char[m][n];
        for (int j = 0; j < m; j++) for (int i = 0; i < n; i++) ret[j][i] = a[i][j];
        a = ret;
    }
    public static String join(final char[] a, final String sep) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
            if (i < a.length - 1) sb.append(sep);
        }
        return sb.toString();
    }
    public static String join(final char[][] a, final String sep) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
            if (i < a.length - 1) sb.append(sep);
        }
        return sb.toString();
    }
    public static String joinWithPrefixAndSuffix(final char[] a, final IntFunction<String> idxToPre, final IntFunction<String> idxToSuf, final String sep) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(idxToPre.apply(i)).append(a[i]).append(idxToSuf.apply(i));
            if (i < a.length - 1) sb.append(sep);
        }
        return sb.toString();
    }
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
    static final int DEFAULT_CAPACITY = 1 << 6;
    int[] buf;
    int len = 1;
    int mask;
    int head = 0;
    int tail = 0;
    public IntDeque(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException(
                String.format("Capacity %d is negative.", capacity)
            );
        }
        while (this.len < capacity) {
            this.len <<= 1;
        }
        this.mask = this.len - 1;
        this.buf = new int[len];
    }
    public IntDeque() {
        this(DEFAULT_CAPACITY);
    }
    public int getLast() {
        if (size() == 0) throw new NoSuchElementException();
        return buf[(tail - 1) & mask];
    }
    public int getFirst() {
        if (size() == 0) throw new NoSuchElementException();
        return buf[head];
    }
    public int get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException(
                String.format("Index %d out of bounds for length %d.", index, size())
            );
        }
        return buf[(head + index) & mask];
    }
    public void addLast(int v) {
        if (size() == len) grow();
        buf[tail++ & mask] = v;
    }
    public void addFirst(int v) {
        if (size() == len) grow();
        buf[--head & mask] = v;
    }
    public int removeLast() {
        if (size() == 0) throw new NoSuchElementException();
        return buf[--tail & mask];
    }
    public int removeFirst() {
        if (size() == 0) throw new NoSuchElementException();
        return buf[head++ & mask];
    }
    public OptionalInt pollLast() {
        if (size() == 0) return OptionalInt.empty();
        return OptionalInt.of(removeLast());
    }
    public OptionalInt pollFirst() {
        if (size() == 0) return OptionalInt.empty();
        return OptionalInt.of(removeFirst());
    }
    public int size() {
        return tail - head;
    }
    public boolean isEmpty() {
        return size() == 0;
    }
    public void clear() {
        head = tail = 0;
    }
    public int[] toArray() {
        int[] ret = new int[size()];
        PrimitiveIterator.OfInt it = iterator();
        Arrays.setAll(ret, i -> it.nextInt());
        return ret;
    }
    private void grow() {
        int[] newBuf = new int[len << 1];
        head &= mask;
        tail &= mask;
        int len1 = len - head;
        int len2 = head;
        System.arraycopy(buf, head, newBuf, 0, len1);
        System.arraycopy(buf, 0, newBuf, len1, len2);
        this.head = 0;
        this.tail = this.len;
        this.len <<= 1;
        this.mask = this.len - 1;
        this.buf = newBuf;
    }
    public PrimitiveIterator.OfInt iterator() {
        return new PrimitiveIterator.OfInt(){
            int it = head;
            public boolean hasNext() {return it < tail;}
            public int nextInt() {return buf[it++ & mask];}
        };
    }
    public PrimitiveIterator.OfInt descendingIterator() {
        return new PrimitiveIterator.OfInt(){
            int it = tail;
            public boolean hasNext() {return it > head;}
            public int nextInt() {return buf[--it & mask];}
        };
    }

    /***************************** DEBUG *********************************/

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        PrimitiveIterator.OfInt it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) sb.append(',');
        }
        sb.append(']');
        return sb.toString();
    }
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
