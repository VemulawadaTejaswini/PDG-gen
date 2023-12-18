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
            TaskF solver = new TaskF();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class TaskF {
        public void solve(int testNumber, FastInput in, FastOutput out) {
            int n = in.readInt();
            int m = in.readInt();
            Node[] nodes = new Node[n + 1];
            for (int i = 1; i <= n; i++) {
                nodes[i] = new Node();
                nodes[i].id = i;
            }
            for (int i = 1; i <= m; i++) {
                Node s = nodes[in.readInt()];
                Node t = nodes[in.readInt()];
                s.next.add(t);
            }
            nodes[n].escape = true;
            findExp(nodes[1]);
            for (int i = 1; i <= n; i++) {
                nodes[i].mx = null;
                for (Node node : nodes[i].next) {
                    if (nodes[i].mx == null || nodes[i].mx.exp < node.exp) {
                        nodes[i].mx = node;
                    }
                }
            }

            double minE = nodes[1].exp;
            for (int i = 1; i <= n; i++) {
                if (nodes[i].mx == null) {
                    continue;
                }
                nodes[i].next.remove(nodes[i].mx);
                for (int j = 1; j <= n; j++) {
                    nodes[j].visited = false;
                }
                findExp(nodes[1]);
                minE = Math.min(minE, nodes[1].exp);
                nodes[i].next.add(nodes[i].mx);
            }

            out.printf("%.15f", minE);
        }

        public void findExp(Node root) {
            if (root.visited) {
                return;
            }
            root.visited = true;
            if (root.escape) {
                root.exp = 0;
                return;
            }
            if (root.next.isEmpty()) {
                root.exp = 1e50;
                return;
            }
            root.exp = 0;
            for (Node node : root.next) {
                findExp(node);
                root.exp += (node.exp + 1) / root.next.size();
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

    static class FastOutput implements AutoCloseable, Closeable {
        private StringBuilder cache = new StringBuilder(10 << 20);
        private final Writer os;

        public FastOutput(Writer os) {
            this.os = os;
        }

        public FastOutput(OutputStream os) {
            this(new OutputStreamWriter(os));
        }

        public FastOutput printf(String format, Object... args) {
            cache.append(String.format(format, args));
            return this;
        }

        public FastOutput flush() {
            try {
                os.append(cache);
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
        List<Node> next = new ArrayList<>();
        Node mx;
        int id;
        boolean escape;
        double exp;
        boolean visited;

    }
}

