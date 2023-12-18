import java.util.Scanner;

public class Main {

	static void quick_sort(long[] d, int left, int right) {
		if (left >= right) {
			return;
		}
		long p = d[(left + right) / 2];
		int l = left, r = right;
		long tmp;
		while (l <= r) {
			while (d[l] < p) {
				l++;
			}
			while (d[r] > p) {
				r--;
			}
			if (l <= r) {
				tmp = d[l];
				d[l] = d[r];
				d[r] = tmp;
				l++;
				r--;
			}
		}
		quick_sort(d, left, r); // ピボットより左側をクイックソート
		quick_sort(d, l, right); // ピボットより右側をクイックソート
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int c = N * (N - 1) / 2;
		long set[] = new long[c];
		long number[] = new long[N];
		for (int i = 0; i < N; i++) {
			number[i] = sc.nextLong();
		}
		int k = 0;
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				if (i != j) {
					set[k] = number[i] * number[j];
					k++;
				}
			}
		}

		quick_sort(set, 0, c - 1);

		System.out.println(set[K - 1]);

	}
}
