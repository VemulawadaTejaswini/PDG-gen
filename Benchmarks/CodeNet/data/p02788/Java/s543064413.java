import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main {
    static MyReader in = new MyReader();

    public static void main(String[] args){
        int n = in.i();
        int d = in.i();
        int a = in.i();
        long[] b = new long[n];
        for (int i = 0; i < n; i++) {
            long x = in.i();
            long h = in.i();
            b[i] = (x << 30) + h;
        }
        Arrays.sort(b);

        long ans = 0;
        for (int i = 0; i < n; i++) {
            int h1 = (int)(b[i] & ((1L << 30) - 1));
            if (h1 == 0) {
                continue;
            }
            int x1 = (int)(b[i] >> 30);
            int count = 1 + (h1 - 1) / a;
            ans += count;
            int atack = count * a;
            int xr = x1 + 2 * d;
            for (int j = i + 1; j < n; j++) {
                long x2 = b[j] >> 30;
                if (x2 <= xr) {
                    int h2 = (int)(b[j] & ((1L << 30) - 1));
                    h2 = Math.max(0, h2 - atack);
                    b[j] = (x2 << 30) + h2;
                } else {
                    break;
                }
            }
        }
        out.println(ans);
    }

    static int max(int a, int b) {
        return a < b ? b : a;
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
