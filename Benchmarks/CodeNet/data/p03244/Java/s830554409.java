import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[][] l = new int[100001][2];
		int[][] r = new int[100001][2];
		for (int i = 0; i < N; i++) {
			int d = in.nextInt();
			if (i % 2 == 0) {
				l[d][0] = d;
				l[d][1]++;
			} else {
				r[d][0] = d;
				r[d][1]++;
			}
		}
		Arrays.sort(l, (x, y) -> Integer.compare(x[1], y[1]));
		Arrays.sort(r, (x, y) -> Integer.compare(x[1], y[1]));
		if (l[l.length - 1][0] != r[r.length - 1][0]) {
			System.out.println(N - l[l.length - 1][1] - r[r.length - 1][1]);
		} else {
			System.out.println(
					Math.min(N - l[l.length - 2][1] - r[r.length - 1][1], N - l[l.length - 1][1] - r[r.length - 2][1]));
		}
		in.close();
	}
}