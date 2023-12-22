/**
表計算を行う簡単なプログラムを作成します。

表の行数rと列数c、r × c の要素を持つ表を読み込んで、
各行と列の合計を挿入した新しい表を出力するプログラムを作成して下さい。

 */

/*sucannerクラス使うためにインポート*/
import java.util.Scanner;

class Main {
	// プログラムのエントリポイント
	public static void main(String[] args) {
		// 入力ストリームの生成
		Scanner sc = new Scanner(System.in);
		int intR = sc.nextInt();
		int intC = sc.nextInt();

		int Hyou[][] = new int[intR][intC];
		int intYokogoukei = 0;
		int intTategoukei = 0;
		int i = 0;
		int j = 0;
		int intSaigo = 0;
		for (i = 0; i < intR; i++) {

			for (j = 0; j < intC; j++) {
				Hyou[i][j] = sc.nextInt();
				intYokogoukei += Hyou[i][j];
				intSaigo += Hyou[i][j];
				System.out.print(Hyou[i][j] + " ");

			}
			System.out.println(intYokogoukei);
			intYokogoukei = 0;
		}
		for (int k = 0; k < intC; k++) {
			for (int l = 0; l < intR; l++) {
				intTategoukei += Hyou[l][k];

			}
			System.out.print(intTategoukei + " ");
			intTategoukei = 0;
		}
		System.out.println(intSaigo);

	}
}