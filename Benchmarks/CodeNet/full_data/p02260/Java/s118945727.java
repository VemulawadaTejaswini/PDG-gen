import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = scn.nextInt();
		}
		selectionSort(A, N);
	}

	public static void selectionSort(int[] A, int N) {
		int swap = 0;

		for (int i = 0; i < N; i++) {
			int minj = i;
			for (int j = i; j < N; j++) {
				if (A[j] < A[minj]) {
					minj = j;
				}
			}
			if (minj != i) {
				int buf = A[minj];
				A[minj] = A[i];
				A[i] = buf;
				swap++;
			}
		}
		printArray(A);
		System.out.println(swap);
	}

	public static void bubbleSort(int[] A, int N) {
		boolean flag = true;
		int swap = 0;
		while (flag) {
			flag = false;
			for (int i = N - 1; i > 0; i--) {
				if (A[i - 1] > A[i]) {
					int buf = A[i];
					A[i] = A[i - 1];
					A[i - 1] = buf;
					flag = true;
					swap++;
				}
			}
		}
		printArray(A);
		System.out.println(swap);
	}

	public static void insertionSort(int[] A, int N) { // N個の要素を含む0-オリジンの配列A
		for (int i = 0; i < N; i++) {
			int v = A[i];
			int j = i - 1;
			while (j >= 0 && A[j] > v) {
				A[j + 1] = A[j];
				j--;
				A[j + 1] = v;
			}
			printArray(A);
		}
	}

	public static void printArray(int[] A) {
		for (int i = 0; i < A.length; i++) {
			System.out.print(((i == 0) ? "" : " ") + A[i] + ((i == A.length - 1) ? "\n" : ""));
		}
	}

}

