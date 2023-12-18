import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N + 1];
		int[] B = new int[N];

		for (int i = 0; i <= N; i++) {
			A[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			B[i] = sc.nextInt();
		}

		long result = 0;

		for (int i = N; i > 0; i--) {
			if (A[i] >= B[i - 1]) {
				result += B[i - 1];
				A[i] -= B[i - 1];
				B[i - 1] = 0;
			} else {
				result += B[i - 1];
				A[i] = 0;
				B[i - 1] -= A[i];
				if (A[i - 1] >= B[i - 1]) {
					result += B[i - 1];
					A[i - 1] -= B[i - 1];
					B[i - 1] = 0;
				} else {
					result += A[i - 1];
					A[i - 1] = 0;
					B[i - 1] -= A[i - 1];
				}
			}
		}

	}

}