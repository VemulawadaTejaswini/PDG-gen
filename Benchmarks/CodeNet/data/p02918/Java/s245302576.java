import java.io.*;
import java.nio.CharBuffer;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        SimpleScanner scanner = new SimpleScanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        char[] s = scanner.next().toCharArray();
        final String LR = "LR";
        int[] happy = new int[2];
        int[] cnt = new int[2];
        int[] endPoint = new int[2];
        boolean whole = false;
        for (int i = 0; i < n; ) {
            int j = i;
            while (j < n && s[j] == s[i])
                ++j;
            int t = LR.indexOf(s[i]);
            happy[t] += j - i - 1;
            cnt[t]++;
            if (i == 0 && j == n)
                whole = true;
            if (i == 0 || j == n)
                endPoint[t]++;
            i = j;
        }
        int ans = happy[0] + happy[1];
        if (!whole) {
            for (int k = 0; k <= 1; ++k) {
                int addition = 0;
                int t = m;
                int plus2 = Math.min(t, cnt[k] - endPoint[k]);
                addition += 2 * plus2;
                t -= plus2;
                int plus1 = Math.min(t, endPoint[k]);
                addition += plus1;
                ans = Math.max(ans, happy[0] + happy[1] + addition);
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