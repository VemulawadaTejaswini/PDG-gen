import java.util.Scanner;

class Main {
	static int gcd(int a, int b) {
		if(b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}

	public static void main(String args[]) {
		int n, m;
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();

		System.out.println(gcd(m / n, m / n + m % n));
	}
}
