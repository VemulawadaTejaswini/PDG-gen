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
            TaskA solver = new TaskA();
            solver.solve(1, in, out);
            out.close();
        }
    }
    static class TaskA {
        boolean valid = true;

        public void solve(int testNumber, FastInput in, FastOutput out) {
            int n = in.readInt();
            Node[] nodes = new Node[n + 1];
            for (int i = 1; i <= n; i++) {
                nodes[i] = new Node();
                nodes[i].id = i;
            }

            for (int i = 2; i <= n; i++) {
                nodes[in.readInt()].next.add(nodes[i]);
            }

            for (int i = 1; i <= n; i++) {
                nodes[i].exp = in.readInt();
            }

            dfs(nodes[1]);
            out.println(valid ? "POSSIBLE" : "IMPOSSIBLE");
        }

        public void dfs(Node root) {
            int total = 0;
            for (Node node : root.next) {
                dfs(node);
                total += node.a + node.b;
            }

            int m = root.next.size();
            boolean[][] possible = new boolean[m + 1][root.exp + 1];
            possible[0][0] = true;
            for (int j = 1; j <= m; j++) {
                Node node = root.next.get(j - 1);
                for (int i = root.exp; i >= 0; i--) {
                    if (i - node.a >= 0) {
                        possible[j][i] = possible[j][i] || possible[j - 1][i - node.a];
                    }
                    if (i - node.b >= 0) {
                        possible[j][i] = possible[j][i] || possible[j - 1][i - node.b];
                    }
                }
            }

            int max = -1;
            for (int i = root.exp; i >= 0; i--) {
                if (possible[m][i]) {
                    max = i;
                    break;
                }
            }

            if (max == -1) {
                valid = false;
                return;
            }

            root.a = root.exp;
            root.b = total - max;
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
    static class FastOutput implements AutoCloseable, Closeable {
        private StringBuilder cache = new StringBuilder(10 << 20);
        private final Writer os;

        public FastOutput(Writer os) {
            this.os = os;
        }

        public FastOutput(OutputStream os) {
            this(new OutputStreamWriter(os));
        }

        public FastOutput println(String c) {
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

    }
    static class Node {
        int id;
        int a;
        int b;
        List<Node> next = new ArrayList<>();
        int exp;

    }
}

