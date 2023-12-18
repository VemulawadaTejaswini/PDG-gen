import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main {
    static MyReader in = new MyReader();

    public static void main(String[] args) {
        int N = in.i();
        int Ma = in.i();
        int Mb = in.i();

        int[] d = new int[N];
        int[] c = new int[N];
        int min = 0;
        int max = 0;

        for (int i = 0; i < N; i++) {
            int a = in.i();
            int b = in.i();
            d[i] = Ma * b - Mb * a;
            c[i] = in.i();
            if (d[i] < 0) {
                min += d[i];
            } else if (d[i] > 0) {
                max += d[i];
            }
        }

        final int INF = Integer.MAX_VALUE / 2;

        int[][] dp = new int[N][max - min + 1];
        Arrays.fill(dp[0], INF);
        dp[0][d[0] - min] = c[0];

        for (int i = 1; i < N; i++) {
            for (int j = min; j <= max; j++) {
                dp[i][j - min] = dp[i - 1][j - min];
            }
            dp[i][d[i] - min] = Math.min(dp[i][d[i] - min], c[i]);
            if (d[i] == 0) {
                continue;
            }
            for (int j = min; j <= max; j++) {
                int k = j + d[i];
                if (min <= k && k <= max) {
                    dp[i][k - min] = Math.min(dp[i][k - min], dp[i - 1][j - min] + c[i]);
                }
            }
        }


        int ans = dp[N - 1][0 - min];
        if (ans == INF) {
            ans = -1;
        }
        out.println(ans);
    }
}

class MyReader extends BufferedReader {
    char[] cbuf = new char[1024];
    int head = 0;
    int tail = 0;

    MyReader() {
        super(new InputStreamReader(System.in));
    }

    char next() {
        if (head == tail) {
            try {
                tail = super.read(cbuf, 0, cbuf.length);
            } catch (IOException e) {
                e.printStackTrace();
            }
            head = 0;
        }
        return cbuf[head++];
    }

    void back() {
        head--;
    }

    boolean minus() {
        boolean minus;
        while (true) {
            char c = next();
            if (!isDelimiter(c)) {
                if (!(minus = c == '-')) back();
                return minus;
            }
        }
    }

    void skip() {
        while (isDelimiter(next()));
        back();
    }

    char[] s(int N) {
        char[] cbuf = new char[N];
        read(cbuf, 0, N);
        return cbuf;
    }

    public int read(char[] cbuf, int off, int len) {
        skip();
        int i;
        for (i = 0; i < cbuf.length; i++) {
            char c = next();
            if (isDelimiter(c)) {
                break;
            }
            cbuf[i] = c;
        }
        return i;
    }

    boolean isDelimiter(char c) {
        return c == ' ' || c == '\n' || c == '\r';
    }

    int i() {
        boolean minus = minus();
        int n = 0;
        while (true) {
            int k = next() - '0';
            if (k < 0 || 9 < k) break;
            n = 10 * n + k;
        }
        return minus ? -n : n;
    }

    int[] ii(final int N) {
        int[] a = new int[N];
        for (int j = 0; j < a.length; j++) a[j] = i();
        return a;
    }

    long l() {
        boolean minus = minus();
        long n = 0;
        while (true) {
            int k = next() - '0';
            if (k < 0 || 9 < k) break;
            n = 10 * n + k;
        }
        return minus ? -n : n;
    }
}
