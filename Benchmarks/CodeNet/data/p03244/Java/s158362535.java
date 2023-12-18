import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				putMap(map1, sc.nextInt());
			} else {
				putMap(map2, sc.nextInt());
			}
		}
		sc.close();

		// 数、値
		int[][] max1 = new int[2][2];
		for (Entry<Integer, Integer> entry : map1.entrySet()) {
			if (max1[0][0] < entry.getValue()) {
				max1[1][0] = max1[0][0];
				max1[1][1] = max1[0][1];
				max1[0][0] = entry.getValue();
				max1[0][1] = entry.getKey();
			} else if (max1[1][0] < entry.getValue()) {
				max1[1][0] = entry.getValue();
				max1[1][1] = entry.getKey();
			}
		}
		int[][] max2 = new int[2][2];
		for (Entry<Integer, Integer> entry : map2.entrySet()) {
			if (max2[0][0] < entry.getValue()) {
				max2[1][0] = max2[0][0];
				max2[1][1] = max2[0][1];
				max2[0][0] = entry.getValue();
				max2[0][1] = entry.getKey();
			} else if (max2[1][0] < entry.getValue()) {
				max2[1][0] = entry.getValue();
				max2[1][1] = entry.getKey();
			}
		}

		if (max1[0][1] != max2[0][1]) {
			System.out.println(n - max1[0][0] - max2[0][0]);
		} else {
			if (max1[1][0] < max2[1][0]) {
				System.out.println(n - max1[0][0] - max2[1][0]);
			} else {
				System.out.println(n - max1[1][0] - max2[0][0]);
			}
		}
	}

	static void putMap(Map<Integer, Integer> map, int i) {
		if (map.containsKey(i)) {
			map.put(i, map.get(i)+1);
		} else {
			map.put(i, 1);
		}
	}
}
