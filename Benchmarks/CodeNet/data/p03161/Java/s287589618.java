import java.io.*;
import java.util.*;
class Main {
	public static final int MAX = 100000;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input1[] = (br.readLine()).trim().split("\\s+");
		int n = Integer.parseInt(input1[0]);
		int k = Integer.parseInt(input1[1]);
		String input2[] = (br.readLine()).trim().split("\\s+");
		int ar[] = new int[n];
		for(int i = 0; i < n; i++) {
			ar[i] = Integer.parseInt(input2[i]);
		}
		int dp[] = new int[n];
		for(int i = n - 1; i >= 0; i--) {
			if(i == n - 1) {
				dp[i] = 0;
				continue;
			}
			// dp[i][0] : one step
			// dp[i][1] : two step
			dp[i] = MAX;
			for(int j = 1; j <= k; j++) {
				if(i + j < n) {
					dp[i] = Math.min(dp[i], dp[i + j] + (int) Math.abs(ar[i + j] - ar[i]));
				}
			}
		}
		System.out.println(dp[0]);
	}
}
