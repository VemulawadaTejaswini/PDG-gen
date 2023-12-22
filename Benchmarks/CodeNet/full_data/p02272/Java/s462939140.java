import java.io.IOException;
import java.util.Scanner;

public class Main {

	static int count = 0;

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		mergeSort(a, 0, n);
		printArrays(a, n);
		System.out.println(count);
	}

	public static void merge(int a[], int left, int mid, int right) {
		int n1 = mid - left;
		int n2 = right - mid;
		int L[] = new int[n1 + 1];
		int R[] = new int[n2 + 1];
		for (int i = 0; i < n1; i++) {
			L[i] = a[left + i];
		}
		for (int i = 0; i < n2; i++) {
			R[i] = a[mid + i];
		}
		L[n1] = 1000000000;
		R[n2] = 1000000000;

		for (int i = 0, j = 0, k = left; k < right; k++) {
			count++;
			if (L[i] <= R[j]) {
				a[k] = L[i];
				i++;
			} else {
				a[k] = R[j];
				j++;
			}
		}
	}

	public static void mergeSort(int a[], int left, int right) {
		if (left + 1 < right) {
			int mid = (left + right) / 2;
			mergeSort(a, left, mid);
			mergeSort(a, mid, right);
			merge(a, left, mid, right);
		}
	}

	public static void printArrays(int a[], int n) {
		for (int i = 0; i < n - 1; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println(a[n - 1]);
	}
}

