import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main main = new Main();
		int A[] = new int[100]; // sufficient
		int N = sc.nextInt();
		for (int i = 0; i < N; ++i)
			A[i] = sc.nextInt();
		int swapcnt = main.selectionSort(A, N);
		for (int i = 0; i < N; ++i) {
			// to join A by " "(space).
			if (i > 0) System.out.print(" ");
			System.out.print(A[i]);
		}
		System.out.println();
		System.out.println(swapcnt);
	}
	/* sort array A(size: N) by using Selection Sort. */
	/* return counts of swapping. */
	public int selectionSort(int A[], int N) {
		int swapcnt = 0;
		for (int i = 0; i < N; ++i) {
			// assume index pointing min{A} is i.
			int minj = i;
			// linear search for index pointing min{A}.
			for (int j = i; j < N; ++j) {
				if (A[j] < A[minj])
					minj = j;
			}
			// not swap when i == minj.
			if (i == minj)
				continue;
			// swapping A[i] for A[minj](i != minj).
			int tmp = A[i];
			A[i] = A[minj];
			A[minj] = tmp;
			++swapcnt;
		}
		return swapcnt;
	}
}
