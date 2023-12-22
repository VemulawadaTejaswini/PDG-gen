import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int lcm = sc.nextInt();
		for (int i = 0; i < n - 1; i++) {
			int a = sc.nextInt();
			lcm = lcm(lcm, a);
		}

		System.out.println(lcm);

		sc.close();
	}

	private static int lcm(int n, int m) {
		return n * m / gcd(n, m);
	}

	private static int gcd(int n, int m) {
		if (m == 0) {
			return n;
		} else {
			return gcd(m, n % m);
		}
	}
}