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
    String __DEBUG_FILE_NAME__ = "src/E2";

    FastScanner in;
    PrintWriter out;

    int MOD = 1000000007;
    public void solve() {
        final String AGCT = "AGCT";

        int n = in.nextInt();
        long[][][][] dp = new long[n+1][4][4][4];
        dp[0][0][0][0] = 1;

        for (int i = 0; i < n; i++) {
            for (int p1 = 0; p1 < 4; p1++) for (int p2 = 0; p2 < 4; p2++) for (int p3 = 0; p3 < 4; p3++) {
                final char c1 = AGCT.charAt(p1);
                final char c2 = AGCT.charAt(p2);
                final char c3 = AGCT.charAt(p3);
                for (int np = 0; np < 4; np++) {
                    final char nc = AGCT.charAt(np);
                    if (i >= 2) {
                        // AGC, ACG, GAC
                        if ((c2 == 'A' && c3 == 'G' && nc == 'C') ||
                                (c2 == 'A' && c3 == 'C' && nc == 'G') ||
                                (c2 == 'G' && c3 == 'A' && nc == 'C')) {
                            continue;
                        }
                    }
                    if (i >= 3) {
                        // AG*C
                        if (c1 == 'A' && c2 == 'G' && nc == 'C') {
                            continue;
                        }
                        // A*GC
                        if (c1 == 'A' && c3 == 'G' && nc == 'C') {
                            continue;
                        }
                    }
                    dp[i+1][p2][p3][np] = ADD(dp[i+1][p2][p3][np], dp[i][p1][p2][p3]);
                }
            }
        }
        long res = 0;
        for (int p1 = 0; p1 < 4; p1++) for (int p2 = 0; p2 < 4; p2++) for (int p3 = 0; p3 < 4; p3++) {
            res = ADD(res, dp[n][p1][p2][p3]);
        }
        System.out.println(res);
    }

    long ADD(long a, long b) {
        return (a + b) % MOD;
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
