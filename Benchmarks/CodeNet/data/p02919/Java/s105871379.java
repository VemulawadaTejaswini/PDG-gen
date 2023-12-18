import java.io.*;
import java.nio.CharBuffer;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        SimpleScanner scanner = new SimpleScanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        int n = scanner.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; ++i)
            p[i] = scanner.nextInt();
        int[][] l = new int[n][2];
        int[][] r = new int[n][2];
//        TreeMap<Integer, Integer> idxMap = new TreeMap<>();
//        for (int i = 0; i < n; ++i) {
//            Map.Entry<Integer, Integer> a = idxMap.ceilingEntry(p[i]);
//            if (a == null) {
//                l[i][0] = l[i][1] = -1;
//            } else {
//                Map.Entry<Integer, Integer> b = idxMap.ceilingEntry(a.getKey());
//                if (b == null) {
//                    l[i][0] = a.getValue();
//                    l[i][1] = -1;
//                } else {
//                    l[i][0] = Math.max(a.getValue(), b.getValue());
//                    l[i][1] = Math.min(a.getValue(), b.getValue());
//                }
//            }
//            idxMap.put(p[i], i);
//        }
//        idxMap.clear();
//        for (int i = n - 1; i >= 0; --i) {
//            Map.Entry<Integer, Integer> a = idxMap.ceilingEntry(p[i]);
//            if (a == null) {
//                r[i][0] = r[i][1] = n;
//            } else {
//                Map.Entry<Integer, Integer> b = idxMap.ceilingEntry(a.getKey());
//                if (b == null) {
//                    r[i][0] = a.getValue();
//                    r[i][1] = n;
//                } else {
//                    r[i][0] = Math.min(a.getValue(), b.getValue());
//                    r[i][1] = Math.max(a.getValue(), b.getValue());
//                }
//            }
//            idxMap.put(p[i], i);
//        }
        long ans = 0;
        for (int i = 0; i < n; ++i) {
            long times = 0;
            int j;
            for (j = i - 1; j >= 0 && p[j] < p[i]; --j) ;
            l[i][0] = j;
            for (--j; j >= 0 && p[j] < p[i]; --j) ;
            l[i][1] = Math.max(j, -1);
            for (j = i + 1; j < n && p[j] < p[i]; ++j) ;
            r[i][0] = j;
            for (++j; j < n && p[j] < p[i]; ++j) ;
            r[i][1] = Math.min(j, n);
            times += (i - l[i][0]) * (r[i][1] - r[i][0]);
            times += (r[i][0] - i) * (l[i][0] - l[i][1]);
            ans += p[i] * times;
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