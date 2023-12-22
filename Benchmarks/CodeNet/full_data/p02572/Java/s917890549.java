import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long a[] = new long[n];
		for (int i = 0; i < n; i++) a[i] = sc.nextLong();
		solve(a, n);
	}

	private static void solve(long[] a, int n) {
		// TODO Auto-generated method stub
		Map<String, Long> memo = new HashMap<String, Long>();
		long res = 0, mod = 1_000_000_007;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				String k = a[i] + "_" + a[j];
				if (memo.containsKey(k)) res = (res + memo.get(k)) % mod;
				else {
					long t = a[i] * a[j];
					memo.put(k, t);
					res = (res + t) % mod;
				}
			}
		}
		System.out.println(res);
	}

}
