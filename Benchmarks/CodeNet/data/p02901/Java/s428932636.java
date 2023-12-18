import java.util.*;

public class Main {
	static int max;
	static int[][] dp;
	static int m;
	static Key[] keys;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		m = sc.nextInt();
		max = 0;
		keys = new Key[m + 1];
		for (int i = 1; i <= m; i++) {
			keys[i] = new Key(sc.nextInt());
			int x = sc.nextInt();
			for (int j = 0; j < x; j++) {
				keys[i].add(sc.nextInt());
			}
			max += keys[i].cost;
		}
		int all = 0;
		for (int i = 0; i < n; i++) {
			all += pow2(i);
		}
		dp = new int[m + 1][all + 1];
		int cost = dfs(m, all);
		if (cost > max) {
			cost = -1;
		}
		System.out.println(cost);
	}
	
	static int dfs(int idx, int k) {
		if (k == 0) {
			return 0;
		}
		if (idx == 0) {
			return max + 1;
		}
		if (dp[idx][k] != 0) {
			return dp[idx][k];
		}
		int ans = Math.min(dfs(idx - 1, k), keys[idx].cost + dfs(idx - 1, k - (k & keys[idx].open)));
		dp[idx][k] = ans;
		return ans;
	}
	
	static class Key {
		int cost;
		int open;
		
		public Key(int cost) {
			this.cost = cost;
			this.open = 0;
		}
		
		public void add(int a) {
			open += pow2(a - 1);
		}
	}
	
	static int pow2(int x) {
		if (x == 0) {
			return 1;
		} else {
			return 2 * pow2(x - 1);
		}
	}
}
