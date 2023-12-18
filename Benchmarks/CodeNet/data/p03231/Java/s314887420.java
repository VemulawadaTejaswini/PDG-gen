import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		String s = sc.next();
		String t = sc.next();
		long l = lcm(n, m);
		Map<Integer, String> map = new HashMap<>();
		for (int i = 0; i < n-1; i++) {
			map.put((int) (i*(l/n)+1), String.valueOf(s.charAt(i)));
		}
		for (int i = 0; i < m-1; i++) {
			if (map.containsKey((int) (i*(l/m)+1))) {
				if (!map.get((int) ((i*(l/m)+1))).equals(String.valueOf(t.charAt(i)))) {
					System.out.println(-1);
					return;
				}
			}
		}
		System.out.println(l);
	}
	
	private static long lcm(int n, int m) {
		int temp;
		long c = n;
		c *= m;
		while((temp = n%m) != 0) {
			n = m;
			m = temp;
		}
		return c / m;
	}
}
