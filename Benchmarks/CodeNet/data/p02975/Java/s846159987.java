import java.io.*;
import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        SimpleScanner scanner = new SimpleScanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        int n = scanner.nextInt();
        HashMap<Integer, Integer> cntMap = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            int t = scanner.nextInt();
            cntMap.compute(t, (k, v) -> v == null ? 1 : v + 1);
        }
        boolean valid = false;
        if (cntMap.size() == 3) {
            int[][] count = new int[3][2];
            int k = 0;
            for (int key : cntMap.keySet()) {
                count[k][0] = key;
                count[k++][1] = cntMap.get(key);
            }
            Arrays.sort(count, Comparator.comparingInt(o -> -o[1]));
            if ((count[0][0] ^ count[1][0]) == count[2][0]
                    && ((count[0][1] - count[2][1] == 0 && count[1][1] - count[2][1] == 0)
                    || (count[0][1] - count[2][1] == 1 && count[1][1] - count[2][1] == 1)
                    || (count[0][1] - count[2][1] == 1 && count[1][1] - count[2][1] == 0))) {
                valid = true;
            }
        } else if (cntMap.size() == 2) {
            if (cntMap.containsKey(0)) {
                int count0 = cntMap.get(0);
                int count1 = 0;
                for (int key : cntMap.keySet())
                    if (key != 0)
                        count1 = cntMap.get(key);
                count1 -= count0 * 2;
                if (count1 >= 0 && count1 <= 2)
                    valid = true;
            }
        } else if (cntMap.size() == 1) {
            if (cntMap.containsKey(0))
                valid = true;
        }
        writer.println(valid ? "Yes" : "No");

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