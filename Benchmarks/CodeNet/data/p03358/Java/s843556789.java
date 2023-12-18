import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.io.IOException;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.io.UncheckedIOException;
import java.util.List;
import java.util.stream.Stream;
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
            FMonochromeCat solver = new FMonochromeCat();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class FMonochromeCat {
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
                a.next.add(b);
                b.next.add(a);
            }

            for (int i = 0; i < n; i++) {
                nodes[i].color = in.readChar() == 'B' ? 0 : 1;
            }

            dfsForSize(nodes[0], null);
            dfsForRemove(nodes[0], null, nodes[0].size);
            Node root = null;
            for (Node node : nodes) {
                if (!node.removed) {
                    root = node;
                    break;
                }
            }

            if (root == null) {
                out.println(0);
                return;
            }

            dfsForRemoveChildren(root, null);

            dfsForDp(root, null);
            int ans = root.dp[0];
            out.println(ans);
        }

        public void dfsForDp(Node root, Node p) {
            if (root.next.isEmpty()) {
                root.dp[0] = root.color;
                root.dp[1] = (1 ^ root.color) + 1;
                root.dp[2] = root.color + 1;
                root.dp[3] = (1 ^ root.color) + 2;
                return;
            }

            for (Node node : root.next) {
                dfsForDp(node, root);
                root.dp[3] += node.dp[3];
            }

            root.next.sort((a, b) -> Integer.compare(a.dp[2] - a.dp[3], b.dp[2] - b.dp[3]));
            root.dp[2] = root.dp[3];
            root.dp[2] = Math.min(root.dp[2], root.dp[3] + root.next.get(0).dp[2] - root.next.get(0).dp[3]);

            root.next.sort((a, b) -> Integer.compare(a.dp[1] - a.dp[3], b.dp[1] - b.dp[3]));
            root.dp[1] = root.dp[3];
            root.dp[1] = Math.min(root.dp[1], root.dp[3] + root.next.get(0).dp[1] - root.next.get(0).dp[3]);

            int[][] dp = new int[2][2];
            for (Node node : root.next) {
                dp[1][1] = Math.min(dp[1][1] + node.dp[3], Math.min(dp[1][0] + node.dp[2], dp[0][1] + node.dp[1]));
                dp[0][1] = Math.min(dp[0][1] + node.dp[3], dp[0][0] + node.dp[2]);
                dp[1][0] = Math.min(dp[1][0] + node.dp[3], dp[0][0] + node.dp[1]);
                dp[0][0] += node.dp[3];
            }

            int min = (int) 1e9;
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    min = Math.min(dp[i][j], min);
                }
            }
            root.dp[0] = min;

            root.dp[0] += ((root.next.size() - 1) & 1) ^ root.color;
            root.dp[1] += ((root.next.size()) & 1) ^ root.color;
            root.dp[2] += ((root.next.size()) & 1) ^ root.color;
            root.dp[3] += ((root.next.size() + 1) & 1) ^ root.color;

            root.dp[1] += 1;
            root.dp[2] += 1;
            root.dp[3] += 2;
        }

        public void dfsForRemoveChildren(Node root, Node p) {
            root.next = root.next.stream().filter(x -> !x.removed && x != p).collect(Collectors.toList());
            for (Node node : root.next) {
                dfsForRemoveChildren(node, root);
            }
        }

        public void dfsForSize(Node root, Node p) {
            root.size = root.color;
            for (Node node : root.next) {
                if (node == p) {
                    continue;
                }
                dfsForSize(node, root);
                root.size += node.size;
            }
        }

        public void dfsForRemove(Node root, Node p, int total) {
            int max = total - root.size;
            for (Node node : root.next) {
                if (node == p) {
                    continue;
                }
                max = Math.max(max, node.size);
                dfsForRemove(node, root, total);
            }

            if (max == total) {
                root.removed = true;
            }

        }

    }

    static class FastInput {
        private final InputStream is;
        private byte[] buf = new byte[1 << 20];
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

        public char readChar() {
            skipBlank();
            char c = (char) next;
            next = read();
            return c;
        }

    }

    static class Node {
        List<Node> next = new ArrayList<>();
        int[] dp = new int[4];
        boolean removed;
        int color;
        int size;
        int id;

        public String toString() {
            return "" + (id + 1);
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
}

