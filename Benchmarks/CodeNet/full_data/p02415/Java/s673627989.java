import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

		// 文字列の入力
		String strInput = scanner.nextLine();
		for (int intLength = 0; intLength < strInput.length(); intLength++ ) {
			char charMoji = strInput.charAt(intLength);
			// 大文字なら小文字に変換して出力
			if (Character.isUpperCase(charMoji)) {
				char charResult = Character.toLowerCase(charMoji);
				System.out.print(charResult);
			// 小文字なら大文字に変換して出力
			} else if (Character.isLowerCase(charMoji)) {
				char charResult = Character.toUpperCase(charMoji);
				System.out.print(charResult);
			// どちらでもないならそのまま出力
			} else {
				System.out.print(charMoji);
			}
		}
		System.out.println();
	}

}

