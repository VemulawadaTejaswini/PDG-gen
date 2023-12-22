/**
Ａ大学は１フロア１０部屋、３階建ての公舎４棟を管理しています。公舎の入居・退去の情報を読み込み、各部屋の入居者数を出力するプログラムを作成して下さい。

n件の情報が与えられます。各情報では、４つの整数b, f, r, vが与えられます。これは、b棟f階のr番目の部屋にv人が追加で入居したことを示します。vが負の値の場合、v人退去したことを示します。

最初、全ての部屋には誰も入居していないものとします。
 */

/*sucannerクラス使うためにインポート*/
import java.util.Scanner;

class Main {
	// プログラムのエントリポイント
	public static void main(String[] args) {
		// 入力ストリームの生成
		Scanner sc = new Scanner(System.in);
		// 公舎４、階層３、フロア１０の配列をつくる
		// 初期値０
		int[][][] Daigaku = new int[4][3][10];
		// 件数の値をうけとる
		int intKen = sc.nextInt();
		// 変数の宣言
		int intTou = 0;
		int intKai = 0;
		int intFuroa = 0;
		int intHito = 0;

		// 受け取った件数の数だけ４つの値を受け取る
		for (int i = 0; i < intKen; i++) {
			intTou = sc.nextInt();
			intKai = sc.nextInt();
			intFuroa = sc.nextInt();
			intHito = sc.nextInt();
			// 受け取った位置に人の数を足す
			Daigaku[intTou-1][intKai-1][intFuroa-1] += intHito;
		}

		for (int i = 0; i < 4 ; i++){
			for(int j = 0; j < 3; j++){
				for(int k = 0; k < 10; k++){
					System.out.print(" " + Daigaku[i][j][k]);
				}
				System.out.println();
			}
			if( i < 3){
				System.out.println("####################");
			}
		}
	}
}