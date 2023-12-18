import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] v = new int[n];
		for (int i = 0; i < n; i++) {
			v[i] = sc.nextInt();
		}
		sc.close();

		int ans = 0;
		for (int a = 0; a <= n && a <= k; a++) {
			for (int b = 0; b <= n && b <= k; b++) {
				int x = a + b;
				if (x > k || x > n) {
					break;
				}

				int val = 0;
				List<Integer> list = new ArrayList<Integer>(a + b);
				for (int i = 0; i < a; i++) {
					val += v[i];
					list.add(v[i]);
				}
				for (int i = n - 1; i >= n - b; i--) {
					val += v[i];
					list.add(v[i]);
				}

				Collections.sort(list);
				for (int i = 0; i < k - x && i < list.size(); i++) {
					int m = list.get(i);
					if (m < 0) {
						val -= m;
					} else {
						break;
					}
				}
				ans = Math.max(ans, val);
			}
		}
		System.out.println(ans);
	}
}
