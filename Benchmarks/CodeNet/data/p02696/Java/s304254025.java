import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long n = sc.nextLong();
		sc.close();

		long x = n / b + 1;
		long z = x * b - 1;
		while (z > n) {
			z -= b;
		}
		long ans1 = a * z / b - a * (z / b);
		long ans2 = a * n / b - a * (n / b);
		System.out.println(Math.max(ans1, ans2));
	}
}
