import java.util.*;
import java.io.*;
import java.util.function.*;

public class Main {
	public final int MOD = (int)1e9 + 7;
	int[] weight;
	int[] value;
	public void solve(BufferedReader br) throws IOException {
		int[] nw = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int N = nw[0];
		int W = nw[1];
		weight = new int[N + 1];
		value = new int[N + 1];
		for (int i = 0; i < N; i++) {
			int[] wv = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			weight[i + 1] = wv[0];
		   	value[i + 1] = wv[1];
		}
		int sum_of_value = 0;
		for (int i = 1; i <= N; i++) sum_of_value += value[i];
		//System.out.println(sum_of_value);
		System.out.println(findZeroOneKanpsack(N, W, sum_of_value));	
	}	

	public long findZeroOneKanpsack(int n, int w, int size) {
		// dp[i] stores the minimum weight that we can have with size exactly value i
		long[] dp = new long[size + 1];
		Arrays.fill(dp, (long) 1e18 + 7);
		dp[0] = 0;		
		for (int i = 1; i <= n; i++) {
			for (int j = size; j >= value[i]; j--) {
				dp[j] = Math.min(dp[j], weight[i] + dp[j - value[i]]);
			}	
		}
		long ans = 0;
		for (int i = 0; i <= size; i++) {
			if (dp[i] <= w) ans = Math.max(ans, i);
		}
		//for (int i = 0; i <= size; i++) System.out.println(i + " " +dp[i]);
		return ans;
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

