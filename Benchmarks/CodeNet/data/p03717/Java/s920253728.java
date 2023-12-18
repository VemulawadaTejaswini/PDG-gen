import java.util.*;

public class Main {
    static final int MOD = 1000000007;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
		for (int i = 0; i < m; i++) {
		    int left = sc.nextInt();
		    int right = sc.nextInt();
		    int value = sc.nextInt();
		    if (map.containsKey(right)) {
		        if (map.get(right).containsKey(value)) {
		            if (value == 3) {
		                if (map.get(right).get(value) < left) {
		                    map.get(right).put(value, left);
		                }
		            } else {
		                if (map.get(right).get(value) > left) {
		                    map.get(right).put(value, left);
		                }
		            }
		        } else {
		            map.get(right).put(value, left);
		        }
		    } else {
		        HashMap<Integer, Integer> tmp = new HashMap<>();
		        tmp.put(value, left);
		        map.put(right, tmp);
		    }
		}
		int[][][] dp = new int[n + 1][n + 1][n + 1];
		dp[0][0][0] = 1;
		for (int i = 1; i <= n; i++) {
		    int[] checks = new int[3];
		    if (map.containsKey(i)) {
		        for (Map.Entry<Integer, Integer> entry : map.get(i).entrySet()) {
		            checks[entry.getKey() - 1] = entry.getValue();
		        }
		    }
		    for (int r = 0; r < i; r++) {
		        for (int g = 0; g < i; g++ ) {
		            for (int b = 0; b < i; b++) {
		                if (r != i - 1 && g != i - 1 && b != i - 1) {
		                    continue;
		                }
		                if ((checks[0] == 0 || (g < checks[0] && b < checks[0])) &&
		                    (checks[1] == 0 || ((g < checks[1] && b >= checks[1]) || g >= checks[1] && b < checks[1])) &&
		                    (checks[2] == 0 || (g >= checks[2] && b >= checks[2]))) {
		                        dp[i][g][b] += dp[r][g][b];
		                        dp[i][g][b] %= MOD;
		                }
		                if ((checks[0] == 0 || (b < checks[0] && r < checks[0])) &&
		                    (checks[1] == 0 || ((b < checks[1] && r >= checks[1]) || b >= checks[1] && r < checks[1])) &&
		                    (checks[2] == 0 || (b >= checks[2] && r >= checks[2]))) {
		                        dp[r][i][b] += dp[r][g][b];
		                        dp[r][i][b] %= MOD;
		                }
		                if ((checks[0] == 0 || (r < checks[0] && g < checks[0])) &&
		                    (checks[1] == 0 || ((r < checks[1] && g >= checks[1]) || r >= checks[1] && g < checks[1])) &&
		                    (checks[2] == 0 || (r >= checks[2] && g >= checks[2]))) {
		                        dp[r][g][i] += dp[r][g][b];
		                        dp[r][g][i] %= MOD;
		                }
		            }
		        }
		    }
		}
		int total = 0;
		for (int i = 0; i < n; i++) {
		    for (int j = 0; j < n; j++) {
		        total += dp[n][i][j];
		        total %= MOD;
		        total += dp[i][j][n];
		        total %= MOD;
		        total += dp[j][n][i];
		        total %= MOD;
		    }
		}
	    System.out.println(total);
    }
}

