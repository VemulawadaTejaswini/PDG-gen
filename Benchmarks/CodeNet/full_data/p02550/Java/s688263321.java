import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		long n = Long.parseLong(sa[0]);
		int x = Integer.parseInt(sa[1]);
		int m = Integer.parseInt(sa[2]);
		br.close();

		Set<Long> set = new HashSet<>();
		long ans = x;
		long now = x;
		int i = 1;
		set.add(now);
		for ( ; i < n; i++) {
			now = now * now % m;
			ans += now;
			if (!set.add(now)) {
				i++;
				break;
			}
		}

		long sum = 0;
		int d = 0;
		set.clear();
		for ( ; i < n; i++) {
			now = now * now % m;
			ans += now;
			if (!set.add(now)) {
				i++;
				break;
			}
			sum += now;
			d++;
		}
		if (i == n) {
			System.out.println(ans);
			return;
		}

		long r = n - i;
		ans += sum * (r / d);
		r %= d;
		for (int j = 0; j < r; j++) {
			now = now * now % m;
			ans += now;
		}
		System.out.println(ans);
	}
}
