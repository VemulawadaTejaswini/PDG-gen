import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main {
    static MyReader in = new MyReader();

    public static void main(String[] args){
        int N = in.i();
        int K = in.i();
        ArrayList<Integer> A = in.il(N);
        A.sort((x, y) -> -abs(x) + abs(y));

        int plus = Integer.MAX_VALUE;
        int minus = Integer.MIN_VALUE;
        boolean odd = false;
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < K; i++) {
            int a = A.get(i);
            if (a < 0) {
                minus = a;
                odd = !odd;
            } else {
                plus = a;
            }
            list.push(a);
        }

        if (odd && plus > 0) {
            int p = minus;
            int m = plus;
            boolean b1 = false;
            boolean b2 = false;
            for (int i = K; i < N; i++) {
                int a = A.get(i);
                if (a < 0) {
                    m = a;
                    b1 = true;
                } else if (a >= 0) {
                    p = a;
                    b2 = true;
                }
                if (b1 && b2) {
                    break;
                }
            }

            if (plus != Integer.MAX_VALUE) {
                boolean b = (long)(m == plus ? Integer.MIN_VALUE : m) * minus < (long)(p == minus ? Integer.MAX_VALUE : p) * plus;
                Integer rm = b ? minus : plus;
                Integer ps = b ? p : m;
                list.remove(rm);
                list.push(ps);
            } else {
                list.clear();
                for (int i = 0; i < K; i++) {
                    list.push(A.get(N - 1 - i));
                }
            }
        }

        final long M = 1_000_000_007;
        long ans = 1;
        for (int a : list) {
            ans = ans * a % M;
        }
        out.println((M + ans) % M);
    }

    static int abs(int i) {
        return i < 0 ? -i : i;
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

    ArrayList<Integer> il(final int N) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int j = 0; j < N; j++) a.add(i());
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
