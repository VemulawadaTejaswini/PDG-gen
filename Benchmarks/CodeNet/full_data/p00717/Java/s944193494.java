import java.util.Scanner;

public class Main {
	Scanner in = new Scanner(System.in);
	int n, m;
	int maxX, maxY, minX, minY;
	int[][] x;
	int[][] y;
	
	public Main() {
		while (true) {
			n = in.nextInt();
			if (n == 0) break;
			x = new int[n+1][];
			y = new int[n+1][];
			for (int i = 0; i <= n; i++) {
				m = in.nextInt();
				x[i] = new int[m];
				y[i] = new int[m];
				maxX = Integer.MIN_VALUE;
				maxY = Integer.MIN_VALUE;
				minX = Integer.MAX_VALUE;
				minY = Integer.MAX_VALUE;
				for (int j = 0; j < m; j++) {
					x[i][j] = in.nextInt() * 2;
					y[i][j] = in.nextInt() * 2;
					maxX = Math.max(maxX, x[i][j]);
					maxY = Math.max(maxY, y[i][j]);
					minX = Math.min(minX, x[i][j]);
					minY = Math.min(minY, y[i][j]);
				}
				int gx = (maxX + minX) / 2;
				int gy = (maxY + minY) / 2;
				for (int j = 0; j < m; j++) {
					x[i][j] -= gx;
					y[i][j] -= gy;
				}
			}
			for (int i = 1; i <= n; i++) {
				if (x[0].length != x[i].length) continue;
				else if (equalPolygon(i))
					System.out.println(i);
			}
			System.out.println("+++++");
		}
	}
	
	boolean equalPolygon(int tgt) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < m; j++) {
				if ((x[0][j] == x[tgt][j] && y[0][j] == y[tgt][j]) ||
					(x[0][j] == x[tgt][m-j-1]) && (y[0][j] == y[tgt][m-j-1])) {
					if (j == m - 1) return true;
					continue;
				}
				else break;
			}
			for (int j = 0; j < m; j++) {
				int temp = x[tgt][j];
				x[tgt][j] = y[tgt][j];
				y[tgt][j] = -temp;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		new Main();
	}
}