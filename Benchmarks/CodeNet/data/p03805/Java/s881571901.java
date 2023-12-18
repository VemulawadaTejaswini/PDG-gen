public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    static int nMax = 8;
    static boolean[][] graph = new boolean[nMax][nMax];

    public static void main(String[] args) {
        int n = scanner.nextInt(), m = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt() - 1, b = scanner.nextInt() - 1;
            graph[a][b] = graph[b][a] = true;
        }
        boolean[] visited = new boolean[nMax];
        visited[0] = true;
        System.out.println(dfs(0, n, visited));
    }

    static int dfs(int v, int n, boolean[] visited) {
        boolean allVisited = true;
        for (int i = 0; i < n; i++)
            if (!visited[i])
                allVisited = false;
        if (allVisited)
            return 1;
        int ret = 0;
        for (int i = 0; i < n; i++) {
            if (graph[v][i] && !visited[i]) {
                visited[i] = true;
                ret += dfs(i, n, visited);
                visited[i] = false;
            }
        }
        return ret;
    }
}