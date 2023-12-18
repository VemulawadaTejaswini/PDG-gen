import java.util.*;

public class Main {
	// static class Triple {
	// 	int r, g, b, val;
	// 	Triple(int r, int g, int b, int val) {
	// 		this.r = r;
	// 		this.g = g;
	// 		this.b = b;
	// 		this.val = val;
	// 	}
	// }

	static final int MOD = 998244353;
	static final int SHIFT = 1024;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, 1);
		for (int i = 0; i < N; i++) {
			HashMap<Integer, Integer> nextMap = new HashMap<Integer, Integer>();
			for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
				int key = entry.getKey();
				int b = key % SHIFT;
				int g = (key / SHIFT) % SHIFT;
				int r = key / (SHIFT * SHIFT);
				// System.out.println(i + ": " + r + ", " + g + ", " + b);
				int value = entry.getValue();

				int key1 = ((r + a[i]) * SHIFT + g) * SHIFT + b;
				if (nextMap.containsKey(key1)) {
					nextMap.put(key1, (nextMap.get(key1) + value) % MOD);
				} else {
					nextMap.put(key1, value);
				}

				int key2 = ((r) * SHIFT + g + a[i]) * SHIFT + b;
				if (nextMap.containsKey(key2)) {
					nextMap.put(key2, (nextMap.get(key2) + value) % MOD);
				} else {
					nextMap.put(key2, value);
				}

				int key3 = ((r) * SHIFT + g) * SHIFT + b + a[i];
				if (nextMap.containsKey(key3)) {
					nextMap.put(key3, (nextMap.get(key3) + value) % MOD);
				} else {
					nextMap.put(key3, value);
				}
			}
			map = nextMap;
		}
		int sum = 0;
		for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
			int key = entry.getKey();
			int b = key % SHIFT;
			int g = (key / SHIFT) % SHIFT;
			int r = key / (SHIFT * SHIFT);
			int value = entry.getValue();
			// System.out.println(r + ", " + g + ", " + b + " = " + value);
			if ((r < g + b) && (g < r + b) && (b < r + g)) {
				sum = (sum + value) % MOD;
			}
		}
		System.out.println(sum);
	}
}
