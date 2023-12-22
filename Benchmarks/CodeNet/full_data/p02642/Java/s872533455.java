import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scn.nextInt();
		}
		quickSort(arr, 0, N - 1);
		int ans = 1;
		if (N >= 2) {
			if (arr[0] == arr[1]) {
				ans--;
			}
		}
		for (int i = N - 1; i >= 0; i--) {
			int a = arr[i];
			boolean check = true;
			for (int j = 0; j <= i; j++) {
				int b = arr[j];
				if (j != i && (a % b) == 0) {
					check = false;
					break;
				}
			}
			if (i != 0 && check) {
				ans++;
			}
		}
		System.out.println(ans);
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