import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main {
    static MyReader in = new MyReader();

    public static void main(String[] args){
        int N = in.i();
        int[] a = in.ii(3 * N);
        PriorityQueue<Integer> q = new PriorityQueue<>();
        long sum = 0;
        for (int i = 0; i < N; i++) {
            q.add(a[i]);
            sum += a[i];
        }
        long[] b = new long[N + 1];
        b[0] = sum;
        for (int i = 0; i < N; i++) {
            int x = a[N + i];
            q.add(x);
            b[i + 1] = b[i] + x - q.poll();
        }

        q = new PriorityQueue<>((x, y) -> -x + y);
        sum = 0;
        for (int i = 2 * N; i < 3 * N; i++) {
            q.add(a[i]);
            sum += a[i];
        }
        long[] c = new long[N + 1];
        c[N] = sum;
        for (int i = N; i > 0; i--) {
            int x = a[N + i - 1];
            q.add(x);
            c[i - 1] = c[i] + x - q.poll();
        }
        q.clear();
        long ans = Long.MIN_VALUE;
        for (int i = 0; i < b.length; i++) {
            long t = b[i] - c[i];
            if (ans < t) {
                ans = t;
            }
        }

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
