import java.io.*;
import java.util.*;
import java.util.Map.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();
		int c = sc.nextInt();

		int[][] d = new int[c][c];
		for (int i = 0; i < c; i++) {
			for (int j = 0; j < c; j++) {
				d[i][j] = sc.nextInt();
			}
		}
		int[][] cc = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				cc[i][j] = sc.nextInt() - 1;
			}
		}

		List<Map<Integer, Integer>> clist = new ArrayList<>(3);
		for (int i = 0; i < 3; i++) {
			clist.add(new HashMap<>());
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				Map<Integer, Integer> hmtmp = clist.get((i + j) % 3);
				if (hmtmp.containsKey(cc[i][j])) {
					hmtmp.put(cc[i][j], hmtmp.get(cc[i][j]) + 1);
				} else {
					hmtmp.put(cc[i][j], 1);
				}
			}
		}

		long min = Integer.MAX_VALUE;
		for (int i = 0; i < c; i++) {
			for (int j = 0; j < c; j++) {
				if (i == j) {
					continue;
				}
				for (int k = 0; k < c; k++) {
					if (k == i || k == j) {
						continue;
					}

					int tmp = 0;
					for (Entry<Integer, Integer> e : clist.get(0).entrySet()) {
						tmp += d[e.getKey()][i] * e.getValue();
					}
					for (Entry<Integer, Integer> e : clist.get(1).entrySet()) {
						tmp += d[e.getKey()][j] * e.getValue();
					}
					for (Entry<Integer, Integer> e : clist.get(2).entrySet()) {
						tmp += d[e.getKey()][k] * e.getValue();
					}

					min = Math.min(min, tmp);
				}
			}
		}

		pr.println(min);
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
