import java.util.Scanner;

public class Main {

	public static int n;
	public static int[] A;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		A = new int[n];

		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		insertionSort();

	}

	public static void insertionSort() {
		for (int i = 0; i < n; i++) {
			int v = A[i];
			int j = i - 1;
			while (j >= 0 && A[j] > v) {
				A[j + 1] = A[j];
				j--;
			}
			A[j + 1] = v;
			printA();
		}
	}

	public static void printA() {
		for (int i = 0; i < n - 1; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println(A[n - 1]);
	}
}
