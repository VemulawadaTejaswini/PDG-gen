import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main {
    static MyReader in = new MyReader();

    public static void main(String[] args) {
        int N = in.i();
        int M = in.i() * 2;
        boolean[] b = new boolean[N + 1];
        int c = 0;
        for (int i = 0; i < M; i++) {
            int a = in.i();
            if (b[a]) {
                c--;
            } else {
                c++;
            }
            b[a] = !b[a];
        }
        out.println(c == 0 ? "YES" : "NO");
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
        char c = next();
        boolean minus = c == '-';
        int n = minus ? 0 : c - '0';
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
}
