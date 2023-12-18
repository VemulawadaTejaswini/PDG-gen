import java.util.Scanner;

public class Main {

    static final int INF = Integer.MAX_VALUE;

    static class Key {
        int cost;
        int boxes;

        public Key(int cost, int boxes) {
            this.cost = cost;
            this.boxes = boxes;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        Key[] keys = new Key[M];
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int boxes = 0;
            for (int j = 0; j < b; j++) boxes += (1 << sc.nextInt() - 1);
            // System.out.println(Integer.toBinaryString(boxes));
            keys[i] = new Key(a, boxes);
        }

        int[][] dp = new int[M + 1][1 << N];
        for (int i = 1; i < 1 << N; i++) {
            dp[0][i] = INF;
        }
        for (int i = 1; i <= M; i++) {
            for (int j = 0; j < 1 << N; j++) {
                dp[i][j] = dp[i - 1][j];
            }
            Key key = keys[i - 1];
            for (int j = 0; j < 1 << N; j++) {
                int k = j | key.boxes;
                if (dp[i - 1][j] == INF) continue;
                dp[i][k] = Math.min(dp[i][k], dp[i - 1][j] + key.cost);
            }
        }

        System.out.println(dp[M][(1 << N) - 1] == INF ? -1 : dp[M][(1 << N) - 1]);
    }
}
