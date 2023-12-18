
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Scannerで値取得。
		 */
		Scanner sint = new Scanner(System.in);

		//値取得
		int numN = sint.nextInt();

		sint.close();
		
		//計算可能な値上限
		final int KEISANKANOU = 10;

		int waru = 0;
		int sho = 0;
//		割り切れるか判定→割れれば割ってみる
		for(waru = 1; waru < KEISANKANOU; waru++) {
			if(numN % waru == 0) {
				sho = numN / waru;
			}
		}
		//shoが１０未満か判定
		if(sho < KEISANKANOU) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
