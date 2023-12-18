import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		System.out.println(f(b) ^ f(a - 1));
	}

	private static long f(long a) {
		if (a % 2 == 0) {
			long n = a / 2;
			if (n % 2 == 1) {
				return 1 ^ a;
			} else {
				return a;
			}
		} else {
			long n = (a + 1) / 2;
			if (n % 2 == 0) {
				return 0;
			} else {
				return 1;
			}
		}
	}
}
