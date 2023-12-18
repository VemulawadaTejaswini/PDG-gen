import java.util.*;

class Main {
    static List<Integer>[] graph;
    static int[] dp;

    public static int dfs(int pos) {
    	if(graph[pos].size() == 0) return 0;

    	if(dp[pos] == -1) {
    		for(int i = 0; i < graph[pos].size(); i++) {
    			dp[pos] = Math.max(dp[pos], dfs(graph[pos].get(i)) + 1);
    		}
    	}

    	return dp[pos];	
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

    	int n = sc.nextInt();
    	int m = sc.nextInt();

    	graph = new ArrayList[n+1];
    	for(int i = 0; i < n+1; i++)
    		graph[i] = new ArrayList<>();
    	for(int i = 0; i < m; i++) {
    		int x = sc.nextInt();
    		int y = sc.nextInt();
    		graph[x].add(y);
    	}
    	// System.out.println(Arrays.deepToString(graph));

    	dp = new int[n+1];
    	Arrays.fill(dp, -1);

    	int ans = 0;
    	for(int i = 1; i < n+1; i++) {
    		ans = Math.max(ans, dfs(i));
    	}

    	System.out.println(ans);
    }
}