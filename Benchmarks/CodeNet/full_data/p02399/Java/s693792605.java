package Computation;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 初期処理
		Scanner sc = null;

		// テキスト入力クラス
		sc = new Scanner(System.in);

		// 入力値をfloatで取る
		float first = sc.nextFloat();
		float second = sc.nextFloat();

		// 求める値
		float quotient = first / second;
		float product = first % second;
		
		// 元データをBigDecimal型にする
		BigDecimal quo = new BigDecimal(quotient);
		BigDecimal pro = new BigDecimal(product);


		// 浮動小数点

		// 出力
		System.out.println(quo.setScale(0,BigDecimal.ROUND_DOWN) + " " + pro.setScale(0,BigDecimal.ROUND_DOWN)
				+ " " + quotient);

	}
}