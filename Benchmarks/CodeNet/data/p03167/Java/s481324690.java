import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] nk = br.readLine().split(" ");
		
		int n = Integer.parseInt(nk[0]);
		int k = Integer.parseInt(nk[1]);
		
		String[] a = new String[n];

		for (int i = 0; i < n; i++) {
			a[i] = br.readLine();
		}
		
		int ans = solve(a,n,k);
		
		System.out.println(ans);
	}

	private static int solve(String[] a, int n, int k) {
		
		int[][] dp = new int[n][k];
		int mod = 1000000007;
		
		for (int i = 0; i < n; i++) {
			if(a[i].charAt(0)=='#')
				break;
			dp[i][0] = 1;
		}
		
		
		for (int i = 0; i < k; i++) {
			if(a[0].charAt(i)=='#')
				break;
			dp[0][i] = 1;
		}
		
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < k; j++) {
				
				if(a[i].charAt(j)=='#')
					continue;
				
				dp[i][j] = (dp[i-1][j]+dp[i][j-1])%mod;
				
			}
		}
		
		
		
		return dp[n-1][k-1];
	}
}