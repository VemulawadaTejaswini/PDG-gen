
import java.util.*;
import java.util.Scanner;

class Main {

    static class pair {
        int first, second;

        pair(int a, int b) {
            first = a;
            second = b;
        }
    }

    static int N = 100010;
    static int n, x;
    static Vector<Vector<Integer>> g = new Vector<Vector<Integer>>();
    static boolean vis[] = new boolean[N];
    static boolean good[] = new boolean[N];
    static int cnt;

    static void ADD_EDGE(int u, int v) {
        g.get(u).add(v);
    }

    static void dfs1(int v) {
        good[v] = true;
        for (int to = 0; to < g.get(v).size(); to++)
            if (!good[g.get(v).get(to)])
                dfs1(g.get(v).get(to));
    }

    static void dfs2(int v) {
        vis[v] = true;
        ++cnt;
        for (int to = 0; to < g.get(v).size(); to++)
            if (!vis[g.get(v).get(to)] && !good[g.get(v).get(to)])
                dfs2(g.get(v).get(to));
    }

    static int Minimum_Edges() {
        dfs1(x);
        Vector<pair> val = new Vector<pair>();
        for (int i = 0; i < n; ++i) {
            if (!good[i]) {
                cnt = 0;
                for (int j = 0; j < vis.length; j++)
                    vis[j] = false;
                dfs2(i);
                val.add(new pair(cnt, i));
            }
        }
        Collections.sort(val, new Comparator<pair>() {
            public int compare(pair p1, pair p2) {
                return p1.first - p2.first;
            }
        });
        Collections.reverse(val);
        int ans = 0;
        for (int it = 0; it < val.size(); it++) {
            if (!good[val.get(it).second]) {
                ++ans;
                dfs1(val.get(it).second);
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        x = sc.nextInt();

        for (int i = 0; i < N + 1; i++)
            g.add(new Vector<Integer>());

        for (int i = 0; i < x; i++) {
            int u, v;
            u = sc.nextInt();
            v = sc.nextInt();
            u--;
            v--;
            ADD_EDGE(u, v);
            ADD_EDGE(v, u);
        }
        System.out.println(Minimum_Edges());
    }
}
