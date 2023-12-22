import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {

	Scanner sc = new Scanner(System.in);

	void run() {
		for (;;) {
			int n = sc.nextInt();
			int t = sc.nextInt();
			if ((n | t) == 0) {
				break;
			}
			int[] m = new int[n];
			int[] l = new int[n];
			int[] k = new int[n];

			for (int i = 0; i < n; i++) {
				m[i] = sc.nextInt();
				l[i] = sc.nextInt();
				k[i] = sc.nextInt();
			}

			int ml[] = new int[n];
			int ll[] = new int[n];
			int kl[] = new int[n];
			int st[] = new int[n];
			int min = 1;
			int max = n;
			for (;;) {
				if (min == max) {
					break;
				}
				int o = (max + min) / 2;

				for (int i = 0; i < n; i++) {
					ll[i] = l[i];
					st[i] = 0;
				}
				int ol = o;
				int f = 0;

				for (int j = 0;; j++) {
					if (f == n) {
						max = o;
						break;
					}
					if (t <= j) {
						min = 1 + o;
						break;
					}

					for (int i = 0; i < n; i++) {

						if (st[i] == 0) {
							if (ol > 0) {
								ol--;
								st[i] = 1;
								ml[i] = m[i];
							} else {
								ll[i]--;
								if (ll[i] == 0) {
									st[i] = 2;
									kl[i] = k[i];
								}
							}
						}

						if (st[i] == 1) {
							ml[i]--;
							if (ml[i] == 0) {
								st[i] = 3;
								ol++;
								f++;
							}
							// ml[i]--;
						} else {
							if (st[i] == 2) {
								kl[i]--;
								if (kl[i] == 0) {
									ll[i] = l[i];
									st[i] = 0;
								}
							}
						}

						/*
						 * if (j % 10 == 0) { System.out.println(j + " " + o +
						 * " " + i + " " + st[i] + " " + ll[i] + " " + ml[i] +
						 * " " + kl[i]); }
						 */}
				}

			}
			System.out.println(max);

		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}