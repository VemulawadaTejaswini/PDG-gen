import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main {
    static MyReader in = new MyReader();

    public static void main(String[] args){
        int N = in.i();
        int K = in.i();
        int[] P = in.ii(N);
        int[] C = in.ii(N);
        for (int i = 0; i < N; i++) {
            P[i]--;
        }

        long ans = C[0];
        boolean[] done = new boolean[N];
        int[] V = new int[N];
        int vi = 0;
        long[][] score = new long[N][N + 1];
        long[] max = new long[N + 1];
        max[0] = 0;
        for (int i = 0; i < N; i++) {
            if (done[i]) {
                continue;
            }

            int count = 0;
            vi = 0;
            for (int v = i; ; ) {
                v = P[v];
                V[vi++] = v;
                count++;
                done[v] = true;
                if (v == i) {
                    break;
                }
            }

            int jMax = 1;
            long tmp = C[0];
            for (int j = 1; j <= count; j++) {
                for (int k = 0; k < vi; k++) {
                    int v = V[k];
                    int u = P[v];
                    long s = score[u][j - 1] + C[u];
                    if (tmp < s) {
                        tmp = s;
                        jMax = j;
                    }
                    score[v][j] = s;
                }
                max[j] = tmp;
            }

            if (count < K) {
                long loopScore = score[V[0]][count];
                if (loopScore > 0) {
                    int rest = K - jMax;
                    if (rest > 0) {
                       tmp += rest / count * loopScore;
                    }
                   tmp = Math.max(tmp, K / count * loopScore + max[K % count]);
                }
            }

            if (ans < tmp) {
                ans = tmp;
            }
        }
        out.println(ans);
    }

    static class MyReader extends BufferedReader {
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
}
