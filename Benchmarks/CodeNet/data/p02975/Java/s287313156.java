import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	static int cnt = 0;
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			putCntMap(map, a);
		}
		sc.close();

		Integer[] k = map.keySet().toArray(new Integer[0]);
		if (k.length > 3) {
			System.out.println("No");
		} else if (k.length == 3) {
			Arrays.parallelSort(k);
			int v0 = map.get(k[0]);
			int v1 = map.get(k[1]);
			int v2 = map.get(k[2]);
			if (v0 == v1 && v1 == v2) {
				if ((k[0] ^ k[1]) == k[2]) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			} else {
				System.out.println("No");
			}
		} else if (k.length == 2) {
			Arrays.parallelSort(k);
			if (k[0] == 0) {
				int v0 = map.get(k[0]);
				int v1 = map.get(k[1]);
				if (v0 * 2 == v1) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			} else {
				System.out.println("No");
			}
		} else if (k.length == 1) {
			if (k[0] == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
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
