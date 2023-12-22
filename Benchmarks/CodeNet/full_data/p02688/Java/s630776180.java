import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main {
    static MyReader in = new MyReader();

    static long[][] nCr = new long[51][51];

    public static void main(String[] args) {
        int N = in.i();
        int K = in.i();
        int ans = N;
        boolean[] b = new boolean[N];
        for (int i = 0; i < K; i++) {
            int d = in.i();
            for (int j = 0; j < d; j++) {
                int a = in.i() - 1;
                if (!b[a]) {
                    b[a] = true;
                    ans--;
                }
            }
        }
        out.println(ans);
    }

    static long pow(long a, int b) {
        long c = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                c *= a;
            }
            a *= a;
            b >>= 1;
        }
        return c;
    }

    static long nCr(int n, int r) {
        if (n < r) return 0;
        if (nCr[n][r] > 0) return nCr[n][r];
        if (r == 0) return nCr[n][r] = 1;
        if (n - r < r) return nCr[n][r] = nCr(n, n - r);
        else return nCr[n][r] = nCr(n - 1, r - 1) + nCr(n - 1, r);
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

    int i() {
        int k = next() - '0';
        boolean minus = k == -3;
        int n = minus ? 0 : k;
        while (0 <= (k = next() - '0') && k <= 9) n = 10 * n + k;
        return minus ? -n : n;
    }

    int[] ii(final int N) {
        int[] a = new int[N];
        for (int j = 0; j < a.length; j++) a[j] = i();
        return a;
    }

    char[] s(final int N) {
        char[] s = new char[N];
        for (int i = 0; i < N; i++) {
            s[i] = next();
        }
        next();
        return s;
    }

    public int read(char[] cbuf) {
        int i;
        for (i = 0; i < cbuf.length; i++) {
            char c = next();
            if (c == ' ' || c == '\n') {
                break;
            }
            cbuf[i] = c;
        }
        if (i == cbuf.length) next();
        return i;
    }
}
