import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int[] A = new int[n + 1];
		int[] B = new int[n];
		int[] C;
		int count = 0;

		for (int i = 0; i < n + 1; i++) {
			A[i] = Integer.parseInt(sc.next());
		}
		for (int i = 0; i < n; i++) {
			B[i] = Integer.parseInt(sc.next());
		}

		C = A.clone();

		for (int i = n - 1; i >= 0; i--) {
			if (A[i + 1] < B[i]) {
				B[i] -= A[i + 1];
				A[i + 1] = 0;
			} else if (A[i + 1] == B[i]) {
				A[i + 1] = 0;
				B[i] = 0;

			} else {
				A[i + 1] -= B[i];
				B[i] = 0;
			}
			if (A[i] < B[i]) {
				B[i] -= A[i];
				A[i] = 0;
			} else if (A[i] == B[i]) {
				A[i] = 0;
				B[i] = 0;
			} else {
				A[i] -= B[i];
				B[i] = 0;
			}
		}

		for (int i = 0; i < n + 1; i++) {
			count += C[i] - A[i];
		}

		System.out.println(count);

	}
}