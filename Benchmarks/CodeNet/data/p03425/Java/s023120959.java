

import java.util.Scanner;

public class Main {

	public static double comb(int n, int r) {
		double ans = 1;
		if (n < r)
			return 0;
		if (n == r)
			return 1;
		for (int i = 1; i <= r; ++i) {
			ans *= (double) (n - i + 1);
			ans /= i;
		}
		return ans;
	}

	public static double comp(String a[], int n) {
		double count = 0;
		int count2[], count3 = 0;
		count2 = new int[5];

		if (n < 3)
			return 0;

		count = comb(n, 3);

		for (int i = 0; i < n; ++i) {
			if (a[i].charAt(0) == 'M') {
				++count2[0];
				if (count2[0] == 1)
					++count3;
			}
			if (a[i].charAt(0) == 'A') {
				++count2[1];
				if (count2[1] == 1)
					++count3;
			}
			if (a[i].charAt(0) == 'R') {
				++count2[2];
				if (count2[2] == 1)
					++count3;
			}
			if (a[i].charAt(0) == 'C') {
				++count2[3];
				if (count2[3] == 1)
					++count3;
			}
			if (a[i].charAt(0) == 'H') {
				++count2[4];
				if (count2[4] == 1)
					++count3;
			}
		}

		// System.out.println(count3 + " " + count);

		for (int i = 0; i < 5; ++i) {
			if (count2[i] == 2)
				count -= (double) (count3 - 1);
			else if (count2[i] > 2) {
				count -= comb(count2[2], 3);
				count -= comb(count2[2], 2) * (double) (count3 - 1);
			}
		}

		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, count = 0;
		String s[], tmp;

		n = sc.nextInt();

		s = new String[n];

		for (int i = 0; i < n; ++i) {
			tmp = sc.next();
			if (tmp.charAt(0) == 'M' || tmp.charAt(0) == 'A' || tmp.charAt(0) == 'R' || tmp.charAt(0) == 'C'
					|| tmp.charAt(0) == 'H') {
				s[count++] = tmp;
			}
		}

		double ans = comp(s, count);

		System.out.println((long) ans);

		sc.close();
	}

}
