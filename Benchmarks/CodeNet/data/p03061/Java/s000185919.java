import java.io.*;
import java.nio.CharBuffer;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        SimpleScanner scanner = new SimpleScanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        int n = scanner.nextInt();
        int[] x = new int[n];
        int[] gcdL = new int[n];
        int[] gcdR = new int[n];
        for (int i = 0; i < n; ++i)
            x[i] = scanner.nextInt();
        gcdL[0] = x[0];
        for (int i = 1; i < n; ++i)
            gcdL[i] = gcd(x[i], gcdL[i - 1]);
        gcdR[n - 1] = x[n - 1];
        for (int i = n - 2; i >= 0; --i)
            gcdR[i] = gcd(x[i], gcdR[i + 1]);
        int ans = gcdR[1];
        ans = Integer.max(ans, gcdL[n - 1]);
        for (int i = 1; i < n - 1; ++i)
            ans = Integer.max(ans, gcd(gcdL[i - 1], gcdR[i + 1]));
        writer.println(ans);
        writer.close();
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
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