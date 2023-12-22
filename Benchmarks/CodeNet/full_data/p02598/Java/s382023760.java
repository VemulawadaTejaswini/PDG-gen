import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値取得
		int N = scan.nextInt();
		long K = scan.nextLong();

		long[] A = new long[N];

		double left = 0.0;
		double right = 0.0;

		for (int i = 0; i < N; i++) {
			A[i] = scan.nextLong();
			if (A[i] > right) {
				right = A[i];
			}
		}

		//演算
		if (K != 0) {
			while ((long) right != (long) left) {
				double mid = (left + right) / 2.0;

				long result = 0L;

				for (int i = 0; i < N; i++) {
					result += (long) Math.ceil(A[i] / mid) - 1L;
				}

				if (result > K) {
					left = mid;
				} else {
					right = mid;
				}
			}
		}

		//結果出力
		System.out.println((long) Math.ceil(right));
	}
}
