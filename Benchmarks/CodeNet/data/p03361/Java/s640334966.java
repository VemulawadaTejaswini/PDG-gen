import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][] s = new char[H][W];
		for (int i = 0; i < H; ++i) {
			s[i] = sc.next().toCharArray();
		}
		int[] dx = { 1, -1, 0, 0 };
		int[] dy = { 0, 0, 1, -1 };
		boolean ans = true;
		for (int i = 0; i < H; ++i) {
			for (int j = 0; j < W; ++j) {
				if (s[i][j] == '.')
					continue;
				boolean tmp = false;
				for (int k = 0; k < 4; ++k) {
					if (dx[k] + i < 0 || dx[k] + i >= H || dy[k] + j < 0 || dy[k] + j >= W)
						continue;
					tmp |= s[dx[k] + i][dy[k] + j] == '#';
				}
				ans = ans && tmp;
			}
		}
		System.out.println(ans ? "Yes" : "No");
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
