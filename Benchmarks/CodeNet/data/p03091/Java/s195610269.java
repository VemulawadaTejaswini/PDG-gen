import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.util.Deque;
import java.util.ArrayList;
import java.io.UncheckedIOException;
import java.util.List;
import java.io.Closeable;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
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
            CThreeCircuits solver = new CThreeCircuits();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class CThreeCircuits {
        Deque<Node> trace = new ArrayDeque<>();

        public void solve(int testNumber, FastInput in, FastOutput out) {
            int n = in.readInt();
            int m = in.readInt();
            int[] deg = new int[n];
            Node[] nodes = new Node[n];
            for (int i = 0; i < n; i++) {
                nodes[i] = new Node();
            }
            for (int i = 0; i < m; i++) {
                int a = in.readInt() - 1;
                int b = in.readInt() - 1;
                deg[a]++;
                deg[b]++;
                Edge e = new Edge();
                e.a = nodes[a];
                e.b = nodes[b];
                e.a.adj.add(e);
                e.b.adj.add(e);
            }

            String no = "No";
            String yes = "Yes";
            for (int i = 0; i < n; i++) {
                if (deg[i] % 2 == 1) {
                    out.println("No");
                    return;
                }
            }


            List<Node> xy = new ArrayList<>(2);
            for (int i = 0; i < n; i++) {
                if (deg[i] >= 6) {
                    out.println(yes);
                    return;
                }
                if (deg[i] == 4) {
                    xy.add(nodes[i]);
                }
            }

            if (xy.size() >= 3) {
                out.println(yes);
                return;
            }
            if (xy.size() <= 1) {
                out.println(no);
                return;
            }

            dfs(nodes[0]);
            List<Node> list = new ArrayList<>(trace);
            SequenceUtils.reverse(list);

            List<Node> compressed = new ArrayList<>();
            for (Node node : list) {
                if (xy.contains(node)) {
                    compressed.add(node);
                }
            }

            if (compressed.get(0) == compressed.get(1) || compressed.get(1) == compressed.get(2)) {
                out.println(yes);
            } else {
                out.println(no);
            }
        }

        public void dfs(Node root) {
            while (!root.adj.isEmpty()) {
                Edge tail = root.adj.remove(root.adj.size() - 1);
                if (tail.handled) {
                    continue;
                }
                tail.handled = true;
                Node node = tail.other(root);
                dfs(node);
            }
            trace.addLast(root);
        }

    }

    static class SequenceUtils {
        public static <T> void swap(List<T> data, int i, int j) {
            T tmp = data.get(i);
            data.set(i, data.get(j));
            data.set(j, tmp);
        }

        public static <T> void reverse(List<T> data, int l, int r) {
            while (l < r) {
                swap(data, l, r);
                l++;
                r--;
            }
        }

        public static <T> void reverse(List<T> data) {
            reverse(data, 0, data.size() - 1);
        }

    }

    static class Node {
        List<Edge> adj = new ArrayList<>();

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

        public FastOutput append(String c) {
            cache.append(c);
            return this;
        }

        public FastOutput println(String c) {
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

    static class Edge {
        Node a;
        Node b;
        boolean handled;

        Node other(Node x) {
            return a == x ? b : a;
        }

    }
}

