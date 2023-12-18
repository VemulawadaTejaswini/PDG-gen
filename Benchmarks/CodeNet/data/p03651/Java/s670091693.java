
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

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

		Set<Integer> l = new TreeSet<>();

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
			boolean up = true;
			Set<Integer> t = new TreeSet<>();

			while (up) {
				Iterator<Integer> iterator = l.iterator();
				Integer B = iterator.next();
				U.err("B:" + B);
				up = false;
				t.clear();
				for (Iterator<Integer> it = l.iterator(); it.hasNext();) {
					Integer C = it.next();
					U.err("C:" + C);
					Integer tmp = C;
					tmp = new Integer(tmp - B);
					while (tmp > 0) {
						t.add(tmp);
						U.err("add:" + tmp);
						if (B > tmp && !l.contains(tmp)) {
							up = true;
						}
						tmp = new Integer(tmp - B);
					}
				}
				l.addAll(t);
			}

			if (l.contains(new Integer(K))) {
				ans = PO;
			}
			if(U.DEBUG){
				for (int a : l) {
					U.err("" + a);
				}
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