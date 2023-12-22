import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] arg)throws IOException{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		 //br.readline(); = 入力された１行分を日本語変換して返してくれる。
		 String str = br.readLine();

		 /*配列の型(intとかStringとか) [] 配列名 = 配列を用意
		  *今回はstrAryって配列にstrを入れてる。
		  *str.split = splitってのはString内に用意されてるメソッド
		  *文字列を分割するときに使用。今回は空白で区切ってって仕様なので
		  *split(" ")としてます。*/
		 String[] strAry = str.split(" ");

		 /*おなじみの文字列から数値への変換。
		  *ただし今回は指定先が配列の何番って風になってる。*/
		 int W = Integer.parseInt(strAry[0]);
		 int H = Integer.parseInt(strAry[1]);
		 int x = Integer.parseInt(strAry[2]);
		 int y = Integer.parseInt(strAry[3]);
		 int r = Integer.parseInt(strAry[4]);

		 /*複数条件の記述。if(条件 && 条件)は「かつ」だったが、
		  * if(条件 || 条件)で「または」の条件指定ができるらしい。
		  * 今回は半径(r)が円の中心座標(x,yそれぞれ)を上回ってしまうと枠を
		  * はみ出してしまうので条件で指定
		  * また、半径(r)と円の中心座標(x,yそれぞれ)の合計が外枠の座標(W,Hそれぞれ)を
		  * 上回ると枠をはみ出してしまうので条件指定
		  * それらを満たさない場合枠内に円が入りきる。
		  */

		 //Constraintを記述
		 if(!(-100 <=x && x<=100 &&
			-100 <=y && y<=100 &&
			0<W && W <=100 &&
			0<H && H <=100 &&
			0<r && r <=100)){
			 System.out.println("エラー");
		 } else {

		 if(x-r<0 || y-r<0 || x+r>W || y+r>H){
	            System.out.println("No");
	        }
	        else{
	            System.out.println("Yes");
	        }
		 }
	}
}