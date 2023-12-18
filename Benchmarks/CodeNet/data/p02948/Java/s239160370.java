import java.io.*;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        SimpleScanner scanner = new SimpleScanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<int[]> tasks = new ArrayList<>(n);
        for (int i = 0; i < n; ++i) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            tasks.add(new int[]{a, b});
        }
        tasks.sort(Comparator.comparingInt(o -> o[0]));
        PriorityQueue<Integer> available = new PriorityQueue<>(n, Comparator.reverseOrder());
        int ans = 0;
        for (int day = 1, i = 0; day <= m; ++day) {
            while (i < n && tasks.get(i)[0] <= day) {
                available.add(tasks.get(i)[1]);
                ++i;
            }
            if (!available.isEmpty())
                ans += available.poll();
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
            return Integer.valueOf(next());
        }

        private long nextLong() {
            return Long.valueOf(next());
        }

        private double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}