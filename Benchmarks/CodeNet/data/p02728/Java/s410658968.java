import java.util.*;
import java.io.*;

public class Main {
    static int n;
    static ArrayList<Integer> [] adj;
    static long mod = (long) 1e9 + 7;
    static long [] ret;
    static long [] dp;
    static int [] sz;
    static long [] fac;
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        n = sc.nextInt();
        adj = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) adj[i] = new ArrayList<>();
        for (int i = 0; i < n- 1; i++) {
            int a = sc.nextInt(); int b = sc.nextInt();
            adj[a].add(b); adj[b].add(a);
        }
        ret = new long[n + 1];
        sz = new int[n + 1];
        fac = new long[n + 1];
        dp = new long[n + 1];
        fac[0] = 1;
        for (int i = 1; i <= n; i++) fac[i] = (fac[i - 1] * i) % mod;
        dfs(1, -1);
        ret[1] = dp[1];
        dfs2(1, -1);
        for (int i = 1; i <= n; i++) out.println(ret[i]);
        out.close();
    }

    static long pow(long b, long e) {
        long ans = 1;
        while (e > 0) {
            if (e % 2 == 1)
                ans = ans * b % mod;
            e >>= 1;
            b = b * b % mod;
        }
        return ans;
    }

    static long inv(long x) {
        return pow(x, mod - 2);
    }


    static void dfs(int cur, int par) {
        sz[cur] = 1; long den = 1; dp[cur] = 1;
        for (Integer next: adj[cur]) {
            if (next != par) {
                dfs(next, cur);
                sz[cur] += sz[next];
                den = (den * fac[sz[next]]) % mod;
                dp[cur] = (dp[next] * dp[cur]) % mod;
            }
        }
        long num = fac[sz[cur] - 1];
        long frac = (num * inv(den)) % mod;
        dp[cur] = (dp[cur] * frac) % mod;
    }

    static void dfs2(int cur, int par) {
        if (par != -1) {
            long frac = (sz[cur] * inv(n - sz[cur])) % mod;
            ret[cur] = (ret[par] * frac) % mod;
        }
        for (Integer next: adj[cur]) {
            if (next != par) {
                dfs2(next, cur);
            }
        }
    }


    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }


    }

}