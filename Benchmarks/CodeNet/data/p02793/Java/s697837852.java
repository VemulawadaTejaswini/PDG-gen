import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] sa = br.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		Eratosthenes er = new Eratosthenes(1000000);
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			Map<Integer, Integer> soinsu = er.bunkai(a[i]);
			for (Integer key : soinsu.keySet()) {
				if (map.containsKey(key)) {
					map.put(key, Math.max(map.get(key), soinsu.get(key)));
				} else {
					map.put(key, soinsu.get(key));
				}
			}
		}

		long lcm = 1;;
		for (Integer key : map.keySet()) {
			lcm *= power(key, map.get(key));
			lcm %= 1000000007;
		}
		BigInteger blcm = BigInteger.valueOf(lcm);
		BigInteger m = BigInteger.valueOf(1000000007);

		BigInteger ans = BigInteger.ZERO;
		for (int i = 0; i < n; i++) {
			ans = ans.add(blcm.multiply(BigInteger.valueOf(a[i]).modInverse(m))).mod(m);
		}
		System.out.println(ans);
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
				if (div[i] == 0) {
					div[i] = i;
				}
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

	static long power(long x, long n) {
		if (n == 0) {
			return 1;
		}
		int mod = 1000000007;
		long val = power(x, n / 2);
		val = val * val % mod;
		if (n % 2 == 1) {
			val = val * x % mod;
		}
		return val;
	}
}
