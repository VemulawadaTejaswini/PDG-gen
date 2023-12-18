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

        int[] max = new int[numVertices + 1];
        boolean[] visited = new boolean[numVertices + 1];
        for (int i = 1; i <= numVertices; i++) {
            if (!visited[i]) {
                dfs(graph, i, 0, max, visited);
            }
        }

        int ans = 0;
        for(int num : max) {
            ans = Math.max(ans, num);
        }
        System.out.println(ans);
    }

    private static void dfs(Map<Integer, List<Integer>> graph, int start, int count, int[] max, boolean[] visited) {
        visited[start] = true;
        max[start] = 0;
        if (graph.containsKey(start)) {
            for (int child : graph.get(start)) {
                dfs(graph, child, count, max, visited);
                max[start] = Math.max(max[start], 1 + max[child]);
            }
        }
    }
}
