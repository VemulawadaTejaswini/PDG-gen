
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static final char ZERO = '0';
	private static final char ONE = '1';

	public static void main(String[] args) {
		// 1. 入力データの処理
		Scanner sc = new Scanner(System.in);
		int strLen = sc.nextInt();
		int commandNum = sc.nextInt();
		String inputS = sc.next();
		//		int strLen = 5;
		//		int commandNum = 1;
		//		String inputS = "00010";
		sc.close();

		// 2. 0,1の配列に分割
		// 要素数を格納
		List<Integer> block0 = new ArrayList<>(strLen);
		List<Integer> block1 = new ArrayList<>(strLen);
		generateBlock(block0,block1,strLen,inputS);

		// 3. 左からkブロック0を反転していき、1が連続する数を出力
		tryAllPatern(block0,block1,commandNum, strLen);

	}

	protected static void tryAllPatern(List<Integer> block0, List<Integer> block1, int commandNum, int strLen) {
		// 試行数
		int tryNum = block0.size() - commandNum + 1;

		// 試行回数が余剰のときは文字列長を出力
		if(tryNum <= 0) {
			System.out.println(strLen);
			return;
		}

		int sumMax = 0;
		for(int i = 0; i < tryNum; i++) {
			int sumTmp = 0;
			// 0ブロックが2以上あって、block0が要素数0だったらとばす
			if(i == 0 && block0.get(0) == 0 && block0.size() >= 2) {
				continue;
			}

			// commandNum + 1個の1の要素数を足す(0ブロックに隣接する1のブロック)
			// 対象とする0ブロックの左の1ブロックの要素数を足す
			if(i - 1 >= 0) {
				sumTmp += block1.get(i - 1);
			}

			for(int j = 0; j < commandNum; j++) {
				sumTmp += block1.get(i + j);
			}

			// 0の要素数を足す
			for(int j = 0; j < commandNum; j++) {
				sumTmp += block0.get(i + j);
			}
			if(sumTmp > sumMax) {
				sumMax = sumTmp;
			}
		}
		System.out.println(sumMax);
	}

	// 0ブロック,1ブロックの順で分割する
	// (0ブロック,1ブロック)の周期であるとする
	// はじめが1ではじまっていたり、最後が0で終わっていた場合、要素数0を格納
	protected static void generateBlock(List<Integer> block0, List<Integer> block1, int strLen,
			String inputS) {
		// 左端が1であれば要素数0の0ブロックを追加
		if(inputS.charAt(0) != ZERO) {
			block0.add(0);
		}
		// 文字列におけるインデックスのカウンター
		int counterIndex = 0;
		while(counterIndex != strLen) {
			int counter = 0;
			if(inputS.charAt(counterIndex) == ZERO) {
				// 0のとき
				while(counterIndex < strLen && inputS.charAt(counterIndex) == ZERO) {
					counter++;
					counterIndex++;
				}
				//System.out.println("0:" + counter);
				block0.add(counter);
			} else if(inputS.charAt(counterIndex) == ONE) {
				// 1のとき
				while(counterIndex < strLen && inputS.charAt(counterIndex) == ONE) {
					counter++;
					counterIndex++;
				}
				//System.out.println("1:" + counter);
				block1.add(counter);
			}
		}

		// 右端が0であれば要素数0の1ブロックを追加
		if(inputS.charAt(strLen - 1) != ONE) {
			block1.add(0);
		}
	}

}
