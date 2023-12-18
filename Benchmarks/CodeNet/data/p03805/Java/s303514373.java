import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[][] e = new int[n][n];
        for (int i = 0; i < m; i++) {
            int a = Integer.parseInt(sc.next()) - 1;
            int b = Integer.parseInt(sc.next()) - 1;
            e[a][b] = 1;
            e[b][a] = 1;
        }
        boolean[] visited = new boolean[n];
        visited[0] = true;
        System.out.println(dfs(0, n, visited, e));
    }

    private static int dfs(int v, int n, boolean[] visited, int[][] e) {
        boolean allVisited = true;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                allVisited = false;
            }
        }
        if (allVisited) {
            return 1;
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (e[v][i] == 0) {
                continue;
            }
            if (visited[i]) {
                continue;
            }
            visited[i] = true;
            ans += dfs(i, n, visited, e);
            visited[i] = false;
        }
        return ans;
    }
}