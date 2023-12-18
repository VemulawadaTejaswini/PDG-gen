import java.util.Scanner;

public class Main {
//	static int cnt = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		int min = 11;
		for (long a = 1; a * a <= n; a++) {
//			cnt++;
			if (n % a != 0) {
				continue;
			}
			long b = n / a;
			int tmp = func(a, b);
			if (tmp < min) {
				min = tmp;
			}
		}
//		System.out.println("cnt:" + cnt);
		System.out.println(min);
		sc.close();
	}

	static int func(long a, long b) {
//		cnt++;
		return Math.max(toDigit(a), toDigit(b));
	}

	static int toDigit(long n) {
//		cnt++;
		String str = "" + n;
		return str.length();
	}

}
