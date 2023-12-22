import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		new Main().solver();
	}

	double EPS = 1e-8;

	void solver() {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] table = new char[h][w];
		for (int i = h - 1; i >= 0; i--) {
			table[i] = sc.next().toCharArray();
		}
		ArrayList<Pair> vd = new ArrayList<>();
		for (int i = 0; i <= h; i++) {
			for (int j = 0; j <= w; j++) {
				int cnt = 0;
				for (int k = 0; k < 4; k++) {
					int ni = i - (k & 1);
					int nj = j - (k >> 1);
					if (0 <= ni && ni < h && 0 <= nj && nj < w && table[ni][nj] == '#')
						cnt++;
				}
				if (cnt % 2 == 1) {
					if (0 <= i - 1 && i - 1 < h && 0 <= j && j < w && table[i - 1][j] == (cnt == 1 ? '#' : '.')) {
						// |# .|. #|
						// |# #|. .|
						// System.out.println(j + " " + i);
						if (j != 0) {
							vd.add(new Pair(((double) i) / ((double) j), 1, j, i));
						} else {
							vd.add(new Pair(1e9, 1, j, i));
						}
					}
					if (0 <= i && i < h && 0 <= j - 1 && j - 1 < w && table[i][j - 1] == (cnt == 1 ? '#' : '.')) {
						// |# #|. .|
						// |. #|# .|
						vd.add(new Pair(((double) i) / ((double) j), -1, j, i));
					}
				}
			}
		}
		vd.sort(new Comparator<Pair>() {
			@Override
			public int compare(Pair o1, Pair o2) {
				return -Double.compare(o1.a, o2.a);
			}
		});
		int res = 1, cur = 1;
		for (int i = 0; i < vd.size();) {
			int idx = i;
			while (idx < vd.size() && Math.abs(vd.get(i).a - vd.get(idx).a) < EPS) {
//				System.out.println("diff" + vd.get(idx).b + " tan" + vd.get(idx).a + " cur" + cur + " x" + vd.get(idx).x
//						+ " y" + vd.get(idx).y);
				cur += vd.get(idx).b;
				idx++;
			}
			i = idx;
			res = Math.max(cur, res);
		}
		System.out.println(res);
	}

	class Pair {
		double a;
		int b;
		int x, y;

		Pair(double a, int b, int x, int y) {
			this.a = a;
			this.b = b;
			this.x = x;
			this.y = y;
		}
	}
}