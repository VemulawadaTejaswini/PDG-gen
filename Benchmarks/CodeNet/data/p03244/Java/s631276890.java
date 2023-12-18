

import java.util.Scanner;

public class Main {

	public static int max(int v[], int e) {
		int max = 0;
		for (int i = 1; i < v.length; ++i) {
			if (i != e) {
				if (v[max] < v[i]) {
					max = i;
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, s1, s2, s3, s4, count = 0, count3 = 0;
		int v[];
		int count1[], count2[];
		count1 = new int[100001];
		count2 = new int[100001];

		n = sc.nextInt();

		v = new int[n + 1];
		for (int i = 1; i <= n; ++i) {
			v[i] = sc.nextInt();
			if (i % 2 != 0) {
				++count1[v[i]];
			} else {
				++count2[v[i]];
			}
		}

		s1 = max(count1, 0);
		s3 = max(count1, s1);
		s2 = max(count2, 0);
		s4 = max(count2, s2);

		if (s1 != s2) {
			for (int i = 1; i <= n; ++i) {
				if (i % 2 != 0) {
					if (v[i] != s1) {
						++count;
					}
				} else {
					if (s2 > 0) {
						if (v[i] != s2) {
							++count;
						}
					}
				}
			}
		} else {
			for (int i = 1; i <= n; ++i) {
				if (i % 2 != 0) {
					if (v[i] != s3) {
						++count;
					}
				} else {
					if (s2 > 0) {
						if (v[i] != s2) {
							++count;
						}
					}
				}
			}
			for (int i = 1; i <= n; ++i) {
				if (i % 2 != 0) {
					if (v[i] != s1) {
						++count3;
					}
				} else {
					if (s2 > 0) {
						if (v[i] != s4) {
							++count3;
						}
					}
				}
			}

			if (count3 < count) {
				count = count3;
			}
		}

		System.out.println(count);
		sc.close();
	}

}
