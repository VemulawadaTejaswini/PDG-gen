import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();

		Map<Integer, Integer> soinsu = bunkai(m);
		long ans = 1;
		for (int k : soinsu.keySet()) {
			int v = soinsu.get(k);
			ans *= nCr(v + n - 1, v);
			ans %= 1000000007;
		}
		System.out.println(ans);
	}

	static Map<Integer, Integer> bunkai(int n) {
		Map<Integer, Integer> soinsu = new HashMap<Integer, Integer>();
		int d = 2;
		while (n > 1) {
			if (n % d == 0) {
				n /= d;
				if (soinsu.containsKey(d)) {
					soinsu.put(d, soinsu.get(d) + 1);
				} else {
					soinsu.put(d, 1);
				}
			} else {
				d++;
			}
		}
		return soinsu;
	}

	static long nCr(long n, long r) {
		long m = 1000000007;
		long val = 1;
		for (int i = 1; i <= r; i++) {
			val = val * (n - i + 1) % m;
			val = val * modinv(i, m) % m;
		}
		return val;
	}

	static long modinv(long a, long m) {
		long b = m;
		long u = 1;
		long v = 0;
		long tmp = 0;

		while (b > 0) {
			long t = a / b;
			a -= t * b;
			tmp = a;
			a = b;
			b = tmp;

			u -= t * v;
			tmp = u;
			u = v;
			v = tmp;
		}

		u %= m;
		if (u < 0) u += m;
		return u;
	}
}
