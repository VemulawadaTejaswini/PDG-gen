import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		int[] a = new int[n + 1];
		HashMap<Integer, Integer> b = new HashMap<Integer, Integer>();
		int ans = 0, max = 0;

		for (int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
			if (b.get(a[i]) != null) {
				b.put(a[i], b.get(a[i]) + 1);
			} else {
				b.put(a[i], 1);
			}
			if (max < a[i]) {
				max = a[i];
			}
		}

		for (Map.Entry<Integer, Integer> i : b.entrySet()) {
			if (i.getKey() < i.getValue()) {
				ans += i.getValue() - i.getKey();
			} else if (i.getValue() < i.getKey()) {
				ans += i.getValue();
			}
		}

		System.out.println(ans);

		sc.close();
	}
}
