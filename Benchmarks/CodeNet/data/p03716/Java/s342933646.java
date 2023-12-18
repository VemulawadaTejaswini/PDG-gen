import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		sa = br.readLine().split(" ");
		int[] a = new int[n * 3];
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		long sum1 = 0;
		PriorityQueue<Integer> que = new PriorityQueue<>();
		for (int i = 0; i < n; i++) {
			que.add(a[i]);
			sum1 += a[i];
		}

		TreeMap<Integer, Integer> map = new TreeMap<>();
		for (int i = n; i < a.length; i++) {
			addCntMap(map, a[i]);
		}
		long sum2 = 0;
		for (int i = 0; i < n; i++) {
			Integer min = map.firstKey();
			sum2 += min;
			delCntMap(map, min);
		}

		long ans = sum1 - sum2;
		for (int i = n; i < n * 2; i++) {
			que.add(a[i]);
			int min = que.poll();
			sum1 = sum1 + a[i] - min;

			if (map.containsKey(a[i])) {
				delCntMap(map, a[i]);
			} else {
				sum2 -= a[i];
				min = map.firstKey();
				sum2 += min;
				delCntMap(map, min);
			}
			ans = Math.max(ans, sum1 - sum2);
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
