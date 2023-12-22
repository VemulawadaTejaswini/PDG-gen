import java.util.Scanner;

public class Main {

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値
		long A = scan.nextLong();
		long B = scan.nextLong();
		long N = scan.nextLong();

		//WK変数
		long result = 0L;

		//演算
		for (long x = 0L; x <= N; x++) {

			long num1 = (A * x) / B;
			long num2 = A * (x / B);

			if (num1 - num2 > result) {
				result = num1 - num2;
			}
		}

		//結果出力
		System.out.println(result);
	}
}