import java.io.*;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        SimpleScanner scanner = new SimpleScanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<int[]> x = new ArrayList<>(n);
        for (int i = 0; i < n; ++i) {
            int c = scanner.nextInt();
            int v = scanner.nextInt();
            x.add(new int[]{c, v});
        }
        x.sort(Comparator.comparingInt(o -> o[0]));
        int[][] f = new int[2][m + 1];
        Arrays.fill(f[0], -1);
        f[0][0] = 0;
        int cur = 0;
        int ans = 0;
        for (int i = 0; i < n; ++i) {
            cur ^= 1;
            for (int j = 0; j < m; ++j)
                if (f[cur ^ 1][j] >= 0)
                    ans = Math.max(ans, f[cur ^ 1][j] + x.get(i)[1]);
            System.arraycopy(f[cur ^ 1], 0, f[cur], 0, m);
            for (int j = x.get(i)[0]; j <= m; ++j) {
                if (f[cur ^ 1][j - x.get(i)[0]] >= 0)
                    f[cur][j] = Math.max(f[cur][j], f[cur ^ 1][j - x.get(i)[0]] + x.get(i)[1]);
                ans = Math.max(ans, f[cur][j]);
            }
        }
        writer.println(ans);
        writer.close();
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

        private void checkEof() {
            if (eof)
                throw new NoSuchElementException();
        }

        private char nextChar() {
            checkEof();
            char b = read();
            checkEof();
            return b;
        }

        private String next() {
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

        private int nextInt() {
            return Integer.parseInt(next());
        }

        private long nextLong() {
            return Long.parseLong(next());
        }

        private double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}