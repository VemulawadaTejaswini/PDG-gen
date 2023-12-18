import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		for (int i = 0; i < n; i++) {
		    graph.add(new ArrayList<>());
		}
		for (int i = 0; i < m; i++) {
		    graph.get(sc.nextInt() - 1).add(sc.nextInt() - 1);
		}
		double[] dp = new double[n];
		for (int i = n - 2; i >= 0; i--) {
		    for (int x : graph.get(i)) {
		        dp[i] += (dp[x] + 1) / graph.get(i).size();
		    }
		}
		double min = dp[0];
		for (int i = 0; i < n; i++) {
		    if (graph.get(i).size() <= 1) {
		        continue;
		    }
		    dp[i] = 0;
		    double max = 0;
		    for (int x : graph.get(i)) {
		        max = Math.max(max, dp[x] + 1);
		        dp[i] += dp[x] + 1;
		    }
		    dp[i] -= max;
		    dp[i] /= graph.get(i).size() - 1;
		    for (int j = i - 1; j >= 0; j--) {
		        dp[j] = 0;
		        for (int x : graph.get(j)) {
		            dp[j] += (dp[x] + 1) / graph.get(j).size();
		        }
		    }
		    min = Math.min(min, dp[0]);
		}
		System.out.println(min);
    }
}
