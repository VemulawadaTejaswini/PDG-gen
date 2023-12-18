import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.function.*;

public class Main {
    static In in = new In();
    static Out out = new Out();
    static final long mod = 1000000007;
    static final long inf = 0x1fffffffffffffffL;
    static final int iinf = 0x3fffffff;
    static final int[] da = {-1, 0, 1, 0, -1, 1, 1, -1, -1};

    void solve() {
        int n = in.nextInt();
        List<List<Integer>> edges = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            edges.add(new ArrayList<>());
        }
        for (int i = 1; i < n; i++) {
            int a = in.nextInt() - 1;
            int b = in.nextInt() - 1;
            edges.get(a).add(b);
            edges.get(b).add(a);
        }
        Monoid<LongPair> monoid = new Monoid<LongPair>(() -> new LongPair(0, 1), (a, b) -> {
            return new LongPair(((a.first + a.second) % mod * ((b.first + b.second) % mod) % mod + mod - a.second * b.second % mod) % mod, a.second * b.second % mod);
        });
        ReRooting<LongPair> reRooting = new ReRooting<>(edges, (acc, node) -> {
            return new LongPair(acc.second, (acc.first + acc.second) % mod);
        }, monoid).calc();
        out.println((reRooting.get(0).first + reRooting.get(0).second) % mod);
    }

    public static void main(String[]$) {
        new Main().solve();
        out.flush();
    }
}

class LongPair {
    long first;
    long second;

    LongPair(long first, long second) {
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
    public String toString() {
        return String.format("[%s, %s]", first, second);
    }
}

class Monoid<T> {
    private T identity;
    private Supplier<T> identitySupplier;
    private BinaryOperator<T> operation;

    Monoid(BinaryOperator<T> operation) {
        this.operation = operation;
    }

    Monoid(T identity, BinaryOperator<T> operation) {
        this(operation);
        this.identity = identity;
    }

    Monoid(Supplier<T> identitySupplier, BinaryOperator<T> operation) {
        this(operation);
        this.identitySupplier = identitySupplier;
    }

    T merge(T x, T y) {
        T identity = identity();
        if (Objects.equals(x, identity)) {
            if (Objects.equals(y, identity)) {
                return identity;
            }
            return y;
        } else if (Objects.equals(y, identity)) {
            return x;
        } else {
            return operation.apply(x, y);
        }
    }

    public T identity() {
        return identitySupplier == null ? identity : identitySupplier.get();
    }
}

class ReRooting<T> {
    boolean isCalculated;
    List<List<Integer>> edges;
    BiFunction<T, Integer, T> addNodeFunction;
    Monoid<T> monoid;
    List<T> res = new ArrayList<>();
    List<List<T>> dp = new ArrayList<>();

    ReRooting(List<List<Integer>> edges, BiFunction<T, Integer, T> addNodeFunction, Monoid<T> monoid) {
        this.edges = edges;
        this.addNodeFunction = addNodeFunction;
        this.monoid = monoid;
        for (int i = 0; i < edges.size(); i++) {
            res.add(monoid.identity());
            dp.add(new ArrayList<>());
            for (int node : edges.get(i)) {
                dp.get(i).add(monoid.identity());
            }
        }
    }

    ReRooting<T> calc() {
        isCalculated = true;
        dfs1(0, -1);
        dfs2(0, -1, monoid.identity());
        return this;
    }

    private T dfs1(int node, int parent) {
        T acc = monoid.identity();
        int m = edges.get(node).size();
        for (int i = 0; i < m; i++) {
            int next = edges.get(node).get(i);
            if (next != parent) {
                T nextValue = dfs1(next, node);
                dp.get(node).set(i, nextValue);
                acc = monoid.merge(acc, nextValue);
            }
        }
        return addNodeFunction.apply(acc, node);
    }

    private void dfs2(int node, int parent, T p) {
        int m = edges.get(node).size();
        for (int i = 0; i < m; i++) {
            if (edges.get(node).get(i) == parent) {
                dp.get(node).set(i, p);
            }
        }
        List<T> dpLeft = new ArrayList<>();
        List<T> dpRight = new ArrayList<>();
        dpLeft.add(monoid.identity());
        dpRight.add(monoid.identity());
        for (int i = 0; i < m; i++) {
            dpLeft.add(monoid.merge(dpLeft.get(i), dp.get(node).get(i)));
            dpRight.add(monoid.merge(dpRight.get(i), dp.get(node).get(m - 1 - i)));
        }
        res.set(node, addNodeFunction.apply(dpLeft.get(m), node));
        for (int i = 0; i < m; i++) {
            int next = edges.get(node).get(i);
            if (next != parent) {
                dfs2(next, node, addNodeFunction.apply(monoid.merge(dpLeft.get(i), dpRight.get(m - 1 - i)), node));
            }
        }
    }

    T get(int v) {
        if (!isCalculated) {
            throw new IllegalStateException("Not calculated");
        }
        return res.get(v);
    }
}

class Combination {
    private static List<Long> fact = new ArrayList<>();
    private static List<Long> invFact = new ArrayList<>();

    private static void build(int n) {
        if (fact.isEmpty()) {
            fact.add(1L);
            invFact.add(1L);
        }
        for (int i = fact.size(); i <= n; i++) {
            fact.add(fact.get(i - 1) * i % Main.mod);
            invFact.add(pow(fact.get(i), Main.mod - 2));
        }
    }

    private static void rangeCheck(long n, long r) {
        if (n < r) {
            throw new IllegalArgumentException("n < r");
        }
        if (n < 0) {
            throw new IllegalArgumentException("n < 0");
        }
        if (r < 0) {
            throw new IllegalArgumentException("r < 0");
        }
    }

    static long fact(int n) {
        build(n);
        return fact.get(n);
    }

    static long invFact(int n) {
        build(n);
        return invFact.get(n);
    }

    static long comb(int n, int r) {
        rangeCheck(n, r);
        return fact(n) * invFact(r) % Main.mod * invFact(n - r) % Main.mod;
    }

    static long comb(long n, long r) {
        rangeCheck(n, r);
        if (n < 1000000) {
            return comb((int)n, (int)r);
        }
        r = Math.min(r, n - r);
        long x = 1, y = 1;
        for (long i = 1; i <= r; i++) {
            x = x * (n - r + i) % Main.mod;
            y = y * i % Main.mod;
        }
        return x * inv(y) % Main.mod;
    }

    static long perm(int n, int r) {
        rangeCheck(n, r);
        return fact(n) * invFact(n - r) % Main.mod;
    }

    static long perm(long n, long r) {
        rangeCheck(n, r);
        if (n < 1000000) {
            return perm((int)n, (int)r);
        }
        long x = 1;
        for (long i = 1; i <= r; i++) {
            x = x * (n - r + i) % Main.mod;
        }
        return x;
    }

    static long homo(int n, int r) {
        return r == 0 ? 1 : comb(n + r - 1, r);
    }

    static long homo(long n, long r) {
        return r == 0 ? 1 : comb(n + r - 1, r);
    }

    static long inv(long a) {
        return pow(a, Main.mod - 2);
    }

    static long pow(long a, long b) {
        long x = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                x = x * a % Main.mod;
                b--;
            } else {
                a = a * a % Main.mod;
                b /= 2;
            }
        }
        return x;
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
