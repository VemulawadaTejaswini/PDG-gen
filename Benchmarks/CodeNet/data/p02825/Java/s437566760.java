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
            TaskC solver = new TaskC();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class TaskC {
        char[][] temp4 = new char[][]{
                {'o', 'o', 'q', 'r'},
                {'p', 'p', 'q', 'r'},
                {'s', 't', 'u', 'u'},
                {'s', 't', 'v', 'v'},
        };
        char[][] temp31 = new char[][]{
                {'e', 'e', '.'},
                {'.', '.', 'f'},
                {'.', '.', 'f'},
        };
        char[][] temp32 = new char[][]{
                {'g', 'g', 'h'},
                {'j', '.', 'h'},
                {'j', 'i', 'i'},
        };

        public void solve(int testNumber, FastInput in, FastOutput out) {
            int n = in.readInt();
            char[][] mat = new char[n][n];
            SequenceUtils.deepFill(mat, '.');
            if (n <= 2) {
                out.println(-1);
                return;
            }
            char[][] ans = draw(n);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    out.append(ans[i][j]);
                }
                out.println();
            }
        }

        public char[][] duplicate(char[][] template, int n) {
            int m = template.length;
            char[][] ans = new char[n][n];
            for (int i = 0; i < n; i += m) {
                for (int j = 0; j < n; j += m) {
                    draw(ans, template, i, j);
                }
            }
            return ans;
        }

        public void draw(char[][] data, char[][] temp, int i, int j) {
            int m = temp.length;
            for (int a = 0; a < m; a++) {
                for (int b = 0; b < m; b++) {
                    data[a + i][b + j] = temp[a][b];
                }
            }
        }

        public char[][] draw(int n) {
            if (n % 4 == 0) {
                return duplicate(temp4, n);
            }
            if (n % 2 == 0) {
                int m = n;
                while (m % 2 == 0) {
                    m /= 2;
                }
                return duplicate(draw(m), n);
            }
            if (n % 3 == 0) {
                return duplicate(temp31, n);
            }
            if (n % 3 == 1) {
                char[][] ans = new char[n][n];
                SequenceUtils.deepFill(ans, '.');
                char last = 'k';
                for (int i = 0; i + 1 < n; i += 2) {
                    ans[i][n - 1] = ans[i + 1][n - 1] = ans[n - 1][i] = ans[n - 1][i + 1] = last;
                    last = last == 'k' ? 'l' : 'k';
                }
                draw(ans, drawSpecial(n - 1, (n - 1) / 2 - 1), 0, 0);
                return ans;
            }


            char[][] ans = new char[n][n];
            SequenceUtils.deepFill(ans, '.');
            char lastA = 'k';
            char lastB = 'm';
            char lastC = 'a';
            char lastD = 'c';
            for (int i = 0; i + 1 < n; i += 2) {
                ans[0][i] = ans[0][i + 1] = lastC;
                ans[n - 1][i + 1] = ans[n - 1][i + 2] = lastA;
                ans[i + 1][0] = ans[i + 2][0] = lastD;
                ans[i][n - 1] = ans[i + 1][n - 1] = lastB;
                lastA = lastA == 'k' ? 'l' : 'k';
                lastB = lastB == 'm' ? 'n' : 'm';
                lastC = lastC == 'a' ? 'b' : 'a';
                lastD = lastD == 'c' ? 'd' : 'c';
            }
            draw(ans, drawSpecial(n - 2, (n + 1) / 2 - 2), 1, 1);
            return ans;
        }

        public char[][] drawSpecial(int n, int k) {
            char[][] ans = duplicate(temp31, n);
            int m = n / 3;
            k -= m;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < k; j++) {
                    draw(ans, temp32, i * 3, ((i + j) % m) * 3);
                }
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

    static class SequenceUtils {
        public static void deepFill(Object array, char val) {
            if (!array.getClass().isArray()) {
                throw new IllegalArgumentException();
            }
            if (array instanceof char[]) {
                char[] charArray = (char[]) array;
                Arrays.fill(charArray, val);
            } else {
                Object[] objArray = (Object[]) array;
                for (Object obj : objArray) {
                    deepFill(obj, val);
                }
            }
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

        public FastOutput println(int c) {
            cache.append(c).append('\n');
            return this;
        }

        public FastOutput println() {
            cache.append('\n');
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

