import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        List<Integer>[] incoming = new List[n];
        int[] outcoming = new int[n];
        for (int i = 0; i < n; i++) incoming[i] = new LinkedList<>();

        for (int i = 0; i < m; i++) {
            int u = scanner.nextInt()-1;
            int v = scanner.nextInt()-1;
            outcoming[u]++;
            incoming[v].add(u);
        }

        int[] dp = new int[n];
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(x->dp[x]));
        for (int i = 0; i < n; i++) {
            if(outcoming[i]==0) queue.add(i);
        }

        while (!queue.isEmpty()){
            Integer poll = queue.poll();
            int curVal = dp[poll];
            for (Integer neighbor : incoming[poll]) {
                if(dp[neighbor]<curVal+1){
                    queue.remove(neighbor);
                    dp[neighbor]=curVal+1;
                    queue.add(neighbor);
                }
            }
        }
        int ans = 0;
        for (int a : dp) ans = Math.max(ans, a);
        System.out.println(ans);
    }
}
