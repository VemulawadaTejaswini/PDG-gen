import java.util.*;
import java.io.*;
import java.util.function.*;

public class Main {
	public final int MOD = (int)1e9 + 7;
	
	public void solve(BufferedReader br) throws IOException {
		int[] nk = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int n = nk[0];
		int k = nk[1];
		int[] ar = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] dp = new int[n];
		Arrays.fill(dp, 1000000000 + 7);
		dp[0] = 0;
		for (int i = 0; i < n; i++) {
			int[] array = new int[k];
			for (int j = 0; j < k; j++) array[j] = i + j + 1;
			for (int j: array) {
				if (j < n) {
					dp[j] = Math.min(dp[j], dp[i] + Math.abs(ar[i] - ar[j]));
				}
			}
		}
		System.out.println(dp[n - 1]);
		//System.out.println(Arrays.toString(ar));	
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

