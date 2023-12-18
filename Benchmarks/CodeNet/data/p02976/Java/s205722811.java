import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    static List<List<Integer>> edge = new ArrayList<>();
    static boolean[] visited;
    public static void main(String[]$) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            edge.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            edge.get(a).add(b);
            edge.get(b).add(a);
        }
        if (m % 2 == 1) {
            System.out.println(-1);
        } else {
            dfs(-1, 0);
        }
    }

    static boolean dfs(int parent, int node) {
        visited[node] = true;
        int use = 0;
        for (int i : edge.get(node)) {
            if (i != parent && (visited[i] || dfs(node, i))) {
                edge.get(i).remove(Integer.valueOf(node));
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