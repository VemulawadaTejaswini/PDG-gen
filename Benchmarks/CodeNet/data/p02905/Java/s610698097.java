
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	private static Map<String, Long> lcmMap = new HashMap<String, Long>();
	private static Map<String, Long> gcdMap = new HashMap<String, Long>();
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			long result = 0;
			for (int i = 0; i < n - 1; i++) {
				for (int j = i + 1; j < n; j++) {
					result += lcm(a[i], a[j]) % 998244353;
				}
			}

			System.out.println(result % 998244353);
		}
	}

	private static long lcm(long m, long n) {
		String key = Long.toString(m) + "," + Long.toString(n);
		if (lcmMap.containsKey(key)) {
			return lcmMap.get(key);
		}
		long result = m * n / gcd(m, n);
		lcmMap.put(key, result);
		return result;
	}
	private static long gcd(long m, long n) {
	    if(m < n) return gcd(n, m);
		String key = Long.toString(m) + "," + Long.toString(n);
	    if (gcdMap.containsKey(key)) {
			return gcdMap.get(key);
	    }
	    if(n == 0) {
	    	return m;
	    }
	    long result = gcd(n, m % n);
	    gcdMap.put(key, result);
	    return result;
	}
}
