import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int R;
	static int[] DR = { 1, 0, -1, 0 };
	static int[] DC = { 0, 1, 0, -1 };

	static int[][] count() {
		int W = sc.nextInt();
		int H = sc.nextInt();
		int X = sc.nextInt() - 1;
		int Y = sc.nextInt() - 1;
		int[][] L = new int[H][W];
		TreeSet<Integer> level = new TreeSet<Integer>();
		sc.nextLine();
		for (int i = 0; i < H; ++i) {
			String line = sc.nextLine();
			int pos = 0;
			for (int j = 0; j < W; ++j) {
				while (line.charAt(pos) == ' ') {
					++pos;
				}
				int v = 0;
				while (pos < line.length() && line.charAt(pos) != ' ') {
					v *= 10;
					v += line.charAt(pos) - '0';
					++pos;
				}
				L[i][j] = v;
				level.add(v);
			}
		}
		int[][] ret = new int[level.size() + 1][2];
		int t = 1;
		boolean[][] visited = new boolean[H][W];
		int count = 0;
		PriorityQueue<Pos> pos = new PriorityQueue<Pos>();
		pos.add(new Pos(X, Y, 1));
		visited[Y][X] = true;
		for (int l : level) {
			while (!pos.isEmpty()) {
				if (pos.peek().l > l) break;
				Pos cur = pos.poll();
				++count;
				for (int i = 0; i < 4; ++i) {
					int nx = cur.x + DC[i];
					int ny = cur.y + DR[i];
					if (nx < 0 || W <= nx || ny < 0 || H <= ny || visited[ny][nx]) continue;
					pos.add(new Pos(nx, ny, L[ny][nx]));
					visited[ny][nx] = true;
				}
			}
			ret[t][0] = l;
			ret[t][1] = count;
			++t;
		}
		return ret;
	}

	static int solve(int[][] c1, int[][] c2) {
		int min = Integer.MAX_VALUE;
		int pos = c2.length - 1;
		for (int i = 0; i < c1.length; ++i) {
			int count = c1[i][1];
			if (count >= R) {
				min = Math.min(min, c1[i][0]);
				break;
			}
			while (pos > 0 && count + c2[pos - 1][1] >= R) {
				--pos;
			}
			if (count + c2[pos][1] >= R) min = Math.min(min, c1[i][0] + c2[pos][0]);
		}
		return min;
	}

	public static void main(String[] args) {
		while (true) {
			R = sc.nextInt();
			if (R == 0) break;
			int[][] c1 = count();
			int[][] c2 = count();
			System.out.println(Math.min(solve(c1, c2), solve(c2, c1)));
		}
	}

	static class Pos implements Comparable<Pos> {
		int x, y, l;

		Pos(int x, int y, int l) {
			this.x = x;
			this.y = y;
			this.l = l;
		}

		public int compareTo(Pos o) {
			return this.l - o.l;
		}
	}
}