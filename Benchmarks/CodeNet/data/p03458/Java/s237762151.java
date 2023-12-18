import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] x = new int[N];
		int[] y = new int[N];

		String[] c = new String[N];
		for (int i = 0; i < N; i++) {
			x[i] = sc.nextInt() % (K * 2);
			y[i] = sc.nextInt() % (K * 2);
			c[i] = sc.next();
		}

		int answer = 0;
		for (int i = 0; i < K; i++) {
			for (int j = 0; j < K; j++) {
				int ab = 0, aw = 0;
				int bb = 0, bw = 0;
				for (int k = 0; k < N; k++) {
					if ((x[k] + i) % (2 * K) >= K) {
						if ((y[k] + j) % (2 * K) >= K) {
							// b
							if (c[k].charAt(0) == 'B') {
								bb++;
							} else {
								bw++;
							}
						} else {
							// a
							if (c[k].charAt(0) == 'B') {
								ab++;
							} else {
								aw++;
							}
						}
					} else {
						if ((y[k] + j) % (2 * K) >= K) {
							// a
							if (c[k].charAt(0) == 'B') {
								ab++;
							} else {
								aw++;
							}
						} else {
							// b
							if (c[k].charAt(0) == 'B') {
								bb++;
							} else {
								bw++;
							}
						}
					}

					answer = Math.max(answer, aw + bb);
					answer = Math.max(answer, ab + bw);
				}
			}
		}

		System.out.println(answer);
	}
}
