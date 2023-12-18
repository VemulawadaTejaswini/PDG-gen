import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int a, b, flg;

		a = sc.nextInt();
		b = sc.nextInt();

		flg = a - b;

		if (0 <= flg) {
			for (int i = 0; i < a; i++) {
				System.out.print(b);
			}
		} else if (flg < 0) {
			for (int i = 0; i < b; i++) {
				System.out.print(a);
			}
		}

		sc.close();

	}

}
