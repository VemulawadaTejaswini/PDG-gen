import java.util.Scanner;

public class Main {
    final static int nmax = 8;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[][] graph = new boolean[nmax][nmax];

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a - 1][b - 1] = graph[b - 1][a - 1] = true;
        }
        boolean[] visited = new boolean[nmax];
        for (int i = 0; i < n; i++) {
            visited[i] = false;
        }
        visited[0] = true;
        System.out.println(dfs(0, n, visited, graph));
    }

    private static int dfs(int v, int n, boolean visited[], boolean graph[][]) {
        boolean all_visited = true;
        for (int i = 0; i < n; i++) {
            if (visited[i] == false) {
                all_visited = false;
            }
        }

        if (all_visited) {
            return 1;
        }

        int ret = 0;

        for (int i = 0; i < n; i++) {
            if (graph[v][i] == false) {
                continue;
            }
            if (visited[i]) {
                continue;
            }
            visited[i] = true;
            ret += dfs(i, n, visited, graph);
            visited[i] = false;

        }
        return ret;
    }

}