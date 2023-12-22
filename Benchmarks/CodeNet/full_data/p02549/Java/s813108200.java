import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		long n = Long.parseLong(str[0]);
		long k = Long.parseLong(str[1]);

		List<Integer> s = new ArrayList<>();

		for (int i = 0; i < k; i++) {
			str = br.readLine().split(" ");

			int l = Integer.parseInt(str[0]);
			int r = Integer.parseInt(str[1]);

			for (int j = l; j <= r; j++) {
				if (!s.contains(j)) {
					s.add(j);
				}
			}
		}

		long dp[] = new long[200010];
		dp[1] = 1;

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < s.size(); j++) {
				if (i + s.get(j) <= n) {
					dp[i + s.get(j)] = (dp[i + s.get(j)] + dp[i]) % 998244353;
				}
			}
		}
		System.out.println(dp[(int) n] % 998244353);
	}
}
