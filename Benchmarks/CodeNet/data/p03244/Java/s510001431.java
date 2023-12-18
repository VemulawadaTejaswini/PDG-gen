import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int v[] = new int[n];
		int dec = 0;
		for (int i = 0; i < n; i++) {
			v[i] = sc.nextInt();
			if (v[i] != 0 && v[i] != v[0]) {
				dec = 1;
			}
		}
		if (dec == 0) {
			System.out.println(n / 2);
			sc.close();
			return;
		}

		Map<Integer, Integer> mp1 = new HashMap<>();
		Map<Integer, Integer> mp2 = new HashMap<>();

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				if (mp1.containsKey(v[i])) {
					mp1.put(v[i], mp1.get(v[i]) + 1);
				} else {
					mp1.put(v[i], 1);
				}
			} else {
				if (mp2.containsKey(v[i])) {
					mp2.put(v[i], mp2.get(v[i]) + 1);
				} else {
					mp2.put(v[i], 1);
				}
			}
		}

		int max1 = 0, max2 = 0, maxx1 = 0, maxx2 = 0;
		int num1 = 0, num2 = 0;
		for (Map.Entry<Integer, Integer> entry : mp1.entrySet()) {
			if (max1 < entry.getValue()) {
				max1 = entry.getValue();
				num1 = entry.getKey();
			}
		}
		for (Map.Entry<Integer, Integer> entry : mp2.entrySet()) {
			if (max2 < entry.getValue()) {
				max2 = entry.getValue();
				num2 = entry.getKey();
			}
		}
		for (Integer val : mp1.values()) {
			if (max1 != val)
				maxx1 = Math.max(maxx1, val);
		}
		for (Integer val : mp2.values()) {
			if (max2 != val)
				maxx2 = Math.max(maxx2, val);
		}
		sc.close();
		if (num1 == num2) {
			int a = Math.max(max1 + maxx2, maxx1 + max2);
			System.out.println(n - a);
		} else {
			System.out.println(n - max1 - max2);
		}
	}
}