import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var a = new int[n];
		var map1 = new HashMap<Integer, Integer>();
		var map2 = new HashMap<Integer, Integer>();
		for (var i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			var v1 = i + a[i];
			if (!map1.containsKey(v1)) {
				map1.put(v1, 1);
			} else {
				map1.put(v1, map1.get(v1) + 1);
			}
			var v2 = i - a[i];
			if (!map2.containsKey(v2)) {
				map2.put(v2, 1);
			} else {
				map2.put(v2, map2.get(v2) + 1);
			}
		}
		sc.close();

		var count = 0;
		for (var v1 : map1.keySet()) {
			if (map2.containsKey(v1)) {
				count += map1.get(v1) * map2.get(v1);
			}
		}

		System.out.println(count);
	}
}