import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main {
    static MyReader in = new MyReader();

    public static void main(String[] args){
        int N = in.i();
        int H = in.i();
        long[] katana = new long[N];
        Arrays.setAll(katana, i -> in.i() + (in.l() << 30));
        Arrays.sort(katana);
        int c = 0;
        int ans = 0;
        for (int i = N - 1; i >= 0; i--) {
            long k = katana[i];
            int a = (int)(k & (1 << 30) - 1);
            int b = (int)(k >> 30);
            if (b < c) {
                break;
            } else {
                c = max(c, a);
                H -= b;
                ans++;
                if (H <= 0) {
                    c = 0;
                    break;
                }
            }
        }
        if (c > 0) {
            ans += (H - 1) / c + 1;
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
