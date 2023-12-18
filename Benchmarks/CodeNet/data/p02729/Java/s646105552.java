import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Scannerで値取得。
		 */
		Scanner sc = new Scanner(System.in);

		//値を取得
		int nNum = sc.nextInt();
		int mNum = sc.nextInt();

		//nとmで組み合わせ計算する
		//nの場合
		int nRes = 0;
		int mRes = 0;

		if (nNum > 0) {
			nRes = CalcCombi(nNum);
		}

		if (mNum > 0) {
			mRes = CalcCombi(mNum);
		}

		//結果を足す
		System.out.println();
	}

	private static int CalcCombi(int num) {

		return (num * (num - 1) / 2);
	}
}
