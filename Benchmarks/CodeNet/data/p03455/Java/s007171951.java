package a;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 正整数入力
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		// 結果出力
		if(num1 * num2 % 2 == 0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}

		scan.close();

	}

}
