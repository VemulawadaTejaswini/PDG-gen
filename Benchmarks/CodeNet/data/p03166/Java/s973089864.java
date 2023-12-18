import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vertexCount = scanner.nextInt();
        int edgeCount = scanner.nextInt();

        int[][] edges = new int[edgeCount][2];
        for (int i = 0; i < edgeCount; ++i) {
            edges[i][0] = scanner.nextInt();
            edges[i][1] = scanner.nextInt();
        }

        int[] dp = new int[vertexCount];
        for (int step = 0; step < 2; ++step) {
            for (int i = 0; i < edgeCount; ++i) {
                dp[edges[i][1] - 1] = Math.max(dp[edges[i][1] - 1], dp[edges[i][0] - 1] + 1);
            }
        }

        int res = 0;
        for (int i = 0; i < vertexCount; ++i) {
            res = Math.max(res, dp[i]);
        }

        System.out.println(res);
    }
}
