import java.io.*;
import java.util.*;

public class Main {
    static MyReader in = new MyReader();

    public static void main(String[] args) {
        int H = in.i();
        int W = in.i();
        char[][] s = new char[H + 2][W + 2];
        int white = 0;

        Arrays.fill(s[0], '#');
        for (int i = 1; i <= H; i++) {
            char[] row = s[i];
            row[0] = '#';
            in.read(row, 1);
            for (int j = 1; j <= W; j++) {
                if (row[j] == '.') {
                    white++;
                }
            }
            row[W + 1] = '#';
            s[i] = row;
        }
        Arrays.fill(s[H + 1], '#');

        int[] d = new int[(H << 6) + W + 1];
        Arrays.fill(d, Integer.MAX_VALUE);

        IntQueue q = new IntQueue(H * W);

        int start = (1 << 6) + 1;
        int goal = (H << 6) + W;

        d[start] = 0;
        q.push(start);

        boolean[] used = new boolean[(H << 6) + W + 1];
        int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        while (!q.isEmpty()) {
            int u = q.pop();
            if (used[u]) continue;
            used[u] = true;
            int i = u >> 6;
            int j = u & (1 << 6) - 1;
            for (int k = 0; k < dir.length; k++) {
                int i2 = i + dir[k][0];
                int j2 = j + dir[k][1];
                int v = (i2 << 6) + j2;
                if (s[i2][j2] == '.' && d[v] - d[u] > 1) {
                    d[v] = d[u] + 1;
                    q.push(v);
                }
            }
        }
        int ans = used[goal] ? white - d[goal] - 1 : -1;

        System.out.println(ans);
    }
}

class IntQueue {
    final int MAX;
    int[] array;
    int head = 0;
    int tail = 0;
    int count = 0;

    IntQueue(int N) {
        MAX = N;
        array = new int[N];
    }

    void push(int n) {
        array[tail] = n;
        if (++tail == MAX) tail = 0;
        count++;
    }

     int pop() {
        int n = array[head];
        if (++head == MAX) head = 0;
        count--;
        return n;
    }

    boolean isEmpty() {
        return count == 0;
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

    public int read(char[] cbuf, int off) {
        int i;
        char c;
        for (i = off; (c = next()) != ' ' && c != '\n'; i++) cbuf[i] = c;
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
