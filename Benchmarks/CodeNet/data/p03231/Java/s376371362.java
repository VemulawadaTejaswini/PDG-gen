import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		String S = in.next();
		String T = in.next();
		long lcm = lcm(M, N);
		long gcd = gcd(M, N);
		long ans = lcm;
		long step = ((long) N / gcd) * ((long) M / gcd);
		for (long i = 0; i < lcm; i += step) {
			if (S.charAt((int) (i * gcd / M)) != T.charAt((int) (i * gcd / N))) {
				ans = -1;
				break;
			}
		}
		System.out.println(ans);
		in.close();

	}

	//最大公約数を求める関数。ｍ＞ｎの必要がある。
	static long gcd(long x, long y) {
		if (x < y) {
			long tmp = y;
			y = x;
			x = tmp;
		}
		if (y == 0) {
			return x;
		}
		return gcd(x % y, y);
	}

	//最小公倍数を求める関数。ｍ＞ｎの必要がある。
	static long lcm(long m, long n) {
		return m * n / gcd(m, n);
	}
}