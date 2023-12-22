import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main {
    static MyReader in = new MyReader();

    public static void main(String[] args) {
        int N = in.i();
        int xl = Integer.MAX_VALUE;
        int xr = 1;
        int yb = xl;
        int yt = 1;
        int[] x = new int[N];
        int[] y = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = in.i();
            y[i] = in.i();
            if (x[i] < xl) {
                xl = x[i];
            }
            if (xr < x[i]) {
                xr = x[i];
            }
            if (y[i] < yb) {
                yb = y[i];
            }
            if (yt < y[i]) {
                yt = y[i];
            }
        }

        ArrayList<int[]> list = new ArrayList<>();

        int x0 = xr;
        int x1 = xl;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (y[i] == yb) {
                cnt++;
                if (x[i] < x0) {
                    x0 = x[i];
                }
                if (x1 < x[i]) {
                    x1 = x[i];
                }
            }
        }
        if (cnt == 1) {
            list.add(new int[]{x0, yb});
        } else {
            list.add(new int[]{x0, yb});
            list.add(new int[]{x1, yb});
        }

        cnt = 0;
        x0 = xr;
        x1 = xl;
        for (int i = 0; i < N; i++) {
            if (y[i] == yt) {
                cnt++;
                if (x[i] < x0) {
                    x0 = x[i];
                }
                if (x1 < x[i]) {
                    x1 = x[i];
                }
            }
        }
        if (cnt == 1) {
            list.add(new int[]{x0, yt});
        } else {
        list.add(new int[]{x0, yt});
        list.add(new int[]{x1, yt});
        }

        int y0 = yt;
        int y1 = yb;
        cnt = 0;
        for (int i = 0; i < N; i++) {
            if (x[i] == xl) {
                cnt++;
                if (y[i] < y0) {
                    y0 = y[i];
                }
                if (y1 < y[i]) {
                    y1 = y[i];
                }
            }
        }
        if (cnt == 1) {
            list.add(new int[]{xl, y0});
        } else {

        list.add(new int[]{xl, y0});
        list.add(new int[]{xl, y1});
    }

        y0 = yt;
        y1 = yb;
        cnt = 0;
        for (int i = 0; i < N; i++) {
            if (x[i] == xr) {
                cnt++;
                if (y[i] < y0) {
                    y0 = y[i];
                }
                if (y1 < y[i]) {
                    y1 = y[i];
                }
            }
        }
        if (cnt == 1) {
            list.add(new int[]{xr, y0});
        } else {
            list.add(new int[]{xr, y0});
            list.add(new int[]{xr, y1});
        }

        int max = 0;
        int n = list.size();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int[] pi = list.get(i);
                int[] pj = list.get(j);
                int xi = pi[0];
                int yi = pi[1];
                int xj = pj[0];
                int yj = pj[1];
                int d = Math.abs(xi - xj) + Math.abs(yi - yj);
                if (max < d) {
                    max = d;
                }
            }
        }
        out.println(max);
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
