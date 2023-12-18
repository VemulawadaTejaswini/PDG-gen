import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long n = sc.nextInt();
		long a = sc.nextInt();
		long b = sc.nextInt();

		if ((a - 1) < (n - b)) {
			exe(a, b, a - 1);
		} else {
			exe(b, a, -(n - b));
		}


	}

	private static void exe(long a, long b, long mg) {
		if ((b - a) % 2 != 0) {
			System.out.println(Math.abs(b - a + mg));
			return;
		}
		System.out.println(Math.abs((b - a) / 2));
	}

}