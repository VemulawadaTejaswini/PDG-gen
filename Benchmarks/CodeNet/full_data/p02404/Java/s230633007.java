import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Lesson5B　以下のような、たてH cm よこ W cm の枠を描くプログラム
##########
#........#
#........#
#........#
#........#
##########

 * @author 前島佑介
 * @version 2014/12/1
 */
class Main {

	// プログラムのエントリポイント
	public static void main(String[] args) {

		try{
			//キーボードからの入力準備
			BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));

			//入力値を格納する場所を初期化
			String strLine = "";

			//入力値をint型で保存する場所
			ArrayList<String> strArray = new ArrayList<String>();

			//入力値の取得にループさせる
			while(true) {

				//1行読み込む
				strLine = insBR.readLine();

				//入力値が"0 0"だったら
				if(strLine.equals("0 0")) {

					//ループから抜ける
					break;
				}

				//入力値を保存
				strArray.add(strLine);
			}

			//ループさせる
			for(int i = 0; i < strArray.size(); i++) {

				//文字列の分割:入力値を" "で分ける
				//分けた文字列はstrLineAry[0]とstrLineAry[1]に分けられる
				String[] strLineAry = strArray.get(i).split(" ");

				//左の値
				int intNum1 = Integer.parseInt(strLineAry[0]);

				//右の値
				int intNum2 = Integer.parseInt(strLineAry[1]);

				//出力させるメソッド
				SharpPaint(intNum1, intNum2);
			}

		//例外処理
		}catch(IOException e) {

			//例外時の出力
			System.out.println(e);
		}catch(NumberFormatException e) {


			//数値以外の入力値で出力
			System.out.println("数値で入力して下さい");
		}
	}
	/**
	 * たてintNum1の分よこintNum２の分の長方形を描くプログラム
	 * 1 cm × 1cm の長方形を '#'で表す
	 * @param intNum1
	 * @param intNum2
	 */
	public static void SharpPaint(int intNum1, int intNum2) {

		//たての分　ループ
		for(int i = 0; i < intNum1; i++) {

			//よこの分　ループ
			for(int j = 0; j < intNum2; j++) {

				//近くの周りは＃
				if(
						i == 0 ||					//左辺
						j == 0 ||					//上辺
						i == intNum1 - 1 ||			//右辺
						j == intNum2 - 1	) {		//下辺
					//出力
					System.out.print("#");
				} else {
					//出力
					System.out.print(".");
				}
			}
			//改行
			System.out.println("");
		}

		//改行
		System.out.println("");

	}
}