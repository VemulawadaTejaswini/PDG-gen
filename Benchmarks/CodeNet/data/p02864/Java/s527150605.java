import java.io.FileInputStream;
import java.util.Arrays;
import java.io.InputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.io.PrintWriter;
import java.io.IOException;

public class Main {
    InputStream is;

    int __t__ = 1;
    int __f__ = 0;
    int __FILE_DEBUG_FLAG__ = __f__;
    String __DEBUG_FILE_NAME__ = "src/F1";

    FastScanner in;
    PrintWriter out;

    public void solve() {
        int n = in.nextInt();
        int K = in.nextInt();
        long[] h = new long[n+2];
        for (int i = 1; i <= n; i++) {
            h[i] = in.nextLong();
        }

        long INF = 1L << 60;
        long[][] dp = new long[n+1][n+1];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], INF);
        }
        dp[0][0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int x = 0; x < i; x++) {
                    dp[i][j] = Math.min(dp[i][j], dp[x][j-1] + Math.max(0, h[i] - h[x]));
                }
            }
        }
        long res = INF;
        for (int i = 0; i <= n; i++) {
            res = Math.min(res, dp[i][n-K]);
        }
        System.out.println(res);
        /*
        long INF = 1L << 60;
        long[][][] dp = new long[n+1][n+1][K+1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                Arrays.fill(dp[i][j], INF);
            }
        }
        dp[0][0][0] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                for (int k = 0; k <= K; k++) {
                    if (dp[i][j][k] == INF) {
                        continue;
                    }
                    dp[i+1][i+1][k] = Math.min(dp[i+1][i+1][k], dp[i][j][k] + Math.max(0, h[i+1] - h[j]));
                    if (k < K) {
                        dp[i + 1][j][k + 1] = Math.min(dp[i + 1][j][k + 1], dp[i][j][k]);
                    }
                }
            }
        }
        long res = INF;
        for (int j = 0; j <= n; j++) {
            for (int k = 0; k <= K; k++) {
                res = Math.min(res, dp[n][j][k]);
            }
        }
        System.out.println(res);

         */
        /*
        long[][] cost = new long[n][n];
        TreeSet<Integer> ts = new TreeSet<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingLong(i -> h[i]));
        for (int l = 0; l < n; l++) {
            for (int r = l; r < n; r++) {
                ts.clear();
                ts.add(0);
                ts.add(n + 1);
                pq.clear();
                for (int i = l; i <= r; i++) {
                    pq.add(i + 1);
                }
                while (!pq.isEmpty()) {
                    int u = pq.poll();
                    int left = ts.lower(u);
                    int right = ts.higher(u);
                    ts.add(u);
                    cost[l][r] += h[u] - Math.max(h[left], h[right]);
                }
            }
        }
        long[][] dp = new long[n+1][K+1];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], 1L << 60);
        }
        dp[0][0] = 0;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < K; k++) {
                dp[i+1][k+1] = Math.min(dp[i+1][k+1], dp[i][k]);
                for (int j = i; j < n; j++) {
                    dp[j+1][k] = Math.min(dp[j+1][k], dp[i][k] + cost[i][j]);
                }
            }
        }
        long res = 1L << 60;
        for (int k = 0; k <= K; k++) {
            res = Math.min(res, dp[n][k]);
        }
        System.out.println(res);
         */
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
