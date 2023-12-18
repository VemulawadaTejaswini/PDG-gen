

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int w = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		StringBuilder[] ans = new StringBuilder[h];
		for (int i = 0; i < h; i++) {
			ans[i] = new StringBuilder("");
		}

		boolean flg = true;

		if (h == 1 || w == 1) {

			if (h == 1) {
				if (b != 0) {
					flg = false;
				} else {
					for (int i = 0; i < w; i++) {
						if (i < a)
							ans[0].append("0");
						else
							ans[0].append("1");
					}
				}
			}

			if (w == 1) {
				if (a != 0) {
					flg = false;
				} else {
					for (int i = 0; i < h; i++) {
						if (i < b)
							ans[i].append("0");
						else
							ans[i].append("1");
					}
				}
			}
		} else {

			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {

					if (i < b) {
						if (j < a)
							ans[i].append("0");
						else
							ans[i].append("1");
					} else {
						if (j < a)
							ans[i].append("1");
						else
							ans[i].append("0");
					}
				}
			}

		}

		if (flg) {
			for (int i = 0; i < h; i++) {
				System.out.println(ans[i].toString());
			}
		} else {
			System.out.println("No");
		}

	}

}
