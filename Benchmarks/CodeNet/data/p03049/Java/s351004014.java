import java.io.*;
import java.nio.CharBuffer;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        SimpleScanner scanner = new SimpleScanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        int n = scanner.nextInt();
        int ans = 0, endA = 0, startB = 0, both = 0;
        for (int i = 0; i < n; ++i) {
            char[] s = scanner.next().toCharArray();
            for (int j = 0; j < s.length - 1; ++j) {
                if (s[j] == 'A' && s[j + 1] == 'B') {
                    ++ans;
                }
            }
            if ((s[0] == 'B') && (s[s.length - 1] == 'A'))
                ++both;
            else if (s[0] == 'B')
                ++startB;
            else if (s[s.length - 1] == 'A')
                ++endA;
        }
        if (both > 0) {
            ans += both - 1;
            if (startB != 0 || endA != 0) {
                ans += Math.min(startB, endA) + 1;
            }
        } else
            ans += Math.min(startB, endA);
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