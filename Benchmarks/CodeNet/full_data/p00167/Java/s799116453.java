import java.util.Arrays;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);

	int cnt;

	void run() {
		for (;;) {
			int n = sc.nextInt();
			if (n == 0)
				return;
			int[] array = new int[n];
			for (int i = 0; i < n; i++)
				array[i] = sc.nextInt();
			cnt = 0;
			mergeSort(array, 0, n);
			System.out.println(cnt);
		}
	}

	void mergeSort(int a[], int left, int right) {
		if (right - left <= 1)
			return;
		int mid = (left + right) / 2;
		mergeSort(a, left, mid);
		mergeSort(a, mid, right);
		// ??????????????§left-mid, mid-right??????????????????????????????????????????
		merge(a, left, mid, right);
	}

	// ????????????????????????????????¨??????
	void merge(int[] a, int left, int mid, int right) {
		int[] L = new int[mid - left + 1];
		int[] R = new int[right - mid + 1];
		int li = 0;
		int ri = 0;
		for (int i = 0; i < L.length - 1; i++)
			L[i] = a[left + i];
		for (int i = 0; i < R.length - 1; i++)
			R[i] = a[mid + i];
		L[L.length - 1] = R[R.length - 1] = Integer.MAX_VALUE / 2;
		for (int i = left; i < right; i++) {
			if (L[li] < R[ri]) {
				a[i] = L[li++];
			} else {
				if (L[li] != Integer.MAX_VALUE / 2) {
					cnt += (mid - li - left);
				}
				a[i] = R[ri++];
			}
		}
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}