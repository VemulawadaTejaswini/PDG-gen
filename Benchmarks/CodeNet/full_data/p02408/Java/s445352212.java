/**

太郎が花子と一緒にトランプ遊びをしようとしたところ、52枚あるはずのカードが n 枚のカードしか手元にありません。これらの n 枚のカードを入力として、足りないカードを出力するプログラムを作成して下さい。

太郎が最初に持っていたトランプはジョーカーを除く52枚のカードです。

52枚のカードは、スペード、ハート、クラブ、ダイヤの４つの絵柄に分かれており、各絵柄には13のランクがあります。

  */
//S,スペード、H,ハート、C,クラブ、D,ダイヤ
/*sucannerクラス使うためにインポート*/
import java.util.Scanner;

class Main {
	// プログラムのエントリポイント
	public static void main(String[] args) {
		// 入力ストリームの生成
		Scanner sc = new Scanner(System.in);
		// 現在手元にある枚数を受け取る
		int intKazu = sc.nextInt();
		// カード全５２枚の配列をつくる
		int card[][] = new int[4][13];
		// カードの絵面と数字を受け取る変数を宣言
		String strEzura = "";
		int intSuuji = 0;

		// 手元にある枚数の数だけ処理を繰り返す
		for (int i = 0; i < intKazu; i++) {
			// 絵面、数字をうけとる
			strEzura = sc.next();
			intSuuji = sc.nextInt();
			// 受け取った絵面、数字の配列に１を入力する。
			// equals : 2つの変数が持っているオブジェクトが同一か判断するメソッド
			if (strEzura.equals("S")) {
				card[0][intSuuji - 1] = 1;
			} else if (strEzura.equals("H")) {
				card[1][intSuuji - 1] = 1;
			} else if (strEzura.equals("C")) {
				card[2][intSuuji - 1] = 1;
			} else if (strEzura.equals("D")) {
				card[3][intSuuji - 1] = 1;
			}
		}

		//処理を絵面の数４、カードの数字１３回繰り返す
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				//配列に値が入ってない場合処理を実行する
				if (card[i][j] == 0){
					//絵面の数字が0,1,2,3いずれかのときに表示する
					//数字のずれを調整するためｊに＋１して表示
					if(i == 0){
						System.out.println("S " + (j + 1));
					}else if ( i == 1){
						System.out.println("H " + (j + 1 ));
					}else if ( i == 2) {
						System.out.println("C " + (j + 1 ));
					}else if ( i == 3) {
						System.out.println("D " + (j + 1 ));
					}

				}
			}
		}
	}
}