import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		Map<Long, Integer> hm = new HashMap<>();
		long b = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong() - i - 1;
			if (hm.containsKey(a[i])) {
				hm.put(a[i], hm.get(a[i]) + 1);
			} else {
				hm.put(a[i], 1);
			}
		}
		long temp = 0;
		long tempKey = 0;
		List<Long> sortedKey = new ArrayList<>();
		for (long key : hm.keySet()) {
			sortedKey.add(key);
		}
		Collections.sort(sortedKey);
		for (long key : sortedKey) {
			if (hm.get(key) == temp) {
				if(Math.abs(key) < Math.abs(tempKey)) {
					tempKey = key;
					temp = hm.get(key);
				}
			} else if (hm.get(key) > temp) {
				tempKey = key;
				temp = hm.get(key);
			}
			b = tempKey;
		}
		long ans = 0;
		for (int i = 0; i < n; i++) {
			ans += Math.abs(a[i] - b);
		}
		System.out.println(ans);
	}
}