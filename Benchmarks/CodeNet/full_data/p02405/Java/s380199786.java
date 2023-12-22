import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Lesson5B　以下のような、たてH cm よこ W cm のチェック柄の長方形を描くプログラムを作成して下さい。
#.#.#.#.#.
.#.#.#.#.#
#.#.#.#.#.
.#.#.#.#.#
#.#.#.#.#.
.#.#.#.#.#


 * @author 前島佑介
 * @version 2014/12/1
 */
class Main {

	/**
	 * プログラムのエントリポイント
	 * @param args
	 */
	public static void main(String[] args) {

		try{

			BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));

			String strLine = "";

			ArrayList<String> strArray = new ArrayList<String>();

			//入力値をListに全部受け取る
			while(true) {

				strLine = insBR.readLine();

				//終了条件
				if(strLine.equals("0 0")) {

					break;
				}

				strArray.add(strLine);
			}

			//1列づつ処理
			for(int i = 0; i < strArray.size(); i++) {

				//分けた文字列はstrLineAry[0]とstrLineAry[1]に分けられる
				String[] strLineAry = strArray.get(i).split(" ");

				//左の値
				int intNum1 = Integer.parseInt(strLineAry[0]);

				//右の値
				int intNum2 = Integer.parseInt(strLineAry[1]);

				SharpPaint(intNum1, intNum2);
			}

		}catch(IOException e) {

			System.out.println(e);
		}catch(NumberFormatException e) {

			System.out.println("数値で入力して下さい");
		}
	}
	/**
	 * たてintNum1の分よこintNum２の分の長方形を描くプログラム
	 * 1 cm × 1cm の長方形を '#'と'.'で表す
	 * @param intNum1
	 * @param intNum2
	 */
	public static void SharpPaint(int intNum1, int intNum2) {

		//'＃'か'.' trueが'#'
		boolean booSharp = true;

		//たての分　ループ
		for(int i = 0; i < intNum1; i++) {

			//偶数の行は'#'から始める
			if(i % 2 == 0) {

				booSharp = true;

			} else {

				booSharp = false;

			}

			//よこの分　ループ
			for(int j = 0; j < intNum2; j++) {

				//'#'と'.'を交互に表示
				if(booSharp) {

					System.out.print("#");

					booSharp = false;

				} else {

					System.out.print(".");

					booSharp = true;

				}



			}
			//改行
			System.out.println("");
		}

		//改行
		System.out.println("");

	}
}