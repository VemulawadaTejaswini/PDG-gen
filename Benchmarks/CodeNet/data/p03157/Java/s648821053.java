import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main {
    static MyReader in = new MyReader();

    public static void main(String[] args) {
        int H = in.i();
        int W = in.i();
        char[][] S = new char[H][];
        for (int i = 0; i < H; i++) {
            S[i] = in.s(W);
        }

        int[] dp = new int[H * W];
        UnionFind uf = new UnionFind(H * W);
        IntStack stack = new IntStack(H * W);
        boolean[][] visited = new boolean[H][W];
        int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        long ans = 0;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (S[i][j] == '.') continue;

                int code = i * W + j;
                if (!uf.isRoot(code)) {
                    ans += dp[uf.root(code)];
                    continue;
                }

                stack.push(code);
                visited[i][j] = true;
                while (!stack.isEmpty()) {
                    int hw = stack.pop();
                    int h = hw / W;
                    int w = hw % W;
                    for (int k = 0; k < 4; k++) {
                        int h2 = h + dir[k][0];
                        int w2 = w + dir[k][1];

                        if (0 <= h2 && h2 < H && 0 <= w2 && w2 < W && S[h][w] != S[h2][w2] && !visited[h2][w2]) {
                            int code2 = h2 * W + w2;
                            stack.push(code2);
                            if (S[h2][w2] == '.') {
                                dp[code]++;
                            } else {
                                uf.unite(code, code2);
                            }
                            visited[h2][w2] = true;
                        }
                    }
                }
                ans += dp[code];
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

class IntStack {
    final int MAX;
    int[] array;
    int head = 0;

    IntStack(int N) {
        MAX = N;
        array = new int[N];
    }

    void push(int n) {
        array[head++] = n;
    }

     int pop() {
        return array[--head];
    }

    boolean isEmpty() {
        return head == 0;
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
