import java.io.*;
import java.util.*;
import java.util.function.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int H = Integer.parseInt(sc.get());
		int W = Integer.parseInt(sc.get());
		int N = Integer.parseInt(sc.get());
		int startRow = Integer.parseInt(sc.get());
		int startColumn = Integer.parseInt(sc.get());
		char[] T = sc.get().toCharArray();
		char[] A = sc.get().toCharArray();

		int y = startRow;
		int x = startColumn;

		char[] td = {'L', 'R', 'U', 'D'};
		int[] ty = {0, 0, -1, +1};
		int[] tx = {-1, +1, 0, 0};
		char[] ad = {'R', 'L', 'D', 'U'};
		int[] ay = {0, 0, +1, -1};
		int[] ax = {+1, -1, 0, 0};
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < N; j++) {
				if (T[j] == td[i]) {
					y += ty[i];
					x += tx[i];
				}
				if (!isOn(y, x, H, W)) {
					System.out.println("NO");
					return;
				}
				if (A[j] == ad[i]) {
					y += ay[i];
					x += ax[i];
					if (!isOn(y, x, H, W)) {
						y -= ay[i];
						x -= ax[i];
					}
				}
			}
		}
		System.out.println("YES");
	}

	boolean isOn(int y, int x, int H, int W) {
		return 1 <= y && y <= H && 1 <= x && x <= W;
	}
}

class Main {
	public static void main(String... args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Solver.INSTANCE.solve(new Supplier<String>() {
			StringTokenizer line;

			public String get() {
				try {
					return (line = line != null && line.hasMoreTokens() ? line : new StringTokenizer(reader.readLine())).nextToken();
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
			}
		});
	}
}