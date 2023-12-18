import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Set;

public class Main {
    InputStream is;

    int __t__ = 1;
    int __f__ = 0;
    int __FILE_DEBUG_FLAG__ = __f__;
    String __DEBUG_FILE_NAME__ = "src/E2";

    FastScanner in;
    PrintWriter out;

    public int[] find(String target, String pattern, int[] table) {
        int n = target.length();
        int[] res = new int[n];
        Arrays.fill(res, -1);
        int j = 0;
        for (int i = 0; i < n; i++) {
            while (j >= 0 && target.charAt(i) != pattern.charAt(j)) {
                j = table[j];
            }
            j++;
            if (j == pattern.length()) {
                int from = i;
                int to = (i + pattern.length()) % n;
                res[from] = to;

                j = table[j];
            }
            // System.out.println(i + " " + j + " " + res);
        }
        return res;
    }

    public void solve() {
        String s = in.next();
        String t = in.next();
        int[] sKmp = StringLibs.kmp(s);
        int[] tKmp = StringLibs.kmp(t);
        int sPeriod = period(sKmp);
        int tPeriod = period(tKmp);

        if (sPeriod == tPeriod) {
            String ss = s.substring(0, sPeriod);
            String tt = t.substring(0, tPeriod);
            if (StringLibs.find(ss + ss, tt) != -1) {
                System.out.println("-1");
                return;
            }
        }

        final int[] g;
        if (s.length() < t.length()) {
            StringBuilder ss = new StringBuilder();
            while (ss.length() < t.length() * 2) {
                ss.append(s);
            }
            g = find(ss.toString(), t, tKmp);
        } else {
            g = find(s + s + s, t, tKmp);
        }

        int[] dp = new int[g.length];
        Arrays.fill(dp, -1);
        int res = 0;
        for (int i = 0; i < g.length; i++) {
            if (g[i] == -1) {
                continue;
            }
            if (dp[i] == -1) {
                boolean can = dfs(i, i, dp, g);
                if (!can) {
                    throw new RuntimeException();
                }
            }
            res = Math.max(res, dp[i]);
        }
        System.out.println(res);
    }

    private boolean dfs(final int u, final int start, final int[] dp, final int[] g) {
        if (dp[u] != -1) {
            return u != start;
        }

        if (g[u] == -1) {
            dp[u] = 0;
            return true;
        }
        boolean res = dfs(g[u], start, dp, g);
        if (!res) {
            return false;
        } else {
            dp[u] = dp[g[u]] + 1;
            return true;
        }
    }

    private int period(int[] kmp) {
        int n = kmp.length - 1;
        int p = n - kmp[n];
        return n % p == 0 ? p : n;
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

class StringLibs {

    public static int[] kmp(String pattern) {
        int n = pattern.length();
        int[] table = new int[n + 1];
        table[0] = -1;
        int j = -1;
        for (int i = 0; i < pattern.length(); i++) {
            while (j >= 0 && pattern.charAt(i) != pattern.charAt(j)) j = table[j];
            j++;
            table[i + 1] = j;
        }
        return table;
    }

    public static int find(String target, String pattern) {
        int[] table = kmp(pattern);

        int n = target.length();
        int j = 0;
        for (int i = 0; i < n; i++) {
            while (j >= 0 && target.charAt(i) != pattern.charAt(j)) {
                j = table[j];
            }
            j++;
            if (j == pattern.length()) {
                return i + 1 - pattern.length();
            }
        }
        return -1;
    }


    public static int[] zAlgo(String s) {
        int n = s.length();
        int[] res = new int[n];
        res[0] = n;
        int i = 1, j = 0;
        while (i < n) {
            while (i + j < n && s.charAt(j) == s.charAt(i + j)) j++;
            res[i] = j;
            if (j == 0) {
                i++;
                continue;
            }

            int k = 1;
            while (i + k < n && k + res[k] < j) {
                res[i + k] = res[k];
                k++;
            }
            i += k;
            j -= k;
        }
        return res;
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
