import java.io.*;
import java.util.*;

class Main {
	static final String YES = "Yes";
	static final String NO = "No";

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] txy = new int[N][3];
		for (int i = 0; i < N; i++) {
			txy[i][0] = sc.nextInt();
			txy[i][1] = sc.nextInt();
			txy[i][2] = sc.nextInt();
		}
		Arrays.sort(txy, (a, b) -> Long.compare(a[0], b[0]));
		int a = 0, b = 0;
		for (int i = 0; i < N; i++) {
			int move = txy[i][0] - (i == 0 ? 0 : txy[i - 1][0]);
			int dist = d(txy[i][1], txy[i][2], a, b);
			if (move < dist || (move - dist) % 2 == 1) {
				System.out.println(NO);
				return;
			}

			a = txy[i][1];
			b = txy[i][2];
		}

		System.out.println(YES);
	}

	private static int d(int x, int y, int x2, int y2) {
		return Math.abs(x - x2) + Math.abs(y - y2);
	}
}
