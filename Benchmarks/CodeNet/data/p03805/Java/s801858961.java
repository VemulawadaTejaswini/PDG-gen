import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static boolean[][] graph;

    private static boolean allVisited(boolean[] visited) {
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) {
                return false;
            }
        }
        return true;
    }

    private static int dfs(int v, int n, boolean[] visited) {
        if (allVisited(visited)) {
            return 1;
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            if (!graph[v][i] || visited[i]) {
                continue;
            }
            visited[i] = true;
            result += dfs(i, n, visited);
            visited[i] = false;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        graph = new boolean[m][m];
        for (int i = 0; i < m; i++) {
            a.add(sc.nextInt());
            b.add(sc.nextInt());
            for (int j = 0; j < m; j++) {
                graph[i][j] = false;
            }
        }
        for (int i = 0; i < m; i++) {
            graph[a.get(i) - 1][b.get(i) - 1] = true;
            graph[b.get(i) - 1][a.get(i) - 1] = true;
        }
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            visited[i] = false;
        }
        visited[0] = true;
        // 隣接頂点が全て訪問済みとなるまでグラフを辿る
        System.out.println(dfs(0, n, visited));
    }
}
