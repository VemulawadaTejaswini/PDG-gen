import java.awt.Point;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int[] DR = { 1, 0, -1, 0 };
	static int[] DC = { 0, 1, 0, -1 };
	static int N;
	static int[][] v = new int[8][8];
	static ArrayList<Point> axisPos = new ArrayList<Point>();
	static ArrayList<Integer> axises = new ArrayList<Integer>();

	static boolean dfs(boolean[][] visited, Point pos, int axis, int sum) {
		if (sum > axises.get(axis)) return false;
		if (sum == axises.get(axis)) {
			++axis;
			if (axis == axises.size()) return true;
			pos = axisPos.get(axis);
			sum = 0;
		}
		for (int i = 0; i < 4; ++i) {
			int nr = pos.x + DR[i];
			int nc = pos.y + DC[i];
			if (nr < 0 || N <= nr || nc < 0 || N <= nc || visited[nr][nc] || v[nr][nc] < 0) continue;
			visited[nr][nc] = true;
			if (dfs(visited, new Point(nr, nc), axis, sum + v[nr][nc])) return true;
			visited[nr][nc] = false;
		}
		return false;
	}

	static boolean solve() {
		boolean[][] visited = new boolean[N][N];
		return dfs(visited, axisPos.get(0), 0, 0);
	}

	public static void main(String[] args) throws Exception {
		while (true) {
			N = sc.nextInt();
			if (N == 0) break;
			int sum = 0;
			axisPos.clear();
			axises.clear();
			for (int i = 0; i < N; ++i) {
				for (int j = 0; j < N; ++j) {
					v[i][j] = sc.nextInt();
					sum += v[i][j];
					if (v[i][j] < 0) {
						axisPos.add(new Point(i, j));
						axises.add(-v[i][j]);
					}
				}
			}
			System.out.println(sum == 0 && solve() ? "YES" : "NO");
		}
	}

}