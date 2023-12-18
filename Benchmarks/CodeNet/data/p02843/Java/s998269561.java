import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		boolean dp[] = new boolean[100010];

		dp[0] = true;
		for (int i = 1; i < dp.length; i++) {
			if (i < 100) {
				dp[i] = false;
			} else if (dp[i - 100] || dp[i - 101] || dp[i - 102] || dp[i - 103] || dp[i - 104] || dp[i - 105]) {
				dp[i] = true;
			} else {
				dp[i] = false;
			}
		}

		if (dp[n]) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}