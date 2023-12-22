import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static String[] weekday = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
	static int S, N, T, P, M;

	public static void main(String[] args) {
		while (true) {
			S = sc.nextInt();
			if (S == 0) break;
			N = sc.nextInt();
			T = sc.nextInt();
			int[] on = new int[7 * 24 * 60];
			int[] sum = new int[on.length * 2];
			String d = sc.next();
			boolean[] day = new boolean[7];
			if (d.equals("All")) {
				Arrays.fill(day, true);
			} else {
				for (int i = 0; i < 7; ++i) {
					if (weekday[i].equals(d)) day[i] = true;
				}
			}
			String time = sc.next();
			for (int i = 0; i < 7; ++i) {
				if (!day[i]) continue;
				if (time.equals("All")) {
					for (int j = 0; j < 24 * 60 - (d.equals("All") ? 0 : 1); ++j) {
						on[i * 24 * 60 + j] = 1;
					}
				} else if (time.equals("Day")) {
					for (int j = 6 * 60; j < 18 * 60 - 1; ++j) {
						on[i * 24 * 60 + j] = 1;
					}
				} else {
					for (int j = 0; j < 6 * 60 - 1; ++j) {
						on[i * 24 * 60 + j] = 1;
					}
					for (int j = 18 * 60; j < 24 * 60 - (d.equals("All") ? 0 : 1); ++j) {
						on[i * 24 * 60 + j] = 1;
					}
				}
			}
			for (int i = 1; i <= on.length; ++i) {
				sum[i] = sum[i - 1] + on[i - 1];
			}
			for (int i = 1; i < on.length; ++i) {
				sum[on.length + i] = sum[on.length + i - 1] + on[i - 1];
			}
			P = sc.nextInt();
			M = sc.nextInt();
			double ans = 0;
			for (int i = 0; i < on.length; ++i) {
				ans = Math.max(ans, solve(sum, i));
			}
			System.out.printf("%.10f\n", ans);
		}
	}

	static double solve(int[] sum, int t) {
		int c = 0;
		for (int i = 0; i < M; ++i) {
			if (sum[t + S] - sum[t] == S) c += N;
			t += T;
			t %= (7 * 24 * 60);
		}
		return 1 - Math.pow(1 - 1.0 / P, c);
	}

}