import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[] arrS = sc.next().toCharArray();
		char[] arrT = sc.next().toCharArray();
		long x = lcm(n, m);
		int nn = (int)(x / n);
		int mm = (int)(x / m);
		for (int i = 0; i * mm < n && i * nn < m; i++) {
			if (arrS[i * mm] != arrT[i * nn]) {
				System.out.println(-1);
				return;
			}
		}
		System.out.println(x);
	}
	static long lcm(long x, long y) {
		return x / gcd(x, y) * y ;
	}
	
	static long gcd(long x, long y) {
		if (x % y == 0) {
			return y;
		}
		return gcd(y, x % y);
	}
}
