import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int H = sc.nextInt();
		int W = sc.nextInt();
		int K = sc.nextInt();

		char[][] s = new char[H][W];
		for (int i = 0; i < H; i++) {
			String str = sc.next();
			for (int j = 0; j < W; j++) {
				s[i][j] = str.charAt(j);
			}
		}

		sc.close();

		int[][] ans = new int[H][W];

		int n = 1;
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				ans[i][j] = s[i][j] == '#' ? n++ : 0;
			}
		}

		// 左右に伸ばす
		for (int i = 0; i < H; i++) {
			int m = 0;
			for (int j = 0; j < W; j++) {
				if (m != ans[i][j] && ans[i][j] != 0) {
					m = ans[i][j];
				}
				ans[i][j] = m;
			}
			m = 0;
			for (int j = W - 1; j >= 0; j--) {
				if (m != ans[i][j] && ans[i][j] != 0) {
					m = ans[i][j];
				}
				ans[i][j] = m;
			}
		}

		for (int i = 1; i < H; i++) {
			if (allZero(ans[i])) {
				ans[i] = Arrays.copyOf(ans[i - 1], ans[i - 1].length);
			}
		}

		for (int i = H - 2; i >= 0; i--) {
			if (allZero(ans[i])) {
				ans[i] = Arrays.copyOf(ans[i + 1], ans[i + 1].length);
			}
		}

		for (int i = 0; i < H; i++) {
			out.println(join(" ", ans[i]));
		}

	}

	private boolean allZero(int[] a) {
		for (int n : a) {
			if (n != 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

	@SuppressWarnings("unused")
	private String join(String delimiter, int[] a) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < a.length; i++) {
			sb.append(a[i]);
			sb.append(delimiter);
		}
		return sb.substring(0, Math.max(sb.length() - delimiter.length(), 0));
	}
}
