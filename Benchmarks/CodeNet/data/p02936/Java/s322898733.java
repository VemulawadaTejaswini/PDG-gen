import java.util.*;
import java.io.*;

public class Main {
    private static ArrayList<Integer>[] g;
    private static long[] val, inc;
    private static int n, q;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        q = in.nextInt();

        g = new ArrayList[n + 1];
        for (int i = 0; i <= n; ++i) {
            g[i] = new ArrayList<>();
        }

        val = new long[n + 1];
        inc = new long[n + 1];
        for (int i = 0; i < n - 1; ++i) {
            int a = in.nextInt();
            int b = in.nextInt();

            g[a].add(b);
            g[b].add(a);
        }

        for (int i = 0; i < q; ++i) {
            int p = in.nextInt();
            long x = in.nextInt();

            inc[p] += x;
        }

        dfs(1, -1, 0l);
        for (int i = 1; i <= n; ++i) {
            System.out.print(val[i] + " ");
        } System.out.println();
    }

    private static void dfs(int u, int p, long acc) {
        acc += inc[u];
        val[u] = acc;
        for (int v : g[u]) if (v != p) {
            dfs(v, u, acc);
        }
    }

}