import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		for (int i = 0; i < N; ++i)
			A[i] = sc.nextInt();
		Main main = new Main();
		int swapcnt = main.bubbleSort(A, N);
		for (int i = 0; i < N; ++i) {
			if (i > 0) System.out.print(" ");
			System.out.print(A[i]);
		}
		System.out.println();
		System.out.println(swapcnt);
	}
	public int bubbleSort(int A[], int N) {
		int swapcnt = 0;
		boolean fin = false; // Did sorting finish?
		while (!fin) {
			fin = true; // No swapping means finish of sorting.
			for (int j = N - 1; j > 0; --j) {
				if (A[j] < A[j - 1]) {
					// swapping A[j] for A[j - 1]
					int tmp = A[j];
					A[j] = A[j - 1];
					A[j - 1] = tmp;
					++swapcnt;
					fin = false; // Swapping was found.
				}
			}
		}
		return swapcnt;
	}
}
