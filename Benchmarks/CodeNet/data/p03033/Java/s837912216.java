import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		long[][] STX = new long[N][3];
		for (int i = 0; i < N; i++) {
			STX[i][0] = sc.nextLong();
			STX[i][1] = sc.nextLong();
			STX[i][2] = sc.nextLong();
			STX[i][0] -= STX[i][2];
			STX[i][1] -= STX[i][2];
		}
		Arrays.sort(STX, (a, b) -> Long.compare(a[2], b[2]));

		long[][] D = new long[Q][3];
		for (int i = 0; i < Q; i++) {
			D[i][0] = sc.nextLong();
			D[i][1] = i;
			D[i][2] = Long.MAX_VALUE;
		}

		Arrays.sort(D, (a, b) -> Long.compare(a[0], b[0]));

		for (int i = N - 1; i >= 0; i--) {
			long[] stx = STX[i];

			int l = -1, r = Q;
			while (r - l > 1) {
				int m = (l + r) / 2;
				if (D[m][0] >= stx[0]) {
					r = m;
				} else {
					l = m;
				}
			}
			//if (r == Q) continue;

			int l2 = -1, r2 = Q;
			while (r2 - l2 > 1) {
				int m = (l2 + r2) / 2;
				if (D[m][0] <= stx[1] - 1) {
					l2 = m;
				} else {
					r2 = m;
				}
			}
			//if (l2 == -1) continue;
			for (int j = r; j <= l2; j++) {
				D[j][2] = stx[2];
			}
		}

		Arrays.sort(D, (a, b) -> Long.compare(a[1], b[1]));


		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < Q; i++) {
			if (D[i][2] == Long.MAX_VALUE) {
				sb.append(-1);
			} else {
				sb.append(D[i][2]);
			}
			sb.append("\n");
		}

		System.out.print(sb.toString());
	}
}
