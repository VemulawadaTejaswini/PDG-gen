import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 0;
		int A = 0;
		// ゼロでいい？
		try {
			N = sc.nextInt();
			A = sc.nextInt();
		} catch (Exception e) {
			System.out.println("整数のみ入力してください");
			// ログに出力？
			// エラースタックトレースは？いる？
			// e.printStackTrace();
		}
		// 入力チェックは？
		// 数字？少数？文字？マイナス？
		// 一つだけ入力されたときは？
		// ⇒外部仕様上大丈夫

		int i = N % 500;
		// 500 が変わる可能性は？1000円に変わる可能性は？B？
		if (i <= A) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}