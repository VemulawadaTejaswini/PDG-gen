import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int q = Integer.parseInt(sa[1]);
		int[] l = new int[q];
		int[] r = new int[q];
		int[] d = new int[q];
		for (int i = 0; i < q; i++) {
			sa = br.readLine().split(" ");
			r[i] = n - Integer.parseInt(sa[0]) + 1;
			l[i] = n - Integer.parseInt(sa[1]);
			d[i] = Integer.parseInt(sa[2]);
		}
		br.close();

		int mod = 998244353;
		long[][] dp = new long[10][n];
		for (int i = 1; i < 10; i++) {
			dp[i][0] = i;
		}
		for (int i = 1; i < n; i++) {
			dp[1][i] = dp[1][i - 1] * 10 % mod;
		}
		for (int i = 1; i < n; i++) {
			dp[1][i] += dp[1][i - 1];
		}
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < n; j++) {
				dp[i][j] = dp[i - 1][j] + dp[1][j];
				dp[i][j] %= mod;
			}
		}

		PrintWriter pw = new PrintWriter(System.out);
		long ans = dp[1][n - 1];
		TreeMap<Integer, Integer> map = new TreeMap<>();
		map.put(0, 1);
		for (int i = 0; i < q; i++) {
			SortedMap<Integer, Integer> sm = map.subMap(l[i], r[i]);
			Integer ok = map.lowerKey(l[i]);
			if (ok == null) {
				ok = l[i];
			}
			int ov = map.get(ok);
			ok = l[i];
			for (int key : sm.keySet()) {
				if (key > 0) {
					ans -= dp[ov][key - 1];
				}
				if (ok > 0) {
					ans += dp[ov][ok - 1];
				}
				ok = key;
				ov = sm.get(key);
			}
			ans -= dp[ov][r[i] - 1];
			if (ok > 0) {
				ans += dp[ov][ok - 1];
			}
			sm.clear();
			map.put(l[i], d[i]);
			if (!map.containsKey(r[i])) {
				map.put(r[i], ov);
			} else if (map.get(r[i]) == d[i]) {
				map.remove(r[i]);
			}
			ans += dp[d[i]][r[i] - 1];
			if (l[i] > 0) {
				ans -= dp[d[i]][l[i] - 1];
			}
			ans %= mod;
			if (ans < 0) {
				ans += mod;
			}
			pw.println(ans);
		}
		pw.flush();
	}
}
