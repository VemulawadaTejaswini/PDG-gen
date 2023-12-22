import java.util.Scanner;


public class Main {
	public static int partition(String[][] arr, int p, int r) {
		int x = toInt(arr, r);
		int i = p - 1;
		for (int j = p; j < r; j++) {
			if (toInt(arr, j) <= x) {
				change(arr, ++i, j);
			}
		}
		change(arr, ++i, r);
		return i;
	}
	public static void quickSort(String[][] arr, int p, int r) {
		if (p < r) {
			int q = partition(arr, p, r);
			quickSort(arr, p, q - 1);
			quickSort(arr, q + 1, r);
		}
	}
	public static void change(String[][] str, int a, int b) {
		String[] c = str[a];
		str[a] = str[b];
		str[b] = c;
	}
	public static int toInt(String[][] arr, int n) {
		return Integer.parseInt(arr[n][1]);
	}
	public static void merge(String[][] arr, int left, int mid, int right) {
		int n1 = mid - left;
		int n2 = right - mid;
		System.out.println("n1 " + n1);
		System.out.println("n2 " + n2);
		String[][] l = new String[n1 + 1][2];
		String[][] r = new String[n2 + 1][2];
		for (int i = 0; i < n1; i++) {
			l[i] = arr[left + i];
		}
		for (int i = 0; i < n2; i++) {
			r[i] = arr[mid + i];
		}
		l[n1][1] = Integer.toString(Integer.MAX_VALUE);
		r[n2][1] = Integer.toString(Integer.MAX_VALUE);
		int i = 0, j = 0;
		for (int k = mid; k < right; k++) {
			if (toInt(l, i) <= toInt(r, j)) {
				arr[k] = l[i++];
			} else {
				arr[k] = r[j++];
			}
		}
	}
	public static void mergeSort(String[][] arr, int left, int right) {
		if (left + 1 < right) {
			int mid = (left + right) / 2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid, right);
			merge(arr, left, mid, right);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[][] arr = new String[n][2];
		String[][] stableSort = new String[n][2];
		for (int i = 0; i < n; i++) {
			arr[i] = stableSort[i] = sc.nextLine().split(" ");
		}
		mergeSort(stableSort, 0, n);
		quickSort(arr, 0, n - 1);
		boolean isStable = true;
		for (int i = 0; i < n; i++) {
			if (!arr[i][0].equals(stableSort[i][0])) {
				isStable = false;
				break;
			}
		}
		if (isStable) {
			System.out.println("Stable");
		} else {
			System.out.println("Not stable");
		}
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
	}
}
