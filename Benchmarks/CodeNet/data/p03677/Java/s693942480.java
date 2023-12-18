import static java.lang.Math.max;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        FastScanner fsc = new FastScanner();
        int n = fsc.nextInt();
        int m = fsc.nextInt();
        LazySegmentTree t = new LazySegmentTree(m, Monoid.ADD, Monoid.ADD, Long::sum, (laz, l) -> laz * l);
        System.gc();
        long sum = 0;
        int pre = fsc.nextInt() - 1;
        for (int i = 1; i < n; i++) {
            int now = fsc.nextInt() - 1;
            int to = now;
            int fr = pre;
            if (fr < to) {
                t.applyForSegment(fr + 2, to + 1, 1);
                t.applyForSegment(to + 1, to + 2, -(to - fr - 1));
            } else {
                t.applyForSegment(fr + 2, m, 1);
                t.applyForSegment(0, 1, m - fr - 1);
                t.applyForSegment(1, to + 1, 1);
                t.applyForSegment(to + 1, to + 2, -(to + m - fr - 1));
            }

            if (now > pre) {
                sum += now - pre;
            } else {
                sum += now + m - pre;
            }
            pre = now;
        }
        fsc.close();
        long max = 0;
        System.gc();
        for (int x = 0; x < m; x++) {
            max = max(max, t.query(0, x + 1));
        }
        System.gc();
        System.out.println(sum - max);
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
        if (hasNextByte())
            return buffer[ptr++];
        else
            return -1;
    }

    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr]))
            ptr++;
        return hasNextByte();
    }

    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext())
            throw new NoSuchElementException();
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
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
            throw new NumberFormatException();
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

    public void close() {
        try {
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class LazySegmentTree {
    private long[] tree;
    private long[] lazy;
    private final long e;
    private final long lazyIdElm;
    private final BinaryOperator<Long> operator;
    private final BinaryOperator<Long> lazyOperator;
    private final BinaryOperator<Long> appFunc;
    private final BiFunction<Long, Integer, Long> mergeLazy;
    private final int size;
    private final int leafs;
    private final int height;
    private final int baseOfLeaf;

    public LazySegmentTree(int m, Monoid<Long> monoid, Monoid<Long> lazyMonoid, BinaryOperator<Long> appFunc,
            BiFunction<Long, Integer, Long> mergeLazy) {
        this.operator = monoid.operator;
        this.e = monoid.e;
        this.lazyOperator = lazyMonoid.operator;
        this.lazyIdElm = lazyMonoid.e;
        this.appFunc = appFunc;
        this.mergeLazy = mergeLazy;
        this.height = minimumExponent(m);
        this.leafs = 1 << this.height;
        this.baseOfLeaf = this.leafs - 1;
        this.size = 2 * this.leafs - 1;
        this.lazy = new long[this.size];
        Arrays.fill(this.lazy, this.lazyIdElm);
        this.tree = new long[this.size];
        for (int i = this.size - 1; i >= 0; i--) {
            if (i >= this.baseOfLeaf) {
                this.tree[i] = this.e;
            } else {
                this.tree[i] = this.operator.apply(this.tree[2 * i + 1], this.tree[2 * i + 2]);
            }
        }
    }

    public void applyForSegment(int l, int r, long v) {
        applyForSegment(l, r, 0, 0, leafs, v);
    }

    private void applyForSegment(int ql, int qr, int k, int tl, int tr, long v) {
        evaluate(k, tl, tr);
        if (qr > tl && tr > ql) {
            if (ql <= tl && tr <= qr) {
                lazy[k] = lazyOperator.apply(lazy[k], v);
                evaluate(k, tl, tr);
            } else {
                int left = 2 * k + 1;
                int right = 2 * k + 2;
                applyForSegment(ql, qr, left, tl, (tl + tr) >> 1, v);
                applyForSegment(ql, qr, right, (tl + tr) >> 1, tr, v);
                tree[k] = operator.apply(tree[left], tree[right]);
            }
        }
    }

    public long query(int l, int r) {
        return query(l, r, 0, 0, leafs);
    }

    private long query(int ql, int qr, int k, int tl, int tr) {
        evaluate(k, tl, tr);
        if (tr <= ql || qr <= tl) {
            return e;
        } else if (ql <= tl && tr <= qr) {
            return tree[k];
        } else {
            long left = query(ql, qr, 2 * k + 1, tl, (tl + tr) >> 1);
            long right = query(ql, qr, 2 * k + 2, (tl + tr) >> 1, tr);
            return operator.apply(left, right);
        }
    }

    private void evaluate(int k, int l, int r) {
        if (lazy[k] != lazyIdElm) {
            if (k < baseOfLeaf) {
                lazy[2 * k + 1] = lazyOperator.apply(lazy[2 * k + 1], lazy[k]);
                lazy[2 * k + 2] = lazyOperator.apply(lazy[2 * k + 2], lazy[k]);
            }
            tree[k] = appFunc.apply(tree[k], mergeLazy.apply(lazy[k], r - l));
            lazy[k] = lazyIdElm;
        }
    }

    private static int minimumExponent(int n) {
        return 31 - Integer.numberOfLeadingZeros(n) + ((-n & n) == n ? 0 : 1);
    }
}

class Monoid<T> {
    public static final Monoid<Long> ADD = new Monoid<>(0l, (u, v) -> u + v);
    public T e;
    public BinaryOperator<T> operator;

    public Monoid(T e, BinaryOperator<T> operator) {
        this.e = e;
        this.operator = operator;
    }
}