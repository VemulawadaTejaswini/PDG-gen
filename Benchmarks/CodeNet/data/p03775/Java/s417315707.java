import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		int min = 11;
		for (long a = 1; a <= n / 2 + 1; a++) {
			if (n % a != 0) {
				continue;
			}
			long b = n / a;
			int tmp = func(a, b);
			if (tmp < min) {
				min = tmp;
			}
		}
		System.out.println(min);
		sc.close();
	}

	static int func(long a, long b) {
		return Math.max(toDigit(a), toDigit(b));
	}

	static int toDigit(long n) {
		String str = "" + n;
		return str.length();
	}

}
