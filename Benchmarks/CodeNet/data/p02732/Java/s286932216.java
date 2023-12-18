import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		List<Integer> b = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b.add(a[i]);
		}
		Collections.sort(b);
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			if (map.get(b.get(i)) == null) {
				map.put(b.get(i), 1);
			} else {
				map.put(b.get(i), map.get(b.get(i)) + 1);
			}
		}
		Map<Integer, Long> res = new HashMap<>();
		for (int i = 0; i < n; i++) {
			if (res.get(a[i]) == null) {
				long sum = 0;
				for (int key : map.keySet()) {
					if (key == a[i]) {
						sum += (map.get(key) - 1) * (map.get(key) - 2) / 2L;
					} else {
						sum += map.get(key) * (map.get(key) - 1) / 2L;
					}
				}
				res.put(a[i], sum);
				System.out.println(sum);
			} else {
				System.out.println(res.get(a[i]));
			}
		}
	}
}
