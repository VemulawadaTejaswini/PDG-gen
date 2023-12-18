import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}

		long[] r = new long[n];
		long[] l = new long[n];

		l[0] = a[0];
		r[n - 1] = a[n - 1];
		for (int i = 1; i < n; i++) {
			l[i] = gcd(l[i - 1], a[i]);
		}
		for (int i = n - 2; i >= 0; i--) {
			r[i] = gcd(r[i + 1], a[i]);
		}

		// 一つ好きな数値に変換 == その値を無視したときの Max の GCD の値
		long answer = Math.max(r[1], l[n - 2]);
		for (int i = 1; i < n - 1; i++) {
			answer = Math.max(answer, gcd(r[i + 1], l[i - 1]));
		}

		System.out.println(answer);
	}

	private static long gcd(long a, long b) {
		if (b == 0) return a;
		return gcd(b, a % b);
	}
}
