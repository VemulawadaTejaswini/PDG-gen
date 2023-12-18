import java.io.*;
import java.util.*;

public class Main {
    static MyReader in = new MyReader();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args){
        int[] primes = new int[9592];
        primes[0] = 2;
        for (int i = 3, p = 1, k = 0; i <= 99991; i += 2) {
            while (true) {
                if (primes[k] * primes[k] <= i) {
                    k++;
                } else {
                    break;
                }
            }
            for (int j = 0; ; j++) {
                if (j == k) {
                    primes[p++] = i;
                    break;
                } else {
                    int q = primes[j];
                    if (i % q == 0) {
                        break;
                    }
                }
            }
        }
        int[] d = new int[50001];
        for (int i = 1; i < d.length; i++) {
            boolean b = exists(primes, 2 * i - 1) && exists(primes, i);
            d[i] = d[i - 1] + (b ? 1 : 0);
        }
        
        int Q = in.i();
        for (int i = 0; i < Q; i++) {
            int ans = 0;
            int l = in.i() / 2 + 1;
            int r = (in.i() - 1) / 2 + 1;
            ans += d[r] - d[l - 1];
            out.println(ans);
        }
        out.close();
    }

    static void solve(int Q, int[] l, int[] r) {
        int[] primes = new int[9592];
        primes[0] = 2;
        for (int i = 3, p = 1, k = 0; i <= 99991; i += 2) {
            while (true) {
                if (primes[k] * primes[k] < i) {
                    k++;
                } else {
                    break;
                }
            }
            for (int j = 0; ; j++) {
                int q = primes[j];
                if (i % q == 0) {
                    break;
                } else if (j == k) {
                    primes[p++] = i;
                    break;
                }
            }
        }
        int[] d = new int[5001];
        for (int i = 1; i < d.length; i++) {
            boolean b = exists(primes, 2 * i - 1) && exists(primes, i);
            d[i] = d[i - 1] + (b ? 1 : 0);
        }

        for (int i = 0; i < Q; i++) {
            int ans = 0;
            ans += d[(r[i] - 1) / 2 + 1] - d[l[i] / 2];
        }
    }

    static boolean exists(int[] primes, int p) {
        return Arrays.binarySearch(primes, p) >= 0;
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
