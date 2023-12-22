/**
 から n までの数の中から、重複無しで３つの数を選びそれらの合計が x となる組み合わせの数を求めるプログラムを作成して下さい。

例えば、1 から 5 までの数から３つを選んでそれらの合計が 9 となる組み合わせは、
?1 + 3 + 5 = 9
?2 + 3 + 4 = 9

の２通りがあります。

 */

/*sucannerクラス使うためにインポート*/
import java.util.Scanner;

class Main {
	// プログラムのエントリポイント
	public static void main(String[] args) {
		// 入力ストリームの生成
		Scanner sc = new Scanner(System.in);
		// 点数を受け取る変数を宣言
		int intN = 0;
		int intX = 0;
		int intKekka = 0;

		// breakされるまで処理をくりかえす
		while (true) {

			intN = sc.nextInt();
			intX = sc.nextInt();
			intKekka = 0;
			if (intN == 0 && intX == 0) {
				break;
			}
			
			for (int i = 1; i <= intN; i++) {
				for (int j = 1; j <= intN; j++) {
					for (int k = 1; k <= intN; k++) {
						if(i == j || j == k || i == k){

						}else if ( i + j + k == intX){
							intKekka ++;
							}
						}
					}
				}
			System.out.println(intKekka/6);
			}

		}
	}