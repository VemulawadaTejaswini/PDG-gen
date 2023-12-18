import java.util.*;
import java.lang.*;

class Main {

	static long MOD = (1L << 32) - 1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] s = sc.next().toCharArray();
		Map<Long, Integer> h = new HashMap<>();
		long B = 100000007;
		for (int len = s.length - 1; len >= 1; len--) {
			h.clear();
			long t = 1;
			long current = 0;
			for (int i = 0; i < len; i++) {
				t = (t * B) % MOD;
				current = ((current * B) + s[i]) % MOD;
			}
			h.put(current, len - 1);
			for (int i = 0; i + len < s.length; i++) {
				current = (current * B + s[i + len] - s[i] * t) % MOD;
				if (h.containsKey(current) && h.get(current) <= i) {
					System.out.println(len);
					return;
				}
				h.put(current, i + len - 1);
			}
		}

		System.out.println(0);
	}
}
