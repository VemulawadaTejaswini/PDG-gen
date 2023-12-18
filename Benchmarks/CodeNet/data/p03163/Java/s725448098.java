import java.util.*;
import java.io.*;
import java.util.function.*;

public class Main {
	public final int MOD = (int)1e9 + 7;
	
	public void solve(BufferedReader br) throws IOException {
		int[] nw = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int n = nw[0];
		int W = nw[1];
		long[] dp = new long[W + 1];
		// dp[i] - Contains the maximum knapsack value containing exactly weight i
		for (int i = 0; i < n; i++) {
			int[] wv = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
 			int w = wv[0];
			long v = wv[1];
			for (int j = W; j >= w; j--) {
				dp[j] = Math.max(dp[j], v + dp[j - w]);
			}
		}	
		System.out.println(dp[W]);
	}
	
	public long mathPow(long base, long exp, long mod) {
		long res = 1;
		base = base % mod;
		while (exp > 0) {
			if ((exp & 1) == 1) res = (res * base ) % mod;
			exp = exp >> 1;
			base = (base * base) % mod;
		}
		return res;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		new Main().solve(br);
	}
}

