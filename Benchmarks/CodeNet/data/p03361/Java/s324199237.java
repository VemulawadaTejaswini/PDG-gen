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

		// 4近傍
		int[] dx = {1, 0, -1, 0};
		int[] dy = {0, 1, 0, -1};

		for (int i = 0; i < h; i++) {
			out:
			for (int j = 0; j < w; j++) {
				if (s[i][j] == '#') {
					for (int k = 0; k < 4; k++) {
						int nx = j + dx[k];
						int ny = i + dy[k];

						if (nx < 0 || nx >= w || ny < 0 || ny >= h) {
							continue;
						}

						if (s[ny][nx] == '#') {
							continue out;
						}
					}

					pr.println("No");
					return;
				}
			}
		}

		pr.println("Yes");
	}

	// ---------------------------------------------------
	public static void main(String[] args) {
		sc = new Scanner(INPUT == null ? System.in : new ByteArrayInputStream(INPUT.getBytes()));
		pr = new Printer(System.out);

		solve();

//		pr.close();
		pr.flush();
//		sc.close();
	}

	static String INPUT = null;

	private static class Printer extends PrintWriter {
		Printer(OutputStream out) {
			super(out);
		}
	}
}
