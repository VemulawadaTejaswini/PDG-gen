import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		while (true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if (n == 0) return;
			int[] a = new int[n];
			for (int i = 0; i < n; ++i) {
				a[i] = sc.nextInt();
			}
			int loser = 0;
			int th = m / a[0] * a[0];
			boolean dup = false;
			for (int i = 1; i < n - 1; ++i) {
				int min;
				if (a[loser] <= a[i]) {
					min = th;
				} else {
					min = th + 1;
				}
				int submit = (min + (a[i] - 1)) / a[i] * a[i];
				if (submit > m) {
					loser = i;
					th = (min - 1) / a[i] * a[i];
					dup = false;
				} else if (submit == th && a[loser] == a[i]) {
					dup = true;
				} else {
					dup = false;
				}
			}
			if (dup) {
				loser = n - 1;
			} else {
				int min;
				if (a[loser] < a[n - 1]) {
					min = th;
				} else {
					min = th + 1;
				}
				int submit = (min + (a[n - 1] - 1)) / a[n - 1] * a[n - 1];
				if (submit > m) {
					loser = n - 1;
				}
			}
			System.out.println(loser + 1);
		}
	}
}