import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
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
        ColoringEdgesonTree solver = new ColoringEdgesonTree();
        solver.solve(1, in, out);
        out.close();
    }

    static class ColoringEdgesonTree {
        int[] results;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            results = new int[n - 1];

            List<List<Pair>> lists = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                lists.add(new ArrayList<>());
            }

            for (int i = 0; i < n - 1; i++) {
                int a = in.nextInt() - 1;
                int b = in.nextInt() - 1;
                lists.get(a).add(new Pair(b, i));
                lists.get(b).add(new Pair(a, i));
            }

            StringBuilder sb = new StringBuilder();
            long result = 0;
            for (int i = 0; i < n; i++) {
                result = Math.max(lists.get(i).size(), result);
            }
            sb.append(result).append("\n");

            dfs(0, 0, lists);

            for (int i = 0; i < n - 1; i++) {
                sb.append(results[i] + "\n");
            }
            out.print(sb.toString().trim());

        }

        public void dfs(int parent, int pColor, List<List<Pair>> lists) {
            List<Pair> children = lists.get(parent);
            int color = 1;
            if (color == pColor) {
                color++;
            }
            for (Pair p : children) {
                if (p.node == parent) {
                    continue;
                }
                if (results[p.route] > 0) {
                    continue;
                }
                results[p.route] = color;
                dfs(p.node, color, lists);
                color++;
            }

        }

        class Pair {
            public final Integer node;
            public final Integer route;

            public Pair(Integer node, Integer route) {
                this.node = node;
                this.route = route;
            }

        }

    }
}

