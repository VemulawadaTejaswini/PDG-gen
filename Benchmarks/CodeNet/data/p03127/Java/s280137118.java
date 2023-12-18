import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int gcd = a[0];

		for (int i = 0; i < n; i++) {
			gcd = gcd(gcd, a[i]);
		}

		System.out.println(gcd);
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
