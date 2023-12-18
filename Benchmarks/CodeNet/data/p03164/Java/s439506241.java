import java.util.*;
import java.io.*;

public class HighWeightKnapsack {
	static BufferedReader br;
	static StringTokenizer tokenizer;

	public static void main(String[] args) throws Exception {
		br = new BufferedReader(new InputStreamReader(System.in));
		int n = nextInt();
		int w = nextInt();
		int[] weight = new int[n];
		int[] val = new int[n];
		int max = 0;
		for(int i = 0; i < n; i++) {
			weight[i] = nextInt();
			val[i] = nextInt();
			max += val[i];
		}
		long[] dp = new long[max + 1];
		Arrays.fill(dp, Long.MAX_VALUE);
		dp[0] = 0;
		for(int i = 0; i < n; i++) {
			for(int k = max; k >= val[i]; k--) {
				if(dp[k - val[i]] == Long.MAX_VALUE || dp[k - val[i]] + weight[i] > w)
					continue;
				dp[k] = Math.min(dp[k], dp[k - val[i]] + weight[i]);
			}
		}
		for(int i = max; i >=0; i--) {
			if(dp[i] < Long.MAX_VALUE) {
				System.out.println(i);
				return;
			}
		}
	}

	public static String next() throws IOException {
		while (tokenizer == null || !tokenizer.hasMoreTokens()) {
			String line = br.readLine();
			if (line == null)
				throw new IOException();
			tokenizer = new StringTokenizer(line);
		}
		return tokenizer.nextToken();
	}

	public static int nextInt() throws IOException {
		return Integer.parseInt(next());
	}
}
