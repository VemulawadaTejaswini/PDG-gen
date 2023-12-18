import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main {
    static MyReader in = new MyReader();

    public static void main(String[] args) {
        int N = in.i();
        int M = in.i();
        int[][] edge = new int[M][];
        for (int i = 0; i < M; i++) {
            edge[i] = new int[]{in.i() - 1, in.i() - 1};
        }
        int ans = 0;
        for (int i = 0; i < M; i++) {
            UnionFind uf = new UnionFind(N);
            for (int j = 0; j < M; j++) {
                if (i == j) continue;
                uf.unite(edge[j][0], edge[j][1]);
            }
            if (uf.size(0) < N) {
                ans++;
            }
        }
        out.println(ans);
    }
}

class UnionFind {
    private final int N;
    int[] parent;
    int[] rank;
    int[] size;

    UnionFind(int n) {
        N = n;
        parent = new int[N];
        Arrays.setAll(parent, i -> i);
        size = new int[N];
        Arrays.fill(size, 1);
        rank = new int[N];
    }

    boolean isRoot(int x) {
        return x == parent[x];
    }

    int root(int x) {
        return isRoot(x) ? x : (parent[x] = root(parent[x]));
    }

    boolean same(int x, int y){
        return root(x) == root(y);
    }

    int size(int x) {
        return size[root(x)];
    }

    void unite(int x, int y){
        x = root(x);
        y = root(y);
        if (x != y) {
            if (rank[x] < rank[y]) {
                parent[x] = y;
                size[y] += size[x];
            } else {
                parent[y] = x;
                size[x] += size[y];
                if (rank[x] == rank[y]) {
                    rank[x]++;
                }
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

    String s() {
        try {
            return readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
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
