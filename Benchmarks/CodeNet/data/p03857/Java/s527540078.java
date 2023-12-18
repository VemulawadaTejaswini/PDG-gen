import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.Map;
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
            TaskB solver = new TaskB();
            solver.solve(1, in, out);
            out.close();
        }
    }
    static class TaskB {
        public void solve(int testNumber, FastInput in, FastOutput out) {
            int n = in.readInt();
            int k = in.readInt();
            int l = in.readInt();

            Node[] n1 = new Node[n + 1];
            Node[] n2 = new Node[n + 1];
            for (int i = 1; i <= n; i++) {
                n1[i] = new Node();
                n2[i] = new Node();
            }

            for (int i = 0; i < k; i++) {
                Node a = n1[in.readInt()];
                Node b = n1[in.readInt()];
                Node.merge(a, b);
            }

            for (int i = 0; i < l; i++) {
                Node a = n2[in.readInt()];
                Node b = n2[in.readInt()];
                Node.merge(a, b);
            }

            int g1 = 0;
            int g2 = 0;
            for (int i = 1; i <= n; i++) {
                if (n1[i].find() == n1[i]) {
                    n1[i].group = g1++;
                }
                if (n2[i].find() == n2[i]) {
                    n2[i].group = g2++;
                }
            }

            Map<Long, Integer> cntMap = new HashMap<>(n);
            for (int i = 1; i <= n; i++) {
                Long g = DigitUtils.asLong(n1[i].find().group, n2[i].find().group);
                cntMap.put(g, cntMap.getOrDefault(g, 0) + 1);
            }

            for (int i = 1; i <= n; i++) {
                Long g = DigitUtils.asLong(n1[i].find().group, n2[i].find().group);
                int cnt = cntMap.get(g);
                out.append(cnt).append(' ');
            }
        }

    }
    static class FastOutput implements AutoCloseable, Closeable {
        private StringBuilder cache = new StringBuilder(1 << 20);
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
    static class DigitUtils {
        private DigitUtils() {}

        public static long asLong(int high, int low) {
            return (((long) high) << 32) | low;
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
    static class Node {
        int group;
        Node p = this;
        int rank;

        public Node find() {
            return p.p == p ? p : (p = p.find());
        }

        public static void merge(Node a, Node b) {
            a = a.find();
            b = b.find();
            if (a == b) {
                return;
            }
            if (a.rank == b.rank) {
                a.rank++;
            }
            if (a.rank > b.rank) {
                b.p = a;
            } else {
                a.p = b;
            }
        }

    }
}

