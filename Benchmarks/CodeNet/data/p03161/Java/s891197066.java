import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static int n;
	static int[] arr;
	static int[] memo;
	static boolean f = false;
	static boolean t = false;
	static int OO = (int) 1e9 + 7;
	static int k;

	static int dp(int i) {

		if (i == n - 1)
			return 0;
		if (i >= n)
			return OO;
		if (memo[i] != -1)
			return memo[i];

		int a = OO;
		for (int j = 1; j <= k && i + j < n; j++) {

			a = Math.min(Math.abs(arr[i] - arr[i + j]) + dp(i + j), a);

		}
		return memo[i] = a;

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		arr = new int[n + 1];
		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		memo = new int[n + 1];
		Arrays.fill(memo, -1);
		pw.print(dp(0));
		pw.close();
	}
}
