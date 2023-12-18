import java.util.*;

public class Main {
    static boolean[] visit;
    static boolean[][] graph;
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int M = sc.nextInt();
        int[] a = new int[M + 1];
        int[] b = new int[M + 1];
        graph = new boolean[N + 1][N + 1];
        visit = new boolean[N + 1];

        for (int i = 1; i <= M; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            graph[a[i]][b[i]] = graph[b[i]][a[i]] = true;
        }

        int ans = 0;
        for (int i = 1; i <= M; i++) {
            graph[a[i]][b[i]] = graph[b[i]][a[i]] = false;
            Arrays.fill(visit, false);

            DFS(1);

            boolean flag = false;
            for (int j = 1; j <= N; j++) {
                if (!visit[j]) {
                    flag = true;
                }
            }
            if (flag) {
                ans++;
            }

            graph[a[i]][b[i]] = graph[b[i]][a[i]] = true;
        }
        System.out.println(ans);
    }

    static void DFS(int n) {
        visit[n] = true;
        for (int i = 1; i <= N; i++) {
            if (!graph[n][i]) continue;
            if (visit[i]) continue;
            DFS(i);
        }
    }
}
