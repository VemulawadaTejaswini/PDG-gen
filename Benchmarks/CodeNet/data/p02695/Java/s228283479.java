import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main {
    static MyReader in = new MyReader();
    static int N, M;
    static int[] a, b, c, d;

    public static void main(String[] args){
        N = in.i();
        M = in.i();
        int Q = in.i();
        a = new int[Q];
        b = new int[Q];
        c = new int[Q];
        d = new int[Q];
        for (int i = 0; i < Q; i++) {
            a[i] = in.i() - 1;
            b[i] = in.i() - 1;
            c[i] = in.i();
            d[i] = in.i();
        }
        int ans = dfs(1, 0, new int[N]);

        out.println(ans);
    }

    static int dfs(int i, int j, int[] A) {
        int ans = 0;
        if (j == N) {
            for (int k = 0; k < a.length; k++) {
                ans += A[b[k]] - A[a[k]] == c[k] ? d[k] : 0;
            }
        } else {
            for (; i <= M; i++) {
                A[j] = i;
                ans = Math.max(ans, dfs(i, j + 1, A));
            }
        }
        return ans;
    }

    static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            out.print(a[i] + " ");
        }
        out.println();
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
