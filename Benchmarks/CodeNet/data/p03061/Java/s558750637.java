import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int maxgcd = 1;

		for (int j = 0; j < n; j++) {
			int gcd = a[0];

			for (int i = 1; i < n; i++) {
				if (i != j) {
					gcd = gcd(gcd, a[i]);
					if (gcd < maxgcd) {
						break;
					}
				}
			}
//			System.out.println("j:" + j + ", gcd:" + gcd + ", maxgcd:" + maxgcd);
			if (gcd > maxgcd) {
				maxgcd = gcd;
			}
		}

		int gcd = a[1];
		for (int i = 2; i < n; i++) {
			gcd = gcd(gcd, a[i]);
			if (gcd < maxgcd) {
				break;
			}
		}
		if (gcd > maxgcd) {
			maxgcd = gcd;
		}
//		System.out.println("j:0, gcd:" + gcd + ", maxgcd:" + maxgcd);

		System.out.println(maxgcd);
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