import java.io.*;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        SimpleScanner scanner = new SimpleScanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        int n = scanner.nextInt();
        ArrayList<String> x = new ArrayList<>(n);
        for (int i = 0; i < n; ++i) {
            char[] s = scanner.next().toCharArray();
            Arrays.sort(s);
            x.add(new String(s));
        }
        x.sort(Comparator.naturalOrder());
        long ans = 0;
        for (int i = 0; i < n; ) {
            int j = i;
            while (j < n && x.get(j).equals(x.get(i)))
                ++j;
            long cnt = j - i;
            ans += cnt * (cnt - 1) / 2;
            i = j;
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