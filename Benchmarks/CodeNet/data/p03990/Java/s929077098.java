import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.io.IOException;
import java.util.Comparator;
import java.util.ArrayList;
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
            PrintWriter out = new PrintWriter(outputStream);
            TaskE solver = new TaskE();
            solver.solve(1, in, out);
            out.close();
        }
    }
    static class TaskE {
        int inf = (int) 1e8;

        public void solve(int testNumber, FastInput in, PrintWriter out) {
            int n = in.readInt();

            Node[] nodes = new Node[n + 1];
            for (int i = 1; i <= n; i++) {
                nodes[i] = new Node();
            }

            Node x = nodes[in.readInt()];
            Node y = nodes[in.readInt()];

            List<Node[]> edges = new ArrayList<>(n);
            for (int i = 1; i < n; i++) {
                Node a = nodes[in.readInt()];
                Node b = nodes[in.readInt()];
                a.red.add(b);
                b.red.add(a);
                edges.add(new Node[] {a, b});
            }

            for (int i = 1; i < n; i++) {
                Node a = nodes[in.readInt()];
                Node b = nodes[in.readInt()];
                a.blue.add(b);
                b.blue.add(a);
            }

            dfsForDepth(y, null, 0);
            List<Node> trace = new ArrayList<>(2 * n);
            flat(y, trace);
            SparseTable<Node> st = new SparseTable<>(trace.toArray(), trace.size(), (a, b) -> a.dfn - b.dfn);

            for (Node[] edge : edges) {
                Node lca = st.query(Math.min(edge[0].dfn, edge[1].dfn), Math.max(edge[0].dfn, edge[1].dfn));
                int dist = edge[0].depth + edge[1].depth - lca.depth * 2;
                if (dist >= 3) {
                    edge[0].escape = edge[1].escape = true;
                }
            }

            int escape = escape(x, null, 0);
            if (escape == inf) {
                out.println(-1);
            } else {
                out.println(escape * 2);
            }
        }

        public int escape(Node root, Node fa, int depth) {
            root.red.remove(fa);

            if (root.depth <= depth) {
                return root.depth;
            }
            if (root.escape) {
                return inf;
            }
            int max = root.depth;
            for (Node node : root.red) {
                max = Math.max(max, escape(node, root, depth + 1));
            }
            return max;
        }

        public void dfsForDepth(Node root, Node fa, int depth) {
            root.blue.remove(fa);
            root.depth = depth;
            for (Node node : root.blue) {
                dfsForDepth(node, root, depth + 1);
            }
        }

        public void flat(Node root, List<Node> trace) {
            root.dfn = trace.size();
            trace.add(root);
            for (Node node : root.blue) {
                flat(node, trace);
                trace.add(root);
            }
        }

    }
    static class SparseTable<T> {
        Object[][] st;
        Comparator<T> comparator;
        int[] floorLogTable;

        public SparseTable(Object[] data, int length, Comparator<T> comparator) {
            int m = floorLog2(length);
            st = new Object[m + 1][length];
            this.comparator = comparator;
            for (int i = 0; i < length; i++) {
                st[0][i] = data[i];
            }
            for (int i = 0; i < m; i++) {
                int interval = 1 << i;
                for (int j = 0; j < length; j++) {
                    if (j + interval < length) {
                        st[i + 1][j] = min((T) st[i][j], (T) st[i][j + interval]);
                    } else {
                        st[i + 1][j] = st[i][j];
                    }
                }
            }

            floorLogTable = new int[length + 1];
            int log = 1;
            for (int i = 0; i <= length; i++) {
                if ((1 << log) <= i) {
                    log++;
                }
                floorLogTable[i] = log - 1;
            }
        }

        public static int floorLog2(int x) {
            return 31 - Integer.numberOfLeadingZeros(x);
        }

        private T min(T a, T b) {
            return comparator.compare(a, b) <= 0 ? a : b;
        }

        public T query(int left, int right) {
            int queryLen = right - left + 1;
            int bit = floorLogTable[queryLen];
            // x + 2^bit == right + 1
            // So x should be right + 1 - 2^bit - left=queryLen - 2^bit
            return min((T) st[bit][left], (T) st[bit][right + 1 - (1 << bit)]);
        }

    }
    static class Node {
        List<Node> red = new ArrayList<>(2);
        List<Node> blue = new ArrayList<>(2);
        boolean escape;
        int depth;
        int dfn;

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
}

