import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main {
    static MyReader in = new MyReader();

    public static void main(String[] args) {
        int H = in.i();
        int W = in.i();
        boolean[][] a = new boolean[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                a[i][j] = (in.i() & 1) == 1;
            }
        }

        int[] lines = new int[4];
        StringBuilder sb = new StringBuilder();
        int N = 0;

        for (int i = 0, j = 0, dj = 1; i < H; ) {
            out.println(i + " " + j);
            if (a[i][j]) {
                lines[0] = lines[2] = i;
                lines[3] = j = (lines[1] = j) + dj;
                if (j == -1 || j == W) {
                    if ((lines[2] = ++i) == H - 1) break;
                    lines[3] = j = lines[1];
                    dj = -dj;
                }
                a[lines[2]][lines[3]] ^= a[lines[0]][lines[1]];
                for (int k = 0; k < 4; k++) {
                    sb.append(lines[k] + 1).append(' ');
                }
                sb.append('\n');
                N++;
            } else {
                j += dj;
                if (j == -1 || j == W) {
                    j -= dj;
                    dj = -dj;
                    if (++i == H) break;
                }
            }
        }
        
        out.println(N);
        out.println(sb);
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

    void back() {
        head--;
    }

    boolean minus() {
        boolean minus;
        while (true) {
            char c = next();
            if (!isDelimiter(c)) {
                if (!(minus = c == '-')) back();
                return minus;
            }
        }
    }

    void skip() {
        while (isDelimiter(next()));
        back();
    }

    char[] s(int N) {
        char[] cbuf = new char[N];
        read(cbuf, 0, N);
        return cbuf;
    }

    public int read(char[] cbuf, int off, int len) {
        skip();
        int i;
        for (i = 0; i < cbuf.length; i++) {
            char c = next();
            if (isDelimiter(c)) {
                break;
            }
            cbuf[i] = c;
        }
        return i;
    }

    boolean isDelimiter(char c) {
        return c == ' ' || c == '\n' || c == '\r';
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
