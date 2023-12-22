import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void selectionSort(String A[], int N) {
		for (int i = 0; i < N; i++) {
			int minj = i;
			String oki;
			for (int j = i; j < N; j++) {
				if (A[j].charAt(1) < A[minj].charAt(1)) {
					minj = j;
				}
			}
			if (i != minj) {
				oki = A[minj];
				A[minj] = A[i];
				A[i] = oki;
			}
		}
	}

	public static void bubbleSort(String A[], int N) {
		String b;
		for (int i = 0; i < N - 1; i++) {
			for (int j = N - 1; j > i; j--) {
				if (A[j - 1].charAt(1) > A[j].charAt(1)) {
					b = A[j - 1];
					A[j - 1] = A[j];
					A[j] = b;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		String[] cards1 = new String[N];
		String[] cards2 = new String[N];
		for (int i = 0; i < N; i++) {
			cards1[i] = scanner.next();
			cards2[i] = cards1[i];
		}
		bubbleSort(cards1, N);
		for (int i = 0; i < N; i++) {
			if (i != N - 1) {
				System.out.print(cards1[i] + " ");
			} else {
				System.out.println(cards1[i]);
			}
		}
		System.out.println("Stable");
		selectionSort(cards2, N);
		for (int i = 0; i < N; i++) {
			if (i != N - 1) {
				System.out.print(cards2[i] + " ");
			} else {
				System.out.println(cards2[i]);
			}
		}
		if (Arrays.equals(cards1, cards2)) {
			System.out.println("Stable");
		} else {
			System.out.println("Not stable");
		}
		scanner.close();

	}
}
