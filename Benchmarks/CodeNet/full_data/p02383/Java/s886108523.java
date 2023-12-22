/**

サイコロの各面には図のとおりに 1 から 6 のラベルが割りあてられています。

入力としてサイコロの各面のラベルに対応する数字と、転がす命令の列が与えられるので、サイコロの上面の数字を出力してください。シミュレーションの初期状態は、図のとおりのラベルの位置でサイコロが置かれているものとします。

 */

//スキャナつかうため

import java.util.Scanner;

public class Main {
	// プログラムのエントリポイント
	public static void main(String[] args) {
		// 入力ストリームの生成

		Scanner sc = new Scanner(System.in);
		// 6桁の数字を受け取る配列diceを作る
		int[] dice = new int[6];
		// 6個入力された数字を受け取る
		for (int i = 0; i < 6; i++) {
			dice[i] = sc.nextInt();
		}
		// 命令の文字列を受け取る
		String mei = sc.next();
		// 受け取った文字列をcharの配列に入れていく
		char[] Roll = mei.toCharArray();
		//受け取った文字列の長さの回数処理を繰り返す
		for (int i = 0; i < mei.length(); i++) {
			//数字入れ替え用の変数
			int irekae = 0;
			//文字列がSだった場合
			if (Roll[i] == 'S') {
				irekae = dice[0];
				dice[0] = dice[4];
				dice[4] = dice[5];
				dice[5] = dice[1];
				dice[1] = irekae;
			//文字列がNだった場合
			} else if (Roll[i] == 'N') {
				irekae = dice[0];
				dice[0] = dice[1];
				dice[1] = dice[5];
				dice[5] = dice[4];
				dice[4] = irekae;
			//文字列がWだった場合
			} else if (Roll[i] == 'W') {
				irekae = dice[0];
				dice[0] = dice[2];
				dice[2] = dice[5];
				dice[5] = dice[3];
				dice[3] = irekae;
			//文字列がEだった場合
			} else if (Roll[i] == 'E') {
				irekae = dice[0];
				dice[0] = dice[3];
				dice[3] = dice[5];
				dice[5] = dice[2];
				dice[2] = irekae;

			}

		}
		//表示
		System.out.println(dice[0]);
	}
}