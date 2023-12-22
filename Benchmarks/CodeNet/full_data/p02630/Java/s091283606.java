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
		int q = scn.nextInt();
		while (q-- > 0) {
			int b = scn.nextInt();
			int c = scn.nextInt();
			Val(arr, b, c);
			long sum = sum(arr);
			System.out.println(sum);
		}

	}

	public static void Val(int[] arr, int b, int c) {
		int n = arr.length;
		int idx = Integer.MAX_VALUE;
		while (idx != -1) {
			idx = binarySearch(arr, 0, n - 1, b);
			if (idx == -1) {
				break;
			} else {
				arr[idx] = c;
			}
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

	public static long sum(int[] s) {
		int length = s.length - 1;
		int half = length / 2;
		long sum = 0;
		for (int i = 0; i <= half; i++) {
			sum += s[i] + s[length - i];
		}
		return sum;
	}

}
