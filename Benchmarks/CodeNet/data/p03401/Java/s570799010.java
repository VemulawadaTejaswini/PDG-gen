import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		int[] A = new int[N + 2];
		int[] B = new int[N + 2];
		int[] C = new int[N + 2];
		A[0] = 0;
		A[N + 1] = 0;
		for (int i = 1; i < N + 1; i++) {
			A[i] = sc.nextInt();
		}
		if (A[1] < A[0]) {
			B[1] = A[0] - A[1];
		} else {
			B[1] = A[1] - A[0];
		}
		sum += B[1];

		for (int i = 2; i < N + 2; i++) {
			if (A[i] < A[i - 1]) {
				B[i] = A[i - 1] - A[i];
			} else {
				B[i] = A[i] - A[i - 1];
			}
			sum += B[i];
			if (A[i] < A[i - 2]) {
				C[i] = A[i - 2] - A[i];
			} else {
				C[i] = A[i] - A[i - 2];
			}
		}

		for (int i = 1; i < N + 1; i++) {
			System.out.println(sum - B[i] - B[i + 1] + C[i + 1]);
		}
	}
}