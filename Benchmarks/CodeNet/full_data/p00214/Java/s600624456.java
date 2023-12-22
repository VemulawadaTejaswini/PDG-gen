
import java.awt.Polygon;
import java.awt.geom.Line2D;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			for (int i = 0; i < n; i++) {
				int m = scanner.nextInt();
				Polygon[] tetragon = new Polygon[m];
				Line2D[][] lines = new Line2D[m][4];
				for (int j = 0; j < m; j++) {
					int[] xs = new int[4];
					int[] ys = new int[4];
					for (int j1 = 0; j1 < 4; j1++) {
						xs[j1] = scanner.nextInt();
						ys[j1] = scanner.nextInt();
					}
					tetragon[j] = new Polygon(xs, ys, 4);
					for (int k = 0; k < 4; k++) {
						lines[j][k] = new Line2D.Double(xs[k], ys[k],
								xs[(k + 1) % 4], ys[(k + 1) % 4]);
					}
				}
				UnionFin unionFin = new UnionFin(m);
				for (int j = 0; j < m; j++) {
					for (int k = j + 1; k < m; k++) {
						boolean flag = false;
						for (int l = 0; l < 4; l++) {
							if (tetragon[j].contains(tetragon[k].xpoints[l],
									tetragon[k].ypoints[l])
									|| tetragon[k].contains(
											tetragon[j].xpoints[l],
											tetragon[j].ypoints[l])) {
								flag = true;
							}
						}
						if (flag)
							unionFin.unite(j, k);
					}
				}
				System.out.println(unionFin.num);
			}
		}
	}

	class UnionFin {
		int[] par, rank;
		int num;

		public UnionFin(int size) {
			num = size;
			par = new int[size];
			rank = new int[size];
			for (int i = 0; i < size; i++)
				par[i] = i;
		}

		int root(int x) {
			if (par[x] == x)
				return x;
			else
				return par[x] = root(par[x]);
		}

		void unite(int x, int y) {
			x = root(x);
			y = root(y);
			if (x == y)
				return;
			if (rank[x] < rank[y])
				par[x] = y;
			else {
				par[y] = x;
				if (rank[x] == rank[y])
					rank[x]++;
			}
			num--;
		}

		boolean isSame(int x, int y) {
			return root(x) == root(y);
		}
	}
}