import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int [n];
		int[] b = new int [n];
		int[] c = new int [n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			c[i] = sc.nextInt();
		}

		int[] cnt1 = new int [n];
		int[] cnt2 = new int [n];
		for (int i = 0; i < n; i++) {
			cnt1[i] = 0;
			cnt2[i] = 0;
		}

		Arrays.sort(a);
		Arrays.sort(c);

		int ans = 0;
		for (int i = 0; i < n; i++) {
			cnt1[i] = binarySearch1(a, b, i);
			// System.out.println("cnt1[" + i + "] = " + cnt1[i]);
			cnt2[i] = binarySearch2(c, b, i);
			// System.out.println("cnt2[" + i + "] = " + cnt2[i]);
			ans += cnt1[i] * cnt2[i];
		}
		System.out.print(ans);
	}

	public static int binarySearch1(int[] a, int[] b, int i) {
		int key = b[i] - 1;

		int left = 0;
		int right = a.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (a[mid] == key) {
				while (mid < a.length - 1 && a[mid] == key) {
					mid++;
				}
				if (a[mid] == key) {
					return mid + 1;
				} else {
					return mid;
				}
			}
			if (a[mid] < key) {
				left = mid + 1;
			}
			if (a[mid] > key) {
				right = mid - 1;
			}
			if (left == right) {
				mid = left;
				if (a[mid] == key) {
					while (mid < a.length - 1 && a[mid] == key) {
						mid++;
					}
					if (a[mid] == key) {
						return mid + 1;
					} else {
						return mid;
					}
				} else {
					if (a[mid] < key) {
						return mid + 1;
					} else {
						return mid;
					}
				}
			}
		}
		return -1;
	}

	public static int binarySearch2(int[] a, int[] b, int i) {
		int key = b[i] + 1;

		int left = 0;
		int right = a.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (a[mid] == key) {
				while (mid > 0 && a[mid] == key) {
					mid--;
				}
				if (a[mid] == key) {
					return a.length - mid;
				} else {
					return a.length - mid - 1;
				}
			}
			if (a[mid] < key) {
				left = mid + 1;
			}
			if (a[mid] > key) {
				right = mid - 1;
			}
			if (left == right) {
				mid = left;
				if (a[mid] == key) {
					while (mid > 0 && a[mid] == key) {
						mid--;
					}
					if (a[mid] == key) {
						return a.length - mid;
					} else {
						return a.length - mid - 1;
					}
				} else {
					if (a[mid] < key) {
						return a.length - mid - 1;
					} else {
						return a.length - mid;
					}
				}
			}
		}
		return -1;
	}
}
