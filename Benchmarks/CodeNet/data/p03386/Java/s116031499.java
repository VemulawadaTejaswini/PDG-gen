import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int a = sc1.nextInt();
		int b = sc1.nextInt();
		int k = sc1.nextInt();

		if (b-a > 2*k) {

			for (int i = 0 ; i < k ; i++ ) {
				System.out.println(a + i);
			}

			for (int i = k ; i > 0 ; i-- ) {
				System.out.println(b - i + 1);
			}

		}

		else {
			for (int i = a ; i <= b ; i++ ) {
				System.out.println(i);
			}
		}

		sc1.close();
	}

}