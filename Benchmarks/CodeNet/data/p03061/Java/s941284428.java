import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n + 1];
		int[] l = new int[n + 1];
		int[] r = new int[n + 2];
		int[] m = new int[n + 1];
		l[0] = 0;
		r[n + 1] = 0;

		for (int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			l[i + 1] = gcd(l[i], a[i]);
		}

		for (int i = n; i > 0; i--) {
			r[i] = gcd(r[i + 1], a[i]);
		}

		for (int i = 0; i <= n; i++) {
			System.out.println("i:" + i + ", " + l[i] + ", " + r[i]);
		}

		for (int i = 1; i <= n; i++) {
			m[i] = gcd(l[i], r[i + 1]);
			System.out.println("i:" + i + ", m[" + i + "]:" + m[i]);
		}

		int max = 0;
		for (int i = 1; i <= n; i++) {
			if (m[i] > max) {
				max = m[i];
			}
		}

		System.out.println(max);
		sc.close();

	}

	public static int gcd(int m, int n) {
		if (m < n)
			return gcd(n, m);
		if (n == 0)
			return m;
		return gcd(n, m % n);
	}

}