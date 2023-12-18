import java.io.*;
import java.nio.CharBuffer;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        SimpleScanner scanner = new SimpleScanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        if (k == 1) {
            writer.println(1);
            writer.close();
            return;
        }
        int[] f = new int[k];
        for (int i = k - 1; i > 0; --i) {
            if (i * 2 >= k)
                f[i] = 1;
            else
                f[i] = f[i * 2] + 1;
        }
        long b = 1 << f[1];
        for (int i = k - 1; i > 0; --i) {
            f[i] = f[1] - f[i];
        }
        long a = 0;
        for (int i = 1; i <= n; ++i) {
            if (i < k) {
                a += 1 << f[i];
            } else {
                a += b;
            }
        }
        writer.println((double) a / (b * n));
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