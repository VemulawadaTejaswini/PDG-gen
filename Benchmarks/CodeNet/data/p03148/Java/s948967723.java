import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int k = Integer.parseInt(sa[1]);
		Susi[] arr = new Susi[n];
		for (int i = 0; i < n; i++) {
			sa = br.readLine().split(" ");
			Susi o = new Susi();
			o.t = Integer.parseInt(sa[0]);
			o.d = Integer.parseInt(sa[1]);
			arr[i] = o;
		}
		br.close();

		Arrays.sort(arr, (o1, o2) -> o2.d - o1.d);
		long ans = 0;
		long sumd = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < k; i++) {
			addCntMap(map, arr[i].t);
			sumd += arr[i].d;
		}
		ans = sumd + (long) map.size() * map.size();

		long val = ans;
		int idx = k - 1;
		for (int i = k; i < n; i++) {
			if (!map.containsKey(arr[i].t)) {
				while (idx >= 0 && map.get(arr[idx].t) == 1) {
					idx--;
				}
				if (idx < 0) {
					break;
				}
				long d1 = arr[i].d - arr[idx].d;
				long size = map.size();
				long d2 = (size + 1) * (size + 1) - size * size;
				val += d1 + d2;
				ans = Math.max(ans, val);
				map.put(arr[idx].t, map.get(arr[idx].t) - 1);
				map.put(arr[i].t, 1);
				idx--;
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

	static class Susi {
		int t, d;
	}
}
