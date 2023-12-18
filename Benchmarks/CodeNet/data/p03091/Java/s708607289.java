import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
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
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        ArrayList<Integer>[] g;
        int[] head;
        Set<P> used;
        ArrayList<Integer> eu;
        int n;

        void dfs(int x) {
            while (head[x] < g[x].size()) {
                int y = g[x].get(head[x]++);
                if (!used.contains(new P(x, y))) {
                    used.add(new P(x, y));
                    used.add(new P(y, x));
                    dfs(y);

                    eu.add(x);
                }
            }
        }

        ArrayList<Integer> cut(ArrayList<Integer> eu) {
            int[] was = new int[n];
            Arrays.fill(was, -1);
            int from = 0;
            int to = 0;
            boolean cut = false;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < eu.size(); i++) {
                int x = eu.get(i);
                if (was[x] != -1) {
                    int len = i - was[x];
                    if (len < min) {
                        from = was[x];
                        to = i;
                        min = len;
                        cut = true;
                    }
                }
                was[x] = i;
            }
            for (int i = 1; i < eu.size(); i++) {
                int x = eu.get(i);
                if (was[x] != -1) {
                    int len = i + eu.size() - was[x];
                    if (len < min) {
                        from = was[x];
                        to = i;
                        min = len;
                        cut = true;
                    }
                }
                was[x] = i;
            }
            if (!cut) {
                return null;
            }

            ArrayList<Integer> neu1 = new ArrayList<>();
            for (int i = 0; i < eu.size(); i++) {
                if ((from < to && i < from || i >= to) || (from > to && i <= from && i >= to)) {
                    neu1.add(eu.get(i));
                }
            }
            return neu1;
        }

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            n = in.nextInt();
            int m = in.nextInt();
            g = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                g[i] = new ArrayList<>();
            }

            int[] deg = new int[n];
            for (int i = 0; i < m; i++) {
                int x = in.nextInt() - 1;
                int y = in.nextInt() - 1;
                g[x].add(y);
                g[y].add(x);
                deg[x]++;
                deg[y]++;
            }

            for (int i = 0; i < n; i++) {
                if (deg[i] % 2 != 0) {
                    out.println("No");
                    return;
                }
            }

            if (m < n + 2) {
                out.println("No");
                return;
            }

            eu = new ArrayList<>();
            used = new HashSet<>();
            head = new int[n];
            eu.add(0);
            dfs(0);
//        System.out.println(eu);

            eu = cut(eu);
            if (eu.size() == 1) {
                out.println("No");
                return;
            }
            eu = cut(eu);
            if (eu.size() == 1) {
                out.println("No");
                return;
            }

            out.println("Yes");
        }

        class P {
            int x;
            int y;

            public P(int x, int y) {
                this.x = x;
                this.y = y;
            }

            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;

                P p = (P) o;

                if (x != p.x) return false;
                return y == p.y;
            }

            public int hashCode() {
                int result = x;
                result = 31 * result + y;
                return result;
            }

        }

    }
}

