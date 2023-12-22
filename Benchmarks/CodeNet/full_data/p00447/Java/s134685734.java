import java.awt.Point;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int M = sc.nextInt();
			if (M == 0) break;
			int[] xm = new int[M];
			int[] ym = new int[M];
			for (int i = 0; i < M; ++i) {
				xm[i] = sc.nextInt();
				ym[i] = sc.nextInt();
			}
			int N = sc.nextInt();
			int[] xn = new int[N];
			int[] yn = new int[N];
			HashSet<Point> ps = new HashSet<Point>();
			for (int i = 0; i < N; ++i) {
				xn[i] = sc.nextInt();
				yn[i] = sc.nextInt();
				ps.add(new Point(xn[i], yn[i]));
			}
			for (int i = 0; i < N; ++i) {
				int dx = xn[i] - xm[0];
				int dy = yn[i] - ym[0];
				boolean ok = true;
				for (int j = 0; j < M; ++j) {
					if (!ps.contains(new Point(xm[j] + dx, ym[j] + dy))) {
						ok = false;
						break;
					}
				}
				if (ok) {
					System.out.println(dx + " " + dy);
					break;
				}
			}
		}
	}
}