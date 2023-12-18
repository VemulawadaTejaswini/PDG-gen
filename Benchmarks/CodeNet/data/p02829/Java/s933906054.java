import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		// 文字列の入力
		if (a != 1 && b != 1) {
			System.out.println("1");
		} else if (a != 2 && b != 2) {
			System.out.println("2");
		} else {
			System.out.println("3");
		}
	}

}