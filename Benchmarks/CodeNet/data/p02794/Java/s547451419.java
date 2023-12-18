import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {

    private static final int MOD = (int)1e9 + 7; //998244353;
    private static final long INF = (long)1e15;

    private List<Integer>[] adj;
    private int[] pre;
    private int[] A, B;

    public Main(FastScanner in, PrintWriter out) {
        int N = in.nextInt();

        adj = new List[N];
        for (int i = 0; i < N; i++)
            adj[i] = new ArrayList<>();

        for (int i = 1; i < N; i++) {
            int u = in.nextInt() - 1;
            int v = in.nextInt() - 1;
            adj[u].add(v);
            adj[v].add(u);
        }

        pre = new int[N];
        dfs(0, -1);

        int M = in.nextInt();
        A = new int[M];
        B = new int[M];
        for (int i = 0; i < M; i++) {
            A[i] = in.nextInt() - 1;
            B[i] = in.nextInt() - 1;
        }

        long ans = 1L << (N - 1);
        LCA lca = new LCA(N, adj);
        for (int i = 1; i < 1 << M; i++) {
            boolean[] marked = new boolean[N];
            for (int j = 0; j < M; j++) if (((1 << j) & i) != 0) {
                int a = A[j], b = B[j];
                int p = lca.query(a, b);
                while (a != p) {
                    marked[a] = true;
                    a = pre[a];
                }
                while (b != p) {
                    marked[b] = true;
                    b = pre[b];
                }
            }
            int cnt = 0;
            for (int j = 1; j < N; j++) if (!marked[j]) {
                cnt++;
            }
            long cur = 1L << cnt;
            // inclusion/exclusion principle
            if (Integer.bitCount(i) % 2 == 1) ans -= cur;
            else ans += cur;
        }
        out.println(ans);
    }

    private void dfs(int u, int p) {
        pre[u] = p;
        for (int v : adj[u]) {
            if (v == p) continue;
            dfs(v, u);
        }
    }

    private int gcd(int a, int b) {
        while (true) {
            if (b == 0) return a;
            int tmp = a;
            a = b;
            b = tmp % b;
        }
    }

    private long gcd(long a, long b) {
        while (true) {
            if (b == 0) return a;
            long tmp = a;
            a = b;
            b = tmp % b;
        }
    }

    private long powm(long x, long p) {
        long res = 1;
        while (p > 0) {
            if (p % 2 == 1)
                res = res * x % MOD;
            x = x * x % MOD;
            p /= 2;
        }
        return res;
    }

    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        // Scanner in = new Scanner(
                // new BufferedReader(new InputStreamReader(System.in)));
        FastScanner in = new FastScanner(System.in);

        Main sol = new Main(in, out);
        out.close();
    }
}

class LCA {
    private int D;
    private int[] depth;
    private int[][] par;

    public LCA(int n, List<Integer>[] adj) {
        D = Integer.numberOfTrailingZeros(Integer.highestOneBit(n));
        par = new int[D + 1][n];
        for (int[] pp : par)
            Arrays.fill(pp, -1);

        depth = new int[n];

        boolean[] seen = new boolean[n];
        Queue<Integer> q = new ArrayDeque<>();
        seen[0] = true;
        q.add(0);

        while (!q.isEmpty()) {
            int u = q.remove();
            for (int v : adj[u]) {
                if (seen[v]) continue;
                q.add(v);
                seen[v] = true;
                depth[v] = depth[u] + 1;
                par[0][v] = u;
            }
        }

        for (int d = 1; d <= D; d++) {
            for (int i = 0; i < n; i++) {
                int mid = par[d - 1][i];
                if (mid >= 0)
                    par[d][i] = par[d - 1][mid];
            }
        }
    }

    private int walk(int u, int k) {
        for (int d = 0; d <= D; d++) if (((1 << d) & k) != 0) {
            u = par[d][u];
        }
        return u;
    }

    public int query(int u, int v) {
        if (depth[u] < depth[v])
            v = walk(v, depth[v] - depth[u]);
        else if (depth[u] > depth[v])
            u = walk(u, depth[u] - depth[v]);
        if (u == v)
            return u;
        // find u, v such that par[0][u] == par[0][v]
        for (int d = D; d >= 0; d--) {
            // if par[d][u] == par[d][v], the jump is too big
            if (par[d][u] != par[d][v]) {
                u = par[d][u];
                v = par[d][v];
            }
        }
        return par[0][u];
    }
}

// Pair
class Pair<T extends Comparable<? super T>, U extends Comparable<? super U>> implements Comparable<Pair<T, U>> {
    T a;
    U b;
    Pair() { }
    Pair(T a, U b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() { return "("+a.toString()+", "+b.toString()+")"; }

    @Override
    public int hashCode() { return Objects.hash(a, b); }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(this.getClass() != obj.getClass()) return false;
        Pair that = (Pair) obj;
        if(this.a.getClass() != that.a.getClass()) return false;
        if(this.b.getClass() != that.b.getClass()) return false;
        if(!this.a.equals(that.a)) return false;
        if(!this.b.equals(that.b)) return false;
        return true;
    }

    @Override
    public int compareTo(Pair<T, U> that) {
        int c = (this.a).compareTo(that.a);
        if(c == 0) c = (this.b).compareTo(that.b);
        return c;
    }
}


class FastScanner{
    private InputStream stream;
    private byte[] buf = new byte[1024];
    private int curChar;
    private int numChars;

    public FastScanner(InputStream stream)
    {
        this.stream = stream;
    }

    int read()
    {
        if (numChars == -1)
            throw new InputMismatchException();
        if (curChar >= numChars){
            curChar = 0;
            try{
                numChars = stream.read(buf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (numChars <= 0)
                return -1;
        }
        return buf[curChar++];
    }

    boolean isSpaceChar(int c)
    {
        return c==' '||c=='\n'||c=='\r'||c=='\t'||c==-1;
    }

    boolean isEndline(int c)
    {
        return c=='\n'||c=='\r'||c==-1;
    }

    int nextInt()
    {
        return Integer.parseInt(next());
    }

    long nextLong()
    {
        return Long.parseLong(next());
    }

    double nextDouble()
    {
        return Double.parseDouble(next());
    }

    String next(){
        int c = read();
        while (isSpaceChar(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do{
            res.appendCodePoint(c);
            c = read();
        }while(!isSpaceChar(c));
        return res.toString();
    }

    String nextLine(){
        int c = read();
        while (isEndline(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do{
            res.appendCodePoint(c);
            c = read();
        }while(!isEndline(c));
        return res.toString();
    }
}
