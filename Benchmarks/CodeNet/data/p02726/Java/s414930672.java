//Created by Aminul on 3/28/2020.

import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = in.nextInt();
        int x = in.nextInt(), y = in.nextInt();
        int from[] = new int[n], to[] = new int[n];
        int idx = 0;
        for (int i = 2; i <= n; i++) {
            from[idx] = i - 1;
            to[idx++] = i;
        }
        from[idx] = x;
        to[idx++] = y;

        int[][] g = packU(n + 1, from, to);
        int f[] = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            int vis[] = bfs(i, g, n);
            for (int k = 1; k <= n; k++) {
                f[vis[k]]++;
            }
        }

        for (int i = 1; i <= n - 1; i++) {
            pw.println(f[i] / 2);
        }

        pw.close();
    }

    static int[] bfs(int source, int[][] g, int n) {
        int vis[] = new int[n + 1];
        Arrays.fill(vis, -1);
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(source);
        vis[source] = 0;
        while (!queue.isEmpty()) {
            int p = queue.poll();
            for (int v : g[p]) {
                if (vis[v] == -1) {
                    vis[v] = vis[p] + 1;
                    queue.add(v);
                }
            }
        }
        return vis;
    }

    static int[][] packU(int n, int[] from, int[] to) {
        int[][] g = new int[n][];
        int[] p = new int[n];
        for (int f : from)
            p[f]++;
        for (int t : to)
            p[t]++;
        for (int i = 0; i < n; i++)
            g[i] = new int[p[i]];
        for (int i = 0; i < from.length; i++) {
            g[from[i]][--p[from[i]]] = to[i];
            g[to[i]][--p[to[i]]] = from[i];
        }
        return g;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}