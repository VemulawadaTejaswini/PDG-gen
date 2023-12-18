import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//宣言文
		//標準入力オブジェクトを生成
		Scanner sc = new Scanner(System.in);
		//標準入力で以下の変数を初期化
		String[] numArray = new String[3];
		numArray[0] = sc.next();
		numArray[1] = sc.next();
		numArray[2] = sc.next();
		//フラグ変数
		int countNum = 0;

		//処理文
		for (int i = 0; i < numArray.length; i++) {
			if(numArray[i].equals("1")){
				//1をカウントする。
				countNum++;
			}
		}
			//標準出力
			System.out.print(countNum);
	}
}