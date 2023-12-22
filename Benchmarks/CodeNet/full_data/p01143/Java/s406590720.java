package aoj2018;

import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int p = sc.nextInt();
			if ((n | m | p) == 0)
				break;
			m--;
			int o = 0, x = 0;
			double money = 0;
			for (int i = 0; i < n; i++) {
				int k = sc.nextInt();
				if (i == m) {
					o += k;
				} else {
					x += k;
				}
				money += k * 100;
			}

			money = money * (100 - p) / 100;
			if (o == 0) {
				System.out.println(0);
			} else {
				System.out.println((int)(money / o));
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}