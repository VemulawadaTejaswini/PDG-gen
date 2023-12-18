import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int h = sc.nextInt();
		int w = sc.nextInt();
		int ans = 200000, max = 0, min = 0;
		boolean cal = false;

		if ((h * w) % 3 != 0) {
			// 縦T
			for (int i = 1; i < h; i++) {
				for (int j = 1; j < w; j++) {
					max = 0;
					min = 0;
					int a = i * w;
					int b = (h - i) * j;
					int c = (h - i) * (w - j);
					if (a >= b && a >= c) {
						max = a;
					} else if (b >= a && b >= c) {
						max = b;
					} else {
						max = c;
					}
					if (a <= b && a <= c) {
						min = a;
					} else if (b <= a && b <= c) {
						min = b;
					} else {
						min = c;
					}
					if (ans > (max - min)) {
						ans = max - min;
						cal = true;
					} else if (cal) {
						cal = false;
						break;
					}
				}
			}

			// 横T
			for (int i = 1; i < w; i++) {
				for (int j = 1; j < h; j++) {
					max = 0;
					min = 0;
					int a = h * i;
					int b = j * (w - i);
					int c = (h - j) * (w - i);
					if (a >= b && a >= c) {
						max = a;
					} else if (b >= a && b >= c) {
						max = b;
					} else {
						max = c;
					}
					if (a <= b && a <= c) {
						min = a;
					} else if (b <= a && b <= c) {
						min = b;
					} else {
						min = c;
					}
					if (ans > (max - min)) {
						ans = max - min;
						cal = true;
					} else if (cal) {
						cal = false;
						break;
					}
				}
			}
		} else {
			ans = 0;
		}

		System.out.println(ans);

		sc.close();
	}
}
