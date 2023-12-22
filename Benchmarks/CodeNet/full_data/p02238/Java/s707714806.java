import java.util.HashSet;
import java.util.Scanner;

public class Main {
    private static int[][] adj;
    private static int[] d;
    private static int[] f;
    private static int time = 1;
    private static HashSet<Integer> visited = new HashSet<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        adj = new int[n +1][];
        for (int i = 0; i < n; i++) {
            int u = in.nextInt();
            int k = in.nextInt();
            adj[u] = new int[k];
            for (int j = 0; j < k; j++) {
                adj[u][j] = in.nextInt();
            }
        }
        in.close();
        d = new int[n+1];
        f = new int[n+1];
        for (int i = 1; i <= n; i++) {
            dfs(i);
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " " + d[i] + " " + f[i]);
        }
    }

    private static void dfs(int node) {
        if (!visited.contains(node)) {
            visited.add(node);
            d[node] = time++;
            int[] neighbors = adj[node];
            for (int neighbor : neighbors) {
                dfs(neighbor);
            }
            f[node] = time++;
        }
    }
}

