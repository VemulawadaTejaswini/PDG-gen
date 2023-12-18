import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.TreeMap;
import java.io.PrintWriter;
import java.io.FileInputStream;

public class Main {
    InputStream is;

    int __t__ = 1;
    int __f__ = 0;
    int __FILE_DEBUG_FLAG__ = __f__;
    String __DEBUG_FILE_NAME__ = "src/D4";

    FastScanner in;
    PrintWriter out;

    public void solve() {
        /*
        // String s = in.next();
        for (int i = 1; i <= 1000; i++) {
            int ans1 = solveA(i);
            int ans2 = solveB(i);
            if (ans1 != ans2) {
                System.out.println(i + " " + ans1 + " " + ans2);
            }
        }
        // System.out.println(res);
         */

        String s = in.next();
        int[][] dp = new int[s.length()+1][10];
        for (int i = 0; i <= s.length(); i++) {
            Arrays.fill(dp[i], 1 << 30);
        }
        dp[0][0] = 0;
        for (int i = 0; i < s.length(); i++) {
            int next = s.charAt(i) - '0';
            dp[i + 1][0] = dp[i][0] + next;
            if (next != 0) {
                dp[i + 1][10 - next] = dp[i][0] + 11 - next;
            }
            for (int j = 1; j < 10; j++) {
                dp[i + 1][0] = Math.min(dp[i + 1][0], dp[i][j] + next);
                if (next != 0) {
                    dp[i + 1][10 - next] = Math.min(dp[i + 1][10 - next], dp[i][j] + (9 - next));
                }
            }
        }
        int res = 1 << 30;
        for (int i = 0; i < 10; i++) {
            res = Math.min(res, dp[s.length()][i]);
        }
        System.out.println(res);
    }

    private int solveB(int x) {
        int res = x;
        for (int b = x; b <= 10000; b++) {
            int cnt = count(b) + count(b - x);
            res = Math.min(res, cnt);
        }
        return res;
    }

    int count(int x) {
        int res = 0;
        while (x > 0) {
            res += x % 10;
            x /= 10;
        }
        return res;
    }

    private int solveA(int x) {
        String s = Integer.toString(x);
        int[][] dp = new int[s.length()+1][10];
        for (int i = 0; i <= s.length(); i++) {
            Arrays.fill(dp[i], 1 << 30);
        }
        dp[0][0] = 0;
        for (int i = 0; i < s.length(); i++) {
            int next = s.charAt(i) - '0';
            dp[i + 1][0] = dp[i][0] + next;
            if (next != 0) {
                dp[i + 1][10 - next] = dp[i][0] + 11 - next;
            }
            for (int j = 1; j < 10; j++) {
                dp[i + 1][0] = Math.min(dp[i + 1][0], dp[i][j] + next);
                if (next != 0) {
                    dp[i + 1][10 - next] = Math.min(dp[i + 1][10 - next], dp[i][j] + (9 - next));
                }
            }
        }
        int res = 1 << 30;
        for (int i = 0; i < 10; i++) {
            res = Math.min(res, dp[s.length()][i]);
        }
        return res;
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
