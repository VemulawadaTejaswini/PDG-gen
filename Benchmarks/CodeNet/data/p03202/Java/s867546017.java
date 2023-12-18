import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Main {
	static TreeMap<Integer, Integer> map;
	static int ans;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] sa = br.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		ans = 0;
		map = new TreeMap<>();
		for (int i = 0; i < n; i++) {
			Integer ce = map.ceilingKey(a[i]);
			if (ce == null) {
				Integer lo = map.lowerKey(a[i]);
				if (lo == null) {
					ans++;
				} else {
					if (map.get(lo) == 1) {
						map.remove(lo);
					}
				}
				map.put(a[i], 1);
			} else {
				boolean res = update(a[i], ce);
				if (!res) {
					ans++;
					update(a[i], ce);
				}
			}
		}
		System.out.println(ans);
	}

	static boolean update(int ai, int ce) {
		Integer[] arr = map.descendingKeySet().toArray(new Integer[0]);
		for (Integer k : arr) {
			if (k > ce) {
				continue;
			}
			int v = map.get(k);
			if (k == ce) {
				k = ai;
			}
			if (v < ans) {
				map.put(k, v + 1);
				if (k > 1) {
					if (map.containsKey(k - 1)) {
						if (map.get(k - 1) == v + 1) {
							map.remove(k - 1);
						}
					} else {
						map.put(k - 1, v);
					}
				}
				map.tailMap(k + 1).clear();
				if (k < ai) {
					map.put(ai, 1);
				}
				return true;
			}
		}
		return false;
	}
}
