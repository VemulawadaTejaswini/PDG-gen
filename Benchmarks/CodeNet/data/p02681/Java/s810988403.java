import java.util.Scanner;

public class Main {

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値
		String S = scan.next();
		String T = scan.next();

		//WK変数
		String result = "No";

		if (S.length() + 1 == T.length() && T.startsWith(S)) {
			result = "Yes";
		}

		//演算

		//結果出力
		System.out.println(result);
	}
}