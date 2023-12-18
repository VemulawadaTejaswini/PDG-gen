import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] nk = br.readLine().split(" ");
		int n = Integer.parseInt(nk[0]);
		int k = Integer.parseInt(nk[1]);
		int[] a = new int[n];
		
		String[] input = br.readLine().split(" ");
		
		for (int i = 0; i < input.length; i++) {
			a[i] = Integer.parseInt(input[i]);
		}
		
		int ans = solve(a,k);
		
		System.out.println(ans);
	}

	private static int solve(int[] a, int k) {
		
		int[] dp = new int[a.length];
		
		Arrays.fill(dp, Integer.MAX_VALUE);
		
		dp[0] = 0;
		
		for (int i = 0; i < dp.length; i++) {
			
			for (int j = i+1; j < Math.min(dp.length, i+k+1); j++) {
				dp[j] = Math.min(dp[j], dp[i]+Math.abs(a[i]-a[j]));
			}
			
		}
		
		return dp[a.length-1];
	}
}