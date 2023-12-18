import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.PrimitiveIterator;
import java.util.Set;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.LongPredicate;
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
        Compress cmp = new Compress(a, false);
        int[] compress = cmp.compress;
        long[] sorted = cmp.sorted;
        int m = sorted.length;
        int[] cnt = new int[m];
        HashMap<Long, Integer> rev = new HashMap<>();
        for (int i = 0; i < n; i++) {
            rev.putIfAbsent(a[i], compress[i]);
            cnt[compress[i]]++;
        }
        CapacityGraph g = new CapacityGraph(2 * (m + 1));
        for (int i = 0; i < m; i++) {
            long x = sorted[i];
            int u = rev.get(x);
            int xnum = cnt[u];
            for (long b = 1 << 30; b - x >= x; b >>= 1) {
                long y = b - x;
                if (!rev.containsKey(y)) {
                    continue;
                }
                int v = rev.get(y);
                if (x == y) {
                    g.addEdge(u, m + v, xnum >> 1);
                } else {
                    g.addEdge(u, m + v, xnum);
                }
            }
            g.addEdge(2 * m, i, xnum);
            g.addEdge(m + i, 2 * m + 1, xnum);
        }
        long ans = MaximumFlow.dinic(2 * m, 2 * m + 1, g);
        out.append(ans);
    }
}



/**
 * @author https://atcoder.jp/users/suisen
 * 
 * (NON-DESTRUCTIVE) methods that returns long array.
 */
class LongArrayGenerator {

    private LongArrayGenerator(){}
    
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

    public static long[] indexToLong(int n, IntToLongFunction f) {
        long[] a = new long[n];
        Arrays.setAll(a, f);
        return a;
    }

    public static long[] toArray(Collection<? extends Number> collection) {
        int n = collection.size();
        long[] ret = new long[n];
        Object[] coll = collection.toArray();
        for (int i = 0; i < n; i++) {
            ret[i] = ((Number) coll[i]).longValue();
        }
        return ret;
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

    public static long[][] transpose(long[][] a) {
        int n = a.length;
        int m = a[0].length;
        long[][] ret = new long[m][n];
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                ret[j][i] = a[i][j];
            }
        }
        return ret;
    }

    public static long[] map(long[] a, LongUnaryOperator f) {
        long[] b = new long[a.length];
        Arrays.setAll(b, i -> f.applyAsLong(a[i]));
        return b;
    }

    public static long[] filter(long[] a, LongPredicate p) {
        LongArrayList ret = new LongArrayList();
        for (long e : a) {
            ret.addIf(e, p);
        }
        return ret.toArray();
    }

    public static long[] accumulate(long[] a, LongBinaryOperator op) {
        int n = a.length;
        long[] ret = new long[n];
        ret[0] = a[0];
        for (int i = 1; i < n; i++) {
            ret[i] = op.applyAsLong(ret[i - 1], a[i]);
        }
        return ret;
    }

    public static long[] accumulate(long[] a) {
        int n = a.length;
        long[] ret = new long[n];
        ret[0] = a[0];
        for (int i = 1; i < n; i++) {
            ret[i] = ret[i - 1] + a[i];
        }
        return ret;
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 * 
 * 1. DESTRUCTIVE methods for long arrays.
 * 2. methods that receives arrays and return some results (except for long arrays).
 */
class LongArrays {

    private LongArrays(){}

    public static void swap(long[] a, int u, int v) {
        long tmp = a[u];
        a[u] = a[v];
        a[v] = tmp;
    }

    public static void reverse(long[] a, int begin, int end) {
        for (int i = begin; i < begin + (end - begin) / 2; i++) {
            swap(a, i, begin + end - i - 1);
        }
    }

    public static void reverse(long[] a) {
        reverse(a, 0, a.length);
    }

    public static void sortDescending(long[] a) {
        Arrays.sort(a);
        reverse(a);
    }

    public static long reduce(long[] a, LongBinaryOperator op) {
        long ret = a[0];
        for (int i = 1; i < a.length; i++) {
            ret = op.applyAsLong(ret, a[i]);
        }
        return ret;
    }

    public static void map(long[] a, LongUnaryOperator op) {
        for (int i = 0; i < a.length; i++) {
            a[i] = op.applyAsLong(a[i]);
        }
    }

    public static void filter(long[] src, long[] dst, LongPredicate p) {
        int idx = 0;
        for (long e : src) {
            if (p.test(e)) {
                dst[idx++] = e;
            }
        }
    }

    public static void filterIndex(long[] dst, int beginIndex, int endIndex, LongPredicate p) {
        for (int i = beginIndex, idx = 0; i < endIndex; i++) {
            if (p.test(i)) {
                dst[idx++] = i;
            }
        }
    }

    public static void filterIndex(long dst[], int endIndex, LongPredicate p) {
        filterIndex(dst, 0, endIndex, p);
    }

    public static void accumulate(long[] a, LongBinaryOperator op) {
        for (int i = 1; i < a.length; i++) {
            a[i] = op.applyAsLong(a[i - 1], a[i]);
        }
    }

    public static void accumulate(long[] a) {
        for (int i = 1; i < a.length; i++) {
            a[i] += a[i - 1];
        }
    }

    public static int unique(long[] a) {
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
        a = b;
        return m;
    }

    public static void transpose(long[][] a) {
        int n = a.length;
        int m = a[0].length;
        long[][] ret = new long[m][n];
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                ret[j][i] = a[i][j];
            }
        }
        a = ret;
    }

    public static int compare(long[] a, long[] b) {
        for (int i = 0; i < a.length; i++) {
            if (i >= b.length) {
                return -1;
            } else if (a[i] > b[i]) {
                return 1;
            } else if (a[i] < b[i]) {
                return -1;
            }
        }
        if (a.length < b.length) {
            return 1;
        } else {
            return 0;
        }
    }

    public static boolean equals(long[] a, long[] b) {
        return compare(a, b) == 0;
    }

    public static String join(long[] a, String sep) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
            if (i < a.length - 1) {
                sb.append(sep);
            }
        }
        return sb.toString();
    }

    public static String joinWithPrefixAndSuffix(long[] a, IntFunction<String> idxToPre, IntFunction<String> idxToSuf, String sep) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(idxToPre.apply(i)).append(a[i]).append(idxToSuf.apply(i));
            if (i < a.length - 1) {
                sb.append(sep);
            }
        }
        return sb.toString();
    }
}



/**
 * @author https://atcoder.jp/users/suisen
 */
abstract class AbstractGraph {
    protected final int n;
    protected int m = 0;
    private ArrayList<Edge>[] adj;
    private int[] in;
    private HashMap<Integer, IntArrayList> components;
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

    public HashMap<Integer, IntArrayList> getComponents() {
        generateComponentsIfAbsent();
        return this.components;
    }

    public IntArrayList getComponent(int i) {
        return getComponents().get(getRoot(i));
    }

    public Set<Integer> getRoots() {
        return getComponents().keySet();
    }

    public Collection<IntArrayList> getComponentSet() {
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

    private void generateComponentsIfAbsent() {
        if (Objects.isNull(this.components)) {
            HashMap<Integer, IntArrayList> components = new HashMap<>();
            for (int i = 0; i < n; i++) {
                if (!components.containsKey(getRoot(i))) {
                    IntArrayList component = new IntArrayList();
                    component.add(i);
                    components.put(getRoot(i), component);
                } else {
                    components.get(getRoot(i)).add(i);
                }
            }
            this.components = components;
        }
    }
    
    abstract public boolean isBipartite();
}



/**
 * @author https://atcoder.jp/users/suisen
 */
class IntArrayList implements Iterable<Integer> {
    private int[] a;
    private int tail = 0;

    private static final int DEFAULT_SIZE = 64;

    public IntArrayList(int capacity) {
        this.a = new int[Math.max(1, capacity)];
    }

    public IntArrayList() {
        this(DEFAULT_SIZE);
    }

    public void add(int v) {
        if (tail == a.length) {
            resize(2);
        }
        a[tail++] = v;
    }

    public int removeLast() {
        return a[tail--];
    }

    public int get(int i) {
        if (i >= this.tail) {
            System.err.println("Error in IntArrayList::get(" + i + "): ArrayIndexOutOfBounds. list size = " + tail);
        }
        return a[i];
    }

    public void set(int i, int v) {
        if (i >= this.tail) {
            System.err.println("Error in IntArrayList::set(" + i + "): ArrayIndexOutOfBounds. list size = " + tail);
        }
        a[i] = v;
    }

    private void resize(double grow) {
        int[] b = new int[(int) Math.ceil(a.length * grow)];
        System.arraycopy(a, 0, b, 0, a.length);
        a = b;
    }

    public int size() {
        return tail;
    }

    public void reverse(int begin, int end) {
        IntArrays.reverse(a, begin, end);
    }

    public void reverse() {
        IntArrays.reverse(a, 0, tail);
    }

    public int[] toArray() {
        int[] ret = new int[tail];
        System.arraycopy(a, 0, ret, 0, tail);
        return ret;
    }

    public boolean addIf(int v, IntPredicate p) {
        if (p.test(v)) {
            add(v);
            return true;
        }
        return false;
    }

    public PrimitiveIterator.OfInt iterator() {
        return new IntArrayListIterator();
    }

    private class IntArrayListIterator implements PrimitiveIterator.OfInt {
        private int i = 0;

        public boolean hasNext() {
            return i < tail;
        }

        public int nextInt() {
            return a[i++];
        }
    }
}



/**
 * @author https://atcoder.jp/users/suisen
 * 
 * (NON-DESTRUCTIVE) methods that returns int array.
 */
class IntArrayGenerator {

    private IntArrayGenerator(){}
    
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

    public static int[] indexToInt(int n, IntUnaryOperator f) {
        int[] a = new int[n];
        Arrays.setAll(a, f);
        return a;
    }

    public static int[] toArray(Collection<? extends Number> collection) {
        int n = collection.size();
        int[] ret = new int[n];
        Object[] coll = collection.toArray();
        for (int i = 0; i < n; i++) {
            ret[i] = ((Number) coll[i]).intValue();
        }
        return ret;
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

    public static int[][] transpose(int[][] a) {
        int n = a.length;
        int m = a[0].length;
        int[][] ret = new int[m][n];
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                ret[j][i] = a[i][j];
            }
        }
        return ret;
    }

    public static int[] count(int[] a, int max) {
        int[] ret = new int[max + 1];
        for (int i = 0; i < a.length; i++) {
            ret[a[i]]++;
        }
        return ret;
    }

    public static int[] map(int[] a, IntUnaryOperator f) {
        int[] b = new int[a.length];
        Arrays.setAll(b, i -> f.applyAsInt(a[i]));
        return b;
    }

    public static int[] filter(int[] a, IntPredicate p) {
        IntArrayList ret = new IntArrayList();
        for (int e : a) {
            ret.addIf(e, p);
        }
        return ret.toArray();
    }

    public static int[] filterIndex(int beginIndex, int endIndex, IntPredicate p) {
        IntArrayList ret = new IntArrayList();
        for (int i = beginIndex; i < endIndex; i++) {
            ret.addIf(i, p);
        }
        return ret.toArray();
    }

    public static int[] filterIndex(int endIndex, IntPredicate p) {
        return filterIndex(0, endIndex, p);
    }

    public static int[] accumulate(int[] a, IntBinaryOperator op) {
        int n = a.length;
        int[] ret = new int[n];
        ret[0] = a[0];
        for (int i = 1; i < n; i++) {
            ret[i] = op.applyAsInt(ret[i - 1], a[i]);
        }
        return ret;
    }

    public static int[] accumulate(int[] a) {
        int n = a.length;
        int[] ret = new int[n];
        ret[0] = a[0];
        for (int i = 1; i < n; i++) {
            ret[i] = ret[i - 1] + a[i];
        }
        return ret;
    }
}



/**
 * @author https://atcoder.jp/users/suisen
 */
class Digraph extends AbstractGraph {
    private Digraph reverse;

    public Digraph(int n) {
        super(n);
    }

    public void addEdge(int from, int to, long cost) {
        Edge e = new Edge(from, to, cost);
        super.addEdge(e);
        this.m++;
    }

    public void addEdge(int from, int to) {
        this.addEdge(from, to, 1);
    }

    @Override
    public void addEdge(Edge e) {
        super.addEdge(e);
        this.m++;
    }

    @Override
    public boolean isBipartite() {
        int[] color = new int[n];
        IntDeque dq = new IntDeque();
        for (int root : getRoots()) {
            dq.addLast(root);
            color[root] = 1;
        }
        while (dq.size() > 0) {
            int now = dq.pollFirst();
            for (Edge e : getEdges(now)) {
                int next = e.to;
                if (color[next] == 0) {
                    color[next] = -color[now];
                    dq.addLast(next);
                } else if (color[now] == color[next]) {
                    return false;
                }
            }
            for (Edge e : reverse().getEdges(now)) {
                int next = e.to;
                if (color[next] == 0) {
                    color[next] = -color[now];
                    dq.addLast(next);
                } else if (color[now] == color[next]) {
                    return false;
                }
            }
        }
        return true;
    }

    public Digraph reverse() {
        generateReverseIfAbsent();
        return this.reverse;
    }

    private void generateReverseIfAbsent() {
        if (Objects.isNull(this.reverse)) {
            this.reverse = new Digraph(n);
            for (int i = 0; i < n; i++) {
                for (Edge e : getEdges(i)) {
                    this.reverse.addEdge(e.reverse());
                }
            }
        }
    }
}

/**
 * @author https://atcoder.jp/users/suisen
 */
class CapacityEdge extends Edge {
    public long cap;
    public int rev;

    public CapacityEdge(int from, int to, long cap, int rev) {
        super(from, to, -1);
        this.cap = cap;
        this.rev = rev;
    }
}



/**
 * @author https://atcoder.jp/users/suisen
 */
class LongArrayList implements Iterable<Long> {
    private long[] a;
    private int tail = 0;

    private static final int DEFAULT_SIZE = 64;

    public LongArrayList(int capacity) {
        this.a = new long[Math.max(1, capacity)];
    }

    public LongArrayList() {
        this(DEFAULT_SIZE);
    }

    public void add(long v) {
        if (tail == a.length) {
            resize();
        }
        a[tail++] = v;
    }

    public long removeLast() {
        return a[tail--];
    }

    public long get(int i) {
        if (i >= a.length) {
            System.err.println("Error in LongArrayList::get(" + i + "): ArrayIndexOutOfBounds. list size = " + a.length);
        }
        return a[i];
    }

    public void set(int i, long v) {
        if (i >= a.length) {
            System.err.println("Error in LongArrayList::set(" + i + "): ArrayIndexOutOfBounds. list size = " + a.length);
        }
        a[i] = v;
    }

    private void resize() {
        long[] b = new long[a.length << 1];
        System.arraycopy(a, 0, b, 0, a.length);
        a = b;
    }

    public int size() {
        return tail;
    }

    public void reverse(int begin, int end) {
        LongArrays.reverse(a, begin, end);
    }

    public void reverse() {
        LongArrays.reverse(a, 0, tail);
    }

    public long[] toArray() {
        long[] ret = new long[tail];
        System.arraycopy(a, 0, ret, 0, tail);
        return ret;
    }

    public boolean addIf(long v, LongPredicate p) {
        if (p.test(v)) {
            add(v);
            return true;
        }
        return false;
    }

    public PrimitiveIterator.OfLong iterator() {
        return new LongArrayListIterator();
    }

    private class LongArrayListIterator implements PrimitiveIterator.OfLong {
        private int i = 0;
        
        public boolean hasNext() {
            return i < tail;
        }

        public long nextLong() {
            return a[i++];
        }
    }
}



/**
 * @author https://atcoder.jp/users/suisen
 */
class MaximumFlow {

    private MaximumFlow(){}
    
    // caluculate maximum-flow in O(|E|*|V|^2), but often fast.
    public static long dinic(int s, int t, CapacityGraph g) {
        int n = g.getV();
        long flow = 0;
        while(true){
            int[] level = dinicBFS(s, t, g);
            if(level[t] < 0) break;
            int[] iter = new int[n];
            long f = dinicDFS(s, t, g, Const.LINF, level, iter);
            while (f > 0) {
                flow += f;
                f = dinicDFS(s, t, g, Const.LINF, level, iter);
            }
        }
        return flow;
    }

    private static int[] dinicBFS(int s, int t, CapacityGraph g) {
        int n = g.getV();
        IntDeque dq = new IntDeque();
        dq.addLast(s);
        int[] level = new int[n];
        Arrays.fill(level, -1);
        level[s] = 0;
        while (dq.size() > 0) {
            int now = dq.pollFirst();
            for (Edge e : g.getEdges(now)) {
                CapacityEdge ce = (CapacityEdge) e;
                if (level[ce.to] < 0 && ce.cap > 0) {
                    dq.addLast(ce.to);
                    level[ce.to] = level[now] + 1;
                }
            }
        }
        return level;
    }

    private static long dinicDFS(int now, int t, CapacityGraph g, long f, int[] level, int[] iter) {
        if (now == t) return f;
        for (int i = iter[now]++; i < g.out(now); i++) {
            CapacityEdge e = (CapacityEdge) g.getEdge(now, i);
            if (level[now] < level[e.to] && e.cap > 0) {
                long d = dinicDFS(e.to, t, g, Math.min(f, e.cap), level, iter);
                if (d > 0) {
                    e.cap -= d;
                    CapacityEdge rev = (CapacityEdge) g.getEdge(e.to, e.rev);
                    rev.cap += d;
                    return d;
                }
            }
        }
        return 0;
    }

    // caluculate maximum-flow in O(|E|*F). F is the maximum-flow.
    public static long fordFulkerson(int s, int t, CapacityGraph g) {
        int n = g.getV();
        long flow = 0;
        while (true) {
            boolean[] used = new boolean[n];
            long f = fordFulkersonDFS(s, t, g, Const.LINF, used);
            flow += f;
            if(f <= 0) break;
        }
        return flow;
    }

    private static long fordFulkersonDFS(int now, int t, CapacityGraph g, long f, boolean[] used) {
        if(now == t) return f;
        used[now] = true;
        for (int i = 0; i < g.out(now); i++) {
            CapacityEdge e = (CapacityEdge) g.getEdge(now, i);
            if (!used[e.to] && e.cap > 0) {
                long d = fordFulkersonDFS(e.to, t, g, Math.min(f, e.cap), used);
                if (d > 0) {
                    e.cap -= d;
                    CapacityEdge rev = (CapacityEdge) g.getEdge(e.to, e.rev);
                    rev.cap += d;
                    return d;
                }
            }
        }
        return 0;
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
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


/**
 * @author https://atcoder.jp/users/suisen
 */
class Compress {
    public int n;
    public int[] compress;
    public long[] sorted;
    public boolean oneIndexed;

    public Compress(long[] a, boolean oneIndexed) {
        this.n = a.length;
        this.compress = new int[n];
        this.oneIndexed = oneIndexed;
        build(a);
    }

    private void build(long[] a) {
        this.sorted = LongArrayGenerator.unique(a);
        Arrays.sort(this.sorted);
        int size = this.sorted.length;
        for (int i = 0; i < n; i++) {
            int l = 0, r = size;
            while (r - l > 1) {
                int m = l + (r - l) / 2;
                if (this.sorted[m] <= a[i]) {
                    l = m;
                } else {
                    r = m;
                }
            }
            this.compress[i] = this.oneIndexed ? l + 1 : l;
        }
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 * 
 * 1. DESTRUCTIVE methods for int arrays.
 * 2. methods that receives arrays and return some results (except for int arrays).
 */
class IntArrays {

    private IntArrays(){}

    public static void swap(int[] a, int u, int v) {
        int tmp = a[u];
        a[u] = a[v];
        a[v] = tmp;
    }

    public static void reverse(int[] a, int begin, int end) {
        for (int i = begin; i < begin + (end - begin) / 2; i++) {
            swap(a, i, begin + end - i - 1);
        }
    }

    public static void reverse(int[] a) {
        reverse(a, 0, a.length);
    }

    public static void sortDescending(int[] a) {
        Arrays.sort(a);
        reverse(a);
    }

    public static int reduce(int[] a, IntBinaryOperator op) {
        int ret = a[0];
        for (int i = 1; i < a.length; i++) {
            ret = op.applyAsInt(ret, a[i]);
        }
        return ret;
    }

    public static void map(int[] a, IntUnaryOperator op) {
        for (int i = 0; i < a.length; i++) {
            a[i] = op.applyAsInt(a[i]);
        }
    }

    public static void filter(int[] src, int[] dst, IntPredicate p) {
        int idx = 0;
        for (int e : src) {
            if (p.test(e)) {
                dst[idx++] = e;
            }
        }
    }

    public static void filterIndex(int[] dst, int beginIndex, int endIndex, IntPredicate p) {
        for (int i = beginIndex, idx = 0; i < endIndex; i++) {
            if (p.test(i)) {
                dst[idx++] = i;
            }
        }
    }

    public static void filterIndex(int dst[], int endIndex, IntPredicate p) {
        filterIndex(dst, 0, endIndex, p);
    }

    public static void accumulate(int[] a, IntBinaryOperator op) {
        for (int i = 1; i < a.length; i++) {
            a[i] = op.applyAsInt(a[i - 1], a[i]);
        }
    }

    public static void accumulate(int[] a) {
        for (int i = 1; i < a.length; i++) {
            a[i] += a[i - 1];
        }
    }

    public static int unique(int[] a) {
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
        a = b;
        return m;
    }

    public static void transpose(int[][] a) {
        int n = a.length;
        int m = a[0].length;
        int[][] ret = new int[m][n];
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                ret[j][i] = a[i][j];
            }
        }
        a = ret;
    }

    public static int compare(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (i >= b.length) {
                return -1;
            } else if (a[i] > b[i]) {
                return 1;
            } else if (a[i] < b[i]) {
                return -1;
            }
        }
        if (a.length < b.length) {
            return 1;
        } else {
            return 0;
        }
    }

    public static boolean equals(int[] a, int[] b) {
        return compare(a, b) == 0;
    }

    public static String join(int[] a, String sep) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
            if (i < a.length - 1) {
                sb.append(sep);
            }
        }
        return sb.toString();
    }

    public static String joinWithPrefixAndSuffix(int[] a, IntFunction<String> idxToPre, IntFunction<String> idxToSuf, String sep) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(idxToPre.apply(i)).append(a[i]).append(idxToSuf.apply(i));
            if (i < a.length - 1) {
                sb.append(sep);
            }
        }
        return sb.toString();
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
class UnionFindTree {
    private int[] parent;
    private int[] rank;
    private int[] size;
    private int groupNum;

    public UnionFindTree(int n) {
        this.parent = IntArrayGenerator.indexToInt(n, i -> i);
        this.rank = new int[n];
        this.size = IntArrayGenerator.filled(n, 1);
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

/**
 * @author https://atcoder.jp/users/suisen
 */
class CapacityGraph extends Digraph {
    public CapacityGraph(int n) {
        super(n);
    }

    @Override
    public void addEdge(int from, int to, long cap){
        CapacityEdge e = new CapacityEdge(from, to, cap, out(to));
        CapacityEdge er = new CapacityEdge(to, from, 0, out(from));
        getEdges(from).add(e);
        getEdges(to).add(er);
        this.m++;
    }

    @Override
    public void addEdge(int from, int to) {
        this.addEdge(from, to, 1);
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

    public static final String YES = "YES";
    public static final String NO = "NO";
    public static final String Yes = "Yes";
    public static final String No = "No";
    public static final String POSSIBLE = "POSSIBLE";
    public static final String IMPOSSIBLE = "IMPOSSIBLE";
    public static final String Possible = "Possible";
    public static final String Impossible = "Impossible";

    public static final int[] dx8 = {1, 0, -1, 0, 1, -1, -1, 1};
    public static final int[] dy8 = {0, 1, 0, -1, 1, 1, -1, -1};
    public static final int[] dx = {1, 0, -1, 0};
    public static final int[] dy = {0, 1, 0, -1};

    private Const(){}
}

/**
 * @author https://atcoder.jp/users/suisen
 */
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

    public Edge reverse() {
        return new Edge(to, from, cost);
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
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

    public void apply(int index, IntUnaryOperator f) {
        index += head + 1;
        if (index >= tail) {
            System.err.println("Error in IntDeque::apply(" + index + "). the size of IntDeque is " + size() + ".");
        }
        applyByRawIndex(index, f);
    }

    public void applyFirst(IntUnaryOperator f) {
        apply(0, f);
    }

    public void applyLast(IntUnaryOperator f) {
        apply(size() - 1, f);
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

    private void applyByRawIndex(int index, IntUnaryOperator f) {
        if (index >= 0) {
            p[index] = f.applyAsInt(p[index]);
        } else {
            n[-(index + 1)] = f.applyAsInt(n[-(index + 1)]);
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
