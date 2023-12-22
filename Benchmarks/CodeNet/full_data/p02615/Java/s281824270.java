import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main{
    static MyReader in = new MyReader();

    public static void main(String[] args){
        int N = in.i();
        int[] A = in.ii(N);
        Arrays.sort(A);
        PriorityQueue<Long> q = new PriorityQueue<>((x, y) -> -f(x) + f(y));
        q.add(create(A[A.length - 1], A[A.length - 1]));
        long ans = 0;
        for (int i = A.length - 2; i >= 0; i--) {
            long n = q.poll();
            int l = l(n);
            int r = r(n);
            q.add(create(l, A[i]));
            q.add(create(A[i], r));
            ans += min(l, r);
        }
        out.println(ans);
    }

    static int min(int a, int b) {
        return a < b ? a : b;
    }

    static long create(long l, long r) {
        return (l << 30) + r;
    }

    static int l(long n) {
        return (int)(n >> 30);
    }

    static int r(long n) {
        return (int)(n & ((1 << 30) - 1));
    }

    static int f(long n) {
        return min(l(n), r(n));
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
