import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.TreeSet;
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
            TaskE solver = new TaskE();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class TaskE {
        FastInput in;
        FastOutput out;
        int n;
        int k;
        List<int[]> pair = new ArrayList<>();

        public void solve(int testNumber, FastInput in, FastOutput out) {
            this.in = in;
            this.out = out;

            this.n = in.readInt();
            this.k = in.readInt();

            long time = System.nanoTime();
            long until = time + (long) (1.5 * 1e9);

            boolean hasAns = false;
            for (int i = 0; System.nanoTime() < until; ) {
                hasAns = trySolve();
                if (hasAns) {
                    break;
                }
                hasAns = trySolve2();
                if (hasAns) {
                    break;
                }
                hasAns = trySolve3();
                if (hasAns) {
                    break;
                }
            }

            if (!hasAns) {
                out.println(-1);
                return;
            }

            for (int[] x : pair) {
                out.append(x[0]).append(' ').append(x[1]).append(' ').append(x[2]).append('\n');
            }
        }

        public boolean trySolve() {
            int[] slots = new int[n];
            for (int i = 0; i < n; i++) {
                slots[i] = 2 * n + i - k;
            }
            TreeSet<Integer> set = new TreeSet<>();
            for (int i = 0; i < 2 * n; i++) {
                set.add(i);
            }

            int[] order = new int[2 * n];
            for (int i = 0; i < 2 * n; i++) {
                order[i] = i;
            }

            pair.clear();
            Randomized.randomizedArray(order, 0, 2 * n);
            int whichSlot = n - 1;
            for (int i = 0; i < 2 * n; i++) {
                int x = order[i];
                if (!set.remove(x)) {
                    continue;
                }

                Integer floor = set.floor(slots[whichSlot] - x);
                if (floor == null) {
                    return false;
                }
                set.remove(floor);
                pair.add(new int[]{x + k, floor + k, slots[whichSlot] + 2 * k});
                whichSlot--;
            }

            return true;
        }

        public boolean trySolve2() {
            int[] slots = new int[n];
            for (int i = 0; i < n; i++) {
                slots[i] = 2 * n + i - k;
            }
            TreeSet<Integer> set = new TreeSet<>();
            for (int i = 0; i < 2 * n; i++) {
                set.add(i);
            }

            int[] order = new int[2 * n];
            for (int i = 0; i < 2 * n; i++) {
                order[i] = i;
            }

            pair.clear();
            Randomized.randomizedArray(order, 0, 2 * n);
            int whichSlot = 0;
            for (int i = 0; i < 2 * n; i++) {
                int x = order[i];
                if (!set.remove(x)) {
                    continue;
                }

                Integer floor = set.floor(slots[whichSlot] - x);
                if (floor == null) {
                    return false;
                }
                set.remove(floor);
                pair.add(new int[]{x + k, floor + k, slots[whichSlot] + 2 * k});
                whichSlot++;
            }

            return true;
        }

        public boolean trySolve3() {
            int[] slots = new int[n];
            for (int i = 0; i < n; i++) {
                slots[i] = 2 * n + i - k;
            }
            Randomized.randomizedArray(slots, 0, n);

            TreeSet<Integer> set = new TreeSet<>();
            for (int i = 0; i < 2 * n; i++) {
                set.add(i);
            }

            int[] order = new int[2 * n];
            for (int i = 0; i < 2 * n; i++) {
                order[i] = i;
            }

            pair.clear();
            Randomized.randomizedArray(order, 0, 2 * n);
            int whichSlot = 0;
            for (int i = 0; i < 2 * n; i++) {
                int x = order[i];
                if (!set.remove(x)) {
                    continue;
                }

                Integer floor = set.floor(slots[whichSlot] - x);
                if (floor == null) {
                    return false;
                }
                set.remove(floor);
                pair.add(new int[]{x + k, floor + k, slots[whichSlot] + 2 * k});
                whichSlot++;
            }

            return true;
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

        public FastOutput append(char c) {
            cache.append(c);
            return this;
        }

        public FastOutput append(int c) {
            cache.append(c);
            return this;
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

    static class Randomized {
        static Random random = new Random();

        public static void randomizedArray(int[] data, int from, int to) {
            to--;
            for (int i = from; i <= to; i++) {
                int s = nextInt(i, to);
                int tmp = data[i];
                data[i] = data[s];
                data[s] = tmp;
            }
        }

        public static int nextInt(int l, int r) {
            return random.nextInt(r - l + 1) + l;
        }

    }
}

