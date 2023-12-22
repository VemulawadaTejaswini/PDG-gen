import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	int[][] b = new int[8][8];

	boolean canPutAt(int r, int c) {
		// r行に駒がない
		for (int i = 0; i < 8; i++) {
			if (b[i][c] == 1) {
				return false;
			}
		}

		// c列に駒がない
		for (int i = 0; i < 8; i++) {
			if (b[r][i] == 1) {
				return false;
			}
		}

		// 斜めに駒がない
		for (int i = 0; i < 8; i++) {
			int r1 = r - i;
			int r2 = r + i;
			int c1 = c - i;
			int c2 = c + i;

			if ((r1 >= 0 && c1 >= 0 && b[r1][c1] == 1) || 
				(r1 >= 0 && c2 <= 7 && b[r1][c2] == 1) ||
				(r2 <= 7 && c1 >= 0 && b[r2][c1] == 1) || 
				(r2 <= 7 && c2 <= 7 && b[r2][c2] == 1)) {
				return false;
			}
		}

		return true;
	}

	boolean backtrack(int rest) {
		if (rest == 0) {
			return true;
		}
		for (int r = 0; r < 8; r++) {
			for (int c = 0; c < 8; c++) {
				if (canPutAt(r, c)) {
					b[r][c] = 1;
					if (backtrack(rest - 1)) {
						return true;
					}
					b[r][c] = 0;
				}
			}
		}
		return false;
	}

	void print() {
		for (int r = 0; r < 8; r++) {
			for (int c = 0; c < 8; c++) {
				out.print(b[r][c] == 1 ? "Q" : ".");
			}
			out.println();
		}
	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int r = sc.nextInt();
			int c = sc.nextInt();

			b[r][c] = 1;
		}

		sc.close();

		backtrack(8 - n);

		print();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}

