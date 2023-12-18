import java.io.*;
import java.nio.CharBuffer;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        SimpleScanner scanner = new SimpleScanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        char[] s = scanner.next().toCharArray();
        int n = s.length;
        long k = scanner.nextLong();
        int lead = 0, tail = 0, mid = 0;
        for (int i = 0; i < n; ) {
            int j = i;
            while (j < n && s[j] == s[i])
                ++j;
            int len = j - i;
            if (i == 0)
                lead = len;
            else if (j == n)
                tail = len;
            else
                mid += len / 2;
            i = j;
        }
        if (lead == n) {
            writer.println(n * k / 2);
        } else if (s[0] == s[n - 1]) {
            writer.println((lead + tail) / 2 * (k - 1) + lead / 2 + tail / 2 + mid * k);
        } else {
            writer.println((lead / 2 + tail / 2 + mid) * k);
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