import java.util.Scanner;

public class Main {
	static int[] array;
	static int count;

	public static void merge(int left,int mid, int right) {
		int n1 = mid - left;
		int n2 = right - mid;
		int[] l = new int[n1 + 1];
		int[] r = new int[n2 + 1];
		for (int i = 0; i < n1; i++) {
			l[i] = array[left + i];
		}
		for (int i = 0; i < n2; i++) {
			r[i] = array[mid + i];
		}
		l[n1] = Integer.MAX_VALUE;
		r[n2] = Integer.MAX_VALUE;
		int i = 0, j = 0;
		for (int k = left; k < right; k++) {
			count++;
			if (l[i] <= r[j]) {
				array[k] = l[i++];
			} else {
				array[k] = r[j++];
			}
		}
	}
	public static void mergeSort(int left, int right) {
		if (left + 1 < right) {
			int mid = (left + right) / 2;
			mergeSort(left, mid);
			mergeSort(mid, right);
			merge(left, mid, right);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		mergeSort(0, n);
		for (int i = 0; i < n; i++) {
			if (i == n - 1) {
				System.out.println(array[i]);
			} else {
				System.out.print(array[i] + " ");
			}
		}
		System.out.println(count);
	}
}
