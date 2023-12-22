import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();

		Eratosthenes era = new Eratosthenes(n);
		long ans = 0;
		for (int i = 1; i <= n; i++) {
			ans += (long) i * getDivCnt(era, i);
		}
		System.out.println(ans);
	}

	static class Eratosthenes {
		int[] div;

		public Eratosthenes(int n) {
			if (n < 2) return;
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

		public boolean isSosuu(int x) {
			return div[x] == x;
		}
	}

	static int getDivCnt(Eratosthenes era, int val) {
		Map<Integer, Integer> soinsu = era.bunkai(val);
		int cnt = 1;
		for (int key : soinsu.keySet()) {
			cnt *= soinsu.get(key) + 1;
		}
		return cnt;
	}
}
