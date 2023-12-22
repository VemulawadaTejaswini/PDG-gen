import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int A[] = new int[size];
		int B[] = new int[size + 1];
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}
		countingSort(A, B, 10000);
	}

	static void countingSort(int[] A, int[] B, int k) {
		int C[] = new int[k];
		for (int i = 0; i < k; i++) {
			C[i] = 0;
		}
		for (int i = 0; i < A.length; i++) {
			C[A[i]] = C[A[i]] + 1;
		}
		for (int i = 1; i < k; i++) {
			C[i] = C[i] + C[i - 1];
		}
		for (int i = A.length - 1; i >= 0; i--) {
			B[C[A[i]]] = A[i];
			C[A[i]] = C[A[i]] - 1;
		}
		for (int i = 1; i < B.length; i++) {
			if (i == B.length - 1) {
				System.out.print(B[i]);
			} else {
				System.out.print(B[i] + " ");
			}
		}
	}

}