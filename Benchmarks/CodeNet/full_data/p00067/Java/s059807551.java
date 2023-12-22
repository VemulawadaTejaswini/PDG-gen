
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	//島の配列
	static int[][] intIsland = new int[12][12];

	//未開拓の土地の配列
	static boolean[][] blNotPass = new boolean[12][12];


	public static void main(String[] args){

		BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> answerList = new ArrayList<Integer>();

		try{
			String strLine = "";
			for(int intTurn = 0; intTurn < 20; intTurn++){

				blNotPass = new boolean[12][12];

				for(int i = 0; i < 12; i++){

						strLine = insBR.readLine();
						String[] strIsland = strLine.split("");
						for(int j = 0; j < 12; j++){
							intIsland[i][j] = Integer.parseInt(strIsland[j]);

							//島がある場合。
							if(intIsland[i][j] == 1){

								//未開拓地として扱うため、trueにする。
								blNotPass[i][j] = true;

							}
						}


				}

				//島の数の変数を用意、同時にforループで通った際に初期化。
				int intCount = 0;

				//島の数を数える。
				for(int intGyou = 0; intGyou < 12; intGyou++){
					for(int intRetsu = 0; intRetsu < 12; intRetsu++){

						if(blNotPass[intGyou][intRetsu]){

							//島の数をカウント。
							intCount++;

							//開拓メソッドへ。
							pioneer(intGyou, intRetsu);

						}
					}
				}

				//回答をリストに格納。
				answerList.add(intCount);

				//空行を読み取る。
				strLine = insBR.readLine();
				if(strLine == null){
					break;
				}


			}
		}catch(IOException e){

		}



		//出力
		for(Integer answer: answerList){
			System.out.println(answer);
		}

	}

	//数値を読み取るメソッド。
	/*public static int[][] island() {
		BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));

		try{
			for(int i = 0; i < 12; i++){
				String[] strIsland = insBR.readLine().split("");
				for(int j = 0; j < 12; j++){
					intIsland[i][j] = Integer.parseInt(strIsland[j]);

					//島がある場合。
					if(intIsland[i][j] == 1){

						//未開拓地として扱うため、trueにする。
						blNotPass[i][j] = true;

					}
				}

			}

		}catch(IOException e){
		 	e.printStackTrace();
		}catch(NumberFormatException e){
			e.printStackTrace();
		}
		return intIsland;

	}*/


	//島を開拓するメソッド。
	public static void pioneer(int intGyou, int intRetsu){
		if(0 <=intGyou && intGyou < 12 && 0 <= intRetsu && intRetsu < 12){
			if(blNotPass[intGyou][intRetsu]){

				//開拓したので、falseにする。メソッド内では上書きできている。
				blNotPass[intGyou][intRetsu] = false;

				int[] intY = {0, -1, 0, 1};
				int[] intX = {1, 0 , -1, 0};

				//再帰処理で開拓していく。
				for(int i = 0; i < 4; i++){
					pioneer(intGyou + intY[i], intRetsu + intX[i]);
				}
			}
		}
	}

}

