import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int H;
	static int[][] f;
	static boolean[][] vanish;

	public static void main(String[] args) {
		while (true) {
			H = sc.nextInt();
			if (H == 0) break;
			f = new int[H][5];
			vanish = new boolean[H][5];
			for (int i = 0; i < H; ++i) {
				for (int j = 0; j < 5; ++j) {
					f[i][j] = sc.nextInt();
				}
			}
			int sum = 0;
			while (true) {
				int add = erase();
				if (add == 0) break;
				sum += add;
				fall();
			}
			System.out.println(sum);
		}
	}

	static int erase() {
		for (int i = 0; i < H; ++i) {
			for (int j = 0; j < 3; ++j) {
				if (f[i][j] != 0 && f[i][j] == f[i][j + 1] && f[i][j] == f[i][j + 2]) {
					vanish[i][j] = vanish[i][j + 1] = vanish[i][j + 2] = true;
				}
			}
		}
		int ret = 0;
		for (int i = 0; i < H; ++i) {
			for (int j = 0; j < 5; ++j) {
				if (vanish[i][j]) {
					vanish[i][j] = false;
					ret += f[i][j];
					f[i][j] = 0;
				}
			}
		}
		return ret;
	}

	static void fall() {
		for (int i = 0; i < 5; ++i) {
			int to = H - 1;
			for (int j = H - 1; j >= 0; --j) {
				if (f[j][i] == 0) continue;
				f[to][i] = f[j][i];
				--to;
			}
			while (to >= 0) {
				f[to][i] = 0;
				--to;
			}
		}
	}

}