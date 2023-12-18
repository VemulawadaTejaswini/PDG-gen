import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b = sc.nextInt();

		if (a <= 8 && b <= 8)
			System.out.println("Yay!");
		else
			System.out.println(":(");

	}
}