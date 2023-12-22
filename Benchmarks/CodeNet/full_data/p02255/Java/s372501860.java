

import java.util.Scanner;

public class Main{

	public static void insertionSort(int[] A, int n) {

		for (int i = 1; i < n; i++) {

			printArray(A, n);

			int v = A[i];
			int j = i - 1;

			while (j >= 0 && A[j] > v) {

				A[j + 1] = A[j];
				j--;

			}

			A[j + 1] = v;
		}

		printArray(A, n);

	}

	public static void printArray(int[] A, int n) {

		for (int i = 0; i < n - 1; i++) {

			System.out.print(A[i] + " ");
		}
		System.out.println(A[n - 1]);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int A[] = new int[n];

		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		sc.close();

		insertionSort(A, n);

	}

}

