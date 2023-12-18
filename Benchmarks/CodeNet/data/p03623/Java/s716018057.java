
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = 0;
		int a = 0;
		int b = 0;

		// 整数の入力
		x = sc.nextInt();
		a = sc.nextInt();
		b = sc.nextInt();

		a = x - a;
		b = b - x;

		if (a < b) {
			System.out.println("A");
		} else {
			System.out.println("B");
		}
		sc.close();
	}

}
