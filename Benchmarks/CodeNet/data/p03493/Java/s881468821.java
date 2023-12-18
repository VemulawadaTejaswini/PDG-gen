
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//宣言文
		//標準入力オブジェクトを生成
		Scanner sc = new Scanner(System.in);
		//標準入力で以下の変数を初期化
		int[] numArray = new int[3];
		numArray[0] = sc.nextInt();
		numArray[1] = sc.nextInt();
		numArray[2] = sc.nextInt();
		//フラグ変数
		boolean numFlag = true;
		int countNum = 0;

		//処理文
		for (int i = 0; i < numArray.length; i++) {
			if (!(numArray[i] == 0 || numArray[i] == 1)) {
				//制約 配列の中身が０か１なのか判定
				numFlag = false;
				break;
			}else if(numArray[i] == 1){
				//1をカウントする。
				countNum++;
			}

		}

		if(numFlag) {
			//標準出力
			System.out.print(countNum);
		}
	}
}
