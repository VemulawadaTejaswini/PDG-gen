
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	static int[] fy = { -2, -2, -2, -1, -1, 0, 0, 1, 1, 2, 2, 2 };
	static int[] fx = { -1, 0, 1, -2, 2, -2, 2, -2, 2, -1, 0, 1 };

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int kx = scanner.nextInt();
			int ky = scanner.nextInt();
			if (ky == 0 && kx == 0)
				break;
			int n = scanner.nextInt();
			int[][] num = new int[n][2];
			for (int i = 0; i < n; i++) {
				num[i][0] = scanner.nextInt();
				num[i][1] = scanner.nextInt();
			}
			Deque<int[]> deque = new ArrayDeque<int[]>();
			deque.offer(new int[] { ky, kx });
			boolean flag = true;
			loop: for (int i = 0; i < n; i++) {
				int size = deque.size();
				Deque<int[]> dequetmp = new ArrayDeque<int[]>();
				while (size-- > 0) {
					int[] m = deque.pop();
					slove(m, num[i], dequetmp);
				}
				if (dequetmp.isEmpty()) {
					flag = false;
					break loop;
				}
				deque = dequetmp;
			}
			System.out.println(flag ? "OK" : "NA");
		}

	}

	private static void slove(int[] m, int[] num, Deque<int[]> dequetmp) {
		boolean[][] map = new boolean[14][14];
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 4; j++) {
				int y = num[1] + i;
				int x = num[0] + j;
				if (2 <= y && y <= 12 && 2 <= x && x <= 12)
					map[y][x] = true;
			}
		}
		for (int i = 0; i < fy.length; i++) {
			int py = m[0] + fy[i] + 2;
			int px = m[1] + fx[i] + 2;
			if (map[py][px]) {
				py -= 2;
				px -= 2;
				boolean flag = true;
				for (int[] t : dequetmp) {
					if (t[0] == py && t[1] == px) {
						flag = false;
						break;
					}
				}
				if (flag) {
					dequetmp.push(new int[] { py, px });
				}
			}
		}
	}
}