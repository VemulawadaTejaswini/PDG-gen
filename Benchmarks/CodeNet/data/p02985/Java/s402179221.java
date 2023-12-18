import java.util.*;
 
public class Main {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < N-1; i++) {
            int a = sc.nextInt(); a--;
            int b = sc.nextInt(); b--;
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        long ans = K*dfs(K, graph, 0, -1);
        ans %= MOD;

        System.out.println(ans);
    }

    private static long dfs(int K, List<List<Integer>> graph, int now, int from) {

        int colorNum = from == -1 ? K-1 : K-2;

        long ret = 1;
        for (int next : graph.get(now)) {
            if (next != from) {
                ret *= colorNum;
                ret %= MOD;
                colorNum--;

                ret *= dfs(K, graph, next, now);
                ret %= MOD;
            }
        }

        return ret;
    }
}
