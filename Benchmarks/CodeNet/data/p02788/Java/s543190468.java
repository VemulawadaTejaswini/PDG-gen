import java.io.*;
import java.util.*;

public class Main {
    static MyReader in = new MyReader();

    public static void main(String[] args) {
        int N = in.i();
        int D = in.i() * 2;
        int A = in.i();

        int[][] m = new int[N + 1][];
        for (int i = 0; i < N; i++) {
            m[i] = new int[]{in.i(), in.i()};
        }
        m[N] = new int[]{1 << 30, 0};
        Arrays.sort(m, (m1, m2) -> m1[0] - m2[0]);

        int[][] bomb = new int[N][];
        int pop = 0;
        int push = 0;

        long ans = 0;
        long extra = 0;

        for (int i = 0; i < N; i++) {
            int x = m[i][0];
            int h = m[i][1];

            while (pop < push) {
                int x2 = bomb[pop][0];
                int h2 = bomb[pop][1];
                if (x <= x2) break;
                extra -= h2;
                pop++;
            }
            h -= extra;

            if (h > 0) {
                int num = (h + A - 1) / A;
                ans += num;
                int attack = A * num;
                extra += attack;
                bomb[push++] = new int[]{x + D, attack};
            }
        }
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
