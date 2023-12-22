import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		int l = sc.nextInt();
		int d, t, x, time = 0, max = 0;
		int[] tv = new int[n];
		int[] score = new int[n];
		for (int i = 0; i < r; i++) {
			d = sc.nextInt() - 1;
			t = sc.nextInt();
			x = sc.nextInt();
			tv[max] += t - time;
			score[d] += x;
			if (x > 0) {
				if (score[max] < score[d]) {
					max = d;
				} else if (score[max] == score[d]) {
					max = min(max, d);
				}
			} else if (max == d) {
				max = 0;
				for (int j = 1; j < n; j++) {
					if (score[max] < score[j]) {
						max = j;
					}
				}
			}
			time = t;
		}
		tv[max] += l - time;
		int ans = 0;
		for (int i = 1; i < n; i++) {
			if (tv[ans] < tv[i]) {
				ans = i;
			}
		}
		System.out.println(ans + 1);
		sc.close();
	}

	static int min(int a, int b) {
		return a < b ? a : b;
	}
}