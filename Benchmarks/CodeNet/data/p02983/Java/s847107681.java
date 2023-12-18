import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long l = sc.nextLong();
		long r = sc.nextLong();
		long m = 0;
		long min = 2019l;
		long calc = 0;
		for (long i = l; i < r; i++) {
			m = 0;
			for (long j = i + 1; j <= r; j++) {
				m += i;
				calc = m % 2019;
				if (calc < min) {
					min = calc;
				}
			}
		}

		System.out.println(min);
	}
}