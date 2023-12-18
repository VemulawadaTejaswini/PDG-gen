import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		sc.close();

		int m = 2019;
		Map<Integer, Integer> map = new HashMap<>();
		addCntMap(map, 0);
		long ans = 0;
		int now = 0;
		int n = s.length;
		for (int i = n - 1; i >= 0; i--) {
			int d = s[i] - '0';
			d *= power(10, n - 1 - i, m);
			now += d;
			now %= 2019;
			ans += ntz(map.get(now));
			addCntMap(map, now);
		}
		System.out.println(ans);
	}

	static int power(int x, int n, int m) {
		if (n == 0) {
			return 1;
		}
		int val = power(x, n / 2, m);
		val = val * val % m;
		if (n % 2 == 1) {
			val = val * x % m;
		}
		return val;
	}

	static int ntz(Integer v) {
		return v == null ? 0 : v;
	}

	static void addCntMap(Map<Integer, Integer> map, Integer key) {
		if (map.containsKey(key)) {
			map.put(key, map.get(key) + 1);
		} else {
			map.put(key, 1);
		}
	}
}
