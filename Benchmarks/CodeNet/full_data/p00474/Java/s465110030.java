
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		l = scanner.nextInt();
		turara = new int[n + 2];
		for (int i = 1; i <= n; i++)
			turara[i] = scanner.nextInt();
		dp = new int[n + 1];
		Arrays.fill(dp, -1);

		int ret = 0;
		for (int i = 1; i <= n; i++)
			ret = Math.max(ret, slove(i));
		System.out.println(ret);
	}

	private int slove(int idx) {
		if (dp[idx] != -1)
			return dp[idx];
		int ret = 0;
		if (turara[idx] < turara[idx + 1])
			ret = Math.max(ret, slove(idx + 1));
		if (turara[idx] < turara[idx - 1])
			ret = Math.max(ret, slove(idx - 1));
		return dp[idx] = ret + (l - turara[idx]);
	}

	int[] dp, turara;
	int n, l;

}