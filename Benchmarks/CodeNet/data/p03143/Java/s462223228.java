import java.io.*;
import java.util.*;

/**
 * Copyright © 2018 Chris. All rights reserved.
 *
 * @author Chris
 * 2018/7/9 15:33
 * @see format
 */
public class Main {

    private static BufferedReader br;
    private static StreamTokenizer st;
    private static PrintWriter pw;

    static final int INF = 1000000007;
    static final int MOD = 1000000007;

    static int[] getBit(long num) {
        int bit[] = new int[40];
        int cur = 0;
        while (num > 0) {
            bit[cur++] = (int) (num & 1);
            num >>= 1;
        }
        return bit;
    }

    static class Edge {
        int f, t, w;
        int id;

        Edge(int f, int t, int w, int id) {
            this.f = f;
            this.t = t;
            this.w = w;
            this.id = id;
        }
    }

    static int n, m, vw[], num = 0, bridge[], comple[];
    static long sw[];
    static Set<Edge> edgeList[];
    static Edge[] edges;
    static int dfn[], low[], parent[];
    static int ans = 0;

    static void tarjan(int u, int fid) {
        dfn[u] = low[u] = ++num;
        Set<Edge> es = edgeList[u];
        for (Edge e: es) {
            int v = e.t;
            if (v == u) {
                v = e.f;
            }
            if (dfn[v] == 0) {
                tarjan(v, e.id);
                low[u] = Math.min(low[u], low[v]);
                if (low[v] > dfn[u]) {
                    bridge[e.id] = 1;
                }
            } else if (fid != e.id) {
                low[u] = Math.min(low[u], dfn[v]);
            }
        }
    }

    static long dfs(boolean vis[], int p) {
        Set<Edge> es = edgeList[p];
        long cur = vw[p];
        for (Edge e : es) {
            int t = e.t;
            if (t == p) {
                t = e.f;
            }
            if (vis[t]) {
                continue;
            }
            vis[t] = true;
            cur += dfs(vis, t);
        }
        return cur;
    }

    static void dfs2(int p) {
        Set<Edge> es = edgeList[p];
        for (Edge e : es) {
            if (comple[e.id] == 1) {
                continue;
            }
            comple[e.id] = 1;
            int t = e.t;
            if (t == p) {
                t = e.f;
            }
            dfs2(t);
        }
    }

    static void dfs3(int p, long s) {
        Set<Edge> es = edgeList[p];
        sw[p] = s;
        for (Edge e : es) {
            int t = e.t;
            if (t == p) {
                t = e.f;
            }
            if (sw[t] == s) {
                continue;
            }
            dfs3(t, s);
        }
    }

    private static void solve() throws IOException {
        n = nextInt();
        m = nextInt();
        vw = new int[n + 1];
        dfn = new int[n + 1];
        low = new int[n + 1];
        sw = new long[n + 1];
        bridge = new int[m + 1];
        comple = new int[m + 1];
        edgeList = new Set[n + 1];
        edges = new Edge[m + 1];
        for (int i = 0; i < n; i++) {
            edgeList[i + 1] = new HashSet<>();
            vw[i + 1] = nextInt();
        }
        Integer order[] = new Integer[m];
        for (int i = 0; i < m; i++) {
            order[i] = i + 1;
            Edge e = new Edge(nextInt(), nextInt(), nextInt(), i + 1);
            edges[i + 1] = e;
            edgeList[e.f].add(e);
            edgeList[e.t].add(e);
        }
        tarjan(1, 0);
        boolean vis1[] = new boolean[n + 1];
        vis1[1] = true;
        long s = dfs(vis1, 1);
        dfs3(1, s);
        Arrays.sort(order, Comparator.comparingInt(o -> -edges[o].w));
        for (int i = 0; i < m; i++) {
            int idx = order[i];
            Edge e = edges[idx];
            if (comple[e.id] == 1 || sw[e.f] >= e.w && sw[e.t] >= e.w) {
                continue;
            }
            if (bridge[idx] == 1) {
                int f = e.f;
                int t = e.t;
                boolean vis[] = new boolean[n + 1];
                vis[f] = vis[t] = true;
                long lft = dfs(vis, f);
                long rht = dfs(vis, t);
                if (lft >= e.w || rht >= e.w) {
                    comple[e.id] = 1;
                    if (lft >= e.w) {
                        dfs2(f);
                    }
                    if (rht >= e.w) {
                        dfs2(t);
                    }
                    continue;
                } else {
                    ans++;
                    edgeList[f].remove(e);
                    edgeList[t].remove(e);
                    dfs3(f, lft);
                    dfs3(t, rht);
                }
            } else {
                ans++;
                int f = e.f;
                int t = e.t;
                edgeList[f].remove(e);
                edgeList[t].remove(e);
                Arrays.fill(dfn, 0);
                tarjan(f, 0);
            }
        }
        pw.println(ans);
    }

    static void swap(long a[], int i, int j) {
        a[i] ^= a[j];
        a[j] ^= a[i];
        a[i] ^= a[j];
    }

    static void swap(int a[], int i, int j) {
        a[i] ^= a[j];
        a[j] ^= a[i];
        a[i] ^= a[j];
    }

    static void getDiv(Map<Integer, Integer> map, int n) {
        int sqrt = (int) Math.sqrt(n);
        for (int i = sqrt; i >= 2; i--) {
            if (n % i == 0) {
                getDiv(map, i);
                getDiv(map, n / i);
                return;
            }
        }
        map.put(n, map.getOrDefault(n, 0) + 1);
    }

    public static boolean[] generatePrime(int n) {
        boolean p[] = new boolean[n + 1];
        p[2] = true;

        for (int i = 3; i <= n; i += 2) {
            p[i] = true;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (!p[i]) {
                continue;
            }
            for (int j = i * i; j <= n; j += i << 1) {
                p[j] = false;
            }
        }
        return p;
    }

    static long llMod(long a, long b, long mod) {
        return (a * b - (long) ((double) a / mod * b + 0.5) * mod + mod) % mod;
    }

    static int pow(long a, long n) {
        long ans = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                ans = (ans * a) % MOD;
            }
            a = (a * a) % MOD;
            n >>= 1;
        }
        return (int) ans;
    }

    static int pow(long a, long n, long mod) {
        long ans = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                ans = llMod(ans, a, mod);
            }
            a = llMod(a, a, mod);
            n >>= 1;
        }
        return (int) ans;
    }

    private static long[][] initC(int n) {
        long c[][] = new long[n][n];

        for (int i = 0; i < n; i++) {
            c[i][0] = 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                c[i][j] = c[i - 1][j - 1] + c[i - 1][j];
            }
        }
        return c;
    }

    /**
     * ps: n >= m, choose m from n;
     */
    private static int c(long n, long m) {
        if (m > n) {
            n ^= m;
            m ^= n;
            n ^= m;
        }
        m = Math.min(m, n - m);

        long top = 1;
        long bot = 1;
        for (long i = n - m + 1; i <= n; i++) {
            top = (top * i) % MOD;
        }
        for (int i = 1; i <= m; i++) {
            bot = (bot * i) % MOD;
        }

        return (int) ((top * pow(bot, MOD - 2)) % MOD);
    }

    static int gcd(int a, int b) {
        if (a < b) {
            a ^= b;
            b ^= a;
            a ^= b;
        }
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    static boolean even(long n) {
        return (n & 1) == 0;
    }

    public static void main(String args[]) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StreamTokenizer(br);
        pw = new PrintWriter(new OutputStreamWriter(System.out));
        st.ordinaryChar('\''); //指定单引号、双引号和注释符号是普通字符
        st.ordinaryChar('\"');
        st.ordinaryChar('/');

        solve();
        pw.flush();
    }

    static String next(int len) throws IOException {
        int b = br.read();
        while (b == '\n' || b == ' ' || b == '\r' || b == '\t') {
            b = br.read();
        }
        char ch[] = new char[len];
        ch[0] = (char) b;
        int idx = 1;
        while (idx < len && (b = br.read()) != ' ' && b != '\n' && b != '\r' && b != '\t') {
            ch[idx++] = (char) b;
        }
        return String.valueOf(ch).trim();
    }

    private static int nextInt() throws IOException {
        st.nextToken();
        return (int) st.nval;
    }

    private static double nextDouble() throws IOException {
        st.nextToken();
        return st.nval;
    }

    private static String[] nextSS(String reg) throws IOException {
        return br.readLine().split(reg);
    }

    private static String nextLine() throws IOException {
        return br.readLine();
    }
}
