import java.util.Scanner;

public class Main {

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値取得
		int N = scan.nextInt();
		long[] A = new long[N];

		long min = 10000000000L;
		long result = 0L;
		for (int i = 0; i < N; i++) {
			A[i] = scan.nextLong();

			result += A[i];

			if (A[i] < min) {
				min = A[i];
			}
		}

		//WK変数

		//演算

		//結果出力
		System.out.println(result - min);
	}
}