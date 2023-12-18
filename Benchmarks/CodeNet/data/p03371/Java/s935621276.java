import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int x = X / 2 * 2;
		int y = Y / 2 * 2;
		int p = X % 2;
		int o = Y % 2;

		if ((A + B) > (C * 2) && (X > Y)) {

			System.out.println((C * x) * 2 + (p * A) + (o * B));
		} else if ((A + B) > (C * 2) && (X <= Y)) {
			System.out.println((C * y) * 2 + (p * A) + (o * B));

		} else if ((A + B) <= (C * 2)) {

			System.out.println(A * X + B * Y);

		}
	}
}
