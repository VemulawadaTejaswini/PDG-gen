import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	/** 道を表す文字 */
	private static final char ROAD = '.';

	/** 移動のX座標差分配列 */
	private static final int[] MOVE_XS = new int[] { 1, -1, 0, 0 };
	/** 移動のY座標差分配列 */
	private static final int[] MOVE_YS = new int[] { 0, 0, 1, -1 };
	/** ワープのX座標差分配列 */
	private static final int[] WARP_XS = new int[] { 1, 1, 1, 1, -1, -1, -1, -1, 2, 2, 2, 2, 2, -2, -2, -2, -2, -2, 0,
			0 };
	/** ワープのY座標差分配列 */
	private static final int[] WARP_YS = new int[] { 1, -1, 2, -2, 1, -1, 2, -2, 0, 1, -1, 2, -2, 0, 1, -1, 2, -2, 2,
			-2 };

	private static final int INF = Integer.MAX_VALUE >> 1;

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int h = scanner.nextInt(), w = scanner.nextInt();
			int ch = scanner.nextInt() - 1, cw = scanner.nextInt() - 1;
			int dh = scanner.nextInt() - 1, dw = scanner.nextInt() - 1;
			boolean[][] road = new boolean[h][w];
			IntStream.range(0, h).forEach(i -> {
				char[] s = scanner.next().toCharArray();
				IntStream.range(0, w).forEach(j -> road[i][j] = (ROAD == s[j]));
			});
			int[][] buffer = new int[h][w];
			IntStream.range(0, h).forEach(i -> Arrays.fill(buffer[i], INF));
			boolean[][] visited = new boolean[h][w];
			int result = getResult(h, w, ch, cw, dh, dw, 0, road, visited, buffer);
			System.out.println((INF == result) ? -1 : result);
		}
	}

	private static int getResult(int h, int w, int cx, int cy, int dh, int dw, int count, boolean[][] road,
			boolean[][] visited, int[][] buffer) {
		if ((cx == dh) && (cy == dw)) {
			return count;
		}
		visited[cx][cy] = true;
		if (count < buffer[cx][cy]) {
			int min = INF;
			// 移動
			for (int i = 0; i < MOVE_XS.length; i++) {
				int newX = cx + MOVE_XS[i], newY = cy + MOVE_YS[i];
				if ((newX >= 0) && (newX < h) && (newY >= 0) && (newY < w) && road[newX][newY]
						&& !visited[newX][newY]) {
					min = Math.min(min, getResult(h, w, newX, newY, dh, dw, count, road, visited, buffer));
				}
			}
			// ワープ
			for (int i = 0; i < WARP_XS.length; i++) {
				int newX = cx + WARP_XS[i], newY = cy + WARP_YS[i];
				if ((newX >= 0) && (newX < h) && (newY >= 0) && (newY < w) && road[newX][newY]
						&& !visited[newX][newY]) {
					min = Math.min(min, getResult(h, w, newX, newY, dh, dw, count + 1, road, visited, buffer));
				}
			}
			buffer[cx][cy] = min;
			visited[cx][cy] = false;
			return min;
		} else {
			return buffer[cx][cy];
		}
	}
}
