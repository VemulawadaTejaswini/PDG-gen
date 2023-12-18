import java.util.*;
import java.io.*;

public class Main {
    static int INF = 1000000000;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int ma = sc.nextInt();
        int mb = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }
        int[][][] dp = new int[n + 1][10 * n + 1][10 * n + 1];
        for (int[][] x : dp) {
            for (int[] y : x) {
                Arrays.fill(y, INF);
            }
        }
        // System.out.println(Arrays.deepToString(dp));
        dp[0][0][0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= 10 * n; j++) {
                for (int k = 0; k <= 10 * n; k++) {
                    if (j - a[i - 1] >= 0 && k - b[i - 1] >= 0) {
                        dp[i][j][k] = Math.min(dp[i - 1][j][k], dp[i - 1][j - a[i - 1]][k - b[i - 1]] + c[i - 1]);
                    } else {
                        dp[i][j][k] = dp[i - 1][j][k];
                    }
                }
            }
        }
        int ans = Integer.MAX_VALUE;
        for (int j = 0; j <= 10 * n; j++) {
            for (int k = 0; k <= 10 * n; k++) {
                if (j == 0 || k == 0) {
                    continue;
                }
                if (ma * k == mb * j) {
                    ans = Math.min(ans, dp[n][j][k]);
                }
            }
        }
        if (ans == INF) {
            System.out.println(-1);
            return;
        }
        System.out.println(ans);
    }
}

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        } else {
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }

    private int readByte() {
        if (hasNextByte())
            return buffer[ptr++];
        else
            return -1;
    }

    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr]))
            ptr++;
        return hasNextByte();
    }

    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext())
            throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }

    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
            throw new NumberFormatException();
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}
