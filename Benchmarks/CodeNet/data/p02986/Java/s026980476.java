import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

public class Main {
    static In in = new In();
    static Out out = new Out();
    static final long mod = 1000000007;
    static final long inf = 0x1fffffffffffffffL;
    static final int iinf = 0x3fffffff;
    static final int[] da = {-1, 0, 1, 0, -1, 1, 1, -1, -1};

    void solve() {
        int n = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n - 1];
        int[] b = new int[n - 1];
        int[] c = new int[n - 1];
        int[] d = new int[n - 1];
        HLDecomposition hld = new HLDecomposition(n);
        List<List<State>> s = new ArrayList<>();
        List<List<Query>> queryList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            s.add(new ArrayList<>());
            queryList.add(new ArrayList<>());
        }
        for (int i = 0; i < n - 1; i++) {
            a[i] = in.nextInt() - 1;
            b[i] = in.nextInt() - 1;
            c[i] = in.nextInt() - 1;
            d[i] = in.nextInt();
            hld.addEdge(a[i], b[i]);
            s.get(c[i]).add(new State(a[i], b[i], d[i]));
        }
        hld.build();
        SegmentTree sumTree = new SegmentTree(n);
        SegmentTree countTree = new SegmentTree(n);
        for (int i = 0; i < n - 1; i++) {
            sumTree.setValue(hld.get(a[i], b[i]), d[i]);
        }
        for (int i = 0; i < q; i++) {
            int x = in.nextInt() - 1;
            int y = in.nextInt();
            int u = in.nextInt() - 1;
            int v = in.nextInt() - 1;
            queryList.get(x).add(new Query(i, u, v, y));
        }
        long[] ans = new long[q];
        for (int i = 0; i < n - 1; i++) {
            for (State state : s.get(i)) {
                countTree.setValue(hld.get(state.a, state.b), 1);
                sumTree.setValue(hld.get(state.a, state.b), 0);
            }
            for (Query query : queryList.get(i)) {
                long count = 0;
                long sum = 0;
                for (Section section : hld.forEachEdge(query.u, query.v)) {
                    count += countTree.getSum(section.left, section.right);
                    sum += sumTree.getSum(section.left, section.right);
                }
                ans[query.i] = sum + count * query.y;
            }
            for (State state : s.get(i)) {
                countTree.setValue(hld.get(state.a, state.b), 0);
                sumTree.setValue(hld.get(state.a, state.b), state.d);
            }
        }
        for (int i = 0; i < q; i++) {
            out.println(ans[i]);
        }
    }

    public static void main(String[]$) {
        new Main().solve();
        out.flush();
    }
}

class State {
    int a;
    int b;
    int d;

    State(int a, int b, int d) {
        this.a = a;
        this.b = b;
        this.d = d;
    }
}

class Query {
    int i;
    int u;
    int v;
    int y;

    Query(int i, int u, int v, int y) {
        this.i = i;
        this.u = u;
        this.v = v;
        this.y = y;
    }
}

class HLDecomposition {
    List<List<Integer>> edges;
    int n;
    int[] vid;
    int[] out;
    int[] head;
    int[] parent;
    int[] depth;
    int[] size;

    HLDecomposition(int n) {
        this.n = n;
        this.edges = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            edges.add(new ArrayList<>());
        }
        this.vid = new int[n];
        this.out = new int[n];
        this.head = new int[n];
        this.parent = new int[n];
        this.depth = new int[n];
        this.size = new int[n];
    }

    void addEdge(int u, int v) {
        edges.get(u).add(v);
        edges.get(v).add(u);
    }

    void build() {
        build(0);
    }

    void build(int root) {
        parent[root] = root;
        dfs1(root);
        dfs2(root, 0);
    }

    private void dfs1(int node) {
        size[node] = 1;
        List<Integer> children = edges.get(node);
        for (int i = 0; i < children.size(); i++) {
            int v = children.get(i);
            if (v != parent[node]) {
                parent[v] = node;
                dfs1(v);
                size[node] += size[v];
                if (size[v] > size[children.get(0)]) {
                    children.set(0, children.set(i, children.get(0)));
                }
            }
        }
    }

    private int dfs2(int node, int k) {
        vid[node] = k++;
        for (int v : edges.get(node)) {
            if (v != parent[node]) {
                if (v == edges.get(node).get(0)) {
                    head[v] = head[node];
                    depth[v] = depth[node];
                } else {
                    head[v] = v;
                    depth[v] = depth[node] + 1;
                }
                k = dfs2(v, k);
            }
        }
        out[node] = k;
        return k;
    }

    List<Section> forEach(int u, int v) {
        List<Section> res = new ArrayList<>();
        while (true) {
            if (head[u] == head[v]) {
                res.add(new Section(Math.min(vid[u], vid[v]), Math.max(vid[u], vid[v]) + 1));
                return res;
            }
            if (depth[u] > depth[v]) {
                res.add(new Section(vid[head[u]], vid[u] + 1));
                u = parent[head[u]];
            } else {
                res.add(new Section(vid[head[v]], vid[v] + 1));
                v = parent[head[v]];
            }
        }
    }

    List<Section> forEachEdge(int u, int v) {
        List<Section> res = new ArrayList<>();
        while (true) {
            if (head[u] == head[v]) {
                res.add(new Section(Math.min(vid[u], vid[v]) + 1, Math.max(vid[u], vid[v]) + 1));
                return res;
            }
            if (depth[u] > depth[v]) {
                res.add(new Section(vid[head[u]], vid[u] + 1));
                u = parent[head[u]];
            } else {
                res.add(new Section(vid[head[v]], vid[v] + 1));
                v = parent[head[v]];
            }
        }
    }

    int lca(int u, int v) {
        while (true) {
            if (head[u] == head[v]) {
                return vid[u] < vid[v] ? u : v;
            }
            if (depth[u] > depth[v]) {
                u = parent[head[u]];
            } else {
                v = parent[head[v]];
            }
        }
    }

    Section subtree(int v) {
        return new Section(vid[v], out[v]);
    }

    Section subtreeEdge(int v) {
        return new Section(vid[v] + 1, out[v]);
    }

    int getSubtreeSize(int k) {
        return size[k];
    }

    int get(int k) {
        return vid[k];
    }

    int get(int u, int v) {
        return Math.max(vid[u], vid[v]);
    }

    @Override
    public String toString() {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[vid[i]] = i;
        }
        return Arrays.toString(a);
    }
}

class Bit {
    private int n;
    private long[] bit;

    Bit(int n) {
        this.n = n;
        this.bit = new long[n + 1];
    }

    Bit(long[] a) {
        this(a.length);
        for (int i = 0; i < n; i++) {
            addValue(i, a[i]);
        }
    }

    void addValue(int i, long x) {
        for (i++; i <= n; i += i & -i) {
            bit[i] += x;
        }
    }

    private long getSum(int i) {
        long sum = 0;
        for (; i > 0; i -= i & -i) {
            sum += bit[i];
        }
        return sum;
    }

    long get(int i) {
        return getSum(i + 1) - getSum(i);
    }

    long getSum(int l, int r) {
        return l >= r ? 0 : getSum(r) - getSum(l);
    }

    long[] getAll() {
        long[] res = new long[n];
        for (int i = 0; i < n; i++) {
            res[i] = get(i);
        }
        return res;
    }

    @Override
    public String toString() {
        return Arrays.toString(getAll());
    }
}

class SegmentTree {
    private int n;
    private int m;
    private long[] min;
    private long[] secondMin;
    private long[] minCount;
    private long[] max;
    private long[] secondMax;
    private long[] maxCount;
    private long[] sum;
    private long[] length;
    private long[] lazyAdd;
    private long[] lazy;

    SegmentTree(int n) {
        this(n, null);
    }

    SegmentTree(long[] a) {
        this(a.length, a);
    }

    private SegmentTree(int m, long[] a) {
        this.m = m;
        this.n = Integer.highestOneBit(m) * 2;
        this.min = new long[n * 2];
        this.secondMin = new long[n * 2];
        this.minCount = new long[n * 2];
        this.max = new long[n * 2];
        this.secondMax = new long[n * 2];
        this.maxCount = new long[n * 2];
        this.sum = new long[n * 2];
        this.length = new long[n * 2];
        this.lazyAdd = new long[n * 2];
        this.lazy = new long[n * 2];
        for (int i = 0; i < n * 2; i++) {
            lazy[i] = Main.inf;
        }
        length[0] = n;
        for (int i = 0; i < n - 1; i++) {
            length[i * 2 + 1] = length[i * 2 + 2] = length[i] >> 1;
        }
        for (int i = 0; i < n; i++) {
            if (i < m) {
                max[n - 1 + i] = min[n - 1 + i] = sum[n - 1 + i] = a == null ? 0 : a[i];
                secondMax[n - 1 + i] = -Main.inf;
                secondMin[n - 1 + i] = Main.inf;
                maxCount[n - 1 + i] = minCount[n - 1 + i] = 1;
            } else {
                max[n - 1 + i] = secondMax[n - 1 + i] = -Main.inf;
                min[n - 1 + i] = secondMin[n - 1 + i] = Main.inf;
                maxCount[n - 1 + i] = minCount[n - 1 + i] = 0;
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            update(i);
        }
    }

    void changeMin(int i, long x) {
        updateMin(x, i, i + 1, 0, 0, n);
    }

    void changeMax(int i, long x) {
        updateMax(x, i, i + 1, 0, 0, n);
    }

    void addValue(int i, long x) {
        addValue(x, i, i + 1, 0, 0, n);
    }

    void setValue(int i, long x) {
        updateValue(x, i, i + 1, 0, 0, n);
    }

    long get(int i) {
        return getSum(i, i + 1, 0, 0, n);
    }

    void changeMin(int l, int r, long x) {
        updateMin(x, l, r, 0, 0, n);
    }

    void changeMax(int l, int r, long x) {
        updateMax(x, l, r, 0, 0, n);
    }

    void addValue(int l, int r, long x) {
        addValue(x, l, r, 0, 0, n);
    }

    void setValue(int l, int r, long x) {
        updateValue(x, l, r, 0, 0, n);
    }

    long getMin(int l, int r) {
        return getMin(l, r, 0, 0, n);
    }

    long getMax(int l, int r) {
        return getMax(l, r, 0, 0, n);
    }

    long getSum(int l, int r) {
        return getSum(l, r, 0, 0, n);
    }

    long[] getAll() {
        for (int i = 0; i < n - 1; i++) {
            lazyPropagate(i);
        }
        return Arrays.copyOfRange(sum, n - 1, n - 1 + m);
    }

    private void updateNodeMin(int k, long x) {
        sum[k] += (x - min[k]) * minCount[k];
        if (min[k] == max[k]) {
            min[k] = max[k] = x;
        } else if (min[k] == secondMax[k]) {
            min[k] = secondMax[k] = x;
        } else {
            min[k] = x;
        }
        if (lazy[k] != Main.inf && lazy[k] < x) {
            lazy[k] = x;
        }
    }

    private void updateNodeMax(int k, long x) {
        sum[k] += (x - max[k]) * maxCount[k];
        if (max[k] == min[k]) {
            max[k] = min[k] = x;
        } else if (max[k] == secondMin[k]) {
            max[k] = secondMin[k] = x;
        } else {
            max[k] = x;
        }
        if (lazy[k] != Main.inf && x < lazy[k]) {
            lazy[k] = x;
        }
    }

    private void lazyPropagate(int k) {
        if (k < n - 1) {
            if (lazy[k] != Main.inf) {
                updateAll(k * 2 + 1, lazy[k]);
                updateAll(k * 2 + 2, lazy[k]);
                lazy[k] = Main.inf;
            } else {
                if (lazyAdd[k] != 0) {
                    addAll(k * 2 + 1, lazyAdd[k]);
                    addAll(k * 2 + 2, lazyAdd[k]);
                    lazyAdd[k] = 0;
                }
                if (max[k] < max[k * 2 + 1]) {
                    updateNodeMax(k * 2 + 1, max[k]);
                }
                if (min[k * 2 + 1] < min[k]) {
                    updateNodeMin(k * 2 + 1, min[k]);
                }
                if (max[k] < max[k * 2 + 2]) {
                    updateNodeMax(k * 2 + 2, max[k]);
                }
                if (min[k * 2 + 2] < min[k]) {
                    updateNodeMin(k * 2 + 2, min[k]);
                }
            }
        }
    }

    private void update(int k) {
        sum[k] = sum[k * 2 + 1] + sum[k * 2 + 2];
        if (max[k * 2 + 1] < max[k * 2 + 2]) {
            max[k] = max[k * 2 + 2];
            maxCount[k] = maxCount[k * 2 + 2];
            secondMax[k] = Math.max(max[k * 2 + 1], secondMax[k * 2 + 2]);
        } else if (max[k * 2 + 2] < max[k * 2 + 1]) {
            max[k] = max[k * 2 + 1];
            maxCount[k] = maxCount[k * 2 + 1];
            secondMax[k] = Math.max(secondMax[k * 2 + 1], max[k * 2 + 2]);
        } else {
            max[k] = max[k * 2 + 1];
            maxCount[k] = maxCount[k * 2 + 1] + maxCount[k * 2 + 2];
            secondMax[k] = Math.max(secondMax[k * 2 + 1], secondMax[k * 2 + 2]);
        }
        if (min[k * 2 + 1] < min[k * 2 + 2]) {
            min[k] = min[k * 2 + 1];
            minCount[k] = minCount[k * 2 + 1];
            secondMin[k] = Math.min(secondMax[k * 2 + 1], min[k * 2 + 2]);
        } else if (min[k * 2 + 2] < min[k * 2 + 1]) {
            min[k] = min[k * 2 + 2];
            minCount[k] = minCount[k * 2 + 2];
            secondMax[k] = Math.min(min[k * 2 + 1], secondMin[k * 2 + 2]);
        } else {
            min[k] = min[k * 2 + 1];
            minCount[k] = minCount[k * 2 + 1] + minCount[k * 2 + 2];
            secondMin[k] = Math.min(secondMin[k * 2 + 1], secondMin[k * 2 + 2]);
        }
    }

    private void updateMin(long x, int a, int b, int k, int l, int r) {
        if (l < b && a < r && x < max[k]) {
            if (a <= l && r <= b && secondMax[k] < x) {
                updateNodeMax(k, x);
            } else {
                lazyPropagate(k);
                updateMin(x, a, b, k * 2 + 1, l, (l + r) / 2);
                updateMin(x, a, b, k * 2 + 2, (l + r) / 2, r);
                update(k);
            }
        }
    }

    private void updateMax(long x, int a, int b, int k, int l, int r) {
        if (l < b && a < r && min[k] < x) {
            if (a <= l && r <= b && x < secondMin[k]) {
                updateNodeMin(k, x);
            } else {
                lazyPropagate(k);
                updateMax(x, a, b, k * 2 + 1, l, (l + r) / 2);
                updateMax(x, a, b, k * 2 + 2, (l + r) / 2, r);
                update(k);
            }
        }
    }

    private void addAll(int k, long x) {
        max[k] += x;
        if (secondMax[k] != -Main.inf) {
            secondMax[k] += x;
        }
        min[k] += x;
        if (secondMin[k] != Main.inf) {
            secondMin[k] += x;
        }
        sum[k] += length[k] * x;
        if (lazy[k] != Main.inf) {
            lazy[k] += x;
        } else {
            lazyAdd[k] += x;
        }
    }

    private void updateAll(int k, long x) {
        max[k] = x;
        secondMax[k] = -Main.inf;
        min[k] = x;
        secondMin[k] = Main.inf;
        maxCount[k] = minCount[k] = length[k];
        sum[k] = x * length[k];
        lazy[k] = x;
        lazyAdd[k] = 0;
    }

    private void addValue(long x, int a, int b, int k, int l, int r) {
        if (l < b && a < r) {
            if (a <= l && r <= b) {
                addAll(k, x);
            } else {
                lazyPropagate(k);
                addValue(x, a, b, k * 2 + 1, l, (l + r) / 2);
                addValue(x, a, b, k * 2 + 2, (l + r) / 2, r);
                update(k);
            }
        }
    }

    private void updateValue(long x, int a, int b, int k, int l, int r) {
        if (l < b && a < r) {
            if (a <= l && r <= b) {
                updateAll(k, x);
            } else {
                lazyPropagate(k);
                updateValue(x, a, b, k * 2 + 1, l, (l + r) / 2);
                updateValue(x, a, b, k * 2 + 2, (l + r) / 2, r);
                update(k);
            }
        }
    }

    private long getMin(int a, int b, int k, int l, int r) {
        if (b <= l || r <= a) {
            return Main.inf;
        }
        if (a <= l && r <= b) {
            return min[k];
        }
        lazyPropagate(k);
        long lv = getMin(a, b, k * 2 + 1, l, (l + r) / 2);
        long rv = getMin(a, b, k * 2 + 2, (l + r) / 2, r);
        return Math.min(lv, rv);
    }

    private long getMax(int a, int b, int k, int l, int r) {
        if (b <= l || r <= a) {
            return -Main.inf;
        }
        if (a <= l && r <= b) {
            return max[k];
        }
        lazyPropagate(k);
        long lv = getMax(a, b, k * 2 + 1, l, (l + r) / 2);
        long rv = getMax(a, b, k * 2 + 2, (l + r) / 2, r);
        return Math.max(lv, rv);
    }

    private long getSum(int a, int b, int k, int l, int r) {
        if (b <= l || r <= a) {
            return 0;
        }
        if (a <= l && r <= b) {
            return sum[k];
        }
        lazyPropagate(k);
        long lv = getSum(a, b, k * 2 + 1, l, (l + r) / 2);
        long rv = getSum(a, b, k * 2 + 2, (l + r) / 2, r);
        return lv + rv;
    }

    @Override
    public String toString() {
        return Arrays.toString(getAll());
    }
}

class Section {
    int left;
    int right;

    Section(int left, int right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Section)) {
            return false;
        }
        Section that = (Section)o;
        return Objects.equals(left, that.left) && Objects.equals(right, that.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(left, right);
    }

    @Override
    public String toString() {
        return String.format("[%s, %s)", left, right);
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

    char[][] nextCharArray(int n, int m) {
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
