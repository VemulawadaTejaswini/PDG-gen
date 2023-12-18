import java.util.*;

public class Main {
    static Integer res = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m =sc.nextInt();
        List<Boolean> visited = new ArrayList<>();
        List<List<Integer>> g = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            visited.add(false);
        }
        for (int i = 0; i < m; i++) {
            g.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            g.get(a).add(b);
            g.get(b).add(a);
        }

        visited.set(0, true);
        dfs(g, visited, 0);
        System.out.println(res);
    }

    private static void dfs(List<List<Integer>> graph, List<Boolean> visited, int cur) {
        if (allVisited(visited)) {
            res++;
            return;
        }

        List<Integer> next = graph.get(cur);
        for (Integer next1 : next) {
            if (visited.get(next1)) {
                continue;
            }

            visited.set(next1, true);
            dfs( graph, visited, next1);
            visited.set(next1, false);
        }
    }

    private static boolean allVisited(List<Boolean> visited) {
        for (boolean v : visited) {
            if (!v) return false;
        }
        return true;
    }
}