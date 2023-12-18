import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long m = sc.nextInt();
		String s = sc.next();
		String t = sc.next();
		long l = lcm(n, m);
		Map<String, String> map = new HashMap<>();
		if (n == 1) {
			map.put(String.valueOf((long) 1), s);
		} else {
			for (int i = 0; i < n-1; i++) {
				map.put(String.valueOf((long) (i*(l/n)+1)), String.valueOf(s.charAt(i)));
			}
		}
		if (m == 1) {
			if (!map.get("1").equals(t)) {
				System.out.println(-1);
				return;
			}
		} else {
			for (int i = 0; i < m-1; i++) {
				if (map.containsKey(String.valueOf((long) (i*(l/m)+1)))) {
					if (!map.get(String.valueOf((long) ((i*(l/m)+1)))).equals(String.valueOf(t.charAt(i)))) {
						System.out.println(-1);
						return;
					}
				}
			}
		}
		System.out.println(l);
	}
	private static long lcm(long n, long m) {
		long temp;
		long c = n;
		c *= m;
		while((temp = n%m) != 0) {
			n = m;
			m = temp;
		}
		return c / m;
	}
}
