import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int brd = Math.abs(n - m);
		long ans = 0;
		int mod = (int) (Math.pow(10, 9) + 7);

		if (brd >= 2) {
			ans = 0;
		} else if (brd == 0) {
			ans = kaijoEx(n, mod) * kaijoEx(m, mod) * 2 % mod;
		} else {
			ans = kaijoEx(n, mod) * kaijoEx(m, mod);
		}

		System.out.println(ans);
	}

	static long kaijoEx(int m, int mod) {
		long s = 1;
		for (int i1 = 1; i1 <= m; i1++)
			s = (long) ((s * i1) % mod);
		return s;
	}
}
