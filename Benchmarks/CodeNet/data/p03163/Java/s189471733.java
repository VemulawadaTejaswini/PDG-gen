import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] nk = br.readLine().split(" ");
		int n = Integer.parseInt(nk[0]);
		int k = Integer.parseInt(nk[1]);
		
		int[] a = new int[n];
		int[] w = new int[n];

		for (int i = 0; i < n; i++) {
			String[] input = br.readLine().split(" ");
			w[i] = Integer.parseInt(input[0]);
			a[i] = Integer.parseInt(input[1]);
		}
		
		long ans = solve(n,k,a,w);
		
		System.out.println(ans);
	}

	private static long solve(int n, int w, int[] value, int[] wt) {
		
		long[][] dp = new long[n+1][w+1];
		
		for(int i=1; i<dp.length; i++) {
			for(int j=1; j<dp[0].length; j++) {
				if(wt[i-1]<=j) {
					dp[i][j]=Math.max(value[i-1]+dp[i-1][j-wt[i-1]], dp[i-1][j]);
				}else
					dp[i][j]=dp[i-1][j];
			}
		}
		
		
		return dp[n][w];
	}
}
