import java.io.*;
import java.nio.CharBuffer;
import java.util.HashMap;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        SimpleScanner scanner = new SimpleScanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        final int MAX = 1 << 20;
        final int MOD = 1000000007;
        int n = scanner.nextInt();
        long[] f = new long[MAX];
        HashMap<Integer, Long> zero = new HashMap<>(n);
        int xor = 0, zeroCount = 0;
//        int[] debugX = new int[n], debugXor = new int[n];
        for (int i = 0; i < n; ++i) {
            int x = scanner.nextInt();
            xor = xor ^ x;
//            debugX[i] = x;
//            debugXor[i] = xor;
            if (xor != 0) {
                if (f[xor] == 0) {
                    f[xor] = 1;
                    zero.put(xor, 1L);
                } else
                    f[xor] = (f[xor] + zero.get(xor)) % MOD;
            } else {
                ++zeroCount;
                for (int key : zero.keySet()) {
                    zero.put(key, (zero.get(key) + f[key]) % MOD);
                }
            }
        }
//        writer.println(Arrays.toString(debugX));
//        writer.println(Arrays.toString(debugXor));
//        writer.flush();
        if (xor != 0) {
            writer.println(zero.get(xor));
        } else {
            long ans = 1;
            for (int i = 1; i < zeroCount; ++i)
                ans = (ans * 2) % MOD;
            for (int key : zero.keySet())
                ans = (ans + f[key]) % MOD;
            writer.println(ans);
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