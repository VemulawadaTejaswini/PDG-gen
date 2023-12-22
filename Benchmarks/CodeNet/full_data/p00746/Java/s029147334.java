import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int[] DR = { 0, 1, 0, -1 };
	static int[] DC = { -1, 0, 1, 0 };

	public static void main(String[] args) throws Exception {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			int l = 0;
			int r = 0;
			int b = 0;
			int t = 0;
			int[] row = new int[N];
			int[] col = new int[N];
			for (int i = 1; i < N; ++i) {
				int n = sc.nextInt();
				int d = sc.nextInt();
				row[i] = row[n] + DR[d];
				col[i] = col[n] + DC[d];
				l = Math.min(l, col[i]);
				r = Math.max(r, col[i]);
				t = Math.min(t, row[i]);
				b = Math.max(b, row[i]);
			}
			System.out.println((r - l + 1) + " " + (b - t + 1));
		}
	}

}