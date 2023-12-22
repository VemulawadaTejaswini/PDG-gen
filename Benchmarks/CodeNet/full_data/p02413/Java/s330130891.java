import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// 表の作成と入力
		int[][] table = CreateTable(sc.nextInt(), sc.nextInt());

		// 表示
		Print(table);
	}

	// 表の生成と入力し、表(2次元配列)を返す
	static int[][] CreateTable(int r, int c) {
		int table[][] = new int[r + 1][c + 1]; // 表を生成(+1は合計行列分)

		for (int y = 0; y < r; y++) {

			for (int x = 0; x < c; x++) {

				table[y][x] = sc.nextInt();

				table[y][c] += table[y][x]; // 最後列(行の合計)に値を加算
			}
		}

		// 最下行(列の合計)の計算
		for (int x = 0; x < c + 1; x++) {

			for (int y = 0; y < r; y++) {

				table[r][x] += table[y][x]; // 最下行(列合計)に値を加算
			}
		}
		return table;
	}

	// 表示処理
	static void Print(int[][] table) {
		// 出力用のループ
		for (int y = 0; y < table.length; y++) {

			System.out.print(table[y][0]);
			for (int x = 1; x < table[y].length; x++) {

				System.out.print(" " + table[y][x]);
			}
			System.out.println();
		}
	}

}

