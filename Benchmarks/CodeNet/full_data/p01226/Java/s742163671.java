

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	static int intHight;//マップの縦の幅。
	static int intWidth;//マップの横の幅。
	static int intMaxTurn;//データセット数。
	static List<Integer> intSensyaPosition;//戦車の位置の数値リスト。
	static boolean[][] blExist;//戦車がいるかどうかの判定配列。
	static String[][] strMap;//マップ構成。
	static String[][][] strAnswer;//最終的なマップ。

	public static void main(String[] args){

		BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> hightList = new ArrayList<Integer>();;
		List<Integer> widthList = new ArrayList<Integer>();;

		try{

			//ターン数を読み取る。
			String strMaxTurn = insBR.readLine();
			intMaxTurn = Integer.parseInt(strMaxTurn);

			//答えのマップを配列で用意。
			strAnswer = new String[intMaxTurn][20][20];

			//ターン数分マップを駆け巡る。
			for(int intTurn = 0; intTurn < intMaxTurn; intTurn++){

				//マップの広さを読み取る。
				String[] strArea = insBR.readLine().split(" ");
				intHight = Integer.parseInt(strArea[0]);
				intWidth = Integer.parseInt(strArea[1]);

				//後ほど答えを出すときに必要になるので、リストにマップの広さをそれぞれ格納。
				hightList.add(intHight);
				widthList.add(intWidth);

				//マップの配列。
				strMap = new String[intHight][intWidth];

				//戦車がいるかどうかの判定配列を初期化。
				blExist = new boolean[intHight][intWidth];

				//マップの構成要素を読み取る。
				for(int intGyou = 0; intGyou < intHight; intGyou++){
					strMap[intGyou]  = insBR.readLine().split("");
				}

				//入力操作数。
				String strOperation = insBR.readLine();
				int intMaxOrder = Integer.parseInt(strOperation);

				//戦車の動作。
				String[] strAction = insBR.readLine().split("");

				//戦車の位置を取得。
				intSensyaPosition = new ArrayList<Integer>();
				boolean blFind = false;
				for(int first = 0; first < intHight; first++){
					for(int second = 0; second < intWidth; second++){
						if("^".equals(strMap[first][second]) || "v".equals(strMap[first][second])
							|| "<".equals(strMap[first][second]) || ">".equals(strMap[first][second])){

								intSensyaPosition.add(first);
								intSensyaPosition.add(second);
								blFind = true;
								break;
						}
					}
					if(blFind){
						break;
					}
				}

				int intSensyaY = intSensyaPosition.get(0);
				int intSensyaX = intSensyaPosition.get(1);
				String strSensya = strMap[intSensyaY][intSensyaX];

				//戦車を操作。
				for(int intOrder = 0; intOrder < intMaxOrder; intOrder++){
					order(strAction[intOrder], intSensyaPosition, strSensya);
				}

				//答えを格納。
				for(int intY = 0; intY < intHight; intY++){
					for(int intX = 0; intX < intWidth; intX++){
						strAnswer[intTurn][intY][intX] = strMap[intY][intX];
					}
				}

			}

		}catch(IOException e){

		}

		//出力
		for(int i = 0; i < intMaxTurn; i++){
			for(int j = 0; j < hightList.get(i); j++){
				for(int k = 0; k < widthList.get(i); k++){
					System.out.print(strAnswer[i][j][k]);
				}
				System.out.println();
			}
			if(i < intMaxTurn - 1){
				System.out.println();
			}
		}

	}

	//オーダーの処理メソッド。
	public static void order(String strOrder, List<Integer> list, String strSensya){

		int intSensyaY = list.get(0);
		int intSensyaX = list.get(1);

		//砲弾を撃つとき。
		switch(strOrder){

			case "S":
				destroy(intSensyaY, intSensyaX, strMap[intSensyaY][intSensyaX]);
				break;


			//方向転換
			case "U":
				if(intSensyaY - 1 < 0){
					strMap[intSensyaY][intSensyaX] = "^";

				}else{

					switch(strMap[intSensyaY - 1][intSensyaX]){

						case ".":
							strMap[intSensyaY][intSensyaX] = ".";
							strMap[intSensyaY - 1][intSensyaX] = "^";
							intSensyaPosition.clear();
							intSensyaPosition.add(intSensyaY - 1);
							intSensyaPosition.add(intSensyaX);
							break;

						default:
							strMap[intSensyaY][intSensyaX] = "^";
							break;

					}

				}
				break;

			case "D":
				if(intHight <= intSensyaY + 1){
					strMap[intSensyaY][intSensyaX] = "v";

				}else{
					if(".".equals(strMap[intSensyaY + 1][intSensyaX])){
						strMap[intSensyaY][intSensyaX] = ".";
						strMap[intSensyaY + 1][intSensyaX] = "v";
						intSensyaPosition.clear();
						intSensyaPosition.add(intSensyaY + 1);
						intSensyaPosition.add(intSensyaX);
					}else{
						strMap[intSensyaY][intSensyaX] = "v";
					}
				}
				break;

			case "L":
				if(intSensyaX - 1 < 0){
					strMap[intSensyaY][intSensyaX] = "<";

				}else{
					switch (strMap[intSensyaY][intSensyaX - 1]){

						case ".":
							strMap[intSensyaY][intSensyaX] = ".";
							strMap[intSensyaY][intSensyaX - 1] = "<";
							intSensyaPosition.clear();
							intSensyaPosition.add(intSensyaY);
							intSensyaPosition.add(intSensyaX - 1);
							break;
						default:
							strMap[intSensyaY][intSensyaX] = "<";
							break;

					}
				}
				break;

			case "R":
				if(intWidth <= intSensyaX + 1){
					strMap[intSensyaY][intSensyaX] = ">";

				}else{
					switch(strMap[intSensyaY][intSensyaX + 1]){

						case ".":
							strMap[intSensyaY][intSensyaX] = ".";
							strMap[intSensyaY][intSensyaX + 1] = ">";
							intSensyaPosition.clear();
							intSensyaPosition.add(intSensyaY);
							intSensyaPosition.add(intSensyaX + 1);
							break;

						default:
							strMap[intSensyaY][intSensyaX] = ">";
							break;
					}

				}
				break;
		}
	}

	public static void destroy(int intY, int intX, String strSensya){
		boolean blDestroy = false;
		switch(strSensya){

			case "^":
				if(0 <= intY - 1 ){
					for(int i = intY - 1; 0 <= i; i--){
						if("*".equals(strMap[i][intX])){
							strMap[i][intX] = ".";
							break;
						}else if("#".equals(strMap[i][intX])){
							break;
						}


					}
				}
				break;

			case "v":
				if(intY + 1 < intHight){
					for(int i = intY + 1; i < intHight; i++){
						switch(strMap[i][intX]){

							case "*":
								strMap[i][intX] = ".";
								blDestroy = true;
								break;

							case "#":
								blDestroy = true;
								break;

						}

						if(blDestroy){
							break;
						}
					}
				}
				break;

			case "<":
				if(0 <= intX - 1){
					for(int i = intX - 1; 0 <= i; i--){
						switch(strMap[intY][i]){

							case "*":
								strMap[intY][i] = ".";
								blDestroy = true;
								break;

							case "#":
								blDestroy = true;
								break;

						}

						if(blDestroy){
							break;
						}
					}
				}
				break;

			case ">":
				if(intX + 1 < intWidth){
					for(int i = intX + 1; i < intWidth; i++){
						switch(strMap[intY][i]){

							case "*":
								strMap[intY][i] = ".";
								blDestroy = true;
								break;

							case "#":
								blDestroy = true;
								break;

						}

						if(blDestroy){
							break;
						}
					}
				}
				break;

		}

	}

}

