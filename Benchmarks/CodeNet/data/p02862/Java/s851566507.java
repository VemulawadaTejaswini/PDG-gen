import java.io.*;
import java.nio.CharBuffer;
import java.util.NoSuchElementException;

public class Main {

    private static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        SimpleScanner scanner = new SimpleScanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (2 * x - y < 0 || (2 * x - y) % 3 != 0 || 2 * y - x < 0 || (2 * y - x) % 3 != 0) {
            writer.println(0);
        } else {
            int a = (2 * x - y) / 3;
            int b = (2 * y - x) / 3;
            if (a > b) {
                int t = a;
                a = b;
                b = t;
            }
            long[] inv = new long[a + 2];
            inv[1] = 1;
            for (int i = 2; i <= a; ++i)
                inv[i] = (MOD - MOD / i * inv[MOD % i] % MOD) % MOD;
            long ans = 1;
            for (int i = 1; i <= a; ++i) {
                ans = ans * (i + b) % MOD * inv[i] % MOD;
            }
            writer.println(ans);
        }
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