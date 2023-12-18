import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int H = sc.nextInt();
		int W = sc.nextInt();

		int[][] a = new int[H][W];

		for (int i = 0; i < H;) {
			String s = sc.next();
			for (int j = 0; j < W; j++) {
				a[i][j] = s.charAt(j) == '.' ? 0 : 1;
			}
			i++;
		}

		boolean[] outputRow = new boolean[H];
		boolean[] outputCol = new boolean[W];

		for (int i = 0; i < H; i++) {
			outputRow[i] = false;
			for (int j = 0; j < W; j++) {
				if (a[i][j] == 1) {
					outputRow[i] = true;
				}
			}
		}

		for (int j = 0; j < W; j++) {
			outputCol[j] = false;
			for (int i = 0; i < H; i++) {
				if (a[i][j] == 1) {
					outputCol[j] = true;
				}
			}
		}

		for (int i = 0; i < H; i++) {
			if (!outputRow[i]) {
				continue;
			}
			for (int j = 0; j < W; j++) {
				if (outputCol[j]) {
					out.print(a[i][j] == 0 ? "." : "#");
				}
			}
			out.println();
		}

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
