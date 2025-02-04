import java.io.IOException;
import java.util.Map;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.HashMap;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintWriter;

public class Main {
    InputStream is;

    int __t__ = 1;
    int __f__ = 0;
    int __FILE_DEBUG_FLAG__ = __f__;
    String __DEBUG_FILE_NAME__ = "src/main/java/E3";

    FastScanner in;
    PrintWriter out;

    public void solve() {
        int R = in.nextInt();
        int C = in.nextInt();
        int K = in.nextInt();

        long[][] itemsA = new long[R][C];
        for (int i = 0; i < R; i++) {
            Arrays.fill(itemsA[i], -1);
        }
        for (int i = 0; i < K; i++) {
            int r = in.nextInt() - 1;
            int c = in.nextInt() - 1;
            long v = in.nextLong();
            itemsA[r][c] = v;
        }

        long[][][] dp = new long[R+1][C+1][4];
        if (itemsA[0][0] != -1) {
            dp[0][0][1] = itemsA[0][0];
        }
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                for (int k = 0; k < 4; k++) {
                    dp[i+1][j][0] = Math.max(dp[i+1][j][0], dp[i][j][k]);
                    if (i + 1 < R && itemsA[i + 1][j] != -1) {
                        dp[i+1][j][1] = Math.max(dp[i+1][j][1], dp[i][j][k] + itemsA[i+1][j]);
                    }
                    dp[i][j+1][k] = Math.max(dp[i][j+1][k], dp[i][j][k]);
                    if (k < 3 && j + 1 < C && itemsA[i][j+1] != -1) {
                        dp[i][j+1][k+1] = Math.max(dp[i][j+1][k+1], dp[i][j][k] + itemsA[i][j+1]);
                    }
                }
            }
        }
        long res = 0;
        for (int i = 0; i < 4; i++) {
            res = Math.max(res, dp[R-1][C-1][i]);
        }
        System.out.println(res);
    }

    private Long toLong(int r, int c) {
        return r * 300000L + c;
    }

    public void run() {
        if (__FILE_DEBUG_FLAG__ == __t__) {
            try {
                is = new FileInputStream(__DEBUG_FILE_NAME__);
            } catch (FileNotFoundException e) {
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

    public boolean isSpaceChar(int c) {
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }

    public boolean isEndline(int c) {
        return c == '\n' || c == '\r' || c == -1;
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public int[] nextIntArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = nextInt();

        return array;
    }

    public int[][] nextIntMap(int n, int m) {
        int[][] map = new int[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = nextIntArray(m);
        }
        return map;
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public long[] nextLongArray(int n) {
        long[] array = new long[n];
        for (int i = 0; i < n; i++)
            array[i] = nextLong();

        return array;
    }

    public long[][] nextLongMap(int n, int m) {
        long[][] map = new long[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = nextLongArray(m);
        }
        return map;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

    public double[] nextDoubleArray(int n) {
        double[] array = new double[n];
        for (int i = 0; i < n; i++)
            array[i] = nextDouble();

        return array;
    }

    public double[][] nextDoubleMap(int n, int m) {
        double[][] map = new double[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = nextDoubleArray(m);
        }
        return map;
    }

    public String next() {
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

    public String[] nextStringArray(int n) {
        String[] array = new String[n];
        for (int i = 0; i < n; i++)
            array[i] = next();

        return array;
    }

    public String nextLine() {
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

    public int[][] nextPackedIntArrays(int packN, int size) {
        int[][] res = new int[packN][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < packN; j++) {
                res[j][i] = nextInt();
            }
        }
        return res;
    }
}
