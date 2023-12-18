import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static int[] pre;
    private static int[] low;
    private static int count;
    private static int res;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());

        List<List<Integer>> g = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            g.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            g.get(a - 1).add(b - 1);
            g.get(b - 1).add(a - 1);
        }

        pre = new int[n];
        low = new int[n];

        dfs(0, new boolean[n], g, -1);
        System.out.println(res - 1);

    }

    private static void dfs(int num, boolean[] visited, List<List<Integer>> graph, int from) {
        pre[num] = count++;
        low[num] = pre[num];
        visited[num] = true;
        List<Integer> l = graph.get(num);
        for (Integer i : l) {
            if (visited[i]) {
                if (i != from) {
                    low[num] = Math.min(low[num], low[i]);
                }
                continue;
            }
            dfs(i, visited, graph, num);
            low[num] = Math.min(low[num], low[i]);
        }
        if (pre[num] == low[num]) {
            res++;
        }
    }
}
