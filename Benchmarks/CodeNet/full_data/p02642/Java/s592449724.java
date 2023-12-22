import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] sa = br.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		Arrays.sort(a);

		int ans = 0;
		Set<Integer> set = new HashSet<>();
		label:
		for (int i = 0; i < n; i++) {
			if (i < n - 1 && a[i] == a[i + 1]) {
				set.add(a[i]);
				continue;
			}
			List<Integer> list = divList(a[i]);
			for (Integer e : list) {
				if (set.contains(e)) {
					continue label;
				}
			}
			set.add(a[i]);
			ans++;
		}
		System.out.println(ans);
	}

	static List<Integer> divList(int n) {
		List<Integer> list = new ArrayList<>();
		int end = (int) Math.sqrt(n);
		for (int i = 1; i <= end; i++) {
			if (n % i == 0) {
				list.add(i);
			}
		}
		int i = end * end == n ? list.size() - 2 : list.size() - 1;
		for ( ; i >= 0; i--) {
			list.add(n / list.get(i));
		}
		return list;
	}
}
