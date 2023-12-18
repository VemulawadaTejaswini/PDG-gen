import java.util.*;

public class Main {
    static int[][] costs;
    static int[] cities;
    static int[][] dp;
    static int r;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		r = sc.nextInt();
		cities = new int[r];
		for (int i = 0; i < r; i++) {
		    cities[i] = sc.nextInt() - 1;
		}
		costs = new int[n][n];
		for (int i = 0; i < n; i++) {
		    Arrays.fill(costs[i], Integer.MAX_VALUE / 10);
		    costs[i][i] = 0;
		}
		for (int i = 0; i < m; i++) {
		    int a = sc.nextInt() - 1;
		    int b = sc.nextInt() - 1;
		    int c = sc.nextInt();
		    costs[a][b] = c;
		    costs[b][a] = c;
		}
		for (int i = 0; i < n; i++) {
		    for (int j = 0; j < n; j++) {
		        for (int k = 0; k < n; k++) {
		            costs[j][k] = Math.min(costs[j][k], costs[j][i] + costs[i][k]);
		        }
		    }
		}
		dp = new int[r][1 << r];
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < r; i++) {
		    min = Math.min(min, dfw(i, (1 << r) - 1));
		}
		System.out.println(min);
    }
    
    static int dfw(int start, int key) {
        int nextkey = key ^ (1 << start);
        if (nextkey == 0) {
            return 0;
        }
        if (dp[start][key] != 0) {
            return dp[start][key];
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < r; i++) {
            int next = (1 << i);
            if ((nextkey & next) == 0) {
                continue;
            }
            min = Math.min(min, dfw(i, nextkey) + costs[cities[start]][cities[i]]);
        }
        dp[start][key] = min;
        return min;
    }
}

