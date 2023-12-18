import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main {
    static MyReader in = new MyReader();

    public static void main(String[] args) {
        char[] N = new char[100];
        int D = in.read(N, 0, 100);
        int K = in.i();
        int[][][] dp = new int[D + 1][K + 1][10];
        dp[0][0][0] = 1;

        for (int i = 1; i <= D; i++) {
            int t = 0;
            for (int h = 0; h < 10; h++) {
                t += dp[i - 1][0][h];
            }
            dp[i][0][0] = t;
            for (int j = 1; j <= K; j++) {
                t = 0;
                for (int h = 0; h < 10; h++) {
                    t += dp[i - 1][j][h];
                }
                dp[i][j][0] = t;
                for (int k = 1; k < 10; k++) {
                    t = 0;
                    for (int h = 0; h < 10; h++) {
                        t += dp[i - 1][j - 1][h];
                    }
                    dp[i][j][k] = t;
                }
            }
        }

        int ans = 1;
        for (int i = 0; i < D; i++) {
            int n = N[i] - '0';
            for (int j = 0; j < n; j++) {
                ans += dp[D - i][K][j];
            }
            if (n != 0 && K-- == 0) {
                ans--;
                break;
            }
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
