import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Main {

	static int h;
	static int w;

	static String matrix[][];

	static int dx[] = { 1, 0, -1, 0 };
	static int dy[] = { 0, 1, 0, -1 };

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");
		h = Integer.parseInt(str[0]);
		w = Integer.parseInt(str[1]);

		int[][] matrix = new int[h][w];
		Queue<Integer> queueX = new ArrayDeque<>();
		Queue<Integer> queueY = new ArrayDeque<>();

		for (int i = 0; i < h; i++) {
			str = br.readLine().split("");
			Arrays.fill(matrix[i], Integer.MAX_VALUE);
			for (int j = 0; j < w; j++) {
				if (str[j].equals("#")) {
					matrix[i][j] = 0;
					queueX.add(j);
					queueY.add(i);
				}
			}
		}
		int ans = 0;

		while (!queueX.isEmpty() && !queueY.isEmpty()) {
			int nowx = queueX.poll();
			int nowy = queueY.poll();
			for (int i = 0; i < 4; i++) {
				if (nowx + dx[i] < 0 || nowx + dx[i] >= w || nowy + dy[i] < 0 || nowy + dy[i] >= h)
					continue;
				int nx = nowx + dx[i], ny = nowy + dy[i];
				if (matrix[ny][nx] == Integer.MAX_VALUE) {
					matrix[ny][nx] = matrix[nowy][nowx] + 1;
					queueX.add(nx);
					queueY.add(ny);
				}
			}
		}
		for (int i = 0; i < h; i++)
			for (int j = 0; j < w; j++)
				ans = Math.max(ans, matrix[i][j]);
		System.out.println(ans);
	}
}