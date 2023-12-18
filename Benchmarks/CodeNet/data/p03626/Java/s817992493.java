import java.util.Scanner;

public class Main {

	static int r = 1000000007;
	static String s1, s2;
	static int n;

	public static long comb(long n, long r) {
		if (n <= 0)
			return 0;
		if (r == 0)
			return 1;
		long ans = 1;

		for (int i = 1; i <= r; ++i) {
			ans *= n - i + 1;
			ans /= i;
			ans %= r;
		}

		return ans;
	}

	public static long domino() {
		long ans = 3;
		long color = 0;// ドミノの向き： １：縦 ２；横

		for (int i = 0; i < n; ++i) {
			if (s1.charAt(i) == s2.charAt(i)) {
				if (color == 1) {
					ans *= 2;
					ans %= r;
				}
				
				color = 1;
			}
			if (i < n - 1) {
				if (s1.charAt(i) == s1.charAt(i + 1)) {
					if (color == 2) {
						ans *= 3;
						ans %= r;
					} else {
						ans *= 2;
						ans %= r;
					}

					color = 2;
					++i;
				}
			}
		}

		ans %= r;
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		s1 = sc.next();
		s2 = sc.next();
		sc.close();

		long ans = domino();
		System.out.println(ans);
	}

}
