import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 085_A
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		String S = sc.nextLine();
		// Scannerクラスのインスタンスをクローズ
		sc.close();

		System.out.println("2018"+S.substring(4));
	}
}
