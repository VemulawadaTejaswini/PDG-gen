import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br;
	static StringTokenizer tokenizer;

	public static void main(String[] args) throws Exception {
		br = new BufferedReader(new InputStreamReader(System.in));
		int n = nextInt();
		int w = nextInt();
		int[] weight = new int[n];
		int[] val = new int[n];
		long[] dp = new long[w + 1];
		for(int i = 0; i < n; i++) {
			weight[i] = nextInt();
			val[i] = nextInt();
		}
		for(int i = 0; i < n; i++) {
//			System.out.println(Arrays.toString(dp));
			for(int k = w; k >= weight[i]; k--) {
				if(dp[k - weight[i]] == 0)
					continue;
				dp[k] = Math.max(dp[k], dp[k - weight[i]] + val[i]);
			} 
			if(weight[i] <= w)
				dp[weight[i]] = Math.max(dp[weight[i]], val[i]);
		}
//		System.out.println(Arrays.toString(dp));
		long max = 0;
		for(int i = 0; i <= w; i++)
			max = Math.max(max, dp[i]);
		System.out.println(max);
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
