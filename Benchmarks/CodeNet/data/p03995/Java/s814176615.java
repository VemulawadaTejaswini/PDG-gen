import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    int r, c, n;
    ArrayList<Edge>[] res, ces;
    int init;

    public static void main(String[] args) {
        Main m  = new Main();
        m.read();
        m.solve();
    }

    private void read() {
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        c = sc.nextInt();
        n = sc.nextInt();
        res = new ArrayList[r];
        ces = new ArrayList[c];
        for (int i = 0; i < r; i++)
            res[i] = new ArrayList<>();
        for (int i = 0; i < c; i++)
            ces[i] = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int row = sc.nextInt() - 1;
            int col = sc.nextInt() - 1;
            init = row;
            long a = sc.nextLong();
            res[row].add(new Edge(col, a));
            ces[col].add(new Edge(row, a));
        }
    }

    private void solve() {
       long[] rs = new long[r];
       long[] cs = new long[c];
       Arrays.fill(rs, Long.MAX_VALUE);
       Arrays.fill(cs, Long.MAX_VALUE);
       rs[init] = 0;
       dfs(rs, cs, init, true);
       if (!check(rs, cs)) {
           System.out.println("No");
           return;
       }
       long rMin, cMin;
        rMin = Arrays.stream(rs).min().getAsLong();
        cMin = Arrays.stream(cs).min().getAsLong();
        if (rMin + cMin >= 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private void dfs(long[] rs, long[] cs, int current, boolean isRow) {
        ArrayList<Edge>[] es = isRow ? res : ces;
        ArrayList<Edge>[] tos = isRow ? ces : res;
        long[] trg = isRow ? cs : rs;
        long[] src = isRow ? rs : cs;
        for (Edge e: es[current]) {
            int to = e.to;
            long a = e.cost;
//            System.out.printf("curr %d, to %d\n", current+1, to+1);
            if (src[current] != Long.MAX_VALUE) {
                trg[to] = a - src[current];
                for (Edge _e: tos[to]) {
                    if (src[_e.to] == Long.MAX_VALUE)
                        dfs(rs, cs, to, !isRow);
                }
            }
        }
    }

    private boolean check(long[] rs, long[] cs) {
        long tmp;
        for (int i = 0; i < r; i++) {
            for (Edge e: res[i]) {
                tmp = rs[i] + cs[e.to];
                if (tmp != e.cost)
                    return false;
            }
        }
        for (int i = 0; i < c; i++) {
            for (Edge e: ces[i]) {
                tmp = cs[i] + rs[e.to];
                if (tmp != e.cost)
                    return false;
            }
        }
        return true;
    }

    private class Edge {
        int to;
        long cost;
        Edge (int t, long c) {
            to = t; cost = c;
        }
    }
}
