import java.io.*;
import java.nio.CharBuffer;
import java.util.NoSuchElementException;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        SimpleScanner scanner = new SimpleScanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] x = new int[n];
        x[0] = scanner.nextInt();
        int inc = 0;
        TreeSet<Integer> recent = new TreeSet<>();
        recent.add(x[0]);
        for (int i = 1; i < m; ++i) {
            x[i] = scanner.nextInt();
            ++inc;
            if (x[i] < x[i - 1])
                inc = 0;
            recent.add(x[i]);
        }
        int ans = 1;
        boolean original = inc == m - 1;
        for (int i = m; i < n; ++i) {
            x[i] = scanner.nextInt();
            ++inc;
            if (x[i] < x[i - 1])
                inc = 0;
            boolean duplicate = x[i - m] == recent.first();
            recent.remove(x[i - m]);
            duplicate = duplicate && x[i] > recent.last();
            recent.add(x[i]);
            if (!duplicate && !(inc >= m - 1 && original))
                ++ans;
            original = original || inc >= m - 1;
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