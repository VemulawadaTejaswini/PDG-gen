import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Random;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Comparator;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		FastScanner in = new FastScanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskC solver = new TaskC();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskC {
		int[] perm;
		long sum;

		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int x = in.nextInt();
			int y = in.nextInt();
			int z = in.nextInt();
			int n = x + y + z;
			int[] a = new int[n];
			int[] b = new int[n];
			int[] c = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = in.nextInt();
				b[i] = in.nextInt();
				c[i] = in.nextInt();
			}

			perm = new int[n];
			Random random = new Random();
			for (int i = 0; i < n; i++) {
				int j = random.nextInt(i + 1);
				perm[i] = perm[j];
				perm[j] = i;
			}

			TreeSet<Integer> ab = new TreeSet<>(diffComparator(a, b));
			TreeSet<Integer> ac = new TreeSet<>(diffComparator(a, c));
			TreeSet<Integer> ba = new TreeSet<>(diffComparator(b, a));
			TreeSet<Integer> bc = new TreeSet<>(diffComparator(b, c));
			TreeSet<Integer> ca = new TreeSet<>(diffComparator(c, a));
			TreeSet<Integer> cb = new TreeSet<>(diffComparator(c, b));

			sum = 0;
			for (int i = 0; i < n; i++) {
				int j = perm[i];
				if (j < x) {
					sum += a[i];
					ab.add(i);
					ac.add(i);
				} else if (j < x + y) {
					sum += b[i];
					ba.add(i);
					bc.add(i);
				} else {
					sum += c[i];
					ca.add(i);
					cb.add(i);
				}
			}

			while (true) {
				if (move2(ab, ba, ac, bc, a, b)) continue;
				if (move2(ba, ab, bc, ac, b, a)) continue;

				if (move2(ac, ca, ab, cb, a, c)) continue;
				if (move2(ca, ac, cb, ab, c, a)) continue;

				if (move2(bc, cb, ba, ca, b, c)) continue;
				if (move2(cb, bc, ca, ba, c, b)) continue;

				if (move3(ab, ac, ba, bc, ca, cb, a, b, c)) continue;
				if (move3(ab, ac, ca, cb, ba, bc, a, c, b)) continue;
				if (move3(ba, bc, ab, ac, ca, cb, b, a, c)) continue;
				if (move3(ba, bc, ca, cb, ab, ac, b, c, a)) continue;
				if (move3(ca, cb, ab, ac, ba, bc, c, a, b)) continue;
				if (move3(ca, cb, ba, bc, ab, ac, c, b, a)) continue;

				break;
			}

			out.println(sum);
		}

		private Comparator<Integer> diffComparator(int[] a, int[] b) {
			return (i, j) -> {
				int u = a[i] - b[i];
				int v = a[j] - b[j];
				if (u != v) {
					return u > v ? -1 : 1;
				}
				if (!i.equals(j)) {
					return perm[i] > perm[j] ? -1 : 1;
				}
				return 0;
			};
		}

		private boolean move2(TreeSet<Integer> ab, TreeSet<Integer> ba, TreeSet<Integer> ac, TreeSet<Integer> bc, int[] a, int[] b) {
			int mx = Math.min(ab.size(), ba.size());
			mx = Math.min(mx, 5);
			List<Integer> removedI = new ArrayList<>();
			List<Integer> removedJ = new ArrayList<>();
			for (int step = 0; step < mx; step++) {
				int i = ab.last();
				int j = ba.last();
				removedI.add(i);
				removedJ.add(j);
				ab.remove(i);
				ac.remove(i);
				ba.remove(j);
				bc.remove(j);

				long add = (long) -a[i] + b[i] - b[j] + a[j];
				sum += add;
				if (add > 0) {
					for (int it = 0; it < removedI.size(); it++) {
						int ii = removedI.get(it);
						int jj = removedJ.get(it);
						ab.add(jj);
						ac.add(jj);
						ba.add(ii);
						bc.add(ii);
					}
					return true;
				}
			}

			for (int step = 0; step < mx; step++) {
				int i = removedJ.get(step);
				int j = removedI.get(step);
				ab.add(j);
				ac.add(j);
				ba.add(i);
				bc.add(i);

				long add = (long) -a[i] + b[i] - b[j] + a[j];
				sum += add;
			}
			return false;
		}

		private boolean move3(TreeSet<Integer> ab, TreeSet<Integer> ac, TreeSet<Integer> ba, TreeSet<Integer> bc, TreeSet<Integer> ca, TreeSet<Integer> cb, int[] a, int[] b, int[] c) {
			int i = ab.last();
			int j = bc.last();
			int k = ca.last();
			long add = (long) -a[i] + b[i] - b[j] + c[j] - c[k] + a[k];
			if (add > 0) {
				ab.remove(i);
				ac.remove(i);
				ab.add(k);
				ac.add(k);
				ba.remove(j);
				bc.remove(j);
				ba.add(i);
				bc.add(i);
				ca.remove(k);
				cb.remove(k);
				ca.add(j);
				cb.add(j);
				sum += add;
				return true;
			}
			return false;
		}

	}

	static class FastScanner {
		private BufferedReader in;
		private StringTokenizer st;

		public FastScanner(InputStream stream) {
			in = new BufferedReader(new InputStreamReader(stream));
		}

		public String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(in.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

	}
}

