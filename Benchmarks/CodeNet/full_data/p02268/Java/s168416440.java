

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s[] = new int[n];
		for (int i = 0; i < n; i++) {
			s[i] = sc.nextInt();
		}

		int q = sc.nextInt();
		int t[] = new int[q];

		for (int i = 0; i < q; i++) {
			t[i] = sc.nextInt();
		}

		System.out.println(countNumbers(n, s, q, t));
	}

	public static boolean isIncludeNumber(int n, int s[], int num) {
		for (int i = 0; i < n; i++) {
			if (s[i] == num) {
				return true;
			}
		}
		return false;
	}

	public static int countNumbers(int n, int s[], int q, int t[]) {
		int count = 0;
		for (int j = 0; j < q; j++) {
			if (isIncludeNumber(n, s, t[j])) {
				count++;
			}
		}
		return count;
	}
}

