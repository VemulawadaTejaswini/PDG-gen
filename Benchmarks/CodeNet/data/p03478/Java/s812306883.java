
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//宣言文
		//標準入力オブジェクトを生成
		Scanner sc = new Scanner(System.in);
		//標準入力で以下の変数を初期化
		int numberN = sc.nextInt();
		int numberA = sc.nextInt();
		int numberB = sc.nextInt();
		//AとBの和変数
		int sumNumAB = 0;
		//位毎変数
		int numthousand = 0;
		int numHundred = 0;
		int numTen = 0;
		int numOne = 0;
		//10の位と1の位和変数
		int sumTenOne = 0;

		//処理文
		//1<= ● <= N　繰り返し　1からNまで
		for (int i = 1; i <= numberN; i++) {

			if (i == 10000 || i == 1000 || i == 100) {
				sumTenOne = 1;
			} else {
				numthousand = i / 1000;
				numHundred = i / 100;
				numTen = i / 10;
				numOne = i - ((i / 10) * 10);
				sumTenOne = numthousand + numHundred + numTen + numOne;
			}
			//●　選別する　10の位と1の位の値
			//合計する　合計してAとBの範囲であるもの
			//合計していく sumNumAB
			if ((numberA <= sumTenOne && sumTenOne <= numberB)) {
				sumNumAB = sumNumAB + i;
			}
		}
		//標準出力　合計したsumNumAB
		System.out.print(sumNumAB);
	}
}
