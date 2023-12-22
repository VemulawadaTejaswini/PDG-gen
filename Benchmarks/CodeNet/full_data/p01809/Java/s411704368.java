import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Integer.parseInt;

/**
 * Let's Solve Geometric Problems
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		line = br.readLine();

		long p, q;
		p = parseInt(line.substring(0, line.indexOf(' ')));
		q = parseInt(line.substring(line.indexOf(' ') + 1));

		//reduce
		q /= gcd(p, q);

		//factorize
		List<Long> f = factors(q);
		if (f.size() != 1) {
			Map<Long, Integer> map = new HashMap<>();
			for (long l : f) {
				map.putIfAbsent(l, 0);
				map.put(l, map.get(l) + 1);
			}
			if (map.size() != 1) {
				boolean multi = true;
				int _c = -1;
				for (int c : map.values()) {
					if (_c == -1) {
						_c = c;
						continue;
					} else {
						if (c != _c) {
							multi = false;
							break;
						}
					}
				}
				q = 1;
				for (long l : map.keySet()) {
					q *= l;
				}
			} else {
				q = f.get(0);
			}
		}

		System.out.println(q);

	}//end main

	static long gcd(long a, long b) {
		if (b == 0) return a;
		return gcd(b, a % b);
	}

	static List<Long> factors(long n) {
		if (n == 0) return new ArrayList<Long>() {
			{
				add(1L);
			}
		};
		List<Long> fs = new ArrayList<>();
		long p = 2;
		for (long i = p; i <= n; i++) {
			while (n % i == 0) {
				fs.add(i);
				n /= i;
			}
		}
		return fs;
	}
}