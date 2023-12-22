import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int[][][] makeadj(int n, int[] from, int[] to, int[] w) {
        int[][][] e = new int[n][][];
        int[] d = new int[n];
        for (int f : from)
            d[f]++;
        for (int t : to)
            d[t]++;
        for (int i = 0; i < n; i++)
            e[i] = new int[d[i]][2];
        for (int i = 0; i < from.length; i++) {
            --d[from[i]];
            e[from[i]][d[from[i]]][0] = to[i];
            e[from[i]][d[from[i]]][1] = w[i];
            --d[to[i]];
            e[to[i]][d[to[i]]][0] = from[i];
            e[to[i]][d[to[i]]][1] = w[i];
        }
        return e;
    }

    public static int prim(int[][][] adj) {
        int[] c = new int[adj.length];
        Arrays.fill(c, Integer.MAX_VALUE);
        c[0] = 0;
        boolean[] vis = new boolean[adj.length];
        int w = 0;
        while (true) {
            int v = -1;
            for (int u = 0; u < adj.length; u++) {
                if (!vis[u] && (v == -1 || c[v] > c[u])) {
                    v = u;
                }
            }
            if (v == -1)
                break;
            w += c[v];
            vis[v] = true;
            for (int[] e : adj[v]) {
                if (!vis[e[0]] && c[e[0]] > e[1]) {
                    c[e[0]] = e[1];
                }
            }
        }
        return w;
    }

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in).useDelimiter("[^0-9]+");
        while (true) {
            int n = sc.nextInt();
            if (n == 0)
                break;
            int m = sc.nextInt();
            int[] f = new int[m];
            int[] t = new int[m];
            int[] w = new int[m];
            for (int i = 0; i < m; i++) {
                f[i] = sc.nextInt();
                t[i] = sc.nextInt();
                w[i] = (sc.nextInt() / 100) - 1;// / 100;
            }
            int[][][] g = makeadj(n, f, t, w);
            System.out.println(prim(g));
        }
    }
}