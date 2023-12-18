import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong() - 1;
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();

		long countA = 0;
		long countB = 0;

		long n = c;
		long m = d;

		long tmp = 0;
		while (n % m != 0) {
			tmp = n;
			n = m % n;
			m = tmp;
		}
		tmp = c /tmp * d / tmp;

		countA = a - a / c - a / d + a / tmp;
		countB = b - b / c - b / d + b / tmp;

		System.out.println(countB - countA);
	}
}