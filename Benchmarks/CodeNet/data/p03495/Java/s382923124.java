import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		Map<Integer, Integer> map = new HashMap<>();
		
		while (sc.hasNextInt()) {
			int key = sc.nextInt();
			if (map.containsKey(key)) {
				map.put(key, map.get(key) + 1);
			} else {
				map.put(key, 1);
			}
		}
		int ans = 0;
		while (map.keySet().size() <= k) {
			int key = 0;
			int min = n;
			for (Integer i : map.keySet()) {
				if (map.get(i) < n) {
					key = i;
					min = map.get(i);
				}
			}
			ans += min;
			map.remove(key);
		}
		System.out.println(ans);
	}
}
