import java.util.*;
import java.io.*;

public class Main {
    static HashSet<Integer> [] adj;
    static HashSet<Integer> [] back;
    static boolean [] vis;
    static int[][] memo;
    static int [] depth;
    static boolean [] leaf;
    static int log;
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt(); int m = sc.nextInt();
        adj = new HashSet[n + 1];
        for (int i = 1; i <= n; i++) adj[i] = new HashSet<>();
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt(); int v = sc.nextInt();
            adj[u].add(v); adj[v].add(u);
        }
        back = new HashSet[n + 1];
        for (int i = 1; i <= n; i++) back[i] = new HashSet<>();
        leaf = new boolean[n + 1];
        vis = new boolean[n + 1];
        depth = new int[n + 1];
        log = (int)Math.ceil(Math.log(n) / Math.log(2));
        memo = new int[n + 1][log + 1];
        for (int i = 0; i <= n; i++)
            Arrays.fill(memo[i], -1);
        dfs(1, -1);
        if (adj[1].size() == 1) leaf[1] = true;
        for (int i = 1; i <= n; i++) {
            for (Integer j: back[i]) {
                adj[j].remove(i);
                adj[i].remove(j);
            }
        }
        dfs2(1, -1);
        ArrayList<Integer> leaves = new ArrayList<>();
        for (int i = 1; i <= n; i++) if (leaf[i]) leaves.add(i);
        int first = leaves.get(0); int second = leaves.get(1);
        int df = depth[first]; int ds = depth[second];
        int jf = first; int js = second;
        for (Integer i: back[first]) {
            if (df > depth[i]) {
                df = Math.min(df, depth[i]);
                jf = i;
            }
        }
        for (Integer i: back[second]) {
            if (ds > depth[i]) {
                ds = Math.min(ds, depth[i]);
                js = i;
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        if (df < ds || (df == ds && depth[first] >= depth[second])) {
            int start = second;
            res.add(start);
            if (js != start) res.add(js);
            int lca = lca(js, jf);
            ArrayList<Integer> temp = new ArrayList<>();
            int cur = js;
            while (cur != lca) {
                if (res.get(res.size() - 1) != cur) res.add(cur);
                cur = memo[cur][0];
            }
            cur = jf;
            while (cur != lca) {
                temp.add(cur);
                cur = memo[cur][0];
            }
            if (lca != js) res.add(lca);
            for (int i = temp.size() - 1; i >= 0; i--) res.add(temp.get(i));
            temp = new ArrayList<>();
            cur = first;
            while (cur != jf) {
                temp.add(cur);
                cur = memo[cur][0];
            }
            for (int i = temp.size() - 1; i >= 0; i--) res.add(temp.get(i));
        } else {
            int start = first;
            res.add(start);
            if (jf != start) res.add(jf);
            int lca = lca(jf, js);
            ArrayList<Integer> temp = new ArrayList<>();
            int cur = jf;
            while (cur != lca) {
                res.add(cur);
                cur = memo[cur][0];
            }
            cur = js;
            while (cur != lca) {
                temp.add(cur);
                cur = memo[cur][0];
            }
            if (lca != jf) res.add(lca);
            for (int i = temp.size() - 1; i >= 0; i--) res.add(temp.get(i));
            cur = second;
            while (cur != js) {
                temp.add(cur);
                cur = memo[cur][0];
            }
            for (int i = temp.size() - 1; i >= 0; i--) res.add(temp.get(i));
        }
        out.println(res.size());
        for (Integer i: res) out.print(i + " ");
        out.close();
    }

    static void dfs(int cur, int par) {
        vis[cur] = true;
        HashSet<Integer> remove = new HashSet<>();
        boolean touched = false;
        for (Integer next: adj[cur]) {
            if (!vis[next]) {
                dfs(next, cur);
                touched = true;
            } else if (vis[next] && next != par) remove.add(next);
        }
        for (Integer i: remove) {
            if (!back[i].contains(cur)) back[cur].add(i);
        }
        leaf[cur] = !touched;
    }

    static void dfs2(int u, int p)
    {

        // Using recursion formula to calculate
        // the values of memo[][]
        memo[u][0] = p;
        for (int i = 1; i <= log; i++) {
            if (memo[u][i - 1] == -1) continue;
            memo[u][i] = memo[memo[u][i - 1]][i - 1];
        }
        for (int v : adj[u]) {
            if (v != p) {

                // Calculating the level of each node
                depth[v] = depth[u] + 1;
                dfs2(v, u);
            }
        }
    }

    static int lca(int u, int v)
    {
        // The node which is present farthest
        // from the root node is taken as u
        // If v is farther from root node
        // then swap the two
        if (depth[u] < depth[v]) {
            int temp = u;
            u = v;
            v = temp;
        }

        // Finding the ancestor of u
        // which is at same level as v
        for (int i = log; i >= 0; i--) {
            if ((depth[u] - (int)Math.pow(2, i)) >= depth[v])
                u = memo[u][i];
        }

        // If v is the ancestor of u
        // then v is the LCA of u and v
        if (u == v)
            return u;

        // Finding the node closest to the root which is
        // not the common ancestor of u and v i.e. a node
        // x such that x is not the common ancestor of u
        // and v but memo[x][0] is
        for (int i = log; i >= 0; i--) {
            if (memo[u][i] != memo[v][i]) {
                u = memo[u][i];
                v = memo[v][i];
            }
        }

        // Returning the first ancestor
        // of above found node
        return memo[u][0];
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