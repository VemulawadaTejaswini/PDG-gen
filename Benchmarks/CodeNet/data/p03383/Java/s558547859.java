import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
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
            PrintWriter out = new PrintWriter(outputStream);
            TaskE solver = new TaskE();
            solver.solve(1, in, out);
            out.close();
        }
    }
    static class TaskE {
        int h;
        int w;
        char[][] mat;
        boolean valid = false;
        boolean[] matched;

        public void solve(int testNumber, FastInput in, PrintWriter out) {
            h = in.readInt();
            w = in.readInt();

            matched = new boolean[w];
            mat = new char[h][w];
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    mat[i][j] = in.readChar();
                }
            }

            prepareGroup(0, h - 1, 0);

            out.println(valid ? "YES" : "NO");
        }

        public boolean match(int i, int j) {
            for (int k = 0; k < h; k++) {
                if (mat[k][i] != mat[h - 1 - k][j]) {
                    return false;
                }
            }
            return true;
        }

        public void check() {
            Arrays.fill(matched, false);
            int single = 0;
            for (int i = 0; i < w; i++) {
                if (matched[i]) {
                    continue;
                }
                for (int j = i + 1; j < w; j++) {
                    if (match(i, j)) {
                        matched[i] = matched[j] = true;
                        break;
                    }
                }

                if (!matched[i]) {
                    if (single < w % 2 && match(i, i)) {
                        matched[i] = true;
                        single++;
                    }
                }

                if (!matched[i]) {
                    return;
                }
            }

            valid = true;
        }

        public void prepareGroup(int l, int r, int single) {
            if (valid) {
                return;
            }

            if (l >= r) {
                check();
                return;
            }

            if (single < h % 2) {
                SequenceUtils.swap(mat, l, h / 2);
                prepareGroup(l, r, single + 1);
                SequenceUtils.swap(mat, l, h / 2);
            }

            for (int i = l + 1; i <= r; i++) {
                SequenceUtils.swap(mat, i, r);
                prepareGroup(l + 1, r - 1, single);
                SequenceUtils.swap(mat, i, r);
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

        public char readChar() {
            skipBlank();
            char c = (char) next;
            next = read();
            return c;
        }

    }
    static class SequenceUtils {
        public static <T> void swap(T[] data, int i, int j) {
            T tmp = data[i];
            data[i] = data[j];
            data[j] = tmp;
        }

    }
}

