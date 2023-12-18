import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Collections;
import java.util.TreeSet;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        ArrayList<Integer>[] e;
        ArrayList<Q> qs;
        boolean[] vis;
        int[] a;

        void dfs(int x, Q q) {
            vis[x] = true;
            q.v.add(a[x]);
            for (int y : e[x]) {
                if (!vis[y]) {
                    dfs(y, q);
                }
            }
        }

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            e = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                e[i] = new ArrayList<>();
            }

            for (int i = 0; i < m; i++) {
                int u = in.nextInt();
                int v = in.nextInt();
                e[u].add(v);
                e[v].add(u);
            }

            int cc = 0;
            qs = new ArrayList<>();
            vis = new boolean[n];
            for (int i = 0; i < n; i++) {
                if (!vis[i]) {
                    Q q = new Q(cc);
                    dfs(i, q);
                    cc++;
                    qs.add(q);
                }
            }

            for (Q q : qs) {
                Collections.sort(q.v);
                if (q.v.size() > cc - 1) {
                    q.v = new ArrayList<>(q.v.subList(0, cc - 1));
                }
            }

            TreeSet<Q> s = new TreeSet<>(qs);
            int left = n - 1 - m;
            long ans = 0;
            while (left > 0) {
                if (s.isEmpty()) {
                    out.println("Impossible");
                    return;
                }
                Q q1 = s.pollFirst();
                if (s.isEmpty()) {
                    out.println("Impossible");
                    return;
                }
                Q q2 = s.pollFirst();
                ans += q1.v.get(q1.p++);
                ans += q2.v.get(q2.p++);
                if (q1.p < q1.v.size()) {
                    s.add(q1);
                }
                if (q2.p < q2.v.size()) {
                    s.add(q2);
                }
                left -= 1;
            }
            out.println(ans);
        }

        class Q implements Comparable<Q> {
            int id;
            ArrayList<Integer> v;
            int p;

            public Q(int id) {
                this.id = id;
                v = new ArrayList<>();
                p = 0;
            }


            public int compareTo(Q o) {
                if (this == o) return 0;
                int t = Integer.compare(v.get(p), o.v.get(o.p));
                if (t == 0) {
                    return id - o.id;
                }
                return t;
            }

        }

    }
}

