import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ");
        int numVertices = Integer.parseInt(line[0]);
        int numEdges = Integer.parseInt(line[1]);

        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < numEdges; i++) {
            line = scanner.nextLine().split(" ");
            int from = Integer.parseInt(line[0]);
            int to = Integer.parseInt(line[1]);
            graph.putIfAbsent(from, new ArrayList<>());
            graph.get(from).add(to);
        }
        int ans = 0;
        for (int i = 1; i <= numVertices; i++) {
            int[] max = new int[numVertices + 1];
            dfs(graph, i, 0, max);
            System.out.println(Arrays.toString(max));
            for (int val : max) {
                ans = Math.max(ans, val);
            }
        }

        System.out.println(ans);
    }

    private static void dfs(Map<Integer, List<Integer>> graph, int start, int count, int[] max) {
        max[start] = Math.max(max[start], count);

        if (graph.containsKey(start)) {
            for (int neigh : graph.get(start)) {
                dfs(graph, neigh, count + 1, max);
            }
        }
    }
}
