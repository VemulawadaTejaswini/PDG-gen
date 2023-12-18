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
        int[][] f;
        int[][] g;
        int[][] grid;
        int[][][] prefix;
        int c1;
        int c2;
        int h;
        int w;
        int range = 'z' - 'a' + 1;

        public void solve(int testNumber, FastInput in, FastOutput out) {
            h = in.readInt();
            w = in.readInt();
            grid = new int[h][w];
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    grid[i][j] = in.readChar() - 'a';
                }
            }

            prefix = new int[h][w][range];
            for (int j = 0; j < w; j++) {
                prefix[0][j][grid[0][j]]++;
                for (int i = 1; i < h; i++) {
                    System.arraycopy(prefix[i - 1][j], 0, prefix[i][j], 0, range);
                    prefix[i][j][grid[i][j]]++;
                }
            }


            f = new int[h][h];
            g = new int[h][h];
            long ans = 0;
            for (int i = 1; i < w; i++) {
                c1 = i - 1;
                c2 = i;

                for (int[] f0 : f) {
                    Arrays.fill(f0, -1);
                }
                for (int[] g0 : g) {
                    Arrays.fill(g0, -1);
                }

                ans += f(h - 1, h - 1);
            }

            out.println(ans);
        }

        public int g(int i, int j) {
            if (i < 0 || j < 0) {
                return 0;
            }

            if (g[i][j] == -1) {
                g[i][j] = g(i - 1, j - 1);
                if (grid[i][c1] == grid[j][c2]) {
                    g[i][j]++;
                }
            }
            return g[i][j];
        }

        public int f(int i, int j) {
            if (i < 0 || j < 0) {
                return 0;
            }

            if (f[i][j] == -1) {
                f[i][j] = Math.min(f(i - 1, j), f(i, j - 1)) + g(i, j);
            }
            return f[i][j];
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

        public char readChar() {
            skipBlank();
            char c = (char) next;
            next = read();
            return c;
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

        public FastOutput println(long c) {
            cache.append(c).append('\n');
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
}

