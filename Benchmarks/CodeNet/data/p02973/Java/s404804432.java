import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		br.close();

		TreeMap<Integer, Integer> map = new TreeMap<>();
		for (int i = 0; i < n; i++) {
			Integer l = map.lowerKey(a[i]);
			putCntMap(map, a[i]);
			removeCntMap(map, l);
		}

		int ans = 0;
		for (Integer k : map.keySet()) {
			ans += map.get(k);
		}
		System.out.println(ans);
	}

	static void putCntMap(Map<Integer, Integer> map, Integer key) {
		if (map.containsKey(key)) {
			map.put(key, map.get(key) + 1);
		} else {
			map.put(key, 1);
		}
	}

	static void removeCntMap(Map<Integer, Integer> map, Integer key) {
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
