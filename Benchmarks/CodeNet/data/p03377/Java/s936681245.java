import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int a = sc1.nextInt();
		int b = sc1.nextInt();
		int x = sc1.nextInt();

		boolean ans = false;

		if (x - a >= 0) {
			if (a + b -x >= 0) {
				ans = true;
			}
		}

		if (ans) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}


		sc1.close();

	}

}
