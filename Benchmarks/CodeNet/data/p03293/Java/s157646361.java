import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String S = scanner.next();
		String T = scanner.next();
		String judge = "No";

		int l = S.length();

		for (int i = 0; i < l; i++) {
			//文字列Sの末尾を取得
			String end = S.substring(l-1,l);

			//文字列Sの末尾は削除
			S = S.substring(0,l-1);

			//文字列Sの先頭に追加
			S = end + S;

			if (T.equals(S)) {
				judge = "Yes";
				break;
			}
		}
		System.out.println(judge);
	}
}