import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main {
    static MyReader in = new MyReader();
    static int mod = 1_000_000_007;
    static int MAX_N = 2000;
    static int[][] C = new int[MAX_N + 1][MAX_N + 1];
    static {
        for(int i = 0; i <= MAX_N; i++){
            Arrays.fill(C[i], -1);
            C[i][0] = C[i][i] = 1;
        }
    }
    static int c(int n, int r) {
        return n < r ? 0 :
        C[n][r] > -1 ? C[n][r] :
           n / 2 < r ? (C[n][r] = c(n, n - r)) :
                       (C[n][r] = (c(n - 1, r - 1) + c(n - 1, r)) % mod);
    }

    public static void main(String[] args) {
        int S = in.i();
        int ans = 0;

        for (int k = 1; ; k++) {
            int n = S - 3 * k;
            if (n < 0) {
                break;
            }
            int r = k - 1;
            ans = (ans + c(n + r, r)) % mod;
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
