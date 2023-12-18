import java.io.*;
import java.util.*;

public class Main {
    static MyReader in = new MyReader();

    public static void main(String[] args) {
        int N = in.i();
        int[] x = new int[N * 3];
        for (int i = 0; i < x.length; ) {
            x[i++] = in.i();
            x[i++] = in.i();
            x[i++] = in.i();
        }

        int x0 = 0;
        int y0 = 0;
        int h0 = 0;
        for (int i = 0; i < x.length; ) {
            x0 = x[i++];
            y0 = x[i++];
            h0 = x[i++];
            if (0 < h0) {
                break;
            }
        }

        for (int Cx = 0; Cx <= 100; Cx++) {
            loop: for (int Cy = 0; Cy <= 100; Cy++) {
                int H = h0 + Math.abs(Cx - x0) + Math.abs(Cy - y0);
                for (int i = 0; i < x.length; ) {
                    int h = Math.max(H - Math.abs(Cx - x[i++]) - Math.abs(Cy - x[i++]), 0);
                    if (h != x[i++]) {
                        continue loop;
                    }
                }
                System.out.printf("%d %d %d\n", Cx, Cy, H);
                return;
            }
        }
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
