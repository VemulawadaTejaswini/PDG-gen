import java.util.Scanner;

public class Main {

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値
		long X = scan.nextLong();

		//WK変数

		//演算
		l1: for (long B = -142L; B < 142L; B++) {
			for (long A = -142L; A < 142L; A++) {

				if (Math.pow(A, 5) - Math.pow(B, 5)== X) {
					System.out.println(A + " " + B);
					break l1;
				}
			}
		}

		//結果出力
	}
}