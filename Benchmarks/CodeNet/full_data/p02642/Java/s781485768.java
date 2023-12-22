import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main{
    static MyReader in = new MyReader();

    public static void main(String[] args){
        int N = in.i();
        int[] A = in.ii(N);
        Arrays.sort(A);
        int max = A[A.length - 1];
        int ans = 0;
        boolean[] b1 = new boolean[max + 1];
        boolean[] b2 = new boolean[max + 1];
        for (int i = 0; i < A.length; i++) {
            if (!b1[A[i]]) {
                if (b2[A[i]]) {
                    b1[A[i]] = true;
                    ans--;
                } else {
                    for (int j = 2; ; j++) {
                        int x = A[i] * j;
                        if (b1.length <= x) {
                            break;
                        }
                        b1[x] = true;
                    }
                    b2[A[i]] = true;
                    ans++;
                }
            }
        }

        // int ans = 0;
        // for (int i = 0; i < A.length; i++) {
        //     if (!b1[A[i]]) {
        //         ans++;
        //     }
        // }
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
