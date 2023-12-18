import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.io.IOException;
import java.util.Deque;
import java.io.UncheckedIOException;
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
            ENegativeDoubling solver = new ENegativeDoubling();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class ENegativeDoubling {
        public void solve(int testNumber, FastInput in, FastOutput out) {
            int n = in.readInt();
            long[] A = new long[n];
            in.populate(A);

            long[] tail = dp(A);
            SequenceUtils.reverse(A);
            long[] head = dp(A);

            long ans = (long) 1e18;
            for (int i = 0; i <= n; i++) {
                long req = 0;
                req += i == 0 ? 0 : head[i - 1] * 2 + i;
                req += i == n ? 0 : tail[i] * 2;
                ans = Math.min(ans, req);
            }

            out.println(ans);
        }

        public long[] dp(long[] A) {
            Deque<Block> dq = new ArrayDeque<>(A.length);
            long[] ans = new long[A.length];
            int n = A.length;
            ans[A.length - 1] = 0;
            dq.addFirst(new Block(A[n - 1], A[n - 1], 1));
            for (int i = A.length - 2; i >= 0; i--) {
                ans[i] = ans[i + 1];
                while (dq.peekFirst().head < A[i]) {
                    Block first = dq.removeFirst();
                    first.inc();
                    ans[i] += first.size;
                    if (!dq.isEmpty() && first.tail * 4 > dq.peekFirst().head) {
                        first = Block.merge(first, dq.removeFirst());
                    }
                    dq.addFirst(first);
                }
                Block added = new Block(A[i], A[i], 1);
                if (A[i] * 4 > dq.peekFirst().head) {
                    added = Block.merge(added, dq.removeFirst());
                }
                dq.addFirst(added);
            }
            return ans;
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

        public void populate(long[] data) {
            for (int i = 0; i < data.length; i++) {
                data[i] = readLong();
            }
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

    static class Block {
        long head;
        long tail;
        int size;

        public Block(long head, long tail, int size) {
            this.head = head;
            this.tail = tail;
            this.size = size;
        }

        public void inc() {
            head *= 4;
            tail *= 4;
        }

        public static Block merge(Block a, Block b) {
            Block ans = new Block(a.head, b.tail, a.size + b.size);
            return ans;
        }

    }

    static class SequenceUtils {
        public static void swap(long[] data, int i, int j) {
            long tmp = data[i];
            data[i] = data[j];
            data[j] = tmp;
        }

        public static void reverse(long[] data) {
            reverse(data, 0, data.length - 1);
        }

        public static void reverse(long[] data, int l, int r) {
            while (l < r) {
                swap(data, l, r);
                l++;
                r--;
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
}

