import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int X = scn.nextInt();
		int N = scn.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scn.nextInt();
		}
		int ans = Val(N, X, arr);
		System.out.println(ans);
	}

	public static int Val(int N, int X, int[] arr) {
		if (N == 0) {
			return X;
		}
		quickSort(arr, 0, N - 1);
		int val = X + 1;
		int val1 = X;
		boolean start = false;
		while (true) {
			val = val - 1;
			int bs = binarySearch(arr, 0, N - 1, val);
			if (bs == -1) {
				return val;
			}
			if (start) {
				val1 = val1 + 1;
				int bs1 = binarySearch(arr, 0, N - 1, val1);
				if (bs1 == -1) {
					return val1;
				}
			}
			start = true;
		}
	}

	public static int binarySearch(int arr[], int l, int r, int x) {
		if (r >= l) {
			int mid = l + (r - l) / 2;
			if (arr[mid] == x)
				return mid;
			if (arr[mid] > x)
				return binarySearch(arr, l, mid - 1, x);
			return binarySearch(arr, mid + 1, r, x);
		}
		return -1;
	}

	public static void quickSort(int[] arr, int lo, int hi) {
		if (lo >= hi) {
			return;
		}
		int mid = (lo + hi) / 2;
		int pivot = arr[mid];
		int left = lo;
		int right = hi;
		while (left <= right) {
			while (arr[left] < pivot) {
				left++;
			}
			while (arr[right] > pivot) {
				right--;
			}
			if (left <= right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		quickSort(arr, lo, right);
		quickSort(arr, left, hi);
	}
}