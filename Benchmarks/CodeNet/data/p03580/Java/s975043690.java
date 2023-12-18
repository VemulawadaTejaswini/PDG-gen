import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.io.IOException;
import java.io.UncheckedIOException;
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
            TaskD solver = new TaskD();
            solver.solve(1, in, out);
            out.close();
        }
    }
    static class TaskD {
        int inf = (int) 1e9;

        public void solve(int testNumber, FastInput in, FastOutput out) {
            int n = in.readInt();
            char[] s = new char[n];
            in.readString(s, 0);

            IntList list = new IntList(n);
            for (int i = 0; i < n; i++) {
                int j = i;
                while (j + 1 < n && s[j + 1] == s[i]) {
                    j++;
                }
                list.add(j - i + 1);
                i = j;
            }
            if (s[n - 1] == '0') {
                list.pop();
            }

            int ans = 0;
            IntList cnts = new IntList(n);
            while (!list.isEmpty()) {
                cnts.clear();
                while (!list.isEmpty()) {
                    cnts.add(list.pop());
                    if (!list.isEmpty() && list.pop() == 1) {
                        continue;
                    }
                    break;
                }
                int m = cnts.size();
                // 0 for nothing, 1 for in, 2 for leave
                int[][] dp = new int[m + 1][3];
                dp[0][0] = 0;
                dp[0][1] = dp[0][2] = -inf;
                for (int i = 1; i <= m; i++) {
                    int cnt = cnts.get(i - 1);

                    for (int left = 0; left < 3; left++) {
                        for (int right = 0; right < 3; right++) {
                            if (left == 2 && right == 1) {
                                continue;
                            }
                            if (left == 1 && right == 2 && cnt < 2) {
                                continue;
                            }
                            if (left == 0) {
                                dp[i][right] = Math.max(dp[i][right], dp[i - 1][left] + (right == 1 ? cnt : 0));
                            }
                            if (left == 1) {
                                dp[i][right] = Math.max(dp[i][right], dp[i - 1][left] + (right == 1 ? cnt - 1 : 0));
                            }
                            if (left == 2) {
                                dp[i][right] = Math.max(dp[i][right], dp[i - 1][left] + (right == 2 ? cnt - 1 : cnt));
                            }
                        }
                    }
                }

                ans += dp[m][0];
            }

            out.println(ans);
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
    static class IntList {
        private int size;
        private int cap;
        private int[] data;
        private static final int[] EMPTY = new int[0];

        public IntList(int cap) {
            this.cap = cap;
            if (cap == 0) {
                data = EMPTY;
            } else {
                data = new int[cap];
            }
        }

        public IntList(IntList list) {
            this.size = list.size;
            this.cap = list.cap;
            this.data = Arrays.copyOf(list.data, size);
        }

        public IntList() {
            this(0);
        }

        private void ensureSpace(int need) {
            int req = size + need;
            if (req > cap) {
                while (cap < req) {
                    cap = Math.max(cap + 10, 2 * cap);
                }
                data = Arrays.copyOf(data, cap);
            }
        }

        private void checkRange(int i) {
            if (i < 0 || i >= size) {
                throw new ArrayIndexOutOfBoundsException();
            }
        }

        public int get(int i) {
            checkRange(i);
            return data[i];
        }

        public void add(int x) {
            ensureSpace(1);
            data[size++] = x;
        }

        public int pop() {
            return data[--size];
        }

        public int size() {
            return size;
        }

        public int[] toArray() {
            return Arrays.copyOf(data, size);
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public void clear() {
            size = 0;
        }

        public String toString() {
            return Arrays.toString(toArray());
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

        public int readString(char[] data, int offset) {
            skipBlank();

            int originalOffset = offset;
            while (next > 32) {
                data[offset++] = (char) next;
                next = read();
            }

            return offset - originalOffset;
        }

    }
}

