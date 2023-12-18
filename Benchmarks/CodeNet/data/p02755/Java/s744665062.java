import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double a = sc.nextInt();
		double b = sc.nextInt();

		// 0.1倍の方がはるかに大きいとき
		if (a * 1.25 < b + 1) {
			System.out.println(-1);
			return;
		}

		double x = a / 0.08;

		System.out.println((int) x);

	}
}
