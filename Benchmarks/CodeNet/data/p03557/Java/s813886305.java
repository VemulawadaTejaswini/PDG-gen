import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main {
    static MyReader in = new MyReader();

    public static void main(String[] args) {
        int N = in.i();
        int[] A = in.ii(N);
        int[] B = in.ii(N);
        int[] C = in.ii(N);
        long ans = solve(N, A, B, C);
        out.println(ans);
    }

    static long solve(int N, int[] A, int[] B, int[] C) {
        Arrays.sort(A);
        Arrays.sort(C);
        long ans = 0;
        for (int j = 0; j < N; j++) {
            int l = -1;
            int r = N - 1;
            while (l < r) {
                int m = (l + r + 1) / 2;
                if (A[m] < B[j]) {
                    l = m;
                } else {
                    r = m - 1;
                }
            }
            long i = l + 1;
            l = 0;
            r = N;
            while (l < r) {
                int m = (l + r) / 2;
                if (B[j] < C[m]) {
                    r = m;
                } else {
                    l = m + 1;
                }
            }
            long k = N - l;
            ans += (long)i * k;
        }
        return ans;
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
            } catch (IOException e) {

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

    String s() {
        try {
            return readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
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
        for (int j = 0; j < N; j++) a[j] = i();
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
