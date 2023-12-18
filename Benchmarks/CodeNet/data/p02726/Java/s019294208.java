import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        Out out = new Out();
        solve(out);
        out.outln();
        out.flush();
        out.close();
    }

    public static void solve(Out out) {
        int n = In.ni();
        int x = In.ni() - 1;
        int y = In.ni() - 1;
        int[] cnt = new int[n];
        Graph g = new Graph(n);
        for (int i = 0; i < n - 1; i++) {
            g.addEdge(i, i + 1);
        }
        g.addEdge(x, y);
        for (int i = 0; i < n; i++) {
            IntDeque dq = new IntDeque();
            dq.addLast(i);
            int[] d = ArrayInitializer.filled(n, -1);
            d[i] = 0;
            while (dq.nonEmpty()) {
                int now = dq.pollFirst();
                for (Edge e : g.getEdges(now)) {
                    int next = e.to;
                    if (d[next] < 0) {
                        d[next] = d[now] + 1;
                        cnt[d[next]]++;
                        dq.addLast(next);
                    }
                }
            }
        }
        for (int i = 1; i < n; i++) {
            if (i < n - 1) {
                out.append(cnt[i] / 2 + "\n");
            } else {
                out.append(cnt[i] / 2);
            }
        }
    }
}


class Graph extends AbstractGraph {
    public Graph(int n) {
        super(n);
    }

    public void addEdge(int from, int to, long cost) {
        Edge e = new Edge(from, to, cost);
        super.addEdge(e);
        super.addEdge(e.reverse());
        this.m++;
    }

    public void addEdge(int from, int to) {
        this.addEdge(from, to, 1);
    }

    @Override
    public void addEdge(Edge e) {
        super.addEdge(e);
        super.addEdge(e.reverse());
        this.m++;
    }

    @Override
    protected void generateComponentsIfAbsent() {
        if (Objects.isNull(getNullableComponents())) {
            HashMap<Integer, ArrayList<Integer>> components = new HashMap<>();
            for (int i = 0; i < n; i++) {
                if (!components.containsKey(getRoot(i))) {
                    ArrayList<Integer> component = new ArrayList<>();
                    component.add(i);
                    components.put(getRoot(i), component);
                } else {
                    components.get(getRoot(i)).add(i);
                }
            }
            setComponents(components);
        }
    }

    @Override
    public boolean isBipartite() {
        int[] color = new int[getV()];
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        for (int root : getRoots()) {
            dq.add(root);
            color[root] = 1;
        }
        while (dq.size() > 0) {
            int now = dq.pollFirst();
            for (Edge e : getEdges(now)) {
                int next = e.to;
                if (color[next] == 0) {
                    color[next] = -color[now];
                    dq.add(next);
                } else if (color[now] == color[next]) {
                    return false;
                }
            }
        }
        return true;
    }
}


class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        } else {
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }

    private int readByte() {
        if (hasNextByte()) {
            return buffer[ptr++];
        } else {
            return -1;
        }
    }

    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
            ptr++;
        }
        return hasNextByte();
    }

    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }

    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
            throw new NumberFormatException();
        }
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}


abstract class AbstractGraph {
    protected final int n;
    protected int m = 0;
    private ArrayList<Edge>[] adj;
    private int[] in;
    private HashMap<Integer, ArrayList<Integer>> components;
    private UnionFindTree uft;
    
    @SuppressWarnings("unchecked")
    protected AbstractGraph(int n) {
        this.n = n;
        this.in = new int[n];
        this.adj = new ArrayList[this.n];
        for (int i = 0; i < this.n; i++) {
            this.adj[i] = new ArrayList<>();
        }
        this.uft = new UnionFindTree(this.n);
    }

    protected void addEdge(Edge e) {
        this.adj[e.from].add(e);
        this.in[e.to]++;
        this.uft.unite(e.from, e.to);
    }

    public int in(int i) {
        return this.in[i];
    }

    public int out(int i) {
        return this.adj[i].size();
    }

    public Edge getEdge(int from, int index) {
        return this.adj[from].get(index);
    }

    public ArrayList<Edge> getEdges(int i) {
        return this.adj[i];
    }

    public int getV() {
        return this.n;
    }

    public int getE() {
        return this.m;
    }

    public int getRoot(int i) {
        return uft.root(i);
    }

    public HashMap<Integer, ArrayList<Integer>> getComponents() {
        generateComponentsIfAbsent();
        return this.components;
    }

    protected void setComponents(HashMap<Integer, ArrayList<Integer>> components) {
        this.components = components;
    }

    protected HashMap<Integer, ArrayList<Integer>> getNullableComponents() {
        return this.components;
    }

    public ArrayList<Integer> getComponent(int i) {
        return getComponents().get(getRoot(i));
    }

    public Set<Integer> getRoots() {
        return getComponents().keySet();
    }

    public Collection<ArrayList<Integer>> getComponentSet() {
        return getComponents().values();
    }

    public boolean isConnected() {
        return getComponents().size() == 1;
    }

    public boolean isConnected(int u, int v) {
        return getRoot(u) == getRoot(v);
    }

    public boolean isTree() {
        return m == n - 1 && isConnected();
    }

    abstract public boolean isBipartite();

    abstract protected void generateComponentsIfAbsent();
}


class Out {
    private StringBuilder sb = new StringBuilder();
    private PrintWriter w = new PrintWriter(System.out);

    public Out() {
    }

    public void append(int v) {
        sb.append(v);
    }

    public void append(long v) {
        sb.append(v);
    }

    public void append(char c) {
        sb.append(c);
    }

    public void append(double v) {
        sb.append(v);
    }

    public void append(char[] c) {
        sb.append(c);
    }

    public void append(String s) {
        sb.append(s);
    }

    public void append(Object e) {
        sb.append(e);
    }

    public void append(int[] a, String sep) {
        for (int i = 0; i < a.length; i++) {
            append(a[i]);
            if (i < a.length - 1) {
                append(sep);
            }
        }
    }

    public void append(long[] a, String sep) {
        for (int i = 0; i < a.length; i++) {
            append(a[i]);
            if (i < a.length - 1) {
                append(sep);
            }
        }
    }

    public void append(char[] a, String sep) {
        for (int i = 0; i < a.length; i++) {
            append(a[i]);
            if (i < a.length - 1) {
                append(sep);
            }
        }
    }

    public void append(double[] a, String sep) {
        for (int i = 0; i < a.length; i++) {
            append(a[i]);
            if (i < a.length - 1) {
                append(sep);
            }
        }
    }

    public void append(char[][] c, String sep) {
        for (int i = 0; i < c.length; i++) {
            append(c[i]);
            if (i < c.length - 1) {
                append(sep);
            }
        }
    }

    public void append(String[] a, String sep) {
        for (int i = 0; i < a.length; i++) {
            append(a[i]);
            if (i < a.length - 1) {
                append(sep);
            }
        }
    }

    public void append(Object[] a, String sep) {
        for (int i = 0; i < a.length; i++) {
            append(a[i]);
            if (i < a.length - 1) {
                append(sep);
            }
        }
    }

    public void out() {
        w.print(sb);
        clearBuilder();
    }

    public void outln() {
        w.println(sb);
        clearBuilder();
    }

    public void print(int v) {
        w.print(v);
    }

    public void print(long v) {
        w.print(v);
    }

    public void print(char c) {
        w.print(c);
    }

    public void print(double v) {
        w.print(v);
    }

    public void print(String s) {
        w.print(s);
    }

    public void print(Object e) {
        w.print(e);
    }

    public void print(String sep, int... a) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            s.append(a[i]);
            if (i < a.length - 1) {
                s.append(sep);
            }
        }
        print(s);
    }

    public void print(String sep, long... a) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            s.append(a[i]);
            if (i < a.length - 1) {
                s.append(sep);
            }
        }
        print(s);
    }

    public void print(String sep, char... a) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            s.append(a[i]);
            if (i < a.length - 1) {
                s.append(sep);
            }
        }
        print(s);
    }

    public void print(String sep, double... a) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            s.append(a[i]);
            if (i < a.length - 1) {
                s.append(sep);
            }
        }
        print(s);
    }

    public void print(String sep, String... a) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            s.append(a[i]);
            if (i < a.length - 1) {
                s.append(sep);
            }
        }
        print(s);
    }

    public void print(String sep, Object... a) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            s.append(a[i]);
            if (i < a.length - 1) {
                s.append(sep);
            }
        }
        print(s);
    }

    public void println() {
        w.println();
    }

    public void println(int v) {
        w.println(v);
    }

    public void println(long v) {
        w.println(v);
    }

    public void println(double v) {
        w.println(v);
    }

    public void println(char c) {
        w.println(c);
    }

    public void println(String s) {
        w.println(s);
    }

    public void println(Object e) {
        w.println(e);
    }

    public void println(String sep, int... a) {
        print(sep, a);
        println();
    }

    public void println(String sep, long... a) {
        print(sep, a);
        println();
    }

    public void println(String sep, double... a) {
        print(sep, a);
        println();
    }

    public void println(String sep, char... a) {
        print(sep, a);
        println();
    }

    public void println(String sep, String... a) {
        print(sep, a);
        println();
    }

    // public void println(String sep, Object... a) {
    //     print(sep, a);
    //     println();
    // }

    public void flush() {
        w.flush();
    }

    public void close() {
        w.close();
    }

    public void clearBuilder() {
        sb = new StringBuilder();
    }

    public void reverse() {
        sb.reverse();
    }

    public void delete(int start, int end) {
        sb.delete(start, end);
    }

    public void delete(int length) {
        sb.delete(sb.length() - length, sb.length());
    }

    public int length() {
        return sb.length();
    }
}

class IntDeque implements Cloneable {
    private int head = -1;
    private int tail = 0;
    private int pSize;
    private int nSize;
    private int p[];
    private int n[];

    private static final int DEFAULT_SIZE = 64;

    public IntDeque(int initialSize) {
        this(Math.max(1, initialSize - initialSize / 2), Math.max(1, initialSize / 2));
        if (initialSize <= 0) {
            System.err.println("Error in IntDeque::new. initial size must be positive.");
        }
    }

    private IntDeque(int pSize, int nSize) {
        this.pSize = pSize;
        this.nSize = nSize;
        this.p = new int[this.pSize];
        this.n = new int[this.nSize];
    }

    public IntDeque() {
        this(DEFAULT_SIZE);
    }

    public static IntDeque asDeque(int initialSize) {
        return new IntDeque(initialSize);
    }

    public static IntDeque asDeque() {
        return new IntDeque(DEFAULT_SIZE);
    }

    public static IntDeque asQueue(int initialSize) {
        return new IntDeque(Math.max(1, initialSize), 1);
    }

    public static IntDeque asQueue() {
        return new IntDeque(DEFAULT_SIZE, 1);
    }

    public static IntDeque asStack(int initialSize) {
        return new IntDeque(1, Math.max(1, initialSize));
    }

    public static IntDeque asStack() {
        return new IntDeque(1, DEFAULT_SIZE);
    }

    public void addLast(int v) {
        putByRawIndex(tail++, v);
    }

    public void addFirst(int v) {
        putByRawIndex(head--, v);
    }

    public int pollFirst() {
        if (size() == 0) {
            System.err.println("Error in IntDeque::pollFirst. cannot poll element from \"EMPTY\" IntDeque.");
        }
        return getByRawIndex(++head);
    }

    public int pollLast() {
        if (size() == 0) {
            System.err.println("Error in IntDeque::pollLast. cannot poll element from \"EMPTY\" IntDeque.");
        }
        return getByRawIndex(--tail);
    }

    public int get(int index) {
        index += head + 1;
        if (index >= tail) {
            System.err.println("Error in IntDeque::get(" + index + "). the size of IntDeque is " + size() + ".");
        }
        return getByRawIndex(index);
    }

    public int getFirst() {
        return get(0);
    }

    public int getLast() {
        return get(size() - 1);
    }

    public int size() {
        return tail - head - 1;
    }

    public void clear() {
        head = -1;
        tail = 0;
    }

    public int[] toArray() {
        int[] a = new int[size()];
        for (int i = 0; i < size(); i++) {
            a[i] = get(i);
        }
        return a;
    }

    private void resize(boolean positive) {
        if (positive) {
            int[] pCopy = new int[pSize << 1];
            System.arraycopy(p, 0, pCopy, 0, pSize);
            p = pCopy;
            pSize <<= 1;
        } else {
            int[] nCopy = new int[nSize << 1];
            System.arraycopy(n, 0, nCopy, 0, nSize);
            n = nCopy;
            nSize <<= 1;
        }
    }

    private int getByRawIndex(int index) {
        if (index >= 0) {
            return p[index];
        } else {
            return n[-(index + 1)];
        }
    }

    private void putByRawIndex(int index, int v) {
        if (index < 0) {
            if (index <= -(nSize + 1)) {
                resize(false);
            }
            n[-(index + 1)] = v;
        } else {
            if (index >= pSize) {
                resize(true);
            }
            p[index] = v;
        }
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean nonEmpty() {
        return size() != 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < size(); i++) {
            sb.append(get(i));
            if (i < size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
        return sb.toString();
    }
}

class UnionFindTree {
    private int[] parent;
    private int[] rank;
    private int[] size;
    private int groupNum;

    public UnionFindTree(int n) {
        this.parent = ArrayInitializer.indexToInt(n, i -> i);
        this.rank = new int[n];
        this.size = ArrayInitializer.filled(n, 1);
        this.groupNum = n;
    }

    public int root(int x) {
        if (parent[x] == x) {
            return x;
        }
        return parent[x] = root(parent[x]);
    }

    public boolean isSame(int x, int y) {
        return root(x) == root(y);
    }

    public void unite(int x, int y) {
        int xr = root(x);
        int yr = root(y);
        if (xr == yr) {
            return;
        }
        if (rank[xr] < rank[yr]) {
            parent[xr] = yr;
            size[yr] += size[xr];
        } else {
            parent[yr] = xr;
            size[xr] += size[yr];
            if (rank[xr] == rank[yr]) {
                rank[xr]++;
            }
        }
        groupNum--;
    }

    public int size(int x) {
        return size[root(x)];
    }

    public boolean isRoot(int x) {
        return parent[x] == x;
    }

    public int groupNum() {
        return groupNum;
    }
}


class In {
    public static final FastScanner fsc = new FastScanner();

    public static int ni() {
        return fsc.nextInt();
    }

    public static int ni(IntUnaryOperator f) {
        return f.applyAsInt(fsc.nextInt());
    }

    public static int[] ni(int n) {
        int[] a = new int[n];
        Arrays.setAll(a, i -> fsc.nextInt());
        return a;
    }

    public static int[] ni (int n, IntUnaryOperator f) {
        int[] a = new int[n];
        Arrays.setAll(a, i -> ni(f));
        return a;
    }

    public static int[][] ni(int n, int m) {
        int[][] a = new int[n][m];
        Arrays.setAll(a, i -> ni(m));
        return a;
    }

    public static int[][] ni(int n, int m, IntUnaryOperator f) {
        int[][] a = new int[n][m];
        Arrays.setAll(a, i -> ni(m, f));
        return a;
    }

    public static long nl() {
        return fsc.nextLong();
    }

    public static long nl(LongUnaryOperator f) {
        return f.applyAsLong(fsc.nextLong());
    }

    public static long[] nl(int n) {
        long[] a = new long[n];
        Arrays.setAll(a, i -> fsc.nextLong());
        return a;
    }

    public static long[] nl(int n, LongUnaryOperator f) {
        long[] a = new long[n];
        Arrays.setAll(a, i -> nl(f));
        return a;
    }

    public static long[][] nl(int n, int m) {
        long[][] a = new long[n][m];
        Arrays.setAll(a, i -> nl(m));
        return a;
    }

    public static long[][] nl(int n, int m, LongUnaryOperator f) {
        long[][] a = new long[n][m];
        Arrays.setAll(a, i -> nl(m, f));
        return a;
    }

    public static char[] nc() {
        return fsc.next().toCharArray();
    }

    public static char[][] nc(int n, int m) {
        char[][] c = new char[n][m];
        Arrays.setAll(c, i -> nc());
        return c;
    }

    public static double nd() {
        return fsc.nextDouble();
    }

    public static double nd(DoubleUnaryOperator f) {
        return f.applyAsDouble(fsc.nextDouble());
    }

    public static double[] nd(int n) {
        double[] a = new double[n];
        Arrays.setAll(a, i -> fsc.nextDouble());
        return a;
    }

    public static double[] nd(int n, DoubleUnaryOperator f) {
        double[] a = new double[n];
        Arrays.setAll(a, i -> nd(f));
        return a;
    }

    public static double[][] nd(int n, int m) {
        double[][] a = new double[n][m];
        Arrays.setAll(a, i -> nd(m));
        return a;
    }

    public static double[][] nd(int n, int m, DoubleUnaryOperator f) {
        double[][] a = new double[n][m];
        Arrays.setAll(a, i -> nd(m, f));
        return a;
    }

    public static String ns() {
        return fsc.next();
    }

    public static String[] ns(int n) {
        String[] s = new String[n];
        Arrays.setAll(s, i -> ns());
        return s;
    }

    public static boolean[][] grid(int h, int w, char trueCharacter) {
        boolean[][] grid = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            char[] s = fsc.next().toCharArray();
            for (int j = 0; j < w; j++) {
                grid[i][j] = s[j] == trueCharacter;
            }
        }
        return grid;
    }
}


class ArrayInitializer {

    private ArrayInitializer(){}
    
    public static int[] filled(int n, int init) {
        int[] ret = new int[n];
        Arrays.fill(ret, init);
        return ret;
    }

    public static int[][] filled(int n, int m, int init) {
        int[][] ret = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(ret[i], init);
        }
        return ret;
    }

    public static long[] filled(int n, long init) {
        long[] ret = new long[n];
        Arrays.fill(ret, init);
        return ret;
    }

    public static long[][] filled(int n, int m, long init) {
        long[][] ret = new long[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(ret[i], init);
        }
        return ret;
    }

    public static int[] indexToInt(int n, IntUnaryOperator f) {
        int[] a = new int[n];
        Arrays.setAll(a, f);
        return a;
    }

    public static long[] indexToLong(int n, IntToLongFunction f) {
        long[] a = new long[n];
        Arrays.setAll(a, f);
        return a;
    }

    public static int[] map(int[] a, IntUnaryOperator f) {
        int[] b = new int[a.length];
        Arrays.setAll(b, i -> f.applyAsInt(a[i]));
        return b;
    }

    public static long[] map(long[] a, LongUnaryOperator f) {
        long[] b = new long[a.length];
        Arrays.setAll(b, i -> f.applyAsLong(a[i]));
        return b;
    }

    public static <T> T[] map(UnaryOperator<T> op, T[] a) {
        @SuppressWarnings("unchecked")
        T[] b = (T[]) new Object[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = op.apply(a[i]);
        }
        return b;
    }

    public static int[] unique(int[] a) {
        HashSet<Integer> set = new HashSet<>();
        for (int e : a) {
            set.add(e);
        }
        int m = set.size();
        int[] b = new int[m];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (set.contains(a[i])) {
                b[index++] = a[i];
                set.remove(a[i]);
            }
        }
        return b;
    }

    public static long[] unique(long[] a) {
        HashSet<Long> set = new HashSet<>();
        for (long e : a) {
            set.add(e);
        }
        int m = set.size();
        long[] b = new long[m];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (set.contains(a[i])) {
                b[index++] = a[i];
                set.remove(a[i]);
            }
        }
        return b;
    }
}

class Edge {
    public int from;
    public int to;
    public long cost;

    public Edge(int from, int to, long cost) {
        this.from = from;
        this.to = to;
        this.cost = cost;
    }

    public Edge(int from, int to) {
        this(from, to, 1);
    }

    protected Edge reverse() {
        return new Edge(to, from, cost);
    }
}
