//Created by Aminul on 8/29/2020.

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = in.nextInt(), m = in.nextInt();
        ArrayDeque<Integer> g[] = genDQ(n + 1);
        boolean[] vis = new boolean[n + 1];
        for (int i = 0; i < m; i++) {
            int u = in.nextInt(), v = in.nextInt();
            g[u].addLast(v);
            g[v].addLast(u);
        }

        int maxSize = 0;
        for (int i = 1; i <= n; i++) {
            maxSize = max(maxSize, dfs(i, vis, g));
        }

        pw.println(maxSize);

        pw.close();
    }

    static int dfs(int u, boolean vis[], ArrayDeque<Integer> g[]) {
        if (vis[u]) return 0;
        vis[u] = true;
        int cnt = 1;
        for (int v : g[u]) {
            if (!vis[v]) cnt += dfs(v, vis, g);
        }
        return cnt;
    }

    static <T> ArrayDeque<T>[] genDQ(int n) {
        ArrayDeque<T> list[] = new ArrayDeque[n];
        for (int i = 0; i < n; i++) list[i] = new ArrayDeque<T>();
        return list;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}