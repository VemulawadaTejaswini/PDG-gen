import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		if (n < 10) {
			System.out.println(0);
			return;
		}

		Eratosthenes e = new Eratosthenes(n);
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 2; i <= n; i++) {
			Map<Integer, Integer> soinsu = e.bunkai(i);
			for (Integer key : soinsu.keySet()) {
				map.put(key, ntz(map.get(key)) + soinsu.get(key));
			}
		}

		int c2 = 0;
		int c4 = 0;
		int c14 = 0;
		int c24 = 0;
		int c74 = 0;
		for (int v : map.values()) {
			if (v >= 2) c2++;
			if (v >= 4) c4++;
			if (v >= 14) c14++;
			if (v >= 24) c24++;
			if (v >= 74) c74++;
		}

		int ans = 0;
		ans += c74;
		ans += c24 * (c2 - 1);
		ans += c14 * (c4 - 1);
		ans += c4 * (c4 - 1) / 2 * (c2 - 2);
		System.out.println(ans);
	}

	static int ntz(Integer o) {
		return o == null ? 0 : o;
	}

	static class Eratosthenes {
		int[] div;

		public Eratosthenes(int n) {
			div = new int[n + 1];
			div[0] = -1;
			div[1] = -1;
			int end = (int) Math.sqrt(n) + 1;
			for (int i = 2; i <= end; i++) {
				if (div[i] == 0) {
					div[i] = i;
					for (int j = i * i; j <= n; j+=i) {
						if (div[j] == 0) div[j] = i;
					}
				}
			}
			for (int i = end + 1; i <= n; i++) {
				if (div[i] == 0) div[i] = i;
			}
		}

		public Map<Integer, Integer> bunkai(int x) {
			Map<Integer, Integer> soinsu = new HashMap<>();
			while (x > 1) {
				Integer d = div[x];
				if (soinsu.containsKey(d)) {
					soinsu.put(d, soinsu.get(d) + 1);
				} else {
					soinsu.put(d, 1);
				}
				x /= d;
			}
			return soinsu;
		}
	}
}
