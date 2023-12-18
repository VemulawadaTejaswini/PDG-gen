// template for atcode
import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {

    private static final int MOD = (int)1e9 + 7; //998244353;
    // private static final long INF = (long)1e17;
    private static final int INF = (int)1e9;

    int N;
    List<Integer>[] adj;
    Set<Integer> cycle;
    int[] pre, marked;

    public Main(FastScanner in, PrintWriter out) {
        N = in.nextInt();
        int M = in.nextInt();
        adj = new List[N];
        for (int i = 0; i < N; i++)
            adj[i] = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            int a = in.nextInt() - 1;
            int b = in.nextInt() - 1;
            adj[a].add(b);
        }

        pre = new int[N];
        marked = new int[N];
        Arrays.fill(pre, -1);
        for (int i = 0; i < N; i++) {
            if (marked[i] == 0) {
                findCycle(adj, i);
                if (cycle != null) break;
            }
        }
        if (cycle == null) {
            out.println(-1);
            return;
        }
        // out.println("initial: " + cycle.toString() + Arrays.toString(pre));
        while (true) {
            for (int u = 0; u < N; u++) {
                if (!cycle.contains(u)) continue;
                List<Integer> keep = new ArrayList<>();
                for (int v : adj[u]) {
                    if (cycle.contains(v))
                        keep.add(v);
                }
                adj[u] = keep;
            }
            // out.println("new cycle");
            // for (int u = 0; u < N; u++) {
                // out.println(adj[u]);
            // }

            int st = -1, end = -1;
            for (int u : cycle) {
                for (int v : adj[u]) {
                    if (pre[v] != u) {
                        st = v;
                        end = u;
                        break;
                    }
                }
                if (st >= 0) break;
            }
            if (st == -1) break;

            // out.printf("before bfs: %d,%d,%s,%s%n",u, v, Arrays.toString(pre), cycle);
            // walk from v to u, keep all nodes on the path
            pre[st] = end;
            Arrays.fill(marked, 0);
            Queue<Integer> q = new ArrayDeque<>();
            q.offer(st);
            marked[st] = 1;
            while (!q.isEmpty()) {
                int v = q.remove();
                if (v == end) break;
                for (int w : adj[v]) {
                    if (marked[w] == 0) {
                        marked[w] = 1;
                        pre[w] = v;
                        q.add(w);
                    }
                }
            }
            cycle = new HashSet<>();
            for (int x = end; x != st; x = pre[x])
                cycle.add(x);
            cycle.add(st);
            // out.println(Arrays.toString(pre) + cycle);
        }

        // out.println("out of the loop");
        // out.println(Arrays.toString(pre));
        Iterator<Integer> it = cycle.iterator();
        int v = it.next();
        Deque<Integer> path = new ArrayDeque<>();
        for (int u = pre[v]; u != v; u = pre[u]) {
            path.push(u);
        }
        path.push(v);
        out.println(path.size());
        for (int u : path)
            out.println(u + 1);
    }

    private void findCycle(List<Integer>[] adj, int v) {
        marked[v] = 1;
        for (int w : adj[v]) {
            if (cycle != null)
                return;
            if (marked[w] == 0) {
                pre[w] = v;
                findCycle(adj, w);
            } else if (marked[w] == 1) {
                cycle = new HashSet<>();
                for (int x = v; x != w; x = pre[x])
                    cycle.add(x);
                cycle.add(w);
                pre[w] = v;
            }
        }
        marked[v] = 2;
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
