import java.io.*;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        SimpleScanner scanner = new SimpleScanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; ++i)
            x[i] = scanner.nextInt();
        int ans = 0;
        for (int takeOps = 1; takeOps <= m; ++takeOps) {
            if (takeOps == n) {
                ArrayList<Integer> takes = new ArrayList<>(takeOps);
                for (int i = 0; i < n; ++i)
                    takes.add(x[i]);
                Collections.sort(takes);
                int sum = 0;
                int remainOps = m - takeOps;
                for (int value : takes) {
                    if (value < 0 && remainOps > 0)
                        --remainOps;
                    else
                        sum += value;
                }
                ans = Math.max(ans, sum);
                break;
            }
            for (int l = 0; l <= takeOps; ++l) {
                ArrayList<Integer> takes = new ArrayList<>(takeOps);
                int r = takeOps - l;
                for (int i = 0; i < l; ++i)
                    takes.add(x[i]);
                for (int i = n - 1; i >= n - r; --i)
                    takes.add(x[i]);
                Collections.sort(takes);
                int sum = 0;
                int remainOps = m - takeOps;
                for (int value : takes) {
                    if (value < 0 && remainOps > 0)
                        --remainOps;
                    else
                        sum += value;
                }
                ans = Math.max(ans, sum);
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