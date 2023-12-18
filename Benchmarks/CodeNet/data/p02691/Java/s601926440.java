import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		sa = br.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		int[] b = new int[n];
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			b[i] = a[i] - i;
			addCntMap(map, b[i]);
		}

		long ans = 0;
		for (int i = 0; i < n; i++) {
			int key = -i - a[i];
			Integer val = map.get(key);
			if (val != null) {
				ans += val;
			}
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
}
