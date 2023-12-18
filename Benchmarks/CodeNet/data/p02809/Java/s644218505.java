import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] sa = br.readLine().split(" ");
		int[] a = new int[n + 1];
		Map<Integer, Set<Integer>> map = new HashMap<>();
		for (int i = 1; i <= n; i++) {
			a[i] = Integer.parseInt(sa[i - 1]);
			Set<Integer> set = map.get(a[i]);
			if (set == null) {
				set = new HashSet<>();
				map.put(a[i], set);
			}
			set.add(i);
		}
		br.close();

		if (n == 2) {
			System.out.println(-1);
			return;
		}

		TreeSet<Integer> set1 = new TreeSet<>();
		TreeSet<Integer> set2 = new TreeSet<>();
		for (int i = 1; i <= n; i++) {
			set1.add(i);
		}

		List<Integer> list = new ArrayList<>();
		while (list.size() < n) {
			Integer o1 = set1.pollFirst();
			if (o1 != null) {
				Integer o2 = set2.pollFirst();
				if (o2 != null && o2 < o1) {
					set2.add(o1);
					o1 = o2;
				}
				if (list.isEmpty() || a[list.get(list.size() - 1)] != o1) {
					list.add(o1);
				} else {
					Integer[] arr = set2.toArray(new Integer[0]);
					for (Integer o : arr) {
						int i = list.get(list.size() - 1);
						if (a[i] != o) {
							list.add(o);
							set2.remove(o);
							break;
						}
					}
					set2.add(o1);
				}
			} else {
				Integer[] arr = set2.toArray(new Integer[0]);
				for (Integer o : arr) {
					for (int i = list.size() - 1; i >= 0; i--) {
						if (a[list.get(i)] != o &&
								(i == list.size() - 1 ||
										!map.containsKey(list.get(i + 1)) ||
										!map.get(list.get(i + 1)).contains(o))) {
							list.add(i + 1, o);
							break;
						}
					}
				}
				if (list.size() < n) {
					throw new Exception();
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		sb.append(list.get(0));
		for (int i = 1; i < n; i++) {
			sb.append(' ').append(list.get(i));
		}
		System.out.println(sb.toString());
	}
}
