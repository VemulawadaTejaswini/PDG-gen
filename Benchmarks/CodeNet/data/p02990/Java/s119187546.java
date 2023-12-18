import java.util.*;

public class Main {
    static final int MOD = 1000000007;
 	public static void main (String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[][] comb = new int[n + 1][n + 1];
		for (int i = 1; i <= n; i++) {
		    for (int j = 0; j <= i; j++) {
		        if (j == 0 || j == i) {
		            comb[i][j] = 1;
		        } else {
		            comb[i][j] = (comb[i - 1][j - 1] + comb[i - 1][j]) % MOD;
		        }
		    }
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= k; i++) {
		    long tmp = ((long)comb[k - 1][i - 1] * (long)comb[n - k + 1][i]) % MOD;
		    sb.append(tmp).append("\n");
		}
		System.out.print(sb);
	}
}
