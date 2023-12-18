import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = Math.abs(a - x);
		int d = Math.abs(b - x);

		if (c < d) {

			System.out.println(c);

		} else {

			System.out.println(d);

		}
	}
}
