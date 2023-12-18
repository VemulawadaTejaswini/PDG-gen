import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Longest Path
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            List<Integer>[] edges = new List[N + 1];
            for (int i = 1; i <= N; i++) {
                edges[i] = new ArrayList<>();
            }

            int[] count = new int[N + 1];

            for (int i = 0; i < M; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();

                edges[x].add(y);
                count[y]++;
            }

            long[] dp = new long[N + 1];

            ArrayDeque<Integer> queue = new ArrayDeque<>();

            for (int i = 1; i <= N; i++) {
                if (count[i] == 0) {
                    queue.add(i);
                }
            }

            while (!queue.isEmpty()) {
                Integer v = queue.poll();

                for (Integer e : edges[v]) {
                    dp[e] = Math.max(dp[e], dp[v] + 1);

                    if (!queue.contains(e)) {
                        queue.add(e);
                    }
                }
            }

            long max = 0;
            for (long d : dp) {
                max = Math.max(max, d);
            }

            System.out.println(max);
        }
    }

}
