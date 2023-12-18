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
        AtD solver = new AtD(in, out);
        solver.solve(1);
        out.close();
    }

    static class AtD {
        private final FastScanner in;
        private final PrintWriter out;
        private int maxHeight;
        private int[] parent;

        public AtD(FastScanner in, PrintWriter out) {
            this.in = in;
            this.out = out;
        }

        public void solve(int testNumber) throws InterruptedException {
            int n = in.nextInt();
            maxHeight = in.nextInt();
            parent = new int[n];

            for (int i = 0; i < n; i++) {
                parent[i] = in.nextInt() - 1;
            }

            out.println(0);
        }

    }

    static class FastScanner {
        private final InputStream in;
        private byte[] buffer = new byte[4096];
        private int pos = 0;
        private int size;

        public FastScanner(InputStream inputStream) throws IOException {
            in = inputStream;
            size = 0;
        }

        public int nextInt() {
            int c = skipWhitespace();

            int ans = 0;

            while (c > ' ') {
                ans *= 10;
                ans += c - '0';
                c = nextChar();
            }

            return ans;
        }

        private int skipWhitespace() {
            while (true) {
                int c = nextChar();
                if (c > ' ' || c == -1) {
                    return c;
                }
            }
        }

        private int nextChar() {
            if (pos >= size) {
                try {
                    size = in.read(buffer);
                } catch (IOException e) {
                    throw new RuntimeException("IO error");
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

