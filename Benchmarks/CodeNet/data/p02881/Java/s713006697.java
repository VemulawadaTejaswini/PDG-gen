import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		int sqrtN = (int) Math.sqrt((double) n);
		long step = 0;

		for (int i = sqrtN; i >= 1; i--) {
			if (n % i == 0) {
				step = (i - 1) + (n / i - 1);
				break;
			}
		}
		System.out.println(step);
		sc.close();
	}
}
