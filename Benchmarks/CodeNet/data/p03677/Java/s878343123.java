import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		sa = br.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		List<List<Integer>> list = new ArrayList<>(m + 1);
		for (int i = 0; i <= m; i++) {
			list.add(new ArrayList<>());
		}
		int[] cnt = new int[m + 2];
		for (int i = 1; i < n; i++) {
			list.get(a[i]).add(i);
			if (a[i - 1] < a[i]) {
				cnt[a[i - 1] + 1]++;
				cnt[a[i]]--;
			} else {
				cnt[a[i - 1] + 1]++;
				cnt[0]++;
				cnt[a[i]]--;
			}
		}
		for (int i = 1; i < cnt.length; i++) {
			cnt[i] += cnt[i - 1];
		}

		long ans = 0;
		for (int i = 1; i < n; i++) {
			if (a[i - 1] < a[i]) {
				ans += a[i] - a[i - 1];
			} else {
				ans += a[i] + 1;
			}
		}

		long val = ans;
		for (int i = 1; i <= m; i++) {
			for (int j : list.get(i - 1)) {
				val += (a[j] + m - a[j - 1]) % m - 1;
			}
			val -= cnt[i - 1];
			ans = Math.min(ans, val);
		}
		System.out.println(ans);
	}
}
