import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main {
    static MyReader in = new MyReader();

    public static void main(String[] args) {
        int N = in.i();
        long M = in.i();
        int V = in.i();
        int P = in.i();

        int[] A = in.ii(N);
        Arrays.sort(A);

        long[] sum = new long[N + 1];
        for (int i = 0; i < N; i++) {
            sum[i + 1] = sum[i] + A[i];
        }

        long vote_of_X = M;
        long vote_of_top_P_minus_1 = M * (P - 1);
        long max_vote = M * V;

        int l = 0;
        int r = N - P;
        while (l < r) {
            int X = (l + r) / 2;
            long vote_of_less_than_X = M * X;

            // sum (a[X] + M - a[i]) i = X + 1 to N - P
            long vote_of_the_others = (A[X] + M) * (N - P - X) - sum[N - P + 1] + sum[X + 1];

            long total_vote = vote_of_X + vote_of_top_P_minus_1 + vote_of_less_than_X + vote_of_the_others;

            if (total_vote < max_vote) {
                l = X + 1;
            } else {
                r = X;
            }
        }

        int ans = N - l;
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
