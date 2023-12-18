import java.util.*;

public class Main {

    static long mod = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        init(200001);
        int n = sc.nextInt();
        Graph g = new Graph(n);
        for(int i=0; i<n-1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            g.addEdge(a, b);
        }
        g.dfs();
        for(int i=0 ;i<n; i++) {
            System.out.println(g.calc(-1, i));
        }

    }

    static class Graph {

        int n;
        ArrayList<Integer>[] next;
        long[][] memo;
        int[][] count;

        Graph(int n) {
            this.n = n;
            next = new ArrayList[n];
            count = new int[n][];
            memo = new long[n][];
            for(int i=0; i<n; i++) {
                next[i] = new ArrayList<Integer>();
            }
        }
        void addEdge(int from, int to) {
            next[from].add(to);
            next[to].add(from);
        }
        void dfs() {
            dfs(-1, 0);
            dfs2(-1, 0);
        }

        void dfs(int p, int v) {
            ArrayList<Integer> edges = next[v];
            int l = edges.size();
            count[v] = new int[l];
            memo[v] = new long[l];
            for(int i=0; i<edges.size(); i++) {
                int c = edges.get(i);
                if(c != p) {
                    dfs(v, c);
                    count[v][i] = count(v, c);
                    memo[v][i] = calc(v, c);
                }
            }
        }
        void dfs2(int p, int v) {
            ArrayList<Integer> edges = next[v];
            int l = edges.size();
            for(int i=0; i<edges.size(); i++) {
                int c = edges.get(i);
                if(c != p) {
                    dfs2(v, c);
                } else {
                    count[v][i] = count(v, p);
                    memo[v][i] = calc(v, p);
                }
            }
        }

        int count(int p, int v) {
            int res = 1;
            for (int i = 0; i < next[v].size(); i++) {
                int c = next[v].get(i);
                if (c != p) {
                    res += count[v][i];
                }
            }
            return res;
        }
        long calc(int p, int v) {
            long res = 1;
            int sum = 0;
            for (int i = 0; i < next[v].size(); i++) {
                int c = next[v].get(i);
                if (c != p) {
                    res *= conv(sum + count[v][i], count[v][i]);
                    res %= mod;
                    res *= memo[v][i];
                    res %= mod;
                    sum += count[v][i];
                }
            }
            return res;
        }

    }

    static long[] fac;
    static long[] finv;
    static long[] inv;
    static void init(int max) {
        fac = new long[max];
        finv = new long[max];
        inv = new long[max];
        fac[0] = fac[1] = 1;
        finv[0] = finv[1] = 1;
        inv[1] = 1;
        for(int i=2; i<max; i++) {
            fac[i] = fac[i-1] * i % mod;
            inv[i] = mod - inv[(int)mod%i] * (mod / i) % mod;
            finv[i] = finv[i-1] * inv[i] % mod;
        }
    }
    static long conv(int n, int k) {
        if(n<k || n<0 || k<0) return 0;
        return fac[n] * (finv[k]*finv[n-k]%mod) % mod;
    }


}


