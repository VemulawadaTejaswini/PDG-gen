import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int k = Integer.parseInt(sa[1]);
		sa = br.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		long ans = 0;
		int x = 39;
		List<Long> list = new ArrayList<>();
		for ( ; x >= 0; x--) {
			list.clear();
			for (int i = 0; i < n; i++) {
				long sum = 0;
				for (int j = i; j < n; j++) {
					sum += a[j];
					if ((sum >> x & 1) == 1) {
						list.add(sum);
					}
				}
			}
			if (list.size() >= k) {
				ans += (1 << x);
				break;
			}
		}
		x--;
		for ( ; x >= 0; x--) {
			List<Long> list2 = new ArrayList<>();
			for (long e : list) {
				if ((e >> x & 1) == 1) {
					list2.add(e);
				}
			}
			if (list2.size() >= k) {
				ans += (1 << x);
				list = list2;
			}
		}
		System.out.println(ans);
	}
}
