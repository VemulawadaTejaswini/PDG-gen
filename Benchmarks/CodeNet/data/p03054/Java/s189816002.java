import java.io.*;
import java.nio.CharBuffer;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        SimpleScanner scanner = new SimpleScanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        int r = scanner.nextInt();
        int c = scanner.nextInt();
        int n = scanner.nextInt();
        int sR = scanner.nextInt();
        int sC = scanner.nextInt();
        char[] s = scanner.next().toCharArray();
        char[] t = scanner.next().toCharArray();
        int nowR, nowC;
        nowR = sR;
        nowC = sC;
        for (int i = 0; i < n; ++i) {
            if (s[i] == 'R')
                ++nowC;
            if (s[i] == 'D')
                ++nowR;
            if (nowR > r || nowC > c) {
                writer.println("NO");
                writer.close();
                return;
            }
            if (t[i] == 'L' && nowC > 1)
                --nowC;
            if (t[i] == 'U' && nowR > 1)
                --nowR;
        }

        nowR = sR;
        nowC = sC;
        for (int i = 0; i < n; ++i) {
            if (s[i] == 'L')
                --nowC;
            if (s[i] == 'U')
                --nowR;
            if (nowR == 0 || nowC == 0) {
                writer.println("NO");
                writer.close();
                return;
            }
            if (t[i] == 'R' && nowC < c)
                ++nowC;
            if (t[i] == 'D' && nowR < r)
                ++nowR;
        }

        writer.println("YES");
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