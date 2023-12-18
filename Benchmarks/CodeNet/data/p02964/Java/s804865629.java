import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		long k = Long.parseLong(sa[1]);
		sa = br.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		// 同じ値が出てくる次のインデックス
		int[] b = new int[n];
		Map<Integer, List<Integer>> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			if (map.containsKey(a[i])) {
				List<Integer> list = map.get(a[i]);
				b[list.get(list.size() - 1)] = i;
				list.add(i);
			} else {
				List<Integer> list = new ArrayList<>();
				list.add(i);
				map.put(a[i], list);
			}
		}
		for (Integer key : map.keySet()) {
			List<Integer> list = map.get(key);
			b[list.get(list.size() - 1)] = list.get(0);
		}

//		for (int i = 0; i < n; i++) {
//			System.out.println(b[i]);
//		}

		int i = 0;
		int cnt = 0;
		while (true) {
			if (i >= b[i]) {
				cnt++;
			}
			i = b[i] + 1;
			if (i == n) {
				cnt++;
				break;
			}
		}
//		System.out.println(cnt);

		k %= cnt;
		if (k == 0) k = cnt;
		i = 0;
		cnt = 0;
		while (cnt < k - 1) {
			if (i >= b[i]) {
				cnt++;
			}
			i = b[i] + 1;
		}

		Set<Integer> set = new HashSet<>();
		List<Integer> list = new ArrayList<>();
		for ( ; i < n; i++) {
			if (set.contains(a[i])) {
				while (true) {
					int x = list.get(list.size() - 1);
					set.remove(x);
					list.remove(list.size() - 1);
					if (x == a[i]) {
						break;
					}
				}
			} else {
				set.add(a[i]);
				list.add(a[i]);
			}
		}

		if (list.isEmpty()) {
			System.out.println();
		} else {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < list.size(); j++) {
				sb.append(list.get(j)).append(' ');
			}
			sb.deleteCharAt(sb.length() - 1);
			System.out.println(sb.toString());
		}
	}
}
