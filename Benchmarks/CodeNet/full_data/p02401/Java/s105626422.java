

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		int a = 0;
		String operator = "";
		int b = 0;

		// テキスト入力
		Scanner sc = new Scanner(System.in);
		String out = "";

		// 演算子の変数に入っている中身で場合わけ
		while (true) {

			//
			while (sc.hasNext()) {
				a = sc.nextInt();
				operator = sc.next();
				b = sc.nextInt();
				break;
			}

			if (operator.equals("?")) {
				break;

			} else if (operator.equals("/")) {
				out = out + a / b + "\n";

			} else if (operator.equals("*")) {
				out = out + a * b + "\n";

			} else if (operator.equals("+")) {
				out = out + (a + b) + "\n";

			} else if (operator.equals("-")) {
				out = out + (a - b) + "\n";
			}
		}
		// 出力
		System.out.print(out);
	}
}