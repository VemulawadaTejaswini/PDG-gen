import java.util.Scanner;

public class Main {

	final static int 	BUILDINGS = 4, // 棟数
						FLOORS = 3, // 階数
						ROOMS = 10; // 部屋数

	static int[][][] house = new int[BUILDINGS][FLOORS][ROOMS]; // 入居者を記録する

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		// 入力件数の入力
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {

			// 各情報の入力
			//入居者を変更
			ChangeTenants(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		}

		//表示
		print();
	}

	// 入居者の変更
	static void ChangeTenants(int b, int f, int r, int v) {
		// 入力データを配列の添え字に合わせ、入居者を加算
		house[b - 1][f - 1][r - 1] += v;
	}

	// 表示処理
	static void print() {
		
		for (int b = 0; b < BUILDINGS; b++) {

			for (int f = 0; f < FLOORS; f++) {

				String output = "";
				for (int r = 0; r < ROOMS; r++) {

					// 数字の前にスペースを入れる
					output += " " + house[b][f][r];
				}
				// 出力
				System.out.println(output);

			}
			// 棟が変わる場合#を20個入れる(最後の行には入れないように)
			if (b < 3) {
				System.out.println("####################");
			}
		}
	}

}
