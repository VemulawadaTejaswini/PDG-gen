import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.io.UncheckedIOException;
import java.util.List;
import java.io.Closeable;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(null, new TaskAdapter(), "", 1 << 29);
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
            EWanderingTKHS solver = new EWanderingTKHS();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class EWanderingTKHS {
        public void solve(int testNumber, FastInput in, FastOutput out) {
            int n = in.readInt();
            Node[] nodes = new Node[n];
            for (int i = 0; i < n; i++) {
                nodes[i] = new Node();
                nodes[i].id = i;
            }
            for (int i = 0; i < n - 1; i++) {
                Node a = nodes[in.readInt() - 1];
                Node b = nodes[in.readInt() - 1];
                a.adj.add(b);
                b.adj.add(a);
            }

            nodes[0].maxToMax = nodes[0];
            nodes[0].max = nodes[0];

            for (Node node : nodes[0].adj) {
                dfs(node, nodes[0], nodes[0], node);
            }
            solve(nodes[0], null, 0);

            for (int i = 1; i < n; i++) {
                out.println(nodes[i].cnt);
            }
        }

        public void dfs(Node root, Node p, Node max, Node second) {
            root.p = p;
            root.max = max;
            if (root.id > max.id) {
                root.max = root;
            }
            if (root == second) {
                root.maxToMax = root;
            } else {
                root.maxToMax = root.p.maxToMax;
                if (root.id >= root.maxToMax.id) {
                    root.maxToMax = root;
                }
            }
            if (max.id <= root.id) {
                root.add++;
            } else {
                if (max.p != null && root.maxToMax.id <= max.p.max.id) {
                    max.add++;
                } else {
                    second.add++;
                }
            }

            for (Node node : root.adj) {
                if (node == p) {
                    continue;
                }
                if (max.id > root.id) {
                    dfs(node, root, max, second);
                } else {
                    dfs(node, root, root, node);
                }
            }
        }

        public void solve(Node root, Node p, int cnt) {
            cnt += root.add;
            root.cnt = cnt;
            for (Node node : root.adj) {
                if (node == p) {
                    continue;
                }
                solve(node, root, cnt);
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

    }

    static class FastOutput implements AutoCloseable, Closeable, Appendable {
        private StringBuilder cache = new StringBuilder(10 << 20);
        private final Writer os;

        public FastOutput append(CharSequence csq) {
            cache.append(csq);
            return this;
        }

        public FastOutput append(CharSequence csq, int start, int end) {
            cache.append(csq, start, end);
            return this;
        }

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

        public FastOutput println(int c) {
            return append(c).println();
        }

        public FastOutput println() {
            cache.append(System.lineSeparator());
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

    static class Node {
        List<Node> adj = new ArrayList<>();
        int id;
        int cnt;
        int add;
        Node p;
        Node maxToMax;
        Node max;

        public String toString() {
            return String.format("%d=%d", id, add);
        }

    }
}

