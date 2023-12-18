import java.io.*;
import java.util.*;

public class Main {
    static MyReader in = new MyReader();

    static int[] a = new int[4];
    static boolean[] used =new boolean[4];
    static boolean[][] edge = new boolean[4][4];

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            int a = in.i() - 1;
            int b = in.i() - 1;
            edge[a][b] = edge[b][a] = true;
        }
        System.out.println(dfs(0, new int[4], new boolean[4]) ? "YES" : "NO");
    }

    static boolean dfs(int k, int[] a, boolean[] used) {
        if (k == 4) {
            int u = a[0];
            for (int i = 1; i < 4; i++) {
                int v = a[i];
                if (!edge[u][v]) return false;
                u = v;
            }
            return true;
        } else {
            for (int i = 0; i < 4; i++) {
                if (!used[i]) {
                    used[i] = true;
                    a[k] = i;
                    if (dfs(k + 1, a, used)) return true;
                    used[i] = false;
                }
            }
        }
        return false;
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
