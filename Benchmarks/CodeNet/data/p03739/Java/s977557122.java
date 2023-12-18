import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] a = new int[100100];
		int[] s = new int[100100];
		int n = sc.nextInt();
		int sum1 = 0;
		int sum2 = 0;

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		s[0] = a[0];
		for (int i = 1; i < n; i++) {
			s[i] = s[i-1] + a[i];
		}

		int count = 0;
		// - + - + となる場合
		while (s[0] >= 0) {
			s[0]--;
			count++; sum1++;
		}
		for (int i = 1; i < n; i++) {
			s[i] -= count;
		}

		for (int i = 1; i < n; i++) {
			count = 0;
			// iが奇数の場合は正にする
			if (i % 2 != 0) {
				while (s[i-1]*s[i] >= 0) {
					s[i]++;
					count++; sum1++;
				}
				for (int j = i+1; j < n; j++) {
					s[j] += count;
				}
			}
			// iが偶数の場合は負にする
			else {
				while (s[i-1]*s[i] >= 0) {
					s[i]--;
					count++; sum1++;
				}
				for (int j = i+1; j < n; j++) {
					s[j] -= count;
				}
			}
		}

		s[0] = a[0];
		for (int i = 1; i < n; i++) {
			s[i] = s[i-1] + a[i];
		}
		count = 0;
		// + - + - となる場合
		while (s[0] <= 0) {
			s[0]++;
			count++; sum2++;
		}
		for (int i = 1; i < n; i++) {
			s[i] += count;
		}

		for (int i = 1; i < n; i++) {
			count = 0;
			if (i % 2 != 0) {
				while (s[i-1]*s[i] >= 0) {
					s[i]--;
					count++; sum2++;
				}
				for (int j = i+1; j < n; j++) {
					s[j] -= count;
				}
			}
			else {
				while (s[i-1]*s[i] >= 0) {
					s[i]++;
					count++; sum2++;
				}
				for (int j = i+1; j < n; j++) {
					s[j] += count;
				}
			}
		}

		System.out.println(Math.min(sum1, sum2));
	}

}
