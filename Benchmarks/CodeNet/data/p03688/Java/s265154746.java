import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
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

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			putCntMap(map, a[i]);
		}
		int size = map.keySet().size();
		if (size == 1) {
			int x = map.keySet().iterator().next();
			if (x == n - 1 || 2 * x <= n) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		} else if (size == 2) {
			Iterator<Integer> it = map.keySet().iterator();
			int m1 = it.next();
			int m2 = it.next();
			int x = Math.min(m1, m2);
			int y = Math.max(m1, m2);
			if (y - x != 1) {
				System.out.println("No");
			} else {
				int xc = map.get(x);
				int yc = map.get(y);
				if (xc < y) {
					if (2 * (y - xc) <= yc) {
						System.out.println("Yes");
					} else {
						System.out.println("No");
					}
				} else {
					System.out.println("No");
				}
			}
		} else {
			System.out.println("No");
		}
	}

	static void putCntMap(Map<Integer, Integer> map, Integer key) {
		if (map.containsKey(key)) {
			map.put(key, map.get(key) + 1);
		} else {
			map.put(key, 1);
		}
	}
}
