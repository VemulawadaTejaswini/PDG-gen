import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;
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
            TaskF solver = new TaskF();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class TaskF {
        public void solve(int testNumber, FastInput in, FastOutput out) {
            int n = in.readInt();
            int[] xor = new int[n];
            for (int i = 1; i < n; i++) {
                int x = in.readInt();
                int y = in.readInt();
                int a = in.readInt();
                xor[x] ^= a;
                xor[y] ^= a;
            }

            int[] cnts = new int[16];
            for (int i = 0; i < n; i++) {
                cnts[xor[i]]++;
            }

            int cc = 0;
            cc += cnts[0];
            cnts[0] = 0;
            for (int i = 1; i < 16; i++) {
                cc += cnts[i] / 2;
                cnts[i] %= 2;
            }

            BitOperator bo = new BitOperator();
            SubsetGenerator sg = new SubsetGenerator();
            int[] dp = new int[1 << 16];

            int mask = 0;
            for (int i = 0; i < 16; i++) {
                if (cnts[i] == 1) {
                    mask = bo.setBit(mask, i, true);
                }
            }

            for (int i = 1; i < dp.length; i++) {
                if (!bo.subset(i, mask)) {
                    dp[i] = 0;
                    continue;
                }

                int x = 0;
                for (int j = 0; j < 16; j++) {
                    if (bo.bitAt(i, j) == 1) {
                        x ^= j;
                    }
                }
                if (x != 0) {
                    continue;
                }
                dp[i] = 1;
                sg.setSet(i);
                while (sg.hasNext()) {
                    int next = sg.next();
                    if (next == 0 || next == i) {
                        continue;
                    }
                    dp[i] = Math.max(dp[i], dp[next] + dp[i - next]);
                }
            }

            cc += dp[mask];
            int edge = n - cc;
            out.println(edge);
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

    static class SubsetGenerator {
        private int[] meanings = new int[33];
        private int[] bits = new int[33];
        private int remain;
        private int next;

        public void setSet(int set) {
            int bitCount = 0;
            while (set != 0) {
                meanings[bitCount] = set & -set;
                bits[bitCount] = 0;
                set -= meanings[bitCount];
                bitCount++;
            }
            remain = 1 << bitCount;
            next = 0;
        }

        public boolean hasNext() {
            return remain > 0;
        }

        private void consume() {
            remain = remain - 1;
            int i;
            for (i = 0; bits[i] == 1; i++) {
                bits[i] = 0;
                next -= meanings[i];
            }
            bits[i] = 1;
            next += meanings[i];
        }

        public int next() {
            int returned = next;
            consume();
            return returned;
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

    static class BitOperator {
        public int bitAt(int x, int i) {
            return (x >> i) & 1;
        }

        public int setBit(int x, int i, boolean v) {
            if (v) {
                x |= 1 << i;
            } else {
                x &= ~(1 << i);
            }
            return x;
        }

        public boolean subset(long x, long y) {
            return intersect(x, y) == x;
        }

        public long intersect(long x, long y) {
            return x & y;
        }

    }
}

