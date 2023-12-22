import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値取得
		int N = scan.nextInt();

		long[] A = new long[N];

		for (int i = 0; i < N; i++) {
			A[i] = scan.nextLong();
		}

		//WK変数
		BigInteger result = BigInteger.valueOf(1);

		//演算

		for (int i = 0; i < N; i++) {

			if (A[i] == 0L) {
			result = BigInteger.ZERO;
			break;
			}

			result = result.multiply(BigInteger.valueOf(A[i]));

			if (result.compareTo(BigInteger.valueOf(1000000000000000000L)) > 0) {
			result = BigInteger.ONE.negate();
			break;
			}
		}

		//結果出力
			System.out.println(result);
	}
}