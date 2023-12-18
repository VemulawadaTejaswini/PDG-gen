import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] l = new int[n];
		for (int i = 0; i < n; i++) {
			l[i] = sc.nextInt();
		}
		sc.close();

		Arrays.parallelSort(l);
		long ans = 0;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				int max = l[i] + l[j];
				if (l[j + 1] >= max) {
					continue;
				}
				int start = j + 1;
				int end = n;
				while (Math.abs(end - start) > 1) {
					int mid = (end + start) / 2;
					if (l[mid] >= max) {
						end = mid;
					} else {
						start = mid;
					}
				}
				int imax = start;

				int min = l[j] - l[i];
				if (l[j + 1] <= min) {
					continue;
				}
				start = j;
				end = n - 1;
				while (Math.abs(end - start) > 1) {
					int mid = (end + start) / 2;
					if (l[mid] > min) {
						end = mid;
					} else {
						start = mid;
					}
				}
				int imin = end;
				ans += Math.max(imax - imin + 1, 0);
			}
		}
		System.out.println(ans);
	}

	static int binarySearch1(int[] array, double val) {
		int start = -1;
		int end = array.length;

		while (Math.abs(end - start) > 1) {
			int mid = (end + start) / 2;
			if (array[mid] >= val) {
				end = mid;
			} else {
				start = mid;
			}
		}
		return end;
	}
}
