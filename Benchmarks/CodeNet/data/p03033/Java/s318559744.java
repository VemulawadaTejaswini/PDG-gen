import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int q = scanner.nextInt();
		int[] s = new int[n];
		int[] t = new int[n];
		int[] x = new int[n];
		int[] d = new int[q];
		for (int i = 0; i < n; i++) {
			s[i] = scanner.nextInt();
			t[i] = scanner.nextInt();
			x[i] = scanner.nextInt();
		}
		for (int i = 0; i < q; i++) {
			d[i] = scanner.nextInt();
		}
		for (int i = 0; i < q; i++) {
			System.out.println(calculateDist(d[i], s, t, x));
		}
	}
	
	private static int calculateDist(int d, int[] s, int[] t, int[] x) {
		int dist = Integer.MAX_VALUE;
		for (int i = 0; i < s.length; i++) {
			// 出発時刻が終了時刻より後の場合何もしない
			if (t[i] <= d) {
				continue;
			}
			// 開始時刻時点の位置
			int sd = s[i] - d;
			if (sd < 0) {
				continue;
			}
			// 終了時刻時点の位置
			int td = t[i] - d;
			if (sd <= x[i] && x[i] < td) {
				dist = Math.min(dist, x[i]);
			}
		}
		return (dist == Integer.MAX_VALUE) ? -1 : dist;
	}
}
