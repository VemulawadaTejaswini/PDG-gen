import java.util.*;

public class Main {
    static boolean[][] graph;
    static boolean[] visited;
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();
        graph = new boolean[n][n];
        visited = new boolean[n];
        int[] a = new int[m];
        int[] b = new int[m];

        for(int i = 0; i < m; i++) {
            a[i] = sc.nextInt() - 1;
            b[i] = sc.nextInt() - 1;
        }

        for(int i = 0; i < m; i++) {
            graph[a[i]][b[i]] = true;
            graph[b[i]][a[i]] = true;
        }

        int count = 0;
        for (int i = 0; i < m; i++) {
            graph[a[i]][b[i]] = false;
            graph[b[i]][a[i]] = false;
            dfs(0);

            for(int j = 0; j < n; j++) {
                if (!visited[j]) {
                    count++;
                    break;
                }
            }

            graph[a[i]][b[i]] = true;
            graph[b[i]][a[i]] = true;
            Arrays.fill(visited, false);
        }

        System.out.println(count);
    }

    static void dfs(int x) {
        if(visited[x]) return;
        visited[x] = true;
        for(int i = 0; i < n; i++) {
            if(graph[x][i]) dfs(i);
        }
    }
}
