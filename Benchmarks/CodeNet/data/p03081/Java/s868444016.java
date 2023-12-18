import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		String s = sc.next();
		Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();
		for (int i = 0; i < n; i++) {
			String str = s.substring(i, i + 1);
			List<Integer> list = map.get(str);
			if (list == null) {
				list = new ArrayList<Integer>();
				map.put(str, list);
			}
			list.add(i);
		}

		int ans = 0;
		int[] cnt = new int[n];
		Arrays.fill(cnt, 1);
		for (int i = 0; i < q; i++) {
			String t = sc.next();
			String d = sc.next();
			List<Integer> list = map.get(t);
			if (list == null) {
				continue;
			}
			if ("L".equals(d)) {
				for (int j = 0; j < list.size(); j++) {
					int idx = list.get(j);
					if (idx == 0) {
						ans += cnt[idx];
					} else {
						cnt[idx - 1] += cnt[idx];
					}
					cnt[idx] = 0;
				}
			} else {
				for (int j = list.size() - 1; j >= 0; j--) {
					int idx = list.get(j);
					if (idx == n - 1) {
						ans += cnt[idx];
					} else {
						cnt[idx + 1] += cnt[idx];
					}
					cnt[idx] = 0;
				}
			}
		}
		sc.close();

		System.out.println(n - ans);
	}
}
