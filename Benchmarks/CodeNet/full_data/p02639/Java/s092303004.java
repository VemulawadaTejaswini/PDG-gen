
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//コンソールに入力した値を取得
		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		int x3 = sc.nextInt();
		int x4 = sc.nextInt();
		int x5 = sc.nextInt();

		if (x1 == 0) {
			System.out.println("1");
		} else if (x2 == 0) {
			System.out.println("2");
		} else if (x3 == 0) {
			System.out.println("3");
		} else if (x4 == 0) {
			System.out.println("4");
		} else if (x5 == 0) {
			System.out.println("5");
		}

		sc.close();
	}
}
