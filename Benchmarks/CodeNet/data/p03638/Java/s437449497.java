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

		int N = sc.nextInt();

		int[] a = nextIntArray1origin(sc, N);

		sc.close();

		int[][] c = new int[H][W];

		int idx = 1;

		for (int h = 0; h < H; h++) {
			if (h % 2 == 0) {
				for (int w = 0; w < W; w++) {
					if (a[idx] == 0) {
						idx++;
					}
					c[h][w] = idx;
					a[idx]--;
				}
			} else {
				for (int w = W - 1; w >= 0; w--) {
					if (a[idx] == 0) {
						idx++;
					}
					c[h][w] = idx;
					a[idx]--;
				}
			}
		}

		for (int h = 0; h < H; h++) {
			out.println(join(" ", c[h]));
		}

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

	@SuppressWarnings("unused")
	private int[] nextIntArray1origin(Scanner sc, int n) {
		int[] result = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}
}
