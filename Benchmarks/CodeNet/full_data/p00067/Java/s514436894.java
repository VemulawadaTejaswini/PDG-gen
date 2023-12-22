import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean checkStart = true;

		while (checkStart) {

			// 二次元配列作成
			int[][] map = new int[12][12];

			// 島の数をカウントする変数
			int countIsland = 0;

			// 入力された値を配列に格納
			for (int row = 0; row < 12; row++) {
				// 入力された数字を一列づつ文字列として変数に格納
				String lineOfNum = scan.nextLine();

					for (int column = 0; column < 12; column++) {
						// 入力された数値を二次元配列に格納
						map[row][column] = (int) lineOfNum.charAt(column) - 48;
					}
			}

			for (int row = 0; row < 12; row++) {
				for (int column = 0; column < 12; column++) {

					// 起点が黒(1)の時
					if (map[row][column] == 1) {

						// チェック済みか判別のため、-1に書き換える
						map[row][column] = -1;
						// 島のフラグを立てるメソッド
						check(row, column, map);
						countIsland++;
					}
				}
			}
			System.out.println(countIsland);

			if(scan.hasNextLine()){
				//空行の空読み
					scan.nextLine();
			}else{
				break;
			}

		}
		scan.close();
	}

	// 引数:行, 列, 二次元配列map
	static void check(int row, int column, int[][] map) {

		// 起点の上側の変数
		int rowUp = row - 1;

		if (rowUp >= 0) {

			// リストの要素の上の値が黒(1)になるとき
			if (map[rowUp][column] == 1) {

				// チェック済みか判別のため、数値を-1に書き換える
				map[rowUp][column] = -1;

				check(rowUp, column, map);
			}
		}

		// 起点の右側の変数
		int columnRight = column + 1;

		if (0 <= columnRight && columnRight < 12) {

			// 配列の要素の右の値が黒(1)になるとき
			if (map[row][columnRight] == 1) {

				map[row][columnRight] = -1;

				check(row, columnRight, map);
			}
		}

		// 起点の下側の変数
		int rowDown = row + 1;

		if (rowDown < 12) {

			// 配列の要素の右の値が黒(1)になるとき
			if (map[rowDown][column] == 1) {

				map[rowDown][column] = -1;

				check(rowDown, column, map);
			}
		}

		// 起点の左側の変数
		int columnLeft = column - 1;

		if (columnLeft >= 0) {

			// 配列の要素の左の値が黒(1)になるとき
			if (map[row][columnLeft] == 1) {

				map[row][columnLeft] = -1;

				check(row, columnLeft, map);
			}
		}
	}
}

