import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.function.BiFunction;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.io.Closeable;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.io.InputStream;

/**
 * Built using CHelper plug-in Actual solution is at the top
 * 
 * @author daltao
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(null, new TaskAdapter(), "daltao", 1 << 27);
        thread.start();
        thread.join();
    }

    static class TaskAdapter implements Runnable {
        @Override
        public void run() {
            InputStream inputStream = System.in;
            OutputStream outputStream = System.out;
            FastInput in = new FastInput(inputStream);
            FastOutput out = new FastOutput(outputStream);
            TaskD solver = new TaskD();
            solver.solve(1, in, out);
            out.close();
        }
    }
    static class TaskD {
        Node[] nodes;
        SparseTable<Node>[] rmq;

        public void solve(int testNumber, FastInput in, FastOutput out) {
            int n = in.readInt();

            nodes = new Node[n];
            Node[][] splitNodes = new Node[2][n];
            for (int i = 0; i < n; i++) {
                nodes[i] = new Node();
                nodes[i].val = in.readInt();
                nodes[i].index = i;
                splitNodes[i % 2][i] = nodes[i];
            }

            rmq = new SparseTable[2];
            for (int i = 0; i < 2; i++) {
                rmq[i] = new SparseTable<>(splitNodes[i], n, (a, b) -> {
                    if (a == null) {
                        return b;
                    }
                    if (b == null) {
                        return a;
                    }
                    return a.val < b.val ? a : b;
                });
            }

            LeftSideTree<Node> pq = dfs(0, n - 1);
            while (pq != LeftSideTree.NIL) {
                Node e = pq.peek();
                out.append(e.val).append(' ').append(e.carry.val).append(' ');
                pq = LeftSideTree.pop(pq, Node.sortByVal);
                pq = LeftSideTree.merge(pq, e.pq, Node.sortByVal);
            }
        }

        public LeftSideTree<Node> dfs(int l, int r) {
            if (l > r) {
                return LeftSideTree.NIL;
            }
            Node min = rmq[l % 2].query(l, r);
            min.carry = rmq[1 - l % 2].query(min.index + 1, r);

            min.pq = LeftSideTree.merge(min.pq, dfs(l, min.index - 1), Node.sortByVal);
            min.pq = LeftSideTree.merge(min.pq, dfs(min.index + 1, min.carry.index - 1), Node.sortByVal);
            min.pq = LeftSideTree.merge(min.pq, dfs(min.carry.index + 1, r), Node.sortByVal);

            return new LeftSideTree<>(min);
        }

    }
    static class LeftSideTree<K> {
        public static final LeftSideTree NIL = new LeftSideTree<>(null);
        LeftSideTree<K> left = NIL;
        LeftSideTree<K> right = NIL;
        int dist;
        K key;
        static {
            NIL.left = NIL;
            NIL.right = NIL;
            NIL.dist = -1;
        }

        public LeftSideTree(K key) {
            this.key = key;
        }

        public static <K> LeftSideTree<K> merge(LeftSideTree<K> a, LeftSideTree<K> b, Comparator<K> cmp) {
            if (a == NIL) {
                return b;
            } else if (b == NIL) {
                return a;
            }
            if (cmp.compare(a.key, b.key) > 0) {
                LeftSideTree<K> tmp = a;
                a = b;
                b = tmp;
            }
            a.right = merge(a.right, b, cmp);
            if (a.left.dist < a.right.dist) {
                LeftSideTree<K> tmp = a.left;
                a.left = a.right;
                a.right = tmp;
            }
            a.dist = a.right.dist + 1;
            return a;
        }

        public K peek() {
            return key;
        }

        public static <K> LeftSideTree<K> pop(LeftSideTree<K> root, Comparator<K> cmp) {
            return merge(root.left, root.right, cmp);
        }

        private void toStringDfs(StringBuilder builder) {
            if (this == NIL) {
                return;
            }
            builder.append(key).append(' ');
            left.toStringDfs(builder);
            right.toStringDfs(builder);
        }

        public String toString() {
            StringBuilder builder = new StringBuilder();
            toStringDfs(builder);
            return builder.toString();
        }

    }
    static class FastOutput implements AutoCloseable, Closeable {
        private StringBuilder cache = new StringBuilder(10 << 20);
        private final Writer os;

        public FastOutput(Writer os) {
            this.os = os;
        }

        public FastOutput(OutputStream os) {
            this(new OutputStreamWriter(os));
        }

        public FastOutput append(char c) {
            cache.append(c);
            return this;
        }

        public FastOutput append(int c) {
            cache.append(c);
            return this;
        }

        public FastOutput flush() {
            try {
                os.append(cache);
                os.flush();
                cache.setLength(0);
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
            return this;
        }

        public void close() {
            flush();
            try {
                os.close();
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }

    }
    static class Node {
        Node carry;
        LeftSideTree<Node> pq = LeftSideTree.NIL;
        int val;
        int index;
        static Comparator<Node> sortByVal = (a, b) -> a.val - b.val;

    }
    static class DigitUtils {
        private static final long[] DIGIT_VALUES = new long[19];
        static {
            DIGIT_VALUES[0] = 1;
            for (int i = 1; i < 19; i++) {
                DIGIT_VALUES[i] = DIGIT_VALUES[i - 1] * 10;
            }
        }

        private DigitUtils() {}

        public static class Log2 {
            public int floorLog(int x) {
                return 31 - Integer.numberOfLeadingZeros(x);
            }

        }

        public static class CachedLog2 {
            private int[] cache;
            private DigitUtils.Log2 log2;

            public CachedLog2(int n) {
                cache = new int[n + 1];
                int b = 0;
                for (int i = 0; i <= n; i++) {
                    while ((1 << (b + 1)) <= i) {
                        b++;
                    }
                    cache[i] = b;
                }
            }

            public int floorLog(int x) {
                if (x >= cache.length) {
                    return log2.floorLog(x);
                }
                return cache[x];
            }

        }

    }
    static class FastInput {
        private final InputStream is;
        private byte[] buf = new byte[1 << 13];
        private int bufLen;
        private int bufOffset;
        private int next;

        public FastInput(InputStream is) {
            this.is = is;
        }

        private int read() {
            while (bufLen == bufOffset) {
                bufOffset = 0;
                try {
                    bufLen = is.read(buf);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                if (bufLen == -1) {
                    return -1;
                }
            }
            return buf[bufOffset++];
        }

        public void skipBlank() {
            while (next >= 0 && next <= 32) {
                next = read();
            }
        }

        public int readInt() {
            int sign = 1;

            skipBlank();
            if (next == '+' || next == '-') {
                sign = next == '+' ? 1 : -1;
                next = read();
            }

            int val = 0;
            if (sign == 1) {
                while (next >= '0' && next <= '9') {
                    val = val * 10 + next - '0';
                    next = read();
                }
            } else {
                while (next >= '0' && next <= '9') {
                    val = val * 10 - next + '0';
                    next = read();
                }
            }

            return val;
        }

    }
    static class SparseTable<T> {
        private Object[][] st;
        private BiFunction<T, T, T> merger;
        private DigitUtils.CachedLog2 log2;

        public SparseTable(Object[] data, int length, BiFunction<T, T, T> merger) {
            log2 = new DigitUtils.CachedLog2(length);
            int m = log2.floorLog(length);

            st = new Object[m + 1][length];
            this.merger = merger;
            for (int i = 0; i < length; i++) {
                st[0][i] = data[i];
            }
            for (int i = 0; i < m; i++) {
                int interval = 1 << i;
                for (int j = 0; j < length; j++) {
                    if (j + interval < length) {
                        st[i + 1][j] = merge((T) st[i][j], (T) st[i][j + interval]);
                    } else {
                        st[i + 1][j] = st[i][j];
                    }
                }
            }
        }

        private T merge(T a, T b) {
            return merger.apply(a, b);
        }

        public T query(int left, int right) {
            int queryLen = right - left + 1;
            int bit = log2.floorLog(queryLen);
            // x + 2^bit == right + 1
            // So x should be right + 1 - 2^bit - left=queryLen - 2^bit
            return merge((T) st[bit][left], (T) st[bit][right + 1 - (1 << bit)]);
        }

        public String toString() {
            return Arrays.toString(st[0]);
        }

    }
}

