import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] v = new int[n];
		HashMap<String, Integer> first = new HashMap<String, Integer>();
		HashMap<String, Integer> second = new HashMap<String, Integer>();
		int ans = 0, fmax = 1, smax = 1;

		for (int i = 0; i < n; i++) {
			v[i] = sc.nextInt();
			if (i % 2 == 0) {
				if (first.get(String.valueOf(v[i])) != null) {
					first.put(String.valueOf(v[i]), first.get(String.valueOf(v[i])) + 1);
					if (first.get(String.valueOf(v[i])) > fmax) {
						fmax = first.get(String.valueOf(v[i]));
					}
				} else {
					first.put(String.valueOf(v[i]), 1);
				}
			} else {
				if (second.get(String.valueOf(v[i])) != null) {
					second.put(String.valueOf(v[i]), second.get(String.valueOf(v[i])) + 1);
					if (second.get(String.valueOf(v[i])) > smax) {
						smax = second.get(String.valueOf(v[i]));
					}
				} else {
					second.put(String.valueOf(v[i]), 1);
				}
			}
		}

		if (first.size() > 1) {
			if (n % 2 == 0) {
				ans = (n / 2) - fmax;
			} else {
				ans = (n / 2) - fmax + 1;
			}
		}

		if (second.size() > 1) {
			ans += (n / 2) - smax;
		}

		if (ans == 0 && v[0] == v[1]) {
			ans = n / 2;
		}

		System.out.println(ans);

		sc.close();
	}

}
