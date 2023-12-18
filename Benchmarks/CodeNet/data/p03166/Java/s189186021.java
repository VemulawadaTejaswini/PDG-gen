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
        int maxPath = 0;
        for (int i = 1; i <= n; i++) {
            maxPath = Math.max(maxPath, maxPath(graph, i));
        }

        System.out.println(maxPath);
    }

    private static int maxPath(Map<Integer, List<Integer>> graph, int i) {
        List<Integer> edges = graph.get(i);
        if(edges == null || edges.isEmpty()) {
            return 0;
        }

        int max = 0;
        for (int edge: edges) {
            int path = maxPath(graph, edge);
            max = Math.max(path, max);
        }

        max++;
        return max;
    }
}

