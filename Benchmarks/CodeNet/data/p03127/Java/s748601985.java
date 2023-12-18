import java.util.Scanner;

public class Main {
	static boolean memo[];
	static int ans, min;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int min = Integer.MAX_VALUE;
		min = gcd(a[0], a[1]);
		for (int i = 2; i < n; i++) {
			min = gcd(min, a[i]);
		}
		System.out.println(min);
	}

	private static int gcd(int m, int n) {
		if (m < n)
			return gcd(n, m);
		if (n == 0)
			return m;
		return gcd(n, m % n);
	}
}
