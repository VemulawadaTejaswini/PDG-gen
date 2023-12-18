import java.util.*;
import java.io.*;

// Template for atcoder
public class Main {

    BufferedReader br;
    PrintWriter out;
    StringTokenizer st;
    boolean eof;
    final long MOD = 1000L * 1000L * 1000L + 7;
    private static final int[] dx = {0, -1, 0, 1};
    private static final int[] dy = {1, 0, -1, 0};

    Line[] tree;
    static final int QUERY_LIMIT = 1000 * 1000 + 10;
    void solve() throws IOException {
        tree = new Line[4 * QUERY_LIMIT];
        for (int i = 0; i < tree.length; i++) {
            tree[i] = new Line(0, MOD * MOD);
        }
        int n = nextInt();
        long C = nextLong();
        long[] arr = nextLongArr(n);
        long[] dp = new long[n];
        insert(0, QUERY_LIMIT - 1, new Line(-2 * arr[0], arr[0] * arr[0]), 1);
        for (int i = 1; i < n; i++) {
            long q = query(0, QUERY_LIMIT - 1, (int) arr[i], 1);
            q += arr[i] * arr[i] + C;
            dp[i] = q;
            insert(0, QUERY_LIMIT - 1, new Line(-2 * arr[i], arr[i] * arr[i] + dp[i]), 1);
        }

        outln(dp[n - 1]);
    }

    class Line {
        long m;
        long b;
        public Line(long m, long b) {
            this.m = m;
            this.b = b;
        }
        public long get(long x) {
            return m * x + b;
        }

        @Override
        public String toString() {
            return m + " " + b;
        }
    }

    void insert(int leftBound, int rightBound, Line seg, int nodeIdx) {
        if(leftBound == rightBound) {
            if(tree[nodeIdx].get(leftBound) > seg.get(leftBound)) {
                tree[nodeIdx].m = seg.m;
                tree[nodeIdx].b = seg.b;
            }
            return;
        }
        int mid = (leftBound + rightBound) >> 1;
        // [l, mid] [mid + 1, r]
        int lson = nodeIdx * 2, rson = nodeIdx * 2 + 1;
        if(tree[nodeIdx].m > seg.m) {
            swap(tree[nodeIdx], seg);
        }
        if(tree[nodeIdx].get(mid) <= seg.get(mid)) {
            insert(leftBound, mid, seg, lson);
        } else {
            swap(tree[nodeIdx], seg);
            insert(mid + 1, rightBound, seg, rson);
        }
    }

    long query(int leftBound, int rightBound, int x, int nodeIdx) {
        if(leftBound == rightBound) {
            return tree[nodeIdx].get(x);
        }

        int mid = (leftBound + rightBound) >> 1;
        int lson = nodeIdx * 2, rson = nodeIdx * 2 + 1;
        // [l, mid] [mid + 1, r]
        if(x <= mid) {
            return Math.min(tree[nodeIdx].get(x), query(leftBound, mid, x, lson));
        } else {
            return Math.min(tree[nodeIdx].get(x), query(mid + 1, rightBound, x, rson));
        }
    }

    void swap(Line left, Line right) {
        long tmpM = left.m;
        long tmpB = left.b;
        left.m = right.m;
        left.b = right.b;
        right.m = tmpM;
        right.b = tmpB;
    }

    void shuffle(int[] a) {
        int n = a.length;
        for(int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n - i));
            int tmp = a[i];
            a[i] = a[r];
            a[r] = tmp;
        }
    }
    private void outln(Object o) {
        out.println(o);
    }
    private void out(Object o) {
        out.print(o);
    }
    public Main() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        solve();
        out.close();
    }
    public static void main(String[] args) throws IOException {
        new Main();
    }

    public long[] nextLongArr(int n) throws IOException{
        long[] res = new long[n];
        for(int i = 0; i < n; i++)
            res[i] = nextLong();
        return res;
    }
    public int[] nextIntArr(int n) throws IOException {
        int[] res = new int[n];
        for(int i = 0; i < n; i++)
            res[i] = nextInt();
        return res;
    }
    public String nextToken() {
        while (st == null || !st.hasMoreTokens()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (Exception e) {
                eof = true;
                return null;
            }
        }
        return st.nextToken();
    }
    public String nextString() {
        try {
            return br.readLine();
        } catch (IOException e) {
            eof = true;
            return null;
        }
    }
    public int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }
    public long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }
    public double nextDouble() throws IOException {
        return Double.parseDouble(nextToken());
    }
}
