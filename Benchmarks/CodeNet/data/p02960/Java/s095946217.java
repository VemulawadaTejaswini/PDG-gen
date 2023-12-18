import java.io.*;
import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {

    private static final int MOD = 1000000007;
    private static final int DIV = 13;

    public static void main(String[] args) {
        SimpleScanner scanner = new SimpleScanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        char[] s = scanner.next().toCharArray();
        int n = s.length;
        long[][] f = new long[2][DIV];
        f[0][0] = 1;
        int cur = 0;
        for (int i = 0; i < n; ++i) {
            cur ^= 1;
            Arrays.fill(f[cur], 0);
            if (s[i] == '?') {
                for (int digit = 0; digit <= 9; ++digit) {
                    for (int j = 0; j < DIV; ++j) {
                        f[cur][(j * 10 + digit) % DIV] = (f[cur][(j * 10 + digit) % DIV] + f[cur ^ 1][j]) % MOD;
                    }
                }
            } else {
                int digit = s[i] - '0';
                for (int j = 0; j < DIV; ++j) {
                    f[cur][(j * 10 + digit) % DIV] = f[cur ^ 1][j];
                }
            }
        }
        writer.println(f[cur][5]);
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