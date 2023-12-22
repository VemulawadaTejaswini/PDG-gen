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
    static final long inf = 0x1fffffffffffffffL;
    static final int iinf = 0x3fffffff;
    static final double eps = 1e-9;
    static long mod = 1000000007;

    void solve(boolean naive) {
        int n = in.nextInt() - 2;
        int q = in.nextInt();
        SegmentTree treeY = new SegmentTree(n);
        SegmentTree treeX = new SegmentTree(n);
        treeY.set(0, n, n);
        treeX.set(0, n, n);
        long ans = (long)n * n;
        int xmax = n + 1;
        int ymax = n + 1;
        for (int i = 0; i < q; i++) {
            int t = in.nextInt();
            int x = in.nextInt() - 2;
            if (t == 1) {
                int len = (int)treeY.get(x);
                ans -= len;
                if (xmax > x) {
                    treeX.set(0, len, x);
                    xmax = x;
                }
            } else {
                int len = (int)treeX.get(x);
                ans -= len;
                if (ymax > x) {
                    treeY.set(0, len, x);
                    ymax = x;
                }
            }
        }
        out.println(ans);
    }

    public static void main(String[] args) {
        new Main().solve(args.length == 1 && args[0].equals("naive"));
        out.flush();
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

    void add(int i, long x) {
        add(x, i, i + 1, 0, 0, n);
    }

    void set(int i, long x) {
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

    void add(int l, int r, long x) {
        add(x, l, r, 0, 0, n);
    }

    void set(int l, int r, long x) {
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

    private void add(long x, int a, int b, int k, int l, int r) {
        if (l < b && a < r) {
            if (a <= l && r <= b) {
                addAll(k, x);
            } else {
                lazyPropagate(k);
                add(x, a, b, k * 2 + 1, l, (l + r) / 2);
                add(x, a, b, k * 2 + 2, (l + r) / 2, r);
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
