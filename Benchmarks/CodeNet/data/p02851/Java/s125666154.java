import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int k = Integer.parseInt(sa[1]);
		sa = br.readLine().split(" ");
		int[] a = new int[n + 1];
		for (int i = 0; i < n; i++) {
			a[i + 1] = Integer.parseInt(sa[i]) - 1;
		}
		br.close();

		for (int i = 1; i <= n; i++) {
			a[i] += a[i - 1];
			a[i] %= k;
		}

		Map<Integer, Integer> map = new HashMap<>();
		long ans = 0;
		for (int i = 0; i <= n; i++) {
			if (i >= k) {
				delCntMap(map, a[i - k]);
			}
			if (map.containsKey(a[i])) {
				ans += map.get(a[i]);
			}
			addCntMap(map, a[i]);
		}
		System.out.println(ans);
	}

	static void addCntMap(Map<Integer, Integer> map, Integer key) {
		if (map.containsKey(key)) {
			map.put(key, map.get(key) + 1);
		} else {
			map.put(key, 1);
		}
	}

	static void delCntMap(Map<Integer, Integer> map, Integer key) {
		if (key != null && map.containsKey(key)) {
			int val = map.get(key);
			if (val == 1) {
				map.remove(key);
			} else {
				map.put(key, val - 1);
			}
		}
	}
}
