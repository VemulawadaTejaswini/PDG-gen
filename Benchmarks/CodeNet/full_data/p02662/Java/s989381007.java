import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {
	static int N;
	static int S;
	static int[] A;
	static long[] t = new long[30];
	static long res = 0;

	public static void main(String[] args) throws NumberFormatException, IOException {
		read();
	}

	private static void read() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] word = br.readLine().split(" ");
		N = Integer.parseInt(word[0]);
		S = Integer.parseInt(word[1]);
		word = br.readLine().split(" ");
		A = new int[N];

		for (int i = 0; i < N; i++) {
			A[i] = Integer.valueOf(word[i]);
		}
		int[][] dp = new int[N][S + 1];
		dp[0][0] = 2;
		if (A[0] <= S) {
			dp[0][A[0]] = 1;
		}
		for (int i = 1; i < N; i++) {
			dp[i][0] = 1 << (i + 1);
			for (int j = 1; j <= S; j++) {
				dp[i][j] = dp[i - 1][j] * 2;
				dp[i][j] %= 998244353;
				if (j >= A[i]) {
					dp[i][j] += dp[i - 1][j - A[i]];
				}
			}
		}
		
		System.out.println(dp[N-1][S]);
		br.close();

	}

}
