import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	static int cnt = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int A[] = new int[n];
		for (int i = 0; i < n; i++)
			A[i] = sc.nextInt();

		sc.close();

		mergeSort(A, 0, n);
		StringBuilder sb = new StringBuilder(11 * n).append(A[0]);
		IntStream.range(1, n).forEach(t -> sb.append(' ').append(A[t]));
		System.out.println(sb.append('\n').append(cnt).toString());
	}

	static void merge(int[] A, int left, int mid, int right) {
		int n1 = mid - left;
		int n2 = right - mid;
		int L[] = new int[n1 + 1];
		int R[] = new int[n2 + 1];

		IntStream.range(0, n1).forEach(i -> L[i] = A[left + i]);
		IntStream.range(0, n2).forEach(i -> R[i] = A[mid + i]);
		L[n1] = R[n2] = Integer.MAX_VALUE; // TODO SENTINEL
		int i = 0, j = 0;
		for (int k = left; k < right; k++) {
			cnt++;
			if (L[i] <= R[j]) {
				A[k] = L[i];
				i++;
			} else {
				A[k] = R[j];
				j++;
			}
		}
	}

	static void mergeSort(int[] A, int left, int right) {
		if (left + 1 < right) {
			int mid = (left + right) / 2;
			mergeSort(A, left, mid);
			mergeSort(A, mid, right);
			merge(A, left, mid, right);
		}
	}
}
