
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		List<Integer>[] path = new ArrayList[n + 1];
		for(int i = 1; i < n + 1; i++) {
			path[i] = new ArrayList<>();
		}
		for(int i = 0; i < m; i++) {
			int s = sc.nextInt();
			int t = sc.nextInt();
			path[s].add(t);
		}
		double[] dp = new double[n + 1];
		double ans = Double.MAX_VALUE;
		for(int i = 1; i < n + 1; i++) {
			for(int j = n; j > 0; j--) {
				dp[j] = 0;
				double max = 0;
				if(j == n) {
					dp[j] = 0;
				} else {
					for(Integer to : path[j]) {
						dp[j] += dp[to] + 1;
						max = Math.max(max, dp[to] + 1);
					}
					if(i == j) {
						dp[j] -= max;
						if(path[j].size() - 1 != 0)
							dp[j] /= (path[j].size() - 1);
						else
							dp[j] = Double.MAX_VALUE;
					} else {
						dp[j] /= path[j].size();
					}
				}
			}

			ans = Math.min(ans, dp[1]);
		}
		System.out.println(ans);
	}

}
