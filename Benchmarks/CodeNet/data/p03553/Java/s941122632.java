import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    FastScanner in = new FastScanner(System.in);
    PrintWriter out = new PrintWriter(System.out);

    void run() {
        int N = in.nextInt();

        int[] a = new int[N+1];
        for (int i = 1; i <= N; i++) {
            a[i] = in.nextInt();
        }

        List<Integer> s = new ArrayList<>();
        for (int i = N; i > 0; i--) {
            boolean allNeg = true;
            for (int j = i; j <= N; j += i) {
                if (a[j] > 0) allNeg = false;
            }
            if (!allNeg && i <= N / 2) {
                s.add(i);
                continue;
            }

            long cur = 0;
            for (int j = i; j <= N; j += i) {
                cur += a[j];
            }
            if (cur >= 0) continue;

            for (int j = i; j <= N; j += i) {
                a[j] = 0;
            }
        }
        long res = 0;
        int[] b = Arrays.copyOf(a, N + 1);
        for (int bits = 0; bits < (1 << s.size()); bits++) {
            System.arraycopy(a, 0, b, 0, N + 1);
            for (int i = 0; i < s.size(); i++) {
                if ((bits & (1 << i)) == 0) {
                    continue;
                }
                int p = s.get(i);
                for (int j = p; j <= N; j += p) {
                    b[j] = 0;
                }
            }

            long cur = 0;
            for (int i = 0; i <= N; i++) {
                cur += b[i];
            }
            res = Math.max(res, cur);
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        new Main().run();
    }

    class FastScanner {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public FastScanner(InputStream stream) {
            this.stream = stream;
            //stream = new FileInputStream(new File("dec.in"));

        }

        int read() {
            if (numChars == -1)
                throw new InputMismatchException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        boolean isEndline(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int n) {
            return nextIntArray(n, 0);
        }

        int[] nextIntArray(int n, int margin) {
            int[] array = new int[n + margin];
            for (int i = 0; i < n; i++)
                array[i + margin] = nextInt();

            return array;
        }

        int[][] nextIntMap(int n, int m) {
            int[][] map = new int[n][m];
            for (int i = 0; i < n; i++) {
                map[i] = in.nextIntArray(m);
            }
            return map;
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        long[] nextLongArray(int n) {
            return nextLongArray(n, 0);
        }

        long[] nextLongArray(int n, int margin) {
            long[] array = new long[n + margin];
            for (int i = 0; i < n; i++)
                array[i + margin] = nextLong();

            return array;
        }

        long[][] nextLongMap(int n, int m) {
            long[][] map = new long[n][m];
            for (int i = 0; i < n; i++) {
                map[i] = in.nextLongArray(m);
            }
            return map;
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        double[] nextDoubleArray(int n) {
            return nextDoubleArray(n, 0);
        }

        double[] nextDoubleArray(int n, int margin) {
            double[] array = new double[n + margin];
            for (int i = 0; i < n; i++)
                array[i + margin] = nextDouble();

            return array;
        }

        double[][] nextDoubleMap(int n, int m) {
            double[][] map = new double[n][m];
            for (int i = 0; i < n; i++) {
                map[i] = in.nextDoubleArray(m);
            }
            return map;
        }

        String next() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        String[] nextStringArray(int n) {
            String[] array = new String[n];
            for (int i = 0; i < n; i++)
                array[i] = next();

            return array;
        }

        String nextLine() {
            int c = read();
            while (isEndline(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isEndline(c));
            return res.toString();
        }
    }
}
