/**

n 人の学生を含むクラスでプログラミングの試験を行った。それぞれの得点をs1, s2 ... snとしたときの、標準偏差を求めるプログラムを作成せよ。

得点の平均値をｍとすれば、分散α2は以下の式で得られる：

α2 = (?ni=1(si - m)2)/n

分散の正の平方根が標準偏差αとなる。

 */

//スキャナつかうため

import java.util.Scanner;

public class Main {
	// プログラムのエントリポイント
	public static void main(String[] args) {
		// 入力ストリームの生成

		Scanner sc = new Scanner(System.in);
		//生徒の数に０がはいるまで処理を繰り返す
		while(true){

		//生徒の数を受け取る
		int intSeito = sc.nextInt();
		//生徒が０の場合処理を終了する
		if(intSeito == 0){
			break;
			}
		//点数と平均と結果を入れる変数を作る。
		int  [] Ten =new int [intSeito];
		double dbHeikin = 0;
		double dbKekka = 0;
		double dbGoukei = 0;
		//生徒の数だけ処理を繰り返す
		for(int i = 0; i < intSeito ; i ++){
			//受けとった数字をdb平均に足していく
			Ten [i] = sc.nextInt();
			dbGoukei += Ten[i];
		}
		//点の合計に生徒数を引いて平均点を出す。
		dbHeikin = dbGoukei/intSeito;
		//生徒の数だけ処理を繰り返す
		for(int j = 0; j < intSeito ; j++){
			//dbKekkaに点数-平均点の2乗を足していく
			dbKekka += Math.pow(Ten[j]-dbHeikin,2);
		}
		//dbKekkaから生徒の数を割り
		//平方根の中にいれる
        dbKekka= Math.sqrt(dbKekka/(double)intSeito);

        //結果表示
        System.out.println(dbKekka);


		}
	}
}