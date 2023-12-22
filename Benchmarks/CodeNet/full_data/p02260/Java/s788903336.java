import java.util.Scanner;

public class Main {

	private static int count = 0;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[] sort_before = new int[num];
		for (int i = 0; i < num; i++) {
			sort_before[i] = scan.nextInt();
		}
		int[] sort_after = selectionSort(sort_before, num);
		selectionSortPrint(sort_after, num);
		counter_print();

	}

	public static int[] selectionSort(int[] A, int N) {

		int j;
		for (int i = 0; i < N - 2; i++) {
			int minj = i;
			for (j = i + 1; j < N; j++) {
				if (A[j] < A[minj]) {
					minj = j;

				}

			}
			if (minj != j) {
				int tmp;
				tmp = A[i];
				A[i] = A[minj];
				A[minj] = tmp;

				counter();
			}

		}

		return A;
	}

	public static void selectionSortPrint(int[] A, int N) {

		for (int i = 0; i < N; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println("");
	}

	public static void counter() {
		count++;
	}

	public static void counter_print() {
		System.out.println(count);
	}
}

