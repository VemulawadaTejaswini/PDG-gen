import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Main {
	static long ans = 0;
	static int n;
	static List<List<Integer>> list;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		n = Integer.parseInt(sa[0]);
		list = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<>());
		}
		for (int i = 0; i < n - 1; i++) {
			sa = br.readLine().split(" ");
			int a = Integer.parseInt(sa[0]) - 1;
			int b = Integer.parseInt(sa[1]) - 1;
			list.get(a).add(b);
			list.get(b).add(a);
		}
		br.close();

		dfs(0, -1);
		long n2 = power(2, n);
		ans = divide(ans, n2, 1000000007);
		System.out.println(ans);
	}

	static long divide(long a, long b, int m) {
		BigInteger ba = BigInteger.valueOf(a);
		BigInteger bm = BigInteger.valueOf(m);
		BigInteger bb = BigInteger.valueOf(b).modInverse(bm);
		return ba.multiply(bb).mod(bm).longValue();
	}

	static int dfs(int x, int p) {
		long val = power(2, n - 1) - 1;
		int sum = 1;
		for (int i : list.get(x)) {
			if (i == p) {
				continue;
			}
			int num = dfs(i, x);
			val -= power(2, num) - 1;
			sum += num;
		}
		val -= power(2, n - sum) - 1;
		ans += val;
		return sum;
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
