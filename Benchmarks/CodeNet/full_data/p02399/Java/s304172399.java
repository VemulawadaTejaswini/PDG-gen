/**２つの整数 a と b を読み込んで、以下の値を計算するプログラムを作成して下さい：
?a ÷ b ： d (整数)
?a ÷ b の余り ： r (整数)
?a ÷ b ： f (浮動小数点数)
**/

/*sucannerクラス使うためにインポート*/
import java.util.Scanner;

class Main{
	//プログラムのエントリポイント
	public static void main(String[] args){
		//入力ストリームの生成
		Scanner sc = new Scanner(System.in);
		//数字を二つうけとる
		int inta = sc.nextInt();
		int intb = sc.nextInt();

		//割算の整数の結果を出す計算式
		int intd = inta / intb;
		//割算のあまりを出す計算式
		int intr = inta % intb;

		//受け取った数字2つをdoubleに変換する
		double dba = (double)inta;
		double dbb = (double)intb;
		//浮動小数点数を出す計算式
		double dbf = dba/dbb;
		//結果の表示
		System.out.println(intd + " " + intr + " " + dbf );

	}
}