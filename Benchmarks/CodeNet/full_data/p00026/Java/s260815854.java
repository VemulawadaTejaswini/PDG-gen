
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		final int X = 0;
		final int Y = 1;
		final int SIZE = 2;
		int countAxis = 0;
		int maxThickness = 0;

		// 真っ白(全てが0である)座標を作成
		int[][] axis = new int[10][10];
		for (int countX = 0; countX < 10; countX++) {
			for (int countY = 0; countY < 10; countY++) {
				axis[countX][countY] = 0;
			}
		}
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		// 無限ループ
		while (true) {

			String inputData = input.readLine();
			// 入力データがnullもしくは空文字の時、ループを抜ける
			if (inputData == null || inputData.equals("")) {
				break;
			}
			// 入力データをカンマで区切り配列に格納(0→X軸、１→Y軸、２→インクのサイズ)
			String[] data = inputData.split(",");
			// 入力データのインクのサイズに合わせてそれぞれのメソッドを実行
			if (Integer.parseInt(data[SIZE]) == 1) {
				makeSmallArea(axis, Integer.parseInt(data[X]),
						Integer.parseInt(data[Y]));
			}

			if (Integer.parseInt(data[SIZE]) == 2) {
				makeMiddleArea(axis, Integer.parseInt(data[X]),
						Integer.parseInt(data[Y]));

			}

			if (Integer.parseInt(data[SIZE]) == 3) {
				makeBigArea(axis, Integer.parseInt(data[X]),
						Integer.parseInt(data[Y]));

			}

		}
		// 色がついていない部分(値が0である部分)の数をカウントする
		countAxis = 0;
		for (int countX = 0; countX < 10; countX++) {
			for (int countY = 0; countY < 10; countY++) {
				if (axis[countX][countY] == 0) {
					countAxis++;
				}
				// 一番高い濃度を記録する
				if (axis[countX][countY] > maxThickness) {
					maxThickness = axis[countX][countY];
				}

			}
		}
		// 出力
		System.out.println(countAxis);
		System.out.println(maxThickness);
	}

	// インクサイズが小の場合のメソッド、枠からはみ出した部分を無視するif分を記載
	static void makeSmallArea(int[][] axis, int xAxis, int yAxis) {
		if (xAxis >= 1) {
			axis[xAxis - 1][yAxis]++;
		}
		if (xAxis <= 8) {
			axis[xAxis + 1][yAxis]++;
		}
		if (yAxis >= 1) {
			axis[xAxis][yAxis - 1]++;
		}
		if (yAxis <= 8) {
			axis[xAxis][yAxis + 1]++;
		}
		axis[xAxis][yAxis]++;
	}

	// インクサイズが中の場合のメソッド、枠からはみ出した部分を無視するif分を記載
	static void makeMiddleArea(int[][] axis, int xAxis, int yAxis) {
		makeSmallArea(axis, xAxis, yAxis);
		if (xAxis >= 1 && yAxis >= 1) {
			axis[xAxis - 1][yAxis - 1]++;

		}
		if (xAxis >= 1 && yAxis <= 8) {
			axis[xAxis - 1][yAxis + 1]++;

		}
		if (xAxis <= 8 && yAxis >= 1) {
			axis[xAxis + 1][yAxis - 1]++;
		}
		if (xAxis <= 8 && yAxis <= 8) {
			axis[xAxis + 1][yAxis + 1]++;

		}
	}

	// インクサイズが大の場合のメソッド、枠からはみ出した部分を無視するif分を記載
	static void makeBigArea(int[][] axis, int xAxis, int yAxis) {
		makeMiddleArea(axis, xAxis, yAxis);
		if (xAxis >= 2) {
			axis[xAxis - 2][yAxis]++;
		}
		if (xAxis <= 7) {
			axis[xAxis + 2][yAxis]++;
		}
		if (yAxis >= 2) {
			axis[xAxis][yAxis - 2]++;
		}
		if (yAxis <= 7) {
			axis[xAxis][yAxis + 2]++;
		}
	}
}