import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Scanner sc = new Scanner(System.in);
		// 整数の入力
		// int a = sc.nextInt();
		// スペース区切りの整数の入力
		// int b = sc.nextInt();
		// int c = sc.nextInt();
		// 文字列の入力
		// String s = sc.next();
		// 出力
		// System.out11.println((a+b+c) + " " + s);
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		String ans = "No";

		if (Math.abs(a-c) <= d) {
			ans = "Yes";
		} else if (Math.abs(a- b) <= d && Math.abs(c - b) <= d) {
			ans = "Yes";
		}

		System.out.println(ans);

	}

}