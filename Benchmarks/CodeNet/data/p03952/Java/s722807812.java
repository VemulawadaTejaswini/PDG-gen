import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Denis Nedelyaev
 */
public class Main {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskB solver = new TaskB(in, out);
        solver.solve(1);
        out.close();
    }

    static class TaskB {
        private final FastScanner in;
        private final PrintWriter out;

        public TaskB(FastScanner in, PrintWriter out) {
            this.in = in;
            this.out = out;
        }

        public void solve(int testNumber) {
            int n = in.nextInt();
            int x = in.nextInt();
            int m = 2 * n - 1;
            if (x == 1 || x == m) {
                out.println("No");
                return;
            }

            out.println("Yes");

            if (n > 2) {
                int[] ans = new int[m];
                int left;
                int right;
                int mid = m / 2;
                if (x == 2) {
                    left = 1;
                    right = 4;

                    ans[mid - 1] = 3;
                    ans[mid] = 2;
                    ans[mid + 1] = 1;
                    ans[mid + 2] = 4;
                } else {
                    left = x - 2;
                    right = x + 1;

                    ans[mid - 1] = x - 2;
                    ans[mid] = x;
                    ans[mid + 1] = x + 1;
                    ans[mid + 2] = x - 1;
                }

                int y = 1;
                for (int j = 0; j < m; j++) {
                    if (ans[j] == 0) {
                        if (y >= left && y <= right) {
                            y = right + 1;
                        }
                        ans[j] = y++;
                    }
                }

                for (int z : ans) {
                    out.println(z);
                }
            } else {
                out.println(1);
                out.println(2);
                out.println(3);
            }
        }

    }

    static class FastScanner {
        private final static int BUFFER_SIZE = 4096;
        private final InputStream in;
        private byte[] buffer = new byte[BUFFER_SIZE];
        private int pos = 0;
        private int size;

        public FastScanner(InputStream inputStream) throws IOException {
            in = inputStream;
            size = 0;
        }

        public int nextInt() {
            int c = skipWhitespace();

            int sign = -1;
            if (c == '-') {
                sign = 1;
                c = read();
            }

            int ans = 0;

            while (c > ' ') {
                ans *= 10;
                ans -= c - '0';
                c = read();
            }

            return sign * ans;
        }

        private int skipWhitespace() {
            while (true) {
                int c = read();
                if (c > ' ' || c == -1) {
                    return c;
                }
            }
        }

        private int read() {
            if (pos >= size) {
                try {
                    size = in.read(buffer, 0, BUFFER_SIZE);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                if (size <= 0) {
                    return -1;
                }
                pos = 0;
            }
            return buffer[pos++];
        }

    }
}

