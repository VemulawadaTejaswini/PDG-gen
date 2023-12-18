import java.io.*;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        SimpleScanner scanner = new SimpleScanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        int n = scanner.nextInt();
        int[] a = new int[n + 1];
        int[] b = new int[n + 1];
        for (int i = 1; i <= n; ++i)
            a[i] = scanner.nextInt();
        ArrayList<Integer> ans = new ArrayList<>(n);
        for (int i = n; i >= 1; --i) {
            if (b[i] % 2 != a[i]) {
                for (int j = 1; j * j <= i; ++j) {
                    if (i % j == 0) {
                        b[j] ^= 1;
                        if (j * j != i)
                            b[i / j] ^= 1;
                    }
                }
                ans.add(i);
            }
        }
        writer.println(ans.size());
        for (int i = ans.size() - 1; i >= 0; --i)
            writer.print(ans.get(i) + " ");
        writer.println();

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