

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//
		int all_number = 0;
		int answer = 0;
		String out_all = "";
		int out = 0;

		// テキスト入力クラス
		Scanner sc = new Scanner(System.in);

		//
		while (sc.hasNext()) {
			//
			all_number = sc.nextInt();
			answer = sc.nextInt();

			if (all_number == 0 && answer == 0)
				break;

			// 一つ目の数を選ぶ
			for (int f = 0; f < all_number; f++) {
				// 二つ目の数を選ぶ
				for (int s = 0; s < all_number; s++) {
					// 同じ数字は使えないので
					if (s != f) {
						// 三つの数を選ぶ
						for (int t = 0; t < all_number; t++) {
							if (s != f && f != t && t != s && s + f + t == 9) {
								// 出力

								out = 1 + out;
							}
						}
					}
				}
			}
			// 組み合わせなので、3で割る
			out = out / 3;
			// 出力文字列
			out_all = out_all + String.valueOf(out) + "\n";
		}
		// 出力
		System.out.print(out_all);
	}
}