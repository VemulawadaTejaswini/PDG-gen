import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.Map;
import java.io.Closeable;
import java.util.Map.Entry;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(null, new TaskAdapter(), "", 1 << 27);
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
            TaskE solver = new TaskE();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class TaskE {
        public void solve(int testNumber, FastInput in, FastOutput out) {
            int n = in.readInt();
            int m = in.readInt();
            long x = in.readLong();
            int[][] edges = new int[m][3];
            for (int i = 0; i < m; i++) {
                edges[i][0] = in.readInt() - 1;
                edges[i][1] = in.readInt() - 1;
                edges[i][2] = in.readInt();
            }

            DynamicMST mst = new DynamicMST(n);
            for (int i = 0; i < m; i++) {
                mst.addEdge(edges[i][0], edges[i][1], edges[i][2]);
            }
            if (mst.getEdgeNum() != n - 1) {
                out.println(0);
                return;
            }
            long diff = x - mst.getTotalWeight();
            if (diff < 0) {
                out.println(0);
                return;
            }

            Map<Long, Integer> cntMap = new HashMap<>(m);
            for (int[] e : edges) {
                long d = e[2] - mst.maxWeightBetween(e[0], e[1]);
                cntMap.put(d, cntMap.getOrDefault(d, 0) + 1);
            }

            NumberTheory.Modular mod = new NumberTheory.Modular(1e9 + 7);
            NumberTheory.Power pow = new NumberTheory.Power(mod);
            if (diff == 0) {
                int num = cntMap.get(diff);
                int ans = mod.subtract(pow.pow(2, m), pow.pow(2, m - num + 1));
                out.println(ans);
                return;
            }
            if (!cntMap.containsKey(diff)) {
                out.println(0);
                return;
            }

            int lessCnt = 0;
            int equalCnt = 0;
            int greaterCnt = 0;
            for (Map.Entry<Long, Integer> entry : cntMap.entrySet()) {
                if (entry.getKey() < diff) {
                    lessCnt += entry.getValue();
                }
                if (entry.getKey() == diff) {
                    equalCnt += entry.getValue();
                }
                if (entry.getKey() > diff) {
                    greaterCnt += entry.getValue();
                }
            }

            int ans = mod.subtract(pow.pow(2, equalCnt + 1), 2);
            ans = mod.mul(ans, pow.pow(2, greaterCnt));
            out.println(ans);
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
                    bufLen = -1;
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

        public long readLong() {
            int sign = 1;

            skipBlank();
            if (next == '+' || next == '-') {
                sign = next == '+' ? 1 : -1;
                next = read();
            }

            long val = 0;
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

    static class NumberTheory {
        public static class Modular {
            int m;

            public Modular(int m) {
                this.m = m;
            }

            public Modular(long m) {
                this.m = (int) m;
                if (this.m != m) {
                    throw new IllegalArgumentException();
                }
            }

            public Modular(double m) {
                this.m = (int) m;
                if (this.m != m) {
                    throw new IllegalArgumentException();
                }
            }

            public int valueOf(int x) {
                x %= m;
                if (x < 0) {
                    x += m;
                }
                return x;
            }

            public int valueOf(long x) {
                x %= m;
                if (x < 0) {
                    x += m;
                }
                return (int) x;
            }

            public int mul(int x, int y) {
                return valueOf((long) x * y);
            }

            public int subtract(int x, int y) {
                return valueOf(x - y);
            }

            public String toString() {
                return "mod " + m;
            }

        }

        public static class Power {
            final NumberTheory.Modular modular;

            public Power(NumberTheory.Modular modular) {
                this.modular = modular;
            }

            public int pow(int x, long n) {
                if (n == 0) {
                    return modular.valueOf(1);
                }
                long r = pow(x, n >> 1);
                r = modular.valueOf(r * r);
                if ((n & 1) == 1) {
                    r = modular.valueOf(r * x);
                }
                return (int) r;
            }

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

        public FastOutput println(int c) {
            cache.append(c).append('\n');
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

        public String toString() {
            return cache.toString();
        }

    }

    static class DynamicMST {
        private DynamicMST.LCTNode[] nodes;
        private long totalWeight;
        private int edgeNum;

        public DynamicMST(int n) {
            nodes = new DynamicMST.LCTNode[n];
            for (int i = 0; i < n; i++) {
                nodes[i] = new DynamicMST.LCTNode();
                nodes[i].id = i;
                nodes[i].weight = 0;
                nodes[i].pushUp();
            }
            for (int i = 1; i < n; i++) {
                DynamicMST.LCTNode node = new DynamicMST.LCTNode();
                node.weight = Long.MAX_VALUE;
                node.a = nodes[i - 1];
                node.b = nodes[i];
                node.pushUp();
                DynamicMST.LCTNode.join(node.a, node);
                DynamicMST.LCTNode.join(node.b, node);
            }
        }

        public long getTotalWeight() {
            return totalWeight;
        }

        public int getEdgeNum() {
            return edgeNum;
        }

        public void addEdge(int aId, int bId, long weight) {
            DynamicMST.LCTNode a = nodes[aId];
            DynamicMST.LCTNode b = nodes[bId];
            DynamicMST.LCTNode.findRoute(a, b);
            DynamicMST.LCTNode.splay(a);
            if (a.largest.weight <= weight) {
                return;
            }
            DynamicMST.LCTNode largest = a.largest;
            DynamicMST.LCTNode.splay(largest);
            DynamicMST.LCTNode.cut(largest.a, largest);
            DynamicMST.LCTNode.cut(largest.b, largest);
            if (largest.weight < Long.MAX_VALUE) {
                edgeNum--;
                totalWeight -= largest.weight;
            }

            DynamicMST.LCTNode node = new DynamicMST.LCTNode();
            node.weight = weight;
            node.a = a;
            node.b = b;
            node.pushUp();
            DynamicMST.LCTNode.join(node.a, node);
            DynamicMST.LCTNode.join(node.b, node);
            edgeNum++;
            totalWeight += node.weight;
        }

        public long maxWeightBetween(int aId, int bId) {
            DynamicMST.LCTNode a = nodes[aId];
            DynamicMST.LCTNode b = nodes[bId];
            DynamicMST.LCTNode.findRoute(a, b);
            DynamicMST.LCTNode.splay(b);
            return b.largest.weight;
        }

        private static class LCTNode {
            public static final DynamicMST.LCTNode NIL = new DynamicMST.LCTNode();
            DynamicMST.LCTNode left = NIL;
            DynamicMST.LCTNode right = NIL;
            DynamicMST.LCTNode father = NIL;
            DynamicMST.LCTNode treeFather = NIL;
            boolean reverse;
            int id;
            DynamicMST.LCTNode a;
            DynamicMST.LCTNode b;
            DynamicMST.LCTNode largest;
            long weight;

            static {
                NIL.left = NIL;
                NIL.right = NIL;
                NIL.father = NIL;
                NIL.treeFather = NIL;
                NIL.weight = 0;
                NIL.largest = NIL;
            }

            public static DynamicMST.LCTNode larger(DynamicMST.LCTNode a, DynamicMST.LCTNode b) {
                return a.weight >= b.weight ? a : b;
            }

            public static void access(DynamicMST.LCTNode x) {
                DynamicMST.LCTNode last = NIL;
                while (x != NIL) {
                    splay(x);
                    x.right.father = NIL;
                    x.right.treeFather = x;
                    x.setRight(last);
                    x.pushUp();

                    last = x;
                    x = x.treeFather;
                }
            }

            public static void makeRoot(DynamicMST.LCTNode x) {
                access(x);
                splay(x);
                x.reverse();
            }

            public static void cut(DynamicMST.LCTNode y, DynamicMST.LCTNode x) {
                makeRoot(y);
                access(x);
                splay(y);
                y.right.treeFather = NIL;
                y.right.father = NIL;
                y.setRight(NIL);
                y.pushUp();
            }

            public static void join(DynamicMST.LCTNode y, DynamicMST.LCTNode x) {
                makeRoot(x);
                x.treeFather = y;
            }

            public static void findRoute(DynamicMST.LCTNode x, DynamicMST.LCTNode y) {
                makeRoot(y);
                access(x);
            }

            public static void splay(DynamicMST.LCTNode x) {
                if (x == NIL) {
                    return;
                }
                DynamicMST.LCTNode y, z;
                while ((y = x.father) != NIL) {
                    if ((z = y.father) == NIL) {
                        y.pushDown();
                        x.pushDown();
                        if (x == y.left) {
                            zig(x);
                        } else {
                            zag(x);
                        }
                    } else {
                        z.pushDown();
                        y.pushDown();
                        x.pushDown();
                        if (x == y.left) {
                            if (y == z.left) {
                                zig(y);
                                zig(x);
                            } else {
                                zig(x);
                                zag(x);
                            }
                        } else {
                            if (y == z.left) {
                                zag(x);
                                zig(x);
                            } else {
                                zag(y);
                                zag(x);
                            }
                        }
                    }
                }

                x.pushDown();
                x.pushUp();
            }

            public static void zig(DynamicMST.LCTNode x) {
                DynamicMST.LCTNode y = x.father;
                DynamicMST.LCTNode z = y.father;
                DynamicMST.LCTNode b = x.right;

                y.setLeft(b);
                x.setRight(y);
                z.changeChild(y, x);

                y.pushUp();
            }

            public static void zag(DynamicMST.LCTNode x) {
                DynamicMST.LCTNode y = x.father;
                DynamicMST.LCTNode z = y.father;
                DynamicMST.LCTNode b = x.left;

                y.setRight(b);
                x.setLeft(y);
                z.changeChild(y, x);

                y.pushUp();
            }

            public String toString() {
                return "" + id;
            }

            public void pushDown() {
                if (reverse) {
                    reverse = false;

                    DynamicMST.LCTNode tmpNode = left;
                    left = right;
                    right = tmpNode;

                    left.reverse();
                    right.reverse();
                }

                left.treeFather = treeFather;
                right.treeFather = treeFather;
            }

            public void reverse() {
                reverse = !reverse;
            }

            public void setLeft(DynamicMST.LCTNode x) {
                left = x;
                x.father = this;
            }

            public void setRight(DynamicMST.LCTNode x) {
                right = x;
                x.father = this;
            }

            public void changeChild(DynamicMST.LCTNode y, DynamicMST.LCTNode x) {
                if (left == y) {
                    setLeft(x);
                } else {
                    setRight(x);
                }
            }

            public void pushUp() {
                largest = larger(this, left.largest);
                largest = larger(largest, right.largest);
            }

        }

    }
}

