import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int[][] dp = new int[n][26];
        String[] texts = new String[n];
        for (int i = 0; i < n; i++) {
            texts[i] = std.next();
        }

        for (int i = 0; i < n; i++) {
            String text = texts[i];
            for (int j = 0; j < text.length(); j++) {
                int diff = text.charAt(j) - 'a';
                dp[i][diff]++;
            }
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(n);
        pq.add(0);

        boolean[] visited = new boolean[n];
        long count = 0;
        while (!pq.isEmpty()) {
            int v = pq.poll();
            if (visited[v]) {
                continue;
            }
            visited[v] = true;

            int[] appearCount = dp[v];
            for (int i = 0; i < n; i++) {
                if (i == v || visited[i]) {
                    continue;
                }

                int[] another = dp[i];
                boolean notMatched = false;
                for (int j = 0; j < dp[i].length; j++) {
                    int diff = Math.abs(appearCount[j] - another[j]);
                    if (diff > 0) {
                        notMatched = true;
                        break;
                    }
                }

                if (!notMatched) {
                    count++;
                } else {
                    pq.add(i);
                }
            }
        }

        System.out.println(count);
    }
}
