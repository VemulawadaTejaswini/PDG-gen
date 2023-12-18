

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long[] a = new long[n];

		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(sc.next());
		}

		Arrays.sort(a);
		int ans = 0;
		HashMap<Integer, Integer> remove = new HashMap<Integer, Integer>();

		for (int i = n - 1; i >= 0; i--) {
			if (remove.containsKey(i))
				continue;
			for (int j = 0; j < i; j++) {
				if (remove.containsKey(j))
					continue;

				if (judge(a[i] + a[j])) {
					ans++;
					remove.put(i, i);
					remove.put(j, j);
				}
			}
		}

		System.out.println(ans);

	}

	static boolean judge(long sum) {
		if ((sum & (sum - 1)) == 0)
			return true;
		else
			return false;

	}

}
