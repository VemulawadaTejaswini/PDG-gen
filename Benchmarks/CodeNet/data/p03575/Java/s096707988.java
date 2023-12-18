import java.util.Scanner;

public class Main {
    int n, m;
    boolean[][] es;
    int[] as, bs;
    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    private void read() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        es = new boolean[n][n];
        as = new int[m];
        bs = new int[m];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            es[a][b] = es[b][a] = true;
            as[i] = a;
            bs[i] = b;
        }
    }

    private void solve() {
        int ans = 0;
        for (int i = 0; i < m; i++) {
            int a = as[i];
            int b = bs[i];
            es[a][b] = es[b][a] = false;
            if (!check())
                ans++;
            es[a][b] = es[b][a] = true;
        }
        System.out.println(ans);
    }

    private boolean check() {
        boolean[] fs = new boolean[n];
        dfs(0, 0, fs);
        boolean ret = true;
        for (boolean b: fs)
            ret &= b;
        return ret;
    }

    private void dfs(int node, int depth, boolean[] used) {
        if (used[node])
            return;
        used[node] = true;
        for (int i = 0; i < n; i++) {
            if (es[node][i] && !used[i])
                dfs(i, depth+1, used);
        }
    }

}
