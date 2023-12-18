import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int h = sc.nextInt();
		int w = sc.nextInt();

		char[][] s = new char[h][];
		for (int i = 0; i < h; i++) {
			s[i] = sc.next().toCharArray();
		}

		int[] dx = {1, 1, 0, -1, -1, -1, 0, 1};
		int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
		int dn = dx.length;

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (s[i][j] == '#') {
					continue;
				}

				int cnt = 0;
				for (int k = 0; k < dn; k++) {
					int x = j + dx[k];
					int y = i + dy[k];

					if (x < 0 || x >= w || y < 0 || y >= h) {
						continue;
					}

					if (s[y][x] == '#') {
						cnt++;
					}
				}

				s[i][j] = (char)('0' + cnt);
			}
		}

		for (int i = 0; i < h; i++) {
			pr.println(s[i]);
		}
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
