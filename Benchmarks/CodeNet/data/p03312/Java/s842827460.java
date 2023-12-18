import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

public class Main {
    InputStream is;

    int __t__ = 1;
    int __f__ = 0;
    int __FILE_DEBUG_FLAG__ = __f__;
    String __DEBUG_FILE_NAME__ = "src/D2";

    FastScanner in;
    PrintWriter out;

    public void solve() {
        int n = in.nextInt();
        long[] a = in.nextLongArray(n);
        long[] sum = new long[n+1];

        for (int i = 0; i < n; i++) {
            sum[i+1] = sum[i] + a[i];
        }
        long res = Long.MAX_VALUE;
        for (int i = 1; i < n - 2; i++) {
            int m = i + 1;
            int l = find(1, i + 2, sum);
            int r = find(i + 2, n + 1, sum);
            res = Math.min(res, calc(l, m, r, n, sum));
            res = Math.min(res, calc(l + 1, m, r, n, sum));
            res = Math.min(res, calc(l, m, r + 1, n, sum));
            res = Math.min(res, calc(l + 1, m, r + 1, n, sum));
        }
        System.out.println(res);
    }

    private long calc(int l, int m, int r, int n, long[] sum) {
        if (l == m || r == n) return Long.MAX_VALUE;
        long[] s = new long[]{
                sum[l],
                sum[m] - sum[l],
                sum[r] - sum[m],
                sum[n] - sum[r]
        };
        // System.out.println(i + " : " + l + " " + m + " " + r + " " + Arrays.toString(s));
        Arrays.sort(s);
        // System.out.println(s[3] - s[0]);
        return s[3] - s[0];
    }

    private int find(int min, int max, long[] sum) {
        int lo = min, hi = max;
        while (hi - lo > 1) {
            int mid = (hi + lo) / 2;
            // System.out.println(lo + " " + hi + " " + mid + " " + (sum[mid] - sum[min-1]) + " " + (sum[max-1] - sum[mid]));
            if (sum[mid] - sum[min-1] <= sum[max-1] - sum[mid]) {
                lo = mid;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    public void run() {
        if (__FILE_DEBUG_FLAG__ == __t__) {
            try {
                is = new FileInputStream(__DEBUG_FILE_NAME__);
            } catch (FileNotFoundException e) {
                // TODO 自動生成された catch ブロック
                e.printStackTrace();
            }
            System.out.println("FILE_INPUT!");
        } else {
            is = System.in;
        }
        in = new FastScanner(is);
        out = new PrintWriter(System.out);

        solve();
    }

    public static void main(final String[] args) {
        new Main().run();
    }

    class FastScanner {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public FastScanner(InputStream stream) {
            this.stream = stream;
            // stream = new FileInputStream(new File("dec.in"));

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
            int[] array = new int[n];
            for (int i = 0; i < n; i++)
                array[i] = nextInt();

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
            long[] array = new long[n];
            for (int i = 0; i < n; i++)
                array[i] = nextLong();

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
            double[] array = new double[n];
            for (int i = 0; i < n; i++)
                array[i] = nextDouble();

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
