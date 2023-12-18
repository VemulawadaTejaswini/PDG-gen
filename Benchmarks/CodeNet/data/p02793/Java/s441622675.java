//--- pE ---//
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	public static void main (String[] args) throws java.lang.Exception {
		new Solution();
	}
}
class Solution {
	Scanner scanner;
	int inf = (int)1e9;
	int mod = (int)1e9 + 7;
	int max_a = (int)1e6 + 5;

	public Solution() {
		scanner = new Scanner(System.in);

		// scanner.nextLine();
		while (scanner.hasNext()) {
			run_case();
		}
	}
	private void run_case() {
		// scanner.nextLine();
		String line = scanner.nextLine();
		int N = Integer.parseInt(line.split("\\s+")[0]);
		// int N = Integer.parseInt(line.split("\\s+")[1]);

		int[] A = strToIntArray(scanner.nextLine());
		// int max_a = 0;
		// for (int u : A) max_a = Math.max(max_a, u);

		// prime
		// boolean[] isPrime = getPrime(max_a);
		// ArrayList<Integer> prime_idx = new ArrayList<>();
		// ArrayList<Integer> set_prime = new ArrayList<>();
		// for (int i=2; i<=max_a; i++) {
		// 	if (isPrime[i]) {
		// 		// prime_idx.add(i);
		// 		set_prime.add(i);
		// 	}
		// }
		int[] min_prime = sieve(max_a);

		// get fac prime
		// int[] cnt = new int[max_a+1];
		HashMap<Integer, Map<Integer, Integer>> mem = new HashMap<>();

		Map<Integer, Integer> cnt = new HashMap<>();

		for (int u : A) {
			if (mem.containsKey(u)) continue;

			Map<Integer, Integer> t = new HashMap<>();
			int cur_val = u;
			while (u > 1) {
				int factor = min_prime[u];

				t.putIfAbsent(factor, 0);
				t.put(factor, t.get(factor) + 1);
				u /= factor;
			}

			mem.put(cur_val, t);

			for (int key : t.keySet()) {
				if (!cnt.containsKey(key)) {
					cnt.put(key, t.get(key));
				} else {
					cnt.put(key, Math.max(cnt.get(key), t.get(key)) );
				}
			}
		}

		Map<Integer, Map<Integer, Long>> pow_map = new HashMap<>();
		for (int key : cnt.keySet()) {
			if (!pow_map.containsKey(key)) {
				pow_map.put(key, new HashMap<>());
			}
			for (int i=0; i<=cnt.get(key); i++) {
				pow_map.get(key).put(i, power(key, i));
			}
		}

		// Map<Integer, Integer> res_cnt = new HashMap<>();
		long res = 0;
		for (int u : A) {
			long cur = 1;

			Map<Integer, Integer> t = mem.get(u);

			for (int key : cnt.keySet()) {
				int t_cnt = t.get(key) == null ? 0 : t.get(key);

				// cur *= power(key, cnt.get(key) - t_cnt);
				cur *= pow_map.get(key).get(cnt.get(key) - t_cnt);
				cur %= mod;
			}
			res += cur;
			res %= mod;
		}

		System.out.println(res);
		return;
	}

	private long power(int a, int n) {
	    if (n == 0) return 1;
	    long p = power(a, n / 2) % mod;
	    p = (p * p) % mod;
	    if (n % 2 == 1) p = (p * a) % mod;
	    return p;
	}

	private long gcd(long a, long b) {
	    if (b == 0) return a;
	    else return gcd(b, a%b);
	}

	private long lcm(long a, long b) {
	    return (a / gcd(a, b) * b);
	}

	private int[] sieve(int MAX) {
		int[] prime = new int[MAX];
	    prime[0] = prime[1] = 1;
	    for (int i = 2; i < MAX; i++) {
	        if (prime[i] == 0) {
	            for (int j = i * 2; j < MAX; j += i) {
	                if (prime[j] == 0) {
	                    prime[j] = i;
	                }
	            }
	            prime[i] = i;
	        }
	    }
		return prime;
	}

	private boolean[] getPrime(int n) {
	    boolean[] prime = new boolean[n + 1];
	    Arrays.fill(prime, true);
	    prime[0] = prime[1] = false;

	    for (int i=2; i<=Math.sqrt(n); i++) {
	        if (prime[i]) {
	            for (int j=2; i*j <= n; j++) {
	                prime[i*j] = false;
	            }
	        }
	    }
	    return prime;
	}


	private int[] strToIntArray(String str) {
	    String[] vals = str.split("\\s+");
	    int sz = vals.length;
	    int[] res = new int[sz];
	    for (int i=0; i<sz; i++) {
	        res[i] = Integer.parseInt(vals[i]);
	    }
	    return res;
	}
}
