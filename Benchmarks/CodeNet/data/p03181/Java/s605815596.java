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
            TaskV solver = new TaskV();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class TaskV {
        Modular mod;

        public void solve(int testNumber, FastInput in, FastOutput out) {
            int n = in.readInt();
            int m = in.readInt();
            mod = new Modular(m);
            Node[] nodes = new Node[n + 1];
            for (int i = 1; i <= n; i++) {
                nodes[i] = new Node();
            }
            for (int i = 1; i < n; i++) {
                Node a = nodes[in.readInt()];
                Node b = nodes[in.readInt()];
                a.next.add(b);
                b.next.add(a);
            }
            dfs(nodes[1], null);
            answer(nodes[1], null);
            for (int i = 1; i <= n; i++) {
                out.println(nodes[i].ans);
            }
        }

        public void dfs(Node root, Node p) {
            root.next.remove(p);
            for (Node node : root.next) {
                dfs(node, root);
            }
            root.dp[0] = 1;
            root.dp[1] = 1;
            for (Node node : root.next) {
                root.dp[1] = mod.mul(root.dp[1], mod.plus(node.dp[0], node.dp[1]));
            }
            for (Node node : root.next) {
                root.dp[2] = mod.plus(root.dp[2], mod.plus(node.dp[1], node.dp[2]));
            }
        }

        public void answer(Node root, Node p) {
            int dp1 = 1;
            int dp2 = 0;
            if (p != null) {
                dp1 = mod.plus(p.dp[0], p.dp[1]);
                dp2 = mod.plus(p.dp[1], p.dp[2]);
            }
            root.ans = mod.mul(root.dp[1], dp1);
            int originDp2 = mod.plus(root.dp[2], dp2);

            int[] pre = new int[root.next.size()];
            int[] post = new int[root.next.size()];
            for (int i = 0; i < root.next.size(); i++) {
                Node node = root.next.get(i);
                pre[i] = mod.plus(node.dp[0], node.dp[1]);
                if (i > 0) {
                    pre[i] = mod.mul(pre[i], pre[i - 1]);
                }
            }
            for (int i = root.next.size() - 1; i >= 0; i--) {
                Node node = root.next.get(i);
                post[i] = mod.plus(node.dp[0], node.dp[1]);
                if (i + 1 < root.next.size()) {
                    post[i] = mod.mul(post[i], post[i + 1]);
                }
            }
            for (int i = 0; i < root.next.size(); i++) {
                Node node = root.next.get(i);
                root.dp[1] = dp1;
                if (i > 0) {
                    root.dp[1] = mod.mul(root.dp[1], pre[i - 1]);
                }
                if (i + 1 < root.next.size()) {
                    root.dp[1] = mod.mul(root.dp[1], post[i + 1]);
                }
                root.dp[2] = mod.subtract(originDp2, mod.plus(node.dp[1], node.dp[2]));
                answer(node, root);
            }
        }

    }

    static class Node {
        List<Node> next = new ArrayList<>();
        int[] dp = new int[3];
        int ans;

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

    static class Modular {
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

        public int plus(int x, int y) {
            return valueOf(x + y);
        }

        public int subtract(int x, int y) {
            return valueOf(x - y);
        }

        public String toString() {
            return "mod " + m;
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
}

