package Computation;

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		// テキスト入力
		Scanner sc = new Scanner(System.in);
		String out = "";

		// 演算子の変数に入っている中身で場合わけ
		while (true) {

			int a = sc.nextInt();
			String operator = (String) sc.next();
			int b = sc.nextInt();

			if (operator.equals("?")) {
				break;
			} else if (operator.equals("/")) {

				out = out + a / b + "\n";
			} else if (operator.equals("*")) {

				out = out + a * b + "\n";
			}

			else if (operator.equals("+")) {

				out = out + (a + b) + "\n";
			} else if (operator.equals("+")) {

				out = out + (a - b) + "\n";

			}
		}
		// 出力
		System.out.println(out);
	}
}