import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		scanner.close();
		Arrays.parallelSort(a);

		int min = a[0] + a[0]; //m=n^2
		int sup = a[n - 1] + a[n - 1] + 1; //m=0
		int mid;
		while (sup - min > 1) {
			mid = (min + sup) / 2;
			if (countHandShake(mid, n, a) >= m) {
				min = mid;
			} else {
				sup = mid;
			}
		}

		long sum = 0;
		int left = 0;
		int right = n - 1;
		while (left <= right) {
			if (a[left] + a[right] >= min) {
				for (int i = left; i < right; i++)
					sum += (a[i] + a[right]) * 2;
				sum += a[right] * 2;
				right--;
			} else {
				left++;
			}

		}
		sum -= min * (countHandShake(min, n, a) - m);

		System.out.println(sum);

	}

	static long countHandShake(int threshold, int n, int[] a) {
		long count = 0;
		int left = 0;
		int right = n - 1;
		while (left <= right) {
			if (a[left] + a[right] >= threshold) {
				count += (right - left) * 2 + 1;
				right--;
			} else {
				left++;
			}

		}
		return count;
	}

}
