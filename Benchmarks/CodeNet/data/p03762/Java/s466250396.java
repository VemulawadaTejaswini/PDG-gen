import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main {
    static MyReader in = new MyReader();
    static final int M = 1_000_000_007;

    public static void main(String[] args){
        int n = in.i();
        int m = in.i();
        int[] x = in.ii(n);
        int[] y = in.ii(m);

        long sx = f(n, x);
        long sy = f(m, y);

        long ans = (M + sx * sy % M) % M;
        out.println(ans);
    }

    static long f(int n, int[] x) {
        long sx = 0;
        long t = 0;
        for (int i = n - 2; i >= 0; i--) {
            t = (t + x[i + 1]) % M;
            sx = (sx + t - (long)(n - 1 - i) * x[i]) % M;
        }
        return sx;
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
                tail = read(cbuf, 0, cbuf.length);
            } catch (IOException e) {}
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
            if (c != ' ' && c != '\n' && c != '\r') {
                if (!(minus = c == '-')) back();
                return minus;
            }
        }
    }

    void skip() {
        while (true) {
            char c = next();
            if (c != ' ' && c != '\n' && c != '\r') {
                back();
                break;
            }
        }
    }

    char[] s(final int N) {
        skip();
        char[] s = new char[N];
        for (int i = 0; i < s.length; i++) {
            s[i] = next();
        }
        return s;
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
