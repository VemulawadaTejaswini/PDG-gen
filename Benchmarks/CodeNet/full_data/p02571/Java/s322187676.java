import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値取得
		String S = scan.next();
		String T = scan.next();

		//演算
		int result = 0;
		int coin = 0;
		for (int i = 0; i < T.length(); i++) {
			for (int j = i + 1; j < T.length(); j++) {
				String part = T.substring(i, j);
				if (S.substring(i, S.length() - T.length() + j).contains(part)) {
					if (coin < part.length()) {
						coin = part.length();
					}
				}
			}
		}

		result = T.length() - coin;

		//結果出力
		System.out.println(result);
	}
}
