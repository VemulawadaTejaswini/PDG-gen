import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;


public class Main {
    public static Graph g;
    public static int[] nodeToEdge;
    public static int k = 0;
    public static Pair<Boolean, Integer>[] tour;
    public static void main(String[] args) {
        FastScanner fsc = new FastScanner();
        int n = fsc.nextInt();
        int q = fsc.nextInt();
        int[] a = new int[n - 1];
        int[] b = new int[n - 1];
        int[] c = new int[n - 1];
        int[] d = new int[n - 1];
        g = new Graph(n, n - 1);
        for (int i = 0; i < n - 1; i++) {
            a[i] = fsc.nextInt() - 1;
            b[i] = fsc.nextInt() - 1;
            c[i] = fsc.nextInt() - 1;
            d[i] = fsc.nextInt();
            g.addEdge(a[i], b[i], d[i]);
        }
        long[] dist = bfs();
        LowestCommonAncestor lca = new LowestCommonAncestor(g);
        nodeToEdge = new int[n];
        nodeToEdge[0] = -1;
        for (int i = 0; i < n - 1; i++) {
            if (lca.parent(a[i]) == b[i]) {
                nodeToEdge[a[i]] = i;
            } else {
                nodeToEdge[b[i]] = i;
            }
        }
        tour = new Pair[2 * (n - 1)];
        dfs(-1, 0);
        ArrayList<Pair<Integer, Integer>>[] sum = new ArrayList[n - 1];
        ArrayList<Pair<Integer, Integer>>[] num = new ArrayList[n - 1];
        for (int i = 0; i < n - 1; i++) {
            sum[i] = new ArrayList<>();
            sum[i].add(new Pair<>(-1, 0));
            num[i] = new ArrayList<>();
            num[i].add(new Pair<>(-1, 0));
        }
        int[] edgeToTourindex = new int[n - 1];
        for (int i = 0; i < 2 * (n - 1); i++) {
            int j = tour[i].val;
            Pair<Integer, Integer> ps = sum[c[j]].get(sum[c[j]].size() - 1);
            Pair<Integer, Integer> pn = num[c[j]].get(num[c[j]].size() - 1);
            if (tour[i].key) {
                sum[c[j]].add(new Pair<>(i, ps.val + d[j]));
                num[c[j]].add(new Pair<>(i, pn.val + 1));
                edgeToTourindex[j] = i;
            } else {
                sum[c[j]].add(new Pair<>(i, ps.val - d[j]));
                num[c[j]].add(new Pair<>(i, pn.val - 1));
            }
        }
        StringBuilder sb = new StringBuilder();
        while (q-- > 0) {
            int x = fsc.nextInt() - 1;
            long y = fsc.nextInt();
            int u = fsc.nextInt() - 1;
            int v = fsc.nextInt() - 1;
            int acs = lca.query(u, v);
            int l, r;
            int ui = nodeToEdge[u] >= 0 ? edgeToTourindex[nodeToEdge[u]] : -1;
            int vi = nodeToEdge[v] >= 0 ? edgeToTourindex[nodeToEdge[v]] : -1;
            int ai = nodeToEdge[acs] >= 0 ? edgeToTourindex[nodeToEdge[acs]] : -1;
            l = -1;
            r = sum[x].size();
            while (r - l > 1) {
                int m = l + (r - l) / 2;
                if (sum[x].get(m).key <= ui) {
                    l = m;
                } else {
                    r = m;
                }
            }
            long du = dist[u] + y * num[x].get(l).val - sum[x].get(l).val;

            l = -1;
            r = sum[x].size();
            while (r - l > 1) {
                int m = l + (r - l) / 2;
                if (sum[x].get(m).key <= vi) {
                    l = m;
                } else {
                    r = m;
                }
            }
            long dv = dist[v] + y * num[x].get(l).val - sum[x].get(l).val;

            l = -1;
            r = sum[x].size();
            while (r - l > 1) {
                int m = l + (r - l) / 2;
                if (sum[x].get(m).key <= ai) {
                    l = m;
                } else {
                    r = m;
                }
            }
            long da = dist[acs] + y * num[x].get(l).val - sum[x].get(l).val;
            long ans = du + dv - 2 * da;
            sb.append(ans).append('\n');
        }
        System.out.print(sb);
    }

    public static void dfs(int parent, int now) {
        if (now != 0) {
            tour[k++] = new Pair<>(true, nodeToEdge[now]);
        }
        for (Edge e : g.getEdges(now)) {
            if (e.to == parent) {
                continue;
            }
            dfs(e.from, e.to);
        }
        if (now != 0) {
            tour[k++] = new Pair<>(false, nodeToEdge[now]);
        }
    }

    public static long[] bfs() {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        long[] d = new long[g.getV()];
        Arrays.fill(d, -1);
        d[0] = 0;
        dq.add(0);
        while (dq.size() > 0) {
            int p = dq.pollFirst();
            for (Edge e : g.getEdges(p)) {
                if (d[e.to] < 0) {
                    d[e.to] = d[e.from] + e.cost;
                    dq.add(e.to);
                }
            }
        }
        return d;
    }
}


class Graph extends AbstractGraph {
    public Graph(int n, int m) {
        super(n, m);
    }

    public void addEdge(int from, int to, long cost) {
        Edge e = new Edge(from, to, cost);
        super.addEdge(e);
        super.addEdge(e.reverse());
    }

    public void addEdge(int from, int to) {
        this.addEdge(from, to, 1);
    }

    @Override
    public void addEdge(Edge e) {
        super.addEdge(e);
        super.addEdge(e.reverse());
    }

    @Override
    protected void generateComponentsIfAbsent() {
        if (Objects.isNull(getNullableComponents())) {
            HashMap<Integer, ArrayList<Integer>> components = new HashMap<>();
            for (int i = 0; i < n; i++) {
                if (!components.containsKey(getRoot(i))) {
                    ArrayList<Integer> component = new ArrayList<>();
                    component.add(i);
                    components.put(getRoot(i), component);
                } else {
                    components.get(getRoot(i)).add(i);
                }
            }
            setComponents(components);
        }
    }

    @Override
    public boolean isBipartite() {
        int[] color = new int[getV()];
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        for (int root : getRoots()) {
            dq.add(root);
            color[root] = 1;
        }
        while (dq.size() > 0) {
            int now = dq.pollFirst();
            for (Edge e : getEdges(now)) {
                int next = e.to;
                if (color[next] == 0) {
                    color[next] = -color[now];
                    dq.add(next);
                } else if (color[now] == color[next]) {
                    return false;
                }
            }
        }
        return true;
    }
}


class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        } else {
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }

    private int readByte() {
        if (hasNextByte()) {
            return buffer[ptr++];
        } else {
            return -1;
        }
    }

    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
            ptr++;
        }
        return hasNextByte();
    }

    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }

    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
            throw new NumberFormatException();
        }
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}


abstract class AbstractGraph {
    protected final int n;
    protected final int m;
    private ArrayList<Edge>[] adj;
    private int[] in;
    private HashMap<Integer, ArrayList<Integer>> components;
    private UnionFindTree uft;
    
    @SuppressWarnings("unchecked")
    protected AbstractGraph(int n, int m) {
        this.n = n;
        this.m = m;
        this.in = new int[n];
        this.adj = new ArrayList[this.n];
        for (int i = 0; i < this.n; i++) {
            this.adj[i] = new ArrayList<>();
        }
        this.uft = new UnionFindTree(this.n);
    }

    protected void addEdge(Edge e) {
        this.adj[e.from].add(e);
        this.in[e.to]++;
        this.uft.unite(e.from, e.to);
    }

    public int in(int i) {
        return this.in[i];
    }

    public int out(int i) {
        return this.adj[i].size();
    }

    public Edge getEdge(int from, int index) {
        return this.adj[from].get(index);
    }

    public ArrayList<Edge> getEdges(int i) {
        return this.adj[i];
    }

    public int getV() {
        return this.n;
    }

    public int getE() {
        return this.m;
    }

    public int getRoot(int i) {
        return uft.root(i);
    }

    public HashMap<Integer, ArrayList<Integer>> getComponents() {
        generateComponentsIfAbsent();
        return this.components;
    }

    protected void setComponents(HashMap<Integer, ArrayList<Integer>> components) {
        this.components = components;
    }

    protected HashMap<Integer, ArrayList<Integer>> getNullableComponents() {
        return this.components;
    }

    public ArrayList<Integer> getComponent(int i) {
        return getComponents().get(getRoot(i));
    }

    public Set<Integer> getRoots() {
        return getComponents().keySet();
    }

    public Collection<ArrayList<Integer>> getComponentSet() {
        return getComponents().values();
    }

    public boolean isConnected() {
        return getComponents().size() == 1;
    }

    public boolean isConnected(int u, int v) {
        return getRoot(u) == getRoot(v);
    }

    public boolean isTree() {
        return m == n - 1 && isConnected();
    }

    abstract public boolean isBipartite();

    abstract protected void generateComponentsIfAbsent();
}


class UnionFindTree {
    private int[] parent;
    private int[] rank;
    private int[] size;
    private int groups;

    public UnionFindTree(int n) {
        this.parent = new int[n];
        this.rank = new int[n];
        this.size = new int[n];
        this.groups = n;
        Arrays.fill(this.size, 1);
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    public int root(int x) {
        if (parent[x] == x) {
            return x;
        }
        return parent[x] = root(parent[x]);
    }

    public boolean isSame(int x, int y) {
        return root(x) == root(y);
    }

    public void unite(int x, int y) {
        int xr = root(x);
        int yr = root(y);
        if (xr == yr) {
            return;
        }
        if (rank[xr] < rank[yr]) {
            parent[xr] = yr;
            size[yr] += size[xr];
        } else {
            parent[yr] = xr;
            size[xr] += size[yr];
            if (rank[xr] == rank[yr]) {
                rank[xr]++;
            }
        }
        groups--;
    }

    public int size(int x) {
        return size[root(x)];
    }

    public boolean isRoot(int x) {
        return parent[x] == x;
    }

    public int groups() {
        return groups;
    }
}


class LowestCommonAncestor {
    private int n;
    private int m;
    private int[][] parent;
    private int[] level;
    private int root;

    public LowestCommonAncestor(AbstractGraph g, int root) {
        this.n = g.getV();
        this.root = root;
        bfs(g);
        buildParent();
    }

    public LowestCommonAncestor(AbstractGraph g) {
        this(g, 0);
    }

    private void bfs(AbstractGraph g) {
        int[] par0 = new int[n];
        this.level = new int[n];
        Arrays.fill(level, -1);
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        this.level[this.root] = 0;
        dq.add(this.root);
        int maxlevel = 0;
        while (dq.size() > 0) {
            int p = dq.pollFirst();
            for (Edge e : g.getEdges(p)) {
                int c = e.to;
                if (this.level[c] < 0) {
                    this.level[c] = this.level[p] + 1;
                    par0[c] = p;
                    maxlevel = Math.max(maxlevel, level[c]);
                    dq.add(c);
                }
            }
        }
        this.m = MathUtil.floorExponent(maxlevel);
        this.parent = new int[m + 1][n];
        this.parent[0] = par0;
    }

    private void buildParent() {
        for (int l = 1; l <= this.m; l++) {
            for (int i = 0; i < n; i++) {
                this.parent[l][i] = this.parent[l - 1][this.parent[l - 1][i]];
            }
        }
    }

    public int query(int u, int v) {
        if (level[u] > level[v]) {
            return query(v, u);
        }
        int d = level[v] - level[u];
        for (int i = 0; level[v] != level[u] && i <= this.m; i++) {
            if ((d & (1 << i)) != 0) {
                v = parent[i][v];
            }
        }
        for (int i = m; u != v && i >= 0; i--) {
            if (parent[i][u] != parent[i][v]) {
                u = parent[i][u];
                v = parent[i][v];
            }
        }
        return parent[0][u];
    }

    public int parent(int i) {
        return i == root ? -1 : parent[0][i];
    }
}


class Pair<K, V> {
    public K key;
    public V val;

    public Pair(K key, V val) {
        this.key = key;
        this.val = val;
    }

    @Override @SuppressWarnings("all")
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof Pair)) {
            return false;
        } else {
            Pair p = (Pair) o;
            return this.key.equals(p.key) && this.val.equals(p.val);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.key, this.val);
    }

    @Override
    public String toString() {
        return "(" + this.key.toString() + ", " + this.val.toString() + ")";
    }
}


class MathUtil{

    private MathUtil(){}
    
    /**
     * Enumarate primes equal to or less than n.
     * @param n
     * @return {@code ArrayList} that holds primes.
     */
    public static ArrayList<Integer> eratosthenes(int n) {
        int[] div = eratosthenesDivisors(n);
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 2; i <= n; i++) if (div[i] == i) result.add(i);
        return result;
    }
    /**
     * execute eratosthenes's prime-enumerate algorithm. a[i] holds the greatest
     * divisor of i. if a[i] = i, i is a prime number. This arrary enables you to
     * prime-factorize in O(log n) time.
     * @param n
     * @return divisor array.
     */
    public static int[] eratosthenesDivisors(int n) {
        int[] divisors = new int[n + 1];
        if (n <= 0) return null;
        for (int i = 1; i <= n; i++) {
            if ((i & 1) != 0) divisors[i] = i;
            else divisors[i] = 2;
        }
        for (int i = 3; i <= n; i += 2) {
            if (divisors[i] == i) {
                for (long j = (long) i * i; j <= n; j += i << 1) {
                    divisors[(int) j] = i;
                }
            }
        }
        return divisors;
    }

    /**
     * Caluculate prime-factorization in O(sqrt(n)) time.
     * @param n
     * @return {@code HashMap} of {prime: index}
     */
    public static HashMap<Long, Integer> primeFactorization(long n) {
        HashMap<Long, Integer> primes = new HashMap<>();
        for (long p = 2; p * p <= n; p++) {
            int q = 0;
            while (n % p == 0) {
                n /= p;
                q++;
            }
            if (q > 0) primes.put(p, q);
        }
        if (n > 1) primes.put(n, 1);
        return primes;
    }

    private static HashMap<Long, Integer> lcm(HashMap<Long, Integer> amap, HashMap<Long, Integer> bmap) {
        if (amap.size() < bmap.size()) return lcm(bmap, amap);
        HashMap<Long, Integer> lcm = amap;
        for (Map.Entry<Long, Integer> e : bmap.entrySet()) {
            long prime = e.getKey();
            if (lcm.containsKey(prime)) lcm.put(prime, Math.max(lcm.get(prime), e.getValue()));
            else lcm.put(prime, e.getValue());
        }
        return lcm;
    }
    private static HashMap<Long, Integer> lcm(HashMap<Long, Integer> amap, long b) {
        HashMap<Long, Integer> bmap = primeFactorization(b);
        return lcm(amap, bmap);
    }
    public static HashMap<Long, Integer> lcm(long... a) {
        HashMap<Long, Integer> amap = new HashMap<>();
        for (long c : a) amap = lcm(amap, c);
        return amap;
    }

    /**
     * calculate lcm(a, b) fast. (NOT considering overflow.)
     */
    public static long unsafeLCM(long a, long b) {
        return a * b / gcd(a, b);
    }

    /**
     * Caluculate the GCD of (a, b)/
     * 
     * @param a first value
     * @param b second value
     * @return GCD(a, b)
     */
    public static long gcd(long a, long b) {
        if (a < b) return gcd(b, a);
        if (b == 0) return a;
        if (a == 0) return b;
        long r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }
    public static long gcd(long... a){
        long gcd = 0;
        for (long c : a) gcd = gcd(gcd, c);
        return gcd;
    }
    /**
     * Return one of the solutions to {@code ax+by=gcd(a, b)}.
     * @return {@code x}, {@code y}, {@code gcd(a, b)}.
     * @param a a of ax+by=gcd(a, b).
     * @param b b of ax+by=gcd(a, b). class ReferenceLong is a reference type of long.
     */
    public static long[] extGCD(long a, long b) {
        ReferenceLong x = new ReferenceLong();
        ReferenceLong y = new ReferenceLong();
        long[] ret = new long[3];
        ret[2] = extGCD(a, b, x, y);
        ret[0] = x.v;
        ret[1] = y.v;
        return ret;
    }
    private static long extGCD(long a, long b, ReferenceLong x, ReferenceLong y) {
        if (b == 0) {
            x.v = 1;
            y.v = 0;
            return a;
        }
        long d = extGCD(b, a % b, y, x);
        y.v -= a / b * x.v;
        return d;
    }
    private static class ReferenceLong {
        long v = 0;
    }

    public static boolean isPowerOfTwo(long n) {
        return (-n & n) == n;
    }

    public static int ceilExponent(long n) {
        return 63 - Long.numberOfLeadingZeros(n) + (isPowerOfTwo(n) ? 0 : 1);
    }

    public static int floorExponent(long n) {
        return 63 - Long.numberOfLeadingZeros(n);
    }

    public static int ceilExponent(int n) {
        return 31 - Integer.numberOfLeadingZeros(n) + (isPowerOfTwo(n) ? 0 : 1);
    }

    public static int fllorExponent(int n) {
        return 31 - Integer.numberOfLeadingZeros(n);
    }
    
    public static int ceilExponent(long n, int base) {
        if (base == 2) {
            return ceilExponent(n);
        }
        int i = 0;
        long m = 1;
        while (m < n) {
            i++;
            long r = m * base;
            if ((m | base) >> 31 != 0 && r / base != m) {
                break;
            }
            m = r;
        }
        return i;
    }
    
    /**
     * caluculate a ^ b NOT considering overflow.
     * so if you want to calculate a ^ b (mod p), use ModUtil.pow(a, b).
     * @param a base
     * @param b exponent
     * @return a ^ b
     */
    public static long pow(int a, int b) {
        if (b == 0) return 1;
        long half = pow(a, b >> 1);
        return half * half * ((b & 1) != 0 ? a : 1);
    }

    /**
     * Caluculate the combination nCr NOT considering overflow.
     * 
     * @param n left
     * @param r right
     * @return nCr
     */
    public static long comb(long n, long r) {
        if (n < r) return 0;
        r = Math.min(r, n - r);
        long res = 1;
        for (long d = 1; d <= r; d++, n--) res *= n / d;
        return res;
    }
}

class Edge {
    public int from;
    public int to;
    public long cost;

    public Edge(int from, int to, long cost) {
        this.from = from;
        this.to = to;
        this.cost = cost;
    }

    public Edge(int from, int to) {
        this(from, to, 1);
    }

    protected Edge reverse() {
        return new Edge(to, from, cost);
    }
}
