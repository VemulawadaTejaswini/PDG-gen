import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n + 1];
		for (int i = 1; i < a.length; i++) {
			a[i] = sc.nextLong();
		}
		sc.close();

		for (int i = 1; i < a.length; i++) {
			a[i] += a[i - 1];
		}

		Map<Long, Long> map = new HashMap<Long, Long>();
		for (int i = 0; i < a.length; i++) {
			putCntMap(map, a[i]);
		}

		long ans = 0;
		for (Long l : map.keySet()) {
			long x = map.get(l);
			ans += x * (x - 1) / 2;
		}
		System.out.println(ans);
	}

	static void putCntMap(Map<Long, Long> map, Long key) {
		if (map.containsKey(key)) {
			map.put(key, map.get(key) + 1);
		} else {
			map.put(key, 1L);
		}
	}
}
