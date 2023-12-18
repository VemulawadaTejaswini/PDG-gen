import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main {
    static MyReader in = new MyReader();

    public static void main(String[] args) {
        int N = in.i();
        int[] A = in.ii(N);
        Arrays.sort(A);
        long ans = 0;
        int l = 0;
        int r = N - 2;
        int x = A[N - 1];
        int y = A[N - 1];
        int turn = 0;
        while (l <= r) {
            if (turn < 2) {
                int a = Math.abs(x - A[l]);
                int b = Math.abs(y - A[l]);
                if (a < b) {
                    y = A[l];
                    ans += b;
                } else {
                    x = A[l];
                    ans += a;
                }
                l++;
            } else {
                int a = Math.abs(x - A[r]);
                int b = Math.abs(y - A[r]);
                if (a < b) {
                    y = A[r];
                    ans += b;
                } else {
                    x = A[r];
                    ans += a;
                }
                r--;
            }
            turn = (turn + 1) % 4;
        }
        out.println(ans);
    }

    static int f(int x, int y, int z, int w) {
        int a = Math.abs(x - z);
        int b = Math.abs(y - w);
        int c = Math.abs(x - w);
        int d = Math.abs(y - z);
        return Math.max(a + b, c + d);
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
