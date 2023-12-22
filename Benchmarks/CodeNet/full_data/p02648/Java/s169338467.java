import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
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
            DKnapsackQueriesOnATree solver = new DKnapsackQueriesOnATree();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class DKnapsackQueriesOnATree {
        Node[] head = new Node[20];
        Node[] tail = new Node[20];
        int threshold = 9;
        int maxL = (int) 1e5;
        int[] dp = new int[maxL + 1];

        public void solve(int testNumber, FastInput in, FastOutput out) {
            int n = in.readInt();

            Node[] nodes = new Node[n + 1];
            for (int i = 1; i <= n; i++) {
                nodes[i] = new Node();
                Node p = nodes[i / 2];
                if (p != null) {
                    p.adj.add(nodes[i]);
                }
                nodes[i].v = in.readInt();
                nodes[i].w = in.readInt();
            }
            int q = in.readInt();
            Query[] qs = new Query[q];
            for (int i = 0; i < q; i++) {
                Node node = nodes[in.readInt()];
                qs[i] = new Query();
                qs[i].l = in.readInt();
                node.bind.add(qs[i]);
            }

            dfs(nodes[1], 0);
            for (Query query : qs) {
                out.println(query.ans);
            }

        }

        private void dfsForSet(int i, int limit, int v, int w) {
            if (w > maxL) {
                return;
            }
            if (i > limit) {
                dp[w] = Math.max(dp[w], v);
                return;
            }
            dfsForSet(i + 1, limit, v, w);
            dfsForSet(i + 1, limit, v + head[i].v, w + head[i].w);
        }

        private void dfsForSolve(Node[] nodes, int i, int limit, int v, int w) {
            if (w > maxL) {
                return;
            }
            if (i > limit) {
                for (Query q : nodes[limit].bind) {
                    if (q.l < w) {
                        continue;
                    }
                    q.ans = Math.max(q.ans, v + dp[q.l - w]);
                }
                return;
            }
            dfsForSolve(nodes, i + 1, limit, v, w);
            dfsForSolve(nodes, i + 1, limit, v + nodes[i].v, w + nodes[i].w);
        }

        public void dfsLow(Node root, int depth) {
            tail[depth] = root;

            if (!root.bind.isEmpty()) {
                dfsForSolve(tail, 0, depth, 0, 0);
            }

            for (Node node : root.adj) {
                dfsLow(node, depth + 1);
            }
        }

        public void dfs(Node root, int depth) {
            head[depth] = root;
            dfsForSolve(head, 0, depth, 0, 0);

            if (depth + 1 == threshold) {
                dfsForSet(0, depth, 0, 0);
                for (int i = 1; i <= maxL; i++) {
                    dp[i] = Math.max(dp[i], dp[i - 1]);
                }
                for (Node node : root.adj) {
                    dfsLow(node, 0);
                }
                Arrays.fill(dp, 0);
            } else {
                for (Node node : root.adj) {
                    dfs(node, depth + 1);
                }
            }
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

        public FastOutput append(long c) {
            cache.append(c);
            return this;
        }

        public FastOutput println(long c) {
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
        int w;
        int v;
        List<Query> bind = new ArrayList<>();

    }

    static class Query {
        int l;
        long ans;

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
}

