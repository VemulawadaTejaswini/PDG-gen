import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;
import java.util.function.Predicate;

public class Main {
    static In in = new In();
    static Out out = new Out();
    static final long inf = 0x1fffffffffffffffL;
    static final int iinf = 0x3fffffff;
    static final double eps = 1e-9;
    static long mod = 998244353;

    void solve(boolean naive) {
        int n = in.nextInt();
        int q = in.nextInt();
        int m = Integer.highestOneBit(n) * 2 + 2;
        long[] a11 = new long[m + 1];
        long[] pow10 = new long[m + 1];
        pow10[0] = 1;
        a11[1] = 1;
        for (int i = 1; i <= m; i++) {
            pow10[i] = pow10[i - 1] * 10 % mod;
            if (i >= 2) {
                a11[i] = (a11[i - 1] * 10 % mod + 1) % mod;
            }
        }
        Monoid<LongPair> monoid = (a, b) -> {
            int newLen = a.first + b.first;
            long newValue = (pow10[b.first] * a.second % mod + b.second) % mod;
            return new LongPair(newLen, newValue);
        };
        LazySegmentTree<LongPair, Integer> tree = new LazySegmentTree<>(monoid, (a, b, len) -> new LongPair(len, a11[len] * b % mod));
        tree.build(n, new LongPair(1, 1));
        for (int i = 0; i < q; i++) {
            int l = in.nextInt() - 1;
            int r = in.nextInt();
            int d = in.nextInt();
            tree.update(l, r, d);
            tree.propagate(1);
            out.println(tree.node.get(1).second);
        }
    }

    public static void main(String[] args) {
        new Main().solve(args.length == 1 && args[0].equals("naive"));
        out.flush();
    }
}

class LongPair implements Comparable<LongPair> {
    int first;
    long second;

    LongPair(int first, long second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof LongPair)) {
            return false;
        }
        LongPair that = (LongPair)o;
        return first == that.first && second == that.second;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(first) * 31 + Long.hashCode(second);
    }

    @Override
    public int compareTo(LongPair o) {
        return first == o.first ? Long.compare(second, o.second) : Integer.compare(first, o.first);
    }

    @Override
    public String toString() {
        return String.format("[%d, %d]", first, second);
    }
}

interface Monoid<T> {
    Monoid<Integer> SET_INTEGER = (a, b) -> b;
    Monoid<Integer> SUM_INTEGER = Integer::sum;
    Monoid<Integer> PRODUCT_INTEGER = (a, b) -> a * b;
    Monoid<Integer> XOR_INTEGER = (a, b) -> a ^ b;
    Monoid<Integer> GCD = (a, b) -> {
        while (a % b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return b;
    };
    Monoid<Integer> MIN_INTEGER = Math::min;
    Monoid<Integer> MAX_INTEGER = Math::max;
    Monoid<Long> SET_LONG = (a, b) -> b;
    Monoid<Long> SUM_LONG = Long::sum;
    Monoid<Long> PRODUCT_LONG = (a, b) -> a * b;
    Monoid<Long> XOR_LONG = (a, b) -> a ^ b;
    Monoid<Long> MIN_LONG = Math::min;
    Monoid<Long> MAX_LONG = Math::max;
    Monoid<Long> SUM_MOD = (a, b) -> (a + b) % Main.mod;

    T mergeFunction(T x, T y);

    default T merge(T x, T y) {
        T identity = identity();
        if (Objects.equals(x, identity)) {
            if (Objects.equals(y, identity)) {
                return identity;
            }
            return y;
        } else if (Objects.equals(y, identity)) {
            return x;
        } else {
            return mergeFunction(x, y);
        }
    }

    default T identity() {
        return null;
    }

    default boolean equalsIdentity(T obj) {
        return obj == null;
    }
}

class LazySegmentTree<T, U> {
    private boolean isBuilt;
    List<T> node;
    List<U> lazy;
    private int n;
    private int m;
    private int height;
    private final Monoid<T> monoidNode;
    private final Merge<T, U> mergeFunction;

    LazySegmentTree(Monoid<T> monoidNode, Merge<T, U> mergeFunction) {
        this.monoidNode = monoidNode;
        this.mergeFunction = mergeFunction;
    }

    void build(int m) {
        build(m, i -> monoidNode.identity());
    }

    void build(int m, T init) {
        build(m, i -> init);
    }

    void build(List<T> data) {
        build(data.size(), data::get);
    }

    void build(int m, IntFunction<T> initFunc) {
        this.m = m;
        this.n = Integer.highestOneBit(m) * 2;
        this.height = Integer.bitCount(n - 1);
        this.node = new ArrayList<>(n * 2);
        this.lazy = new ArrayList<>(n * 2);
        for (int i = 0; i < n; i++) {
            node.add(null);
        }
        for (int i = 0; i < n; i++) {
            node.add(i < m ? initFunc.apply(i) : monoidNode.identity());
        }
        for (int i = n - 1; i > 0; i--) {
            node.set(i, monoidNode.merge(node.get(i * 2), node.get(i * 2 + 1)));
        }
        for (int i = 0; i < n * 2; i++) {
            lazy.add(null);
        }
        this.isBuilt = true;
    }

    void update(int i, U x) {
        update(i, i + 1, x);
    }

    void update(int l, int r, U x) {
        checkBuilt();
        for (int i = height; i > 0; i--) {
            propagate((l + n) >> i);
            propagate((r + n - 1) >> i);
        }
        for (int ll = l + n, rr = r + n; ll < rr; ll /= 2, rr /= 2) {
            if (ll % 2 == 1) {
                lazy.set(ll, x == null ? lazy.get(ll) : x);
                propagate(ll);
                ll++;
            }
            if (rr % 2 == 1) {
                rr--;
                lazy.set(rr, x == null ? lazy.get(rr) : x);
                propagate(rr);
            }
        }
        for (int ll = (l + n) / 2, rr = (r + n - 1) / 2; ll > 0; ll /= 2, rr /= 2) {
            if (null == lazy.get(ll)) {
                node.set(ll, monoidNode.merge(merge(ll * 2), merge(ll * 2 + 1)));
            }
            if (null == lazy.get(rr)) {
                node.set(rr, monoidNode.merge(merge(rr * 2), merge(rr * 2 + 1)));
            }
        }
    }

    T get(int i) {
        return get(i, i + 1);
    }

    T get(int l, int r) {
        checkBuilt();
        for (int i = height; i > 0; i--) {
            propagate((l + n) >> i);
            propagate((r + n - 1) >> i);
        }
        T vl = monoidNode.identity();
        T vr = monoidNode.identity();
        for (int ll = l + n, rr = r + n; ll < rr; ll /= 2, rr /= 2) {
            if (ll % 2 == 1) {
                vl = monoidNode.merge(vl, merge(ll));
                ll++;
            }
            if (rr % 2 == 1) {
                rr--;
                vr = monoidNode.merge(merge(rr), vr);
            }
        }
        return monoidNode.merge(vl, vr);
    }

    List<T> getAll() {
        List<T> all = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            all.add(get(i));
        }
        return all;
    }

    int binarySearch(Predicate<T> predicate) {
        return binarySearch(0, m, predicate);
    }

    int binarySearch(int l, int r, Predicate<T> predicate) {
        checkBuilt();
        if (l < 0 || m < r || l >= r) {
            return -1;
        }
        for (int i = height; i > 0; i--) {
            propagate((l + n) >> i);
            propagate((r + n - 1) >> i);
        }
        T res = monoidNode.identity();
        int offset = l;
        for (int i = l + n; i < n * 2 && offset < r; ) {
            T t = monoidNode.merge(res, merge(i));
            if (rangeRight(i) <= r && !predicate.test(t)) {
                res = t;
                offset = rangeRight(i++);
                if (i % 2 == 0) {
                    i /= 2;
                }
            } else {
                i *= 2;
            }
        }
        return offset;
    }

    void propagate(int k) {
        if (null == lazy.get(k)) {
            return;
        }
        node.set(k, merge(k));
        if (k < n) {
            if (lazy.get(k) != null) {
                lazy.set(k * 2, lazy.get(k));
                lazy.set(k * 2 + 1, lazy.get(k));
            }
        }
        lazy.set(k, null);
    }

    private T merge(int i) {
        if (null == lazy.get(i)) {
            return node.get(i);
        } else {
            return mergeFunction.merge(node.get(i), lazy.get(i), range(i));
        }
    }

    private int rangeRight(int k) {
        return ((k ^ Integer.highestOneBit(k)) + 1) * range(k);
    }

    private int range(int k) {
        return 1 << (height - Integer.bitCount(Integer.highestOneBit(k) - 1));
    }

    private void checkBuilt() {
        if (!isBuilt) {
            throw new IllegalStateException("segment tree is not built");
        }
    }

    @Override
    public String toString() {
        return getAll().toString();
    }

    interface Merge<T, U> {
        T merge(T t, U u, int length);
    }
}

class In {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 0x10000);
    private StringTokenizer tokenizer;

    String next() {
        try {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
        } catch (IOException ignored) {
        }
        return tokenizer.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    double nextDouble() {
        return Double.parseDouble(next());
    }

    char[] nextCharArray() {
        return next().toCharArray();
    }

    char[][] nextCharGrid(int n, int m) {
        char[][] a = new char[n][m];
        for (int i = 0; i < n; i++) {
            a[i] = next().toCharArray();
        }
        return a;
    }

    int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
        }
        return a;
    }

    int[] nextIntArray(int n, IntUnaryOperator op) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = op.applyAsInt(nextInt());
        }
        return a;
    }

    long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextLong();
        }
        return a;
    }

    long[] nextLongArray(int n, LongUnaryOperator op) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = op.applyAsLong(nextLong());
        }
        return a;
    }

    List<List<Integer>> nextEdges(int n, int m) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            res.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int u = nextInt() - 1;
            int v = nextInt() - 1;
            res.get(u).add(v);
            res.get(v).add(u);
        }
        return res;
    }
}

class Out {
    private PrintWriter out = new PrintWriter(System.out);
    boolean autoFlush = false;

    void println(Object... a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (Object obj : a) {
            joiner.add(String.valueOf(obj));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void println(char[] s) {
        out.println(String.valueOf(s));
        if (autoFlush) {
            out.flush();
        }
    }

    void println(int[] a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i : a) {
            joiner.add(Integer.toString(i));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void println(long[] a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (long i : a) {
            joiner.add(Long.toString(i));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void flush() {
        out.flush();
    }
}
