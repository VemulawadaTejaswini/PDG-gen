import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

		// 列と行intN,intMを取得
		int intN = scanner.nextInt();
		int intM = scanner.nextInt();

		int[][] intAij = new int[intN][intM];
		// intAijの入力
		for (int intI = 0; intI < intN; intI++) {
			for (int intJ = 0; intJ < intM; intJ++) {
				// intAijに入力した数値を与える
				intAij[intI][intJ] = scanner.nextInt();

			}
		}

		int[] intBj = new int[intM];
		// intBjの入力
		for (int intK = 0; intK < intM; intK++) {
			// intBj配列の作成
			intBj[intK] = scanner.nextInt();
		}

		// intN回解intCiを出力
		for (int intX = 0; intX < intN; intX++) {
			// 解intCiの定義と初期化
			int intCi = 0;
			for (int intY = 0; intY < intM; intY++) {
				// intCiの計算
				intCi += intAij[intX][intY] * intBj[intY];
			}
			// intCiの出力
			System.out.println(intCi);
		}
	}
}

