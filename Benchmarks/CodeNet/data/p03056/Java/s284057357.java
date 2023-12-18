import java.io.*;
import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        SimpleScanner scanner = new SimpleScanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        int r = scanner.nextInt();
        int c = scanner.nextInt();
        char[][] grid = new char[r][];
        for (int i = 0; i < r; ++i)
            grid[i] = scanner.next().toCharArray();
        int diffR = 1;
        for (int i = 0; i < r - 1; ++i) {
            for (int j = 0; j < c; ++j) {
                if (grid[i][j] != grid[i + 1][j]) {
                    ++diffR;
                    break;
                }
            }
        }
        int diffC = 1;
        for (int j = 0; j < c - 1; ++j) {
            for (int i = 0; i < r; ++i) {
                if (grid[i][j] != grid[i][j + 1]) {
                    ++diffC;
                    break;
                }
            }
        }
        writer.println(ceilLog(diffR) + ceilLog(diffC));

        writer.close();
    }

    private static int ceilLog(int x) {
        int k = 0;
        while ((1 << k) < x)
            ++k;
        return k;
    }


    private static int[] bfs(int n, List<List<Integer>> links, int k) {
        int[] queue = new int[n];
        int p, q;
        p = q = 0;
        queue[q++] = k;
        int[] d = new int[n];
        Arrays.fill(d, -1);
        d[k] = 0;
        while (p < q) {
            int u = queue[p];
            for (int v : links.get(u)) {
                if (d[v] < 0) {
                    d[v] = d[u] + 1;
                    queue[q++] = v;
                }
            }
            ++p;
        }
        return new int[]{queue[q - 1], d[queue[q - 1]]};
    }

    private static class SimpleScanner {

        private static final int BUFFER_SIZE = 10240;

        private Readable in;
        private CharBuffer buffer;
        private boolean eof;

        SimpleScanner(InputStream in) {
            this.in = new BufferedReader(new InputStreamReader(in));
            buffer = CharBuffer.allocate(BUFFER_SIZE);
            buffer.limit(0);
            eof = false;
        }


        private char read() {
            if (!buffer.hasRemaining()) {
                buffer.clear();
                int n;
                try {
                    n = in.read(buffer);
                } catch (IOException e) {
                    n = -1;
                }
                if (n <= 0) {
                    eof = true;
                    return '\0';
                }
                buffer.flip();
            }
            return buffer.get();
        }

        void checkEof() {
            if (eof)
                throw new NoSuchElementException();
        }

        char nextChar() {
            checkEof();
            char b = read();
            checkEof();
            return b;
        }

        String next() {
            char b;
            do {
                b = read();
                checkEof();
            } while (Character.isWhitespace(b));
            StringBuilder sb = new StringBuilder();
            do {
                sb.append(b);
                b = read();
            } while (!eof && !Character.isWhitespace(b));
            return sb.toString();
        }

        int nextInt() {
            return Integer.valueOf(next());
        }

        long nextLong() {
            return Long.valueOf(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}