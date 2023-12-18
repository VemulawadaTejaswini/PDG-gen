import java.io.*;
import java.util.*;
import java.util.function.*;

class Range {
	int start;
	int end;

	Range(int start, int end) {
		this.start = start;
		this.end = end;
	}

	Range(Range copy) {
		this(copy.start, copy.end);
	}

	boolean isIn(int x) {
		return start <= x && x < end;
	}

	boolean isEmpty() {
		return end - start <= 0;
	}
}

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int H = Integer.parseInt(sc.get());
		int W = Integer.parseInt(sc.get());
		int N = Integer.parseInt(sc.get());
		int startRow = Integer.parseInt(sc.get()) - 1;
		int startColumn = Integer.parseInt(sc.get()) - 1;
		char[] T = sc.get().toCharArray();
		char[] A = sc.get().toCharArray();

		Range[] turnY = new Range[N];
		Range[] turnX = new Range[N];
		if (T[N - 1] == 'U') {
			turnY[N - 1] = new Range(1, H);
		} else if (T[N - 1] == 'D') {
			turnY[N - 1] = new Range(0, H - 1);
		} else {
			turnY[N - 1] = new Range(0, H);
		}
		if (T[N - 1] == 'L') {
			turnX[N - 1] = new Range(1, W);
		} else if (T[N - 1] == 'R') {
			turnX[N - 1] = new Range(0, W - 1);
		} else {
			turnX[N - 1] = new Range(0, W);
		}

		for (int i = N - 2; i >= 0; i--) {
			Range y = turnY[i] = new Range(turnY[i + 1]);
			Range x = turnX[i] = new Range(turnX[i + 1]);
			if (A[i] == 'U' && y.end < H) {
				y.end++;
			} else if (A[i] == 'D' && y.start > 0) {
				y.start--;
			}
			if (A[i] == 'L' && x.end < W) {
				x.end++;
			} else if (A[i] == 'R' && x.start > 0) {
				x.start--;
			}

			if (T[i] == 'U' && y.start < H) {
				y.start++;
			} else if (T[i] == 'D' && y.end > 0) {
				y.end--;
			}
			if (T[i] == 'R' && x.end > 0) {
				x.end--;
			} else if (T[i] == 'L' && x.start < W) {
				x.start++;
			}
			if (y.isEmpty() || x.isEmpty()) {
				System.out.println("NO");
				return;
			}
		}
		if (turnY[0].isIn(startRow) && turnX[0].isIn(startColumn)) System.out.println("YES");
		else System.out.println("NO");
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