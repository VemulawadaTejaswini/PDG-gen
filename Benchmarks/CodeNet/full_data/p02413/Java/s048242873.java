package Nested_Controls2;

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		//
		int height = 0;
		int width = 0;

		// 表の縦、横を決める入力値を持ってくる
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			height = sc.nextInt();
			width = sc.nextInt();
			break;
		}

		// シートのインスタンスを作る
		excel ex = new excel();

		// 入力値から表を作る
		ex.setSheet(height, width);

		// 表に入力する値を持ってくる
		while (sc.hasNext()) {

			// 入力された値を表のそれぞれの場所に入れる
			for (int i = 0; i < height; i++) {
				for (int s = 0; s < width; s++) {
					int input_number = sc.nextInt();
					ex.setSell(input_number, i, s);
				}
			}
			break;
		}
		// 表の最後の列に行の計算結果を挿入
		ex.sum_row();
		ex.sum_column();

		// 表全体を出力
		ex.out_sheet();

	}
}

class excel {

	// フィールド
	int[][] sheet;

	// 入力値から表(2次元配列)を作るメソッド
	public void setSheet(int height, int width) {

		// 最後に合計値を出す列を用意
		sheet = new int[height + 1][width + 1];
	}

	// 入力値をセルに入れる
	public void setSell(int input_number, int height, int width) {
		sheet[height][width] = input_number;
	}

	// 行の合計値を最後のセルに追加
	public void sum_row() {
		// 行の数だけ回す
		for (int i = 0; i < sheet.length; i++) {

			// 列の数だけ回す
			int sum = 0;
			for (int s = 0; s < sheet[0].length; s++) {

				// 行の合計値
				sum = sheet[i][s] + sum;
			}
			// 最後に追加
			sheet[i][(sheet[0].length - 1)] = sum;
		}
	}

	// 列の合計値を最後のセルに追加
	public void sum_column() {
		// 列の数だけ回す
		for (int c = 0; c < sheet[0].length; c++) {

			// 行の数だけ回す
			int sum = 0;
			for (int s = 0; s < sheet.length; s++) {

				// 行の合計値
				sum = sheet[s][c] + sum;
			}
			// 最後に追加
			sheet[sheet.length-1][c] = sum;
		}
	}

	// 表全体を出力
	public void out_sheet() {

		// 行の回数
		for (int i = 0; i < sheet.length; i++) {

			// 列の回数
			for (int s = 0; s < sheet[0].length - 1; s++) {
				// 空白を一つ空けて表示
				System.out.print(sheet[i][s] + " ");
			}
			// 最後の行を改行
			System.out.println(sheet[i][(sheet[0].length - 1)]);
		}
	}
}