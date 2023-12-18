import java.util.Scanner;

/**
 * Longest Path
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            Edge[] edges = new Edge[M];
            for (int i = 0; i < M; i++) {
                edges[i] = new Edge();
                edges[i].from = sc.nextInt();
                edges[i].to = sc.nextInt();
            }

            long[] dp = new long[N + 1];

            int cnt = M;
            for (int k = 0; k < N; k++) {
                int cnt2 = 0;

                for (int i = 0; i < cnt; i++) {
                    if (dp[edges[i].from] >= k) {
                        dp[edges[i].to] = k + 1;

                        edges[cnt2] = edges[i];
                        cnt2++;
                    }
                }

                if (cnt2 == 0) {
                    break;
                }

                cnt = cnt2;
            }

            long max = 0;
            for (int i = 1; i <= N; i++) {
                max = Math.max(max, dp[i]);
            }

            System.out.println(max);
        }
    }

    public static class Edge {

        int from;

        int to;

    }

}
