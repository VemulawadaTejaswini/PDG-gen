import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str[] = br.readLine().split(" ");
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(str[i]);
		}
		System.out.println(mergeSort(a, 0, n));
	}

	public static int bubbleSort(int a[], int n) {
		int cnt = 0, tmp;
		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j > i; j--) {
				if (a[j] < a[j - 1]) {
					tmp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = tmp;
					cnt++;
				}
			}
		}
		return cnt;
	}

	public static long merge(int a[], int left, int mid, int right) {
		long count = 0;
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
			if (L[i] <= R[j]) {
				a[k] = L[i];
				i++;
			} else {
				a[k] = R[j];
				j++;
				count += n1 - i;
			}
		}
		return count;
	}

	public static long mergeSort(int a[], int left, int right) {
		long v1, v2, v3;
		if (left + 1 < right) {
			int mid = (left + right) / 2;
			v1 = mergeSort(a, left, mid);
			v2 = mergeSort(a, mid, right);
			v3 = merge(a, left, mid, right);
			return v1 + v2 + v3;
		} else
			return 0;
	}
}
