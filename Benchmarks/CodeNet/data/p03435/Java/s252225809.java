import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int[][] c = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = sc.nextInt();
			}
		}

		int sum = c[0][0] + c[1][1] + c[2][2];
		for (int i = 0; i < 3; i++) {
			int tmp = 0;
			int tmp2 = 0;
			for (int j = 0; j < 3; j++) {
				tmp += c[j][(i + j) % 3];
				tmp2 += c[j][(i - j + 3) % 3];
			}

			if (tmp != sum) {
				pr.println("No");
				return;
			}
			if (tmp2 != sum) {
				pr.println("No");
				return;
			}
		}

		pr.println("Yes");
	}

	// ---------------------------------------------------
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		pr = new Printer(System.out);

		solve();

		pr.close();
		sc.close();
	}

	private static class Printer extends PrintWriter {
		Printer(PrintStream out) {
			super(out);
		}
	}
}
