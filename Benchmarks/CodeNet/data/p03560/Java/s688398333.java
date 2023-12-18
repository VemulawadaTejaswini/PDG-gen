import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    private static class Node {
        private int to, cost;

        private Node(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int K = scan.nextInt();
        int[] dp = new int[K];
        Arrays.fill(dp, Integer.MAX_VALUE);

        PriorityQueue<Node> que = new PriorityQueue<>(new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o1.cost-o2.cost;
            }
        });
        for (int i = 1; i < Math.min(10, K); ++i) {
            dp[i] = i;
            que.add(new Node(i, i));
        }

        while (!que.isEmpty()) {
            Node node = que.poll();
            int v = node.to;
            int c = node.cost;
            if (c > dp[v]) continue;
            for (int i = 0; i < 10; ++i) {
                int nextv = (v * 10 + i) % K;
                int nextc = c + i;
                if (dp[nextv] > nextc) {
                    dp[nextv] = nextc;
                    que.add(new Node(nextv, nextc));
                }
            }
        }
        System.out.println(dp[0]);
    }
}