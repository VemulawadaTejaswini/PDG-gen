import java.util.*;

public class Main {
	static int[][] DIR = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
	public static final int Y = 1024;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][] A = new char[H][];
		int num_w = 0;
		int num_b = 0;

		int[] black = new int[W*H];
		int[] black2 = new int[W*H];

		for (int i = 0; i < H; i++) {
			String s = sc.next();
			char[] cs = s.toCharArray();
			A[i] = cs;
			for (int j = 0; j < cs.length; j++) {
				if (cs[j] == '.') {
					num_w ++;
				}
				else {
					black[num_b++] = i * Y + j;
					num_b++;
				}
			}
		}
		int turn = 0;
		while (num_w > 0) {
			turn++;

			int num_b2 = 0;
			for (int b = 0; b < num_b; b++) {
				int pair = black[b];
				int _y = pair / Y;
				int _x = pair % Y;
				for (int d = 0; d < DIR.length; d++) {
					int x = _x + DIR[d][0];
					int y = _y + DIR[d][1];

					if (0 <= y && y < A.length && 0 <= x && x < A[y].length && A[y][x] == '.') {
						A[y][x] = '#';
						black2[num_b2++] = y * Y + x;
						num_w--;
					}
				}
			}
			num_b = num_b2;
			int[] tmp = black;
			black = black2;
			black2 = tmp;
		}
		// System.out.println(A[1]);
		System.out.println(turn);
	}
}
