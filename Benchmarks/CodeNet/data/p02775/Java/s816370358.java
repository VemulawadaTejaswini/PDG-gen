import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		br.close();

		int n = s.length();
		long[] dp0 = new long[n + 1];
		long[] dp1 = new long[n + 1];
		for (int i = n - 1; i >= 0; i--) {
			int j = n - 1 - i;
			int c = s.charAt(i) - '0';
			dp0[j + 1] = Math.min(dp0[j] + c, dp1[j] + c + 1);
			dp1[j + 1] = Math.min(dp0[j] + 10 - c, dp1[j] + 9 - c);
		}
		long ans = Math.min(dp0[n], dp1[n] + 1);
		System.out.println(ans);
	}
}
