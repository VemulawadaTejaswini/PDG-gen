import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// １番目に入力される文字列
		String charStr = scan.nextLine();

		// 2番目に入力される命令数
		int command = scan.nextInt();

		// 配列を宣言
		char[] charArray = new char[charStr.length()];
		for (int i = 0; i < charStr.length(); i++) {
			// 文字列を配列(char型)に格納
			charArray[i] = charStr.charAt(i);
		}

		for (int i = 0; i < command; i++) {
			// 命令の種類を入力
			String firstCommand = scan.next();
			// 範囲:A番目からB番目
			int setNumA = scan.nextInt();
			int setNumB = scan.nextInt();
			// 出力の命令の時
			if (firstCommand.equals("print")) {
				for (; setNumA <= setNumB; setNumA++) {
					System.out.print(charArray[setNumA]);
				}
				System.out.println("");

				// 逆順の命令の時
			} else if (firstCommand.equals("reverse")) {
				for (int j = 0; j < (setNumB - setNumA + 1) / 2; j++) {
					char change = charArray[setNumA + j];
					charArray[setNumA + j] = charArray[setNumB - j];
					charArray[setNumB - j] = change;
				}

				// 置き換えの命令の時
			} else if (firstCommand.equals("replace")) {

				// 置き換える文字を入力
				String replace = scan.next();
				for (int j = 0; setNumA <= setNumB; setNumA++, j++) {

					// 入力した文字を指定した範囲と置き換える
					charArray[setNumA] = replace.charAt(j);
				}

			}
		}
		scan.close();
	}
}

