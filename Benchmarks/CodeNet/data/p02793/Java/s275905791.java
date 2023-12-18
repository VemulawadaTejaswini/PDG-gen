import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	static long MOD = 1000000007L;
	int N;
	long[] A, B, temp;
	long gcd, lcm;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		this.A = new long[N];
		String[] tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			A[i] = Long.parseLong(tokens[i]);
		}
		this.B = new long[N];
		this.temp = Arrays.copyOf(A, A.length);
	}

	List<Long> getSoinsuuBunkai(long val) {
		long div = -1;
		for (long i = 2; i < Math.sqrt(val) + 1; ++i) {
			if (val % i == 0) {
				div = i;
				break;
			}
		}
		if (div < 0) {
			// val が素数
			List<Long> result = new ArrayList<>(1);
			result.add(val);
			return result;
		} else {
			List<Long> result = getSoinsuuBunkai(val / div);
			result.add(div);
			return result;
		}
	}

	Map<Long, Integer> count(List<Long> sosuu) {
		Map<Long, Integer> map = new HashMap<>();
		for (int i = 0; i < sosuu.size(); ++i) {
			if (map.containsKey(sosuu.get(i))) {
				map.put(sosuu.get(i), map.get(sosuu.get(i)) + 1);
			} else {
				map.put(sosuu.get(i), 1);
			}
		}
		return map;
	}

	void calc() {
		// 最小公倍数と最大公約数を求める
		// まずAの値を全部素因数分解する
		List<Long>[] a = new List[N];
		for (int i = 0; i < N; ++i) {
			a[i] = getSoinsuuBunkai(A[i]);
		}
		Map<Long, Integer> map = new HashMap<>();
		for (List<Long> sosuu : a) {
			Map<Long, Integer> subMap = count(sosuu);
			for (Long key : subMap.keySet()) {
				if (map.containsKey(key)) {
					map.put(key, Math.max(subMap.get(key), map.get(key)));
				} else {
					map.put(key, subMap.get(key));
				}
			}
		}
		lcm = lcm(map);
		// Bの一覧を求める
		for (int i = 0; i < N; ++i) {
			B[i] = (lcm * inv(A[i])) % MOD;
		}
	}

	long lcm(Map<Long, Integer> map) {
		long result = 1;
		for (Long key : map.keySet()) {
			for (int i = 0; i < map.get(key); ++i) {
				result *= key;
				result %= MOD;
			}
		}
		return result;
	}

	long gcd(long large, long small) {
		if (small > large) {
			return gcd(small, large);
		}
		if (large % small == 0) {
			return small;
		}
		return gcd(small, large % small);
	}

	void showResult() {
		long result = 0L;
		for (int i = 0; i < N; ++i) {
			result += B[i];
			result %= MOD;
		}
		System.out.println(result);
	}

	static long inv(long val) {
		long result = 1L;
		long k = MOD - 2L;
		long y = val;
		while (k != 0) {
			if ((k & 1L) > 0) {
				result = (result * y) % MOD;
			}
			y = (y * y) % MOD;
			k /= 2;
		}
		return result;

	}
}