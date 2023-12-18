import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		long n = Long.parseLong(str[0]);
		long p = Long.parseLong(str[1]);

		Map<Long, Integer> map = primeFactorization(p);

		long ans = 1;
		for (long key : map.keySet()) {
			int ex = map.get(key);

			for (int i = 0; i < ex / n; i++) {
				ans *= key;
			}
		}

		System.out.println(ans);
	}

	static Map<Long, Integer> primeFactorization(long n) {
		Map<Long, Integer> map = new HashMap<>();
		for (long p = 2; p * p <= n; p++) {
			if (n % p != 0)
				continue;
			int cnt = 0;
			while (n % p == 0) {
				cnt++;
				n = n / p;
			}
			map.put(p, cnt);
		}
		if (n > 1)
			map.put(n, 1);

		return map;
	}
}
