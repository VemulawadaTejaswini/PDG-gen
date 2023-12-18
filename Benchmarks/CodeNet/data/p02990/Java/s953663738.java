import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		long n = in.nextInt();
		long k = in.nextInt();
		solve(n, k);
		in.close();
	}

	private static void solve(long n, long k) {
		for (long i = 1; i <= k; i++) {
			System.out.println(solveI(k, n - k, i));
		}
	}

	private static long solveI(long k, long r, long i) {
		long a = selV(k, i);
		long b = 0;
		b = (a * selV(r, i - 1));
		b %= 1000000007;
		b += (a * selV(r, i) * 2);
		b %= 1000000007;
		b += (a * selV(r, i + 1));
		b %= 1000000007;
		return b;
	}

	private static long selV(long a, long b) {
//		System.out.println("C " + a + " " + b + " ");
		if (b > a || b <= 0)
			return 0;
		a--;
		b--;
		if (b > a / 2)
			b = a - b;
		long r = 1;
		long m = b;
		while (m > 0) {
			r *= a--;
			m--;
		}
		while (b > 0) {
			r /= b--;
		}
		r %= 1000000007;
//		System.out.println("R " + r);
		return r;
	}
}
