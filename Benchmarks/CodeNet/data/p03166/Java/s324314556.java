import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] inDegree = new int[N];
        List<Integer>[] edge = new ArrayList[N];
        for(int i = 0; i < N; i++) {
            edge[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < M; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            edge[x-1].add(y-1);
            inDegree[y-1]++;
        }
        //queue for zero indegree nodes
        LinkedList<Integer> queue = new LinkedList();
        for (int i = 0; i < N; i++) {
            if (inDegree[i] == 0) {
                queue.offerLast(i);
            }
        }
        long[] dp = new long[N];
        while (queue.size() > 0) {
            int v = queue.pollFirst();
            for (int w : edge[v]) {
                dp[w] = Math.max(dp[w], dp[v] + 1);
                if(--inDegree[w] == 0) {
                    queue.offerLast(w);
                }
            }
        }

        long ans=0;
        for (int i = 0; i < N; i++) {
            ans = Math.max(ans, dp[i]);
        }
    
        System.out.println(ans);
    }
}