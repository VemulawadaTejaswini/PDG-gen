import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Integer, List<Integer>> graph = new HashMap<>();
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            graph.put(i, new ArrayList<>());
        }

        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            List<Integer> edges = graph.get(x);
            edges.add(y);
        }

        Integer[] maxes = new Integer[n+1];
        int maxPath = 0;
        for (int i = 1; i <= n; i++) {
            maxPath = Math.max(maxPath, maxPath(graph, i, maxes));
        }

        System.out.println(maxPath);
    }

    private static int maxPath(Map<Integer, List<Integer>> graph, int i, Integer[] maxes) {
        List<Integer> edges = graph.get(i);
        if(edges == null || edges.isEmpty()) {
            return 0;
        }

        if(maxes[i] != null) {
            return maxes[i];
        }

        int max = 0;
        for (int edge: edges) {
            int path = maxPath(graph, edge, maxes);
            max = Math.max(path, max);
        }

        max++;
        maxes[i] = max;
        return max;
    }

}
