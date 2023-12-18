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
        Bridge solver = new Bridge();
        solver.solve(1, in, out);
        out.close();
    }

    static class Bridge {
        boolean[] visited;
        int[] lowest;
        int[] order;
        int[] parent;
        int timer;
        List<List<Integer>> g;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt() + 1;
            int m = in.nextInt();

            visited = new boolean[n];
            // lowlink
            lowest = new int[n];
            // nodeを訪れた順番
            order = new int[n];
            parent = new int[n];
            timer = 1;
            g = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                g.add(new ArrayList<>());
            }

            for (int i = 0; i < m; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                (g.get(a)).add(b);
                (g.get(b)).add(a);
            }
            long result = 0;
            dfs(1, 0);
            for (int i = 1; i < n; i++) {
                for (Integer v : g.get(i)) {
                    if (order[i] < lowest[v]) {
                        result++;
                    }
                }
            }

            out.println(result);

        }

        public void dfs(int current, int prev) {
            order[current] = timer;
            lowest[current] = timer;
            timer++;
            visited[current] = true;

            for (Integer next : g.get(current)) {
                if (!visited[next]) {
                    parent[next] = current;
                    dfs(next, current);
                    // 子の探索が終了
                    lowest[current] = Math.min(lowest[current], lowest[next]);
                } else if (next != prev) {
                    // Back edge の最小
                    lowest[current] = Math.min(lowest[current], order[next]);
                }
            }
        }

    }
}

