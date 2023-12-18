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
import java.util.function.IntBinaryOperator;


@SuppressWarnings("unchecked")
public class Main {
    public static void main(String[] args) {
        FastScanner fsc = new FastScanner();
        int n = fsc.nextInt();
        int q = fsc.nextInt();
        int[] ea = new int[n - 1];
        int[] eb = new int[n - 1];
        int[] ec = new int[n - 1];
        int[] ed = new int[n - 1];
        Tree t = new Tree(n);
        for (int i = 0; i < n - 1; i++) {
            ea[i] = fsc.nextInt() - 1;
            eb[i] = fsc.nextInt() - 1;
            ec[i] = fsc.nextInt() - 1;
            ed[i] = fsc.nextInt();
            t.addEdge(ea[i], eb[i], ed[i]);
        }
        int[] c = new int[n];
        int[] d = new int[n];
        for (int i = 0; i < n - 1; i++) {
            if (t.parent(ea[i]) == eb[i]) {
                c[ea[i]] = ec[i];
                d[ea[i]] = ed[i];
            } else {
                c[eb[i]] = ec[i];
                d[eb[i]] = ed[i];
            }
        }
        LowestCommonAncestor lca = new LowestCommonAncestor(t);
        EdgeEulerTour eet = new EdgeEulerTour(t);
        ArrayList<Pair3<Integer, Integer, Integer>>[] sn = new ArrayList[n - 1];
        for (int i = 0; i < n - 1; i++) {
            sn[i] = new ArrayList<>();
            sn[i].add(new Pair3<>(0, 0, 0));
        }
        for (int i = 1; i < 2 * n - 1; i++) {
            int v = eet.tour[i];
            Pair3<Integer, Integer, Integer> pp = sn[c[v]].get(sn[c[v]].size() - 1);
            int sign = eet.down[v] == i ? 1 : -1;
            sn[c[v]].add(new Pair3<>(i, pp.val1 + d[v] * sign, pp.val2 + sign));
        }
        StringBuilder sb = new StringBuilder();
        while (q-- > 0) {
            int x = fsc.nextInt() - 1;
            int y = fsc.nextInt();
            int u = fsc.nextInt() - 1;
            int v = fsc.nextInt() - 1;
            int a = lca.query(u, v);
            int lu = bs(sn[x], eet.down[u]);
            long du = t.distance(u) + y * sn[x].get(lu).val2 - sn[x].get(lu).val1;
            int lv = bs(sn[x], eet.down[v]);
            long dv = t.distance(v) + y * sn[x].get(lv).val2 - sn[x].get(lv).val1;
            int la = bs(sn[x], eet.down[a]);
            long da = t.distance(a) + y * sn[x].get(la).val2 - sn[x].get(la).val1;
            sb.append(du + dv - 2 * da).append('\n');
        }
        System.out.print(sb);
    }

    public static int bs(ArrayList<Pair3<Integer, Integer, Integer>> list, int ti) {
        int l = 0;
        int r = list.size();
        while (r - l > 1) {
            int m = l + (r - l) / 2;
            if (list.get(m).key <= ti) {
                l = m;
            } else {
                r = m;
            }
        }
        return l;
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


class IntUtil {

    private IntUtil(){}
    
    public static int min(int... a) {
        int ret = Const.IINF;
        for (int c : a) ret = Math.min(ret, c);
        return ret;
    }

    public static int max(int... a) {
        int ret = -Const.IINF;
        for (int c : a) ret = Math.max(ret, c);
        return ret;
    }

    /**
     * Caluculate the ceil of a/b. Returns the smallest integer greater than or
     * equal to a/b while 'a/b' rounds fractional parts to ZERO.
     * 
     * @param a
     * @param b
     * @return the smallest integer greater than or equal to a/b
     */
    public static int cld(int a, int b) {
        if (a > 0 && b > 0) return (a + b - 1) / b;
        else if (a < 0 && b < 0) return (a + b + 1) / b;
        else return a / b;
    }

    /**
     * Caluculate the floor of a/b. Returns the largest integer less than or equal
     * to a/b while 'a/b' rounds fractional parts to ZERO.
     * 
     * @param a
     * @param b
     * @return the largest integer less than or equal to a/b
     */
    public static int fld(int a, int b) {
        if (a <= 0 && b > 0) return (a - b + 1) / b;
        else if (a > 0 && b <= 0) return (a - b - 1) / b;
        else return a / b;
    }

    public static int fold(IntBinaryOperator func, int e, int... a) {
        int ret = e;
        for (int c : a) ret = func.applyAsInt(ret, c);
        return ret;
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


class Tree extends Graph {
    public final int root;
    private int[] parent;
    private long[] d;
    private int[] level;

    private boolean init = false;

    public Tree(int n, int root) {
        super(n, n - 1);
        this.root = root;
        this.parent = new int[n];
        this.d = new long[n];
        this.level = new int[n];
    }

    public Tree(int n) {
        this(n, 0);
    }

    public long distance(int i) {
        return distance()[i];
    }

    public long[] distance() {
        init();
        return d;
    }

    public int parent(int i) {
        return parent()[i];
    }

    public int[] parent() {
        init();
        return parent;
    }

    public int level(int i) {
        return level()[i];
    }

    public int[] level() {
        init();
        return level;
    }

    @Override
    public int getRoot(int i) {
        return this.root;
    }

    private void init() {
        if (!init) {
            initialBFS();
            init = true;
        }
    }

    private void initialBFS() {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.add(root);
        parent[root] = root;
        Arrays.fill(d, -1);
        d[root] = 0;
        while (dq.size() > 0) {
            int p = dq.pollFirst();
            for (Edge e : getEdges(p)) {
                if (d[e.to] < 0) {
                    d[e.to] = d[e.from] + e.cost;
                    level[e.to] = level[e.from] + 1;
                    parent[e.to] = e.from;
                    dq.add(e.to);
                }
            }
        }
    }
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

    public LowestCommonAncestor(Tree t) {
        this.n = t.getV();
        this.level = t.level();
        this.m = MathUtil.floorExponent(IntUtil.max(this.level));
        this.parent = new int[m + 1][n];
        this.parent[0] = t.parent();
        buildParent();
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
        return u == v ? u : parent[0][u];
    }
}

// the path from u to v (u is an ancestor of v) corresponds to tour[down[u] + 1, down[v] + 1).
// a vertex v corresponds to the edge from parent[v] to v.
class EdgeEulerTour {
    private Tree t;
    private int root;
    private int n;
    public int[] tour;
    public int[] down;
    public int[] up;
    
    public EdgeEulerTour(Tree t) {
        this.t = t;
        this.root = t.root;
        this.n = t.getV();
        this.tour = new int[2 * n];
        this.down = new int[n];
        this.up = new int[n];
        build();
    }
    private int k = 0;

    private void build() {
        this.down[this.root] = k;
        this.tour[k++] = this.root;
        dfs(-1, t.root);
        this.up[this.root] = k;
        this.tour[k++] = this.root;
    }

    private void dfs(int parent, int now) {
        for (Edge e : t.getEdges(now)) {
            if (e.to != parent) {
                this.down[e.to] = k;
                this.tour[k++] = e.to;
                dfs(e.from, e.to);
                this.up[e.to] = k;
                this.tour[k++] = e.to;
            }
        }
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
        return 63 - Long.numberOfLeadingZeros(n) + (n == 0 ? 1 : 0);
    }

    public static int ceilExponent(int n) {
        return 31 - Integer.numberOfLeadingZeros(n) + (isPowerOfTwo(n) ? 0 : 1);
    }

    public static int fllorExponent(int n) {
        return 31 - Integer.numberOfLeadingZeros(n) + (n == 0 ? 1 : 0);
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

class Const {
    public static final long MOD7 = 1_000_000_007;
    public static final long MOD9 = 1_000_000_009;
    public static final long MOD99 = 998_244_353;

    public static final long LINF = 1_000_000_000_000_000_000l;
    public static final int IINF = 1_000_000_000;
    public static final double DINF = 1e150;

    public static final double DELTA = 0.000_000_000_1;
    public static final double LDELTA = 0.000_001;

    public static final String YES = "YES";
    public static final String NO = "NO";
    public static final String Yes = "Yes";
    public static final String No = "No";
    public static final String POSSIBLE = "POSSIBLE";
    public static final String IMPOSSIBLE = "IMPOSSIBLE";
    public static final String Possible = "Possible";
    public static final String Impossible = "Impossible";

    public static final int[] dx8 = {1, 0, -1, 0, 1, -1, -1, 1};
    public static final int[] dy8 = {0, 1, 0, -1, 1, 1, -1, -1};
    public static final int[] dx = {1, 0, -1, 0};
    public static final int[] dy = {0, 1, 0, -1};

    public static long MOD = MOD7;

    public static void setMod(long mod) {
        MOD = mod;
    }

    private Const(){}
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


class Pair3<K, V1, V2> {
    public K key;
    public V1 val1;
    public V2 val2;

    public Pair3(K key, V1 val1, V2 val2) {
        this.key = key;
        this.val1 = val1;
        this.val2 = val2;
    }

    @Override @SuppressWarnings("all")
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof Pair3)) {
            return false;
        } else {
            Pair3 p = (Pair3) o;
            return this.key.equals(p.key) && this.val1.equals(p.val1) && this.val2.equals(p.val2);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.key, this.val1, this.val2);
    }

    @Override
    public String toString() {
        return "(" + this.key.toString() + ", " + this.val1.toString() + ", " + this.val2.toString() + ")";
    }
}
