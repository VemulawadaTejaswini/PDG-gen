import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        final int NMAX = 8;
        boolean[][] graph = new boolean[NMAX][NMAX];
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a - 1][b - 1] = graph[b - 1][a - 1] = true;
        }
      
        boolean[] visited = new boolean[NMAX];
        for (int i = 0; i < N; i++) {
            visited[i] = false;
        }
        visited[0] = true;
        System.out.println(dfs(0, N, visited, graph));
    }

    private static int dfs(int v, int N, boolean[] visited, boolean[][] graph) {
        boolean allVisited = true;
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                allVisited = false;
            }
        }
        if (allVisited) {
            return 1;
        }
        int ret = 0;
        for (int i = 0; i < N; i++) {
            if (!graph[v][i]) continue;
            if (visited[i]) continue;

            visited[i] = true;
            ret += dfs(i, N, visited, graph);
            visited[i] = false;
        }
        return ret;
    }
}