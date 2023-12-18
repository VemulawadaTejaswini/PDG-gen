import java.util.HashSet;
import java.util.Scanner;

public class Main {
    static int N;
    static int M;
    static int[][] graph;
    static int INF = Integer.MAX_VALUE;

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();

        graph = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                graph[i][j] = INF;
            }
        }

        for (int i = 0; i < M; i++) {
            int from = scanner.nextInt() - 1;
            int to = scanner.nextInt() - 1;
            graph[from][to] = to;
            graph[to][from] = from;
        }

        scanner.close();
        System.out.println(dfs(0, 1, new HashSet<>(1), 0));
    }

    private static int dfs(int i, int passCount, HashSet<Integer> passedVertetes, int count) {
        if (N <= passCount) return Integer.MIN_VALUE;

        for (int to : graph[i]) {
            if (to != INF) {
                if (!passedVertetes.contains(to)) {
                    passedVertetes.add(to);
                    passCount++;
                    if (dfs(to, passCount, passedVertetes, count++) == Integer.MIN_VALUE) return count;
                }
            }
        }

        return count;
    }
}