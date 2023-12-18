import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		sc.close();

		long min = Long.MAX_VALUE;
		for (int i = 1; i <= (int)Math.sqrt(n); i++) {
			if (n % i == 0) {
				min = Math.min(min, (i - 1) + (n / i - 1));
			}
		}
		System.out.println(min);
	}
}
