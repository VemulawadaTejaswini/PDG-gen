import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	int H, W;
	int[][] A;
	int[][] B;

	int dfs(int y, int x, int blue, int red) {
		if (y == H - 1 && x == W - 1) {
			int ba = abs((blue + A[y][x]) - (red + B[y][x]));
			int ra = abs((red + A[y][x]) - (blue + B[y][x]));

			return Math.min(ba, ra);
		}

		// 右
		int rightABlue = Integer.MAX_VALUE, rightARed = Integer.MAX_VALUE;
		if (x != W - 1) {
			int x2 = x + 1;

			// Aをblueに選ぶ
			rightABlue = dfs(y, x2, blue + A[y][x], red + B[y][x]);
			// Aをredに選ぶ
			rightARed = dfs(y, x2, blue + B[y][x], red + A[y][x]);

		}

		// 下
		int downABlue = Integer.MAX_VALUE, downARed = Integer.MAX_VALUE;

		if (y != H - 1) {
			int y2 = y + 1;
			// Aをblueに選ぶ
			downABlue = dfs(y2, x, blue + A[y][x], red + B[y][x]);
			// Aをredに選ぶ
			rightARed = dfs(y2, x, blue + B[y][x], red + A[y][x]);

		}

		return min(new int[] { rightABlue, rightARed, downABlue, downARed });

	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		H = sc.nextInt();
		W = sc.nextInt();

		A = new int[H][W];
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				A[i][j] = sc.nextInt();
			}
		}

		B = new int[H][W];
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				B[i][j] = sc.nextInt();
			}
		}

		sc.close();

		out.println(dfs(0, 0, 0, 0));

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

	@SuppressWarnings("unused")
	private int min(int[] arr) {
		if (arr == null || arr.length == 0) {
			throw new IllegalArgumentException(Arrays.toString(arr));
		}

		int candidate = arr[0];
		for (int i = 1; i < arr.length; i++) {
			candidate = candidate < arr[i] ? candidate : arr[i];
		}
		return candidate;
	}
}
