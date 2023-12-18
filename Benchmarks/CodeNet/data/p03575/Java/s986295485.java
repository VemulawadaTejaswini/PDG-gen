import java.util.Scanner;

public class Main {

    private static int n;
    private static boolean[][] graph;
    private static boolean[] visited;

    private static void dfs(int v) {
        visited[v] = true;
        for (int i = 0; i < n; i++) {
            if (!graph[v][i] || visited[i]) {
                continue;
            }
            dfs(i);
        }
    }

    private static boolean isBridge() {
        for (int j = 0; j < n; j++) {
            if (!visited[j]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[m];
        int[] b = new int[m];
        graph = new boolean[n][n];
        visited = new boolean[n];
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            graph[a[i] - 1][b[i] - 1] = true;
            graph[b[i] - 1][a[i] - 1] = true;
        }

        int result = 0;
        for (int i = 0; i < m; i++) {
            graph[a[i] - 1][b[i] - 1] = false;
            graph[b[i] - 1][a[i] - 1] = false;
            for (int j = 0; j < n; j++) {
                visited[j] = false;
            }

            dfs(0);

            if (isBridge()) {
                result += 1;
            }
            graph[a[i] - 1][b[i] - 1] = true;
            graph[b[i] - 1][a[i] - 1] = true;
        }
        System.out.println(result);
    }

}
