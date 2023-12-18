import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long y = sc.nextLong();
		sc.close();
		System.out.println(calc(x, y));

	}

	public static long calc(long argX, long argY) {
		if ((argX + argY) % 3 != 0) {
			return 0;
		}
		long x = Math.max(argX, argY);
		long y = Math.min(argX, argY);
		long d;
		long xa, ya;
		d = x / 2;
		xa = x - 2 * d;
		ya = y - d;
		long dd = ya / 2;
		long yaa = ya - 2 * dd;
		long xaa = xa - dd;

		if (yaa != 0 || xaa != 0) {
			return 0L;
		} else {
			long cl = d + dd;
			long cr = d;
			long ans = combination(cl, cr) % ((long) Math.pow(10, 9) + 7);
			return ans;
		}

	}

	public static long combination(long left, long right) {
		long temp = left;
		long ans = 1;
		for (long i = 0; i < right; i++) {
			ans *= (left - i);
		}
		for (long i = 0; i < right; i++) {
			ans /= (right - i);
		}
		return ans;
	}
}
