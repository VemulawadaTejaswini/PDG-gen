
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		String PO = "POSSIBLE";
		String IM = "IMPOSSIBLE";

		String ans = IM;

		int N = sc.nextInt();
		int K = sc.nextInt();

		List<Integer> l = new ArrayList<>();

		boolean big = false;
		for (int i = 0; i < N; i++) {
			int tmp = sc.nextInt();
			if (tmp >= K) {
				big = true;
			}
			if (!l.contains(new Integer(tmp))) {
				l.add(tmp);
			}
		}

		if (!big) {
			U.err("too small");
			ans = IM;
		} else {
			U.err("check");
			List<Integer> t = new ArrayList<>();
			boolean up = true;

			while (up) {
				Collections.sort(l);
				Integer B = l.get(0);
				U.err("B:" + B);
				up = false;
				for (int i = 1; i < l.size(); i++) {
					t.clear();
					Integer C = l.get(i);
					U.err("C:" + C);
					Integer tmp = C;
					tmp = new Integer(tmp - B);
					while (tmp > 0) {
						U.err("tmp:" + tmp);
						if (!l.contains(tmp) && !t.contains(tmp)) {
							t.add(tmp);
							U.err("add:" + tmp);
							if (B > tmp) {
								up = true;
							}
						}
						tmp = new Integer(tmp - B);
					}
					l.addAll(t);
				}
			}

			if (l.contains(new Integer(K))) {
				ans = PO;
			}
		}

		for (int t : l) {
			U.err("" + t);
		}

		// 出力
		U.out("" + ans);
	}

	static class U {
		public static final boolean DEBUG = false;
		public static final long MS = 1_000;
		public static final long NS = 1_000_000;

		public static void err(String s) {
			if (DEBUG) {
				System.err.println(s);
			}
		}

		public static long time() {
			return System.nanoTime();
		}

		// output
		static PrintWriter o = new PrintWriter(System.out);

		public static void add(String s) {
			o.append(s);
		}

		public static void out(String s) {
			o.append(s);
			o.flush();
		}
	}
}