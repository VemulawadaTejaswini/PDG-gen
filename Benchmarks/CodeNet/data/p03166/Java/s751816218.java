import java.util.*;

public class Main {

    static List<List<Integer>> edges = new ArrayList<>();
    static int[] dp = null;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        dp = new int[N];
        Arrays.fill(dp,-1);
        for (int i = 0; i < N; i++) {
            edges.add(new ArrayList<>());
        }
        for (int i = 0; i < M; i++) {
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;
            edges.get(x).add(y);
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            ans = Math.max(ans , rec(i));
        }

        System.out.println(ans);
    }

    static private int rec(int node){
        if(dp[node]!=-1) return dp[node];
        int ans =0;
        for(int node2 : edges.get(node)){
            ans = Math.max(ans,rec(node2)+1);
        }
        dp[node] = ans;
        return ans;
    }
}
