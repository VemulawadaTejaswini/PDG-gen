import static java.lang.Math.*;
import static java.util.Arrays.*;
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("src/aoj1174/input.txt"));
			//System.setOut(new PrintStream(new FileOutputStream("src/aoj1172/result.txt")));
		} catch (FileNotFoundException e) {
		}
		new Main().run();
	}

	Scanner sc;
	void run() {
		sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			if (n == 0) break;
			solve(n);
		}
	}

	void solve(int n) {
		int[] xs = new int[n];
		int[] ys = new int[n];
		int[] rs = new int[n];
		int[] cs = new int[n];
		for (int i = 0; i < n; i++) {
			xs[i] = sc.nextInt();
			ys[i] = sc.nextInt();
			rs[i] = sc.nextInt();
			cs[i] = sc.nextInt();
		}
		boolean[][] isOver = new boolean[n][n];
		for (int i = 0; i < n; i++)
			for (int j = i + 1; j < n; j++) {
				if ((xs[i] - xs[j]) * (xs[i] - xs[j]) + (ys[i] - ys[j]) * (ys[i] - ys[j]) < (rs[i] + rs[j]) * (rs[i] + rs[j])) {
					isOver[i][j] = true;
				}
			}

		int ans = 0;
		boolean[] visited = new boolean[1 << n];
		visited[(1 << n) - 1] = true;
		for (int set = (1 << n) - 1; set >= 0; set--) {
			if (!visited[set]) continue;
			ans = max(ans, n - Integer.bitCount(set));

			for (int i = 0; i < n; i++) if ((set >> i & 1) == 1)
				for (int j = i + 1; j < n; j++) if ((set >> j & 1) == 1)
					if (cs[i] == cs[j]){
						boolean ok = true;
						for (int k = i - 1; k >= 0; k--) if ((set >> k & 1) == 1 && isOver[k][i]) ok = false;
						for (int k = j - 1; k >= 0; k--) if ((set >> k & 1) == 1 && isOver[k][j]) ok = false;

						if (ok) {
							int nset = set;
							nset ^= (1 << i);
							nset ^= (1 << j);
							visited[nset] = true;
						}
				}
		}
		System.out.println(ans);
	}

	void tr(Object... os) {
		System.err.println(deepToString(os));
	}
}