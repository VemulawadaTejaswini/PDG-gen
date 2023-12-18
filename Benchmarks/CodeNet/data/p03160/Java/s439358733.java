import java.util.*;
import java.io.*;

public class frogDP {
	static BufferedReader br;
	static StringTokenizer tokenizer;

	public static void main(String[] args) throws Exception {
		br = new BufferedReader(new InputStreamReader(System.in));
		int n = nextInt();
		int[] arr = new int[n];
		int[] dp = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = nextInt();
			dp[i] = Integer.MAX_VALUE;
		}
		dp[0] = 0;
		for(int i = 0; i < n - 2; i++) {
			dp[i + 1] = Math.min(dp[i + 1], Math.abs(arr[i] - arr[i + 1]) + dp[i]);
			dp[i + 2] = Math.min(dp[i + 2], Math.abs(arr[i] - arr[i + 2]) + dp[i]);
		}
		dp[n - 1] = Math.min(dp[n - 1], Math.abs(arr[n - 2] - arr[n - 1]) +dp[n - 2]);
		System.out.println(dp[n - 1]);
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
