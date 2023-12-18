import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    static List<Map<Integer, Boolean>> edge = new ArrayList<>();
    static boolean[] visited;
    public static void main(String[]$) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            edge.add(new HashMap<>());
        }
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            edge.get(a).put(b, null);
            edge.get(b).put(a, null);
        }
        if (m % 2 == 1) {
            System.out.println(-1);
        } else {
            dfs(-1, 0);
        }
    }

    static boolean dfs(int parent, int node) {
        visited[node] = true;
        if (edge.get(node).size() == 1) {
            return true;
        }
        boolean[] visited2 = Arrays.copyOf(visited, visited.length);
        int use = 0;
        for (int i : edge.get(node).keySet()) {
            if (i == parent) {
                continue;
            }

            if (visited2[i]) {
                System.out.println((node + 1) + " " + (i + 1));
                use++;
            } else if (!visited[i] && dfs(node, i)) {
                System.out.println((node + 1) + " " + (i + 1));
                use++;
            }
        }
        if (use % 2 == 1 && parent != -1) {
            System.out.println((node + 1) + " " + (parent + 1));
        }
        return use % 2 == 0;
    }
}