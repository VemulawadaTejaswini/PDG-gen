/**
n×m  の行列 A  と m×l  の行列 B  を入力し、それらの積である n×l  の
 を出力するプログラムを作成してください。行列 C  の各要素 c ij   は次の式で得られます：

 １行目に n 、m 、l  が空白区切りで与えられます。

続く行に n×m  の行列 A  と m×l  の行列 B  が与えられます。

 */

//スキャナつかうため

import java.util.Scanner;

public class Main {
	// プログラムのエントリポイント
	public static void main(String[] args) {
		// 入力ストリームの生成
		Scanner sc = new Scanner(System.in);
		// 3つの数値を受け取る
		int intN = sc.nextInt();
		int intM = sc.nextInt();
		int intL = sc.nextInt();
		// 受け取った数値で配列をつくる
		// Aの行列
		int[][] gyoua = new int[intN][intM];
		// Bの行列
		int[][] gyoub = new int[intM][intL];
		// Cの行列
		long[][] gyouc = new long[intN][intL];
		// 数値をAの配列の数受け取る
		for (int i = 0; i < intN; i++) {
			for (int j = 0; j < intM; j++) {
				gyoua[i][j] = sc.nextInt();
			}
		}
		// Bの配列の数数値を受け取る
		for (int i = 0; i < intM; i++) {
			for (int j = 0; j < intL; j++) {
				gyoub[i][j] = sc.nextInt();
			}
		}
		// 計算
		for (int i = 0; i < intN; i++) {
			for (int j = 0; j < intL; j++) {

				for (int k = 0; k < intM; k++) {
					// Cの配列に計算結果を入れていく
					gyouc[i][j] += gyoua[i][k] * gyoub[k][j];
				}
				System.out.print(gyouc[i][j]);
				if (j != intL - 1) {
					// 空白
					System.out.print(" ");
				}
			}
			// 改行
			System.out.println();
		}

	}
}