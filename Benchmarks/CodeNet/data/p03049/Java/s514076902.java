import java.io.*;
import java.util.*;

public class Main {
    static MyReader in = new MyReader();

    public static void main(String[] args) {
        int N = in.i();
        char[][] s = new char[N][10];
        int[] n = new int[N];
        for (int i = 0; i < N; i++) {
            n[i] = in.read(s[i]);
        }
        int ans = 0;
        int A = 0;
        int B = 0;
        int AB = 0;
        for (int i = 0; i < N; i++) {
            boolean a = s[i][n[i] - 1] == 'A';
            boolean b = s[i][0] == 'B';
            if (a && b) {
                AB++;
            } else if (a) {
                A++;
            } else if (b) {
                B++;
            }
            char[] si = s[i];
            boolean f = false;
            for (int j = 0; j < n[i]; j++) {
                if (si[j] == 'A') {
                    f = true;
                } else if (f && si[j] == 'B') {
                    ans++;
                    f = false;
                } else {
                    f = false;
                }
            }
        }
        if (AB > 0) {
            ans += AB - 1;
            if (A > 0 || B > 0) {
                A++;
                B++;
            }
        }
        ans += Math.min(A, B);
        System.out.println(ans);
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

    int i() {
        int k = next() - '0';
        boolean minus = k == -3;
        int n = minus ? 0 : k;
        while (0 <= (k = next() - '0') && k <= 9) n = 10 * n + k;
        return minus ? -n : n;
    }

    int[] ii(final int N) {
        int[] a = new int[N];
        for (int j = 0; j < a.length; j++) a[j] = i();
        return a;
    }

    long l() {
        int k = next() - '0';
        boolean minus = k == -3;
        long n = minus ? 0 : k;
        while (0 <= (k = next() - '0') && k <= 9) n = 10 * n + k;
        return minus ? -n : n;
    }

    char[] s(final int N) {
        char[] s = new char[N];
        for (int i = 0; i < N; i++) {
            s[i] = next();
        }
        next();
        return s;
    }

    public int read(char[] cbuf) {
        int i;
        char c;
        for (i = 0; (c = next()) != ' ' && c != '\n'; i++) cbuf[i] = c;
        return i;
    }

    public String readLine() {
        try {
            return super.readLine();
        } catch (IOException e) {
            return null;
        }
    }
}
