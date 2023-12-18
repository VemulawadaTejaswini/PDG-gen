import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br;
	static StringTokenizer tokenizer;

	public static void main(String[] args) throws Exception {
		br = new BufferedReader(new InputStreamReader(System.in));
		int n = nextInt();
		int m = nextInt();
		int[] arr = new int[n];
		int[] dp = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = nextInt();
			dp[i] = Integer.MAX_VALUE;
		}
		dp[0] = 0;
		for(int i = 0; i < n - 1; i++) {
			int max = Math.min(i + m, n - 1);
			for(int k = 1; k + 1 <= max; k++) {
			dp[i + 1] = Math.min(dp[i + k], Math.abs(arr[i] - arr[i + k]) + dp[i]);
			}
		}
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
