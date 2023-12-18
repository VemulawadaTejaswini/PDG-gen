import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long[] cost = new long[M];
        int[][] index = new int[N][N];
        long[][] d = new long[N][N];
        long INF = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                index[i][j] = -1;
                if (i != j) {
                    d[i][j] = INF;
                }
            }
        }
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            int c = sc.nextInt();
            cost[i] = c;
            index[a][b] = i;
            index[b][a] = i;
            d[a][b] = c;
            d[b][a] = c;
        }
        for (int k = 0; k < N; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
                }
            }
        }
        boolean used[] = new boolean[M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    if (index[k][j] != -1 && d[i][j] == d[i][k] + cost[index[k][j]]) {
                        used[index[k][j]] = true;
                    }
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < M; i++) {
            if (!used[i]) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
