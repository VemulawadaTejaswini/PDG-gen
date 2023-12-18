import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] l = new int[n];
		for (int i = 0; i < n; i++) {
			l[i] = sc.nextInt();
		}
		sc.close();

		Arrays.sort(l);
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int index1 = Math.max(j + 1, search1(l, l[j] - l[i]));
				int index2 = search2(l, l[j] + l[i]);
				if (index1 <= index2) {
					count += (index2 - index1 + 1);
				}
			}
		}
		System.out.println(count);
	}

	public static int search1(int[] l, int a) {
		int min = 0;
		int max = l.length;
		while (max - min > 1) {
			int mid = min + (max - min) / 2;
			if (l[mid] > a) {
				max = mid;
			} else {
				min = mid;
			}
		}
		return max;
	}

	public static int search2(int[] l, int a) {
		int min = 0;
		int max = l.length;
		while (max - min > 1) {
			int mid = min + (max - min) / 2;
			if (l[mid] < a) {
				min = mid;
			} else {
				max = mid;
			}
		}
		return min;
	}
}
