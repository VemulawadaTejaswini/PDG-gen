

import java.util.Scanner;

public class Main {

	public static int max(int v[], int e) {
		int max = 0;
		for (int i = 0; i < v.length; ++i) {
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

		int n, s1, s2, count = 0;
		int v[];
		int count1[], count2[];
		count1 = new int[100000];
		count2 = new int[100000];

		n = sc.nextInt();

		v = new int[n];
		for (int i = 0; i < n; ++i) {
			v[i] = sc.nextInt();
			if (i % 2 != 0) {
				++count1[v[i]];
			} else {
				++count2[v[i]];
			}
		}

		s1 = max(count1, 0);
		s2 = max(count2, s1);
		if (s2 <= 0)
			count = n / 2;

		for (int i = 0; i < n; ++i) {
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

		System.out.println(count);

		sc.close();
	}

}
