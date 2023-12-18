import java.util.Scanner;

public class Main {

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値
		long X = scan.nextLong();

		//WK変数

		//演算
		for (long B = -10000000L; B < 10000000L; B++) {

			double A = Math.pow((long) Math.pow(B, 5) + X, 0.2);
			if (Math.ceil(A) == Math.floor(A)) {
				System.out.println((long) A + " " + B);
				break;
			}
		}

		//結果出力
	}
}