import java.util.Scanner;

public class Main {
	static long count = 0;

	public static long merge(int[] A, int left, int mid, int right) {
		int n1 = mid - left;
		int n2 = right - mid;
		int[] L = new int[n1 + 1];
		int[] R = new int[n2 + 1];
		for (int i = 0; i < n1; i++) {
			L[i] = A[left + i];

		}
		for (int i = 0; i < n2; i++) {
			R[i] = A[mid + i];

		}
		L[n1] = 1000000001;
		R[n2] = 1000000001;
		int i = 0;
		int j = 0;
		for (int k = left; k < right; k++) {
			if (L[i] <= R[j]) {
				A[k] = L[i];
				i = i + 1;
			} else {
				A[k] = R[j];
				j = j + 1;
				count += n1 - i;
			}

		}
		return count;

	}

	public static long mergeSort(int[] A, int left, int right) {
		if (left + 1 < right) {
			int mid = (left + right) / 2;
			mergeSort(A, left, mid);
			mergeSort(A, mid, right);
			count = merge(A, left, mid, right);
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = scanner.nextInt();
		}
		count = mergeSort(numbers, 0, n);
		System.out.println(count);
		scanner.close();
	}

}
