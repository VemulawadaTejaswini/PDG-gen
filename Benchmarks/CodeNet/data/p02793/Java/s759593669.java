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
	// int max_a = (int)1e6;

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
		int max_a = 0;
		for (int u : A) max_a = Math.max(max_a, u);

		// prime
		boolean[] isPrime = getPrime(max_a);
		ArrayList<Integer> prime_idx = new ArrayList<>();
		ArrayList<Integer> set_prime = new ArrayList<>();
		for (int i=2; i<=max_a; i++) {
			if (isPrime[i]) {
				// prime_idx.add(i);
				set_prime.add(i);
			}
		}

		// get fac prime
		int[] cnt = new int[set_prime.size()];
		HashMap<Integer, List<Integer>> mem = new HashMap<>();
		outer:
		for (int u : A) {
			if (mem.containsKey(u)) continue;
			int[] t = new int[set_prime.size()];
			int cur_val = u;
			for (int i=0; i<set_prime.size(); i++) {
				while (u % set_prime.get(i) == 0) {
					u /= set_prime.get(i);
					t[i] ++;
				}
				// done
				if (u == 1) {
					ArrayList<Integer> tl = new ArrayList<>();
					for (int v : t) tl.add(v);
					mem.put(cur_val, tl);

					for (int k=0; k<cnt.length; k++) {
						cnt[k] = Math.max(cnt[k], t[k]);
					}
					continue outer;
				}
			}
		}

		long res = 0;
		for (int u : A) {
			long cur = 1;
			List<Integer> t = mem.get(u);
			for (int i=0; i<cnt.length; i++) {
				long tt = 1;
				for (int j=0; j<cnt[i] - t.get(i); j++) {
					tt *= set_prime.get(i);
					tt %= mod;
				}
				cur *= tt;
				cur %= mod;
			}
			res += cur;
			res %= mod;
		}

		System.out.println(res);
		return ;
	}

	private long gcd(long a, long b) {
	    if (b == 0) return a;
	    else return gcd(b, a%b);
	}

	private long lcm(long a, long b) {
	    return (a / gcd(a, b) * b);
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
class Spell {
	public int power, cost;
	public Spell(int power, int cost) {
		this.power = power;
		this.cost = cost;
	}
}
