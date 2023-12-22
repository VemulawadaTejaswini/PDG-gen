import java.util.Scanner;

public class Main {

	/**
	 * 入力された数のうち素数の数がいくつかを出力する
	 * 
	 * @param args
	 *            入力数、素数判定する数字
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		long check;
		int count = 0;// 素数の数
		// 入力された数の素数を判定する
		for (int i = 0; i < num; i++) {
			check = scan.nextLong();
			if (PrimeNumber_Checker(check)) {
				count++;
			}
		}
		System.out.println(count);
	}

	/**
	 * 素数であるかどうかを判定数
	 * 
	 * @param check_num
	 *            判定する数字
	 * @return 判定結果(true:素数)
	 */
	public static boolean PrimeNumber_Checker(long check_num) {
		if (check_num < 2) {// 1は素数ではない
			return false;
		}
		if (check_num == 2) {// ２は素数
			return true;
		}
		if (check_num % 2 == 0) {// 偶数は素数でない
			return false;
		}

		double sqrtNum = Math.sqrt(check_num);
		for (int k = 3; k <= sqrtNum; k = k + 2) {
			if (check_num % k == 0) {
				return false;
			}
		}
		return true;

	}
}

