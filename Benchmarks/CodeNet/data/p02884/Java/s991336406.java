import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		HashSet<Integer>[] graph = new HashSet[n + 1];
		for (int i = 1; i <= n; i++) {
		    graph[i] = new HashSet<Integer>();
		}
		for (int i = 0; i < m; i++) {
		    graph[sc.nextInt()].add(sc.nextInt());
		}
		double[] dp = new double[n + 1];
		for (int i = n - 1; i >= 1; i--) {
		    for (int x : graph[i]) {
		        dp[i] += (dp[x] + 1) / graph[i].size();
		    }
		}
		double min = dp[1];
		for (int i = 1; i < n; i++) {
		    if (graph[i].size() <= 1) {
		        continue;
		    }
		    double max = 0;
		    dp[i] = 0;
		    for (int x : graph[i]) {
		        max = Math.max(dp[x] + 1, max);
		        dp[i] += dp[x] + 1;
		    }
		    dp[i] -= max;
		    dp[i] /= (graph[i].size() - 1);
		    for (int j = i - 1; j >= 1; j--) {
		        dp[j] = 0;
		        for (int x : graph[j]) {
		            dp[j] += (dp[x] + 1) / graph[j].size();
		        }
		    }
		    min = Math.min(min, dp[1]);
		}
		System.out.println(min);
	}
}
