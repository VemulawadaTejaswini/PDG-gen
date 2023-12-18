import java.util.function.*;
import java.io.*;

class Main {
    static Scanner scanner = new Scanner();
    static long mod = 1000000007;
    static int inf = 0x7ffffff;

    public static void main(String[]$) throws Exception {
        long n = scanner.nextLong();
        long min = 10000000000000L;
        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                min = Math.min(min, i + n / i - 2);
            }
        }
        System.out.println(min);
    }

    static class System {
        static PrintWriter out = new PrintWriter(java.lang.System.out);

        static {
            Runtime.getRuntime().addShutdownHook(new Thread(System.out::flush));
        }
    }

    static class Scanner {
        BufferedInputStream reader = new BufferedInputStream(java.lang.System.in);
        byte[] buffer = new byte[0x10000];
        int i = 0;
        int length = 0;

        int read() {
            if (i == length) {
                i = 0;
                try {
                    length = reader.read(buffer);
                } catch (IOException ignored) {
                }
                if (length == -1) {
                    return -1;
                }
            }
            return buffer[i++];
        }

        String next() {
            StringBuilder builder = new StringBuilder();
            int b = read();
            while (b < '!' || '~' < b) {
                b = read();
            }
            while ('!' <= b && b <= '~') {
                builder.appendCodePoint(b);
                b = read();
            }
            return builder.toString();
        }

        int nextInt() {
            return (int)nextLong();
        }

        long nextLong() {
            int b = read();
            while (b < '!' || '~' < b) {
                b = read();
            }
            int i = 0;
            if (b == '-') {
                i = 1;
                b = read();
            }
            long n = 0;
            while ('0' <= b && b <= '9') {
                n = n * 10 + b - '0';
                b = read();
            }
            return i == 0 ? n : -n;
        }

        char[][] nextCharArray(int n, int m) {
            char[][] a = new char[n][m];
            for (int i = 0; i < n; i++) {
                a[i] = next().toCharArray();
            }
            return a;
        }

        int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            return a;
        }

        int[] nextIntArray(int n, IntUnaryOperator op) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = op.applyAsInt(nextInt());
            }
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextLong();
            }
            return a;
        }

        long[] nextLongArray(int n, LongUnaryOperator op) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = op.applyAsLong(nextLong());
            }
            return a;
        }
    }
}
