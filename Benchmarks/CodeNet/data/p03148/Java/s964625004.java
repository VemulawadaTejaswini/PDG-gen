
import java.io.Serializable;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	/**
	 * problem solver
	 */
	public static class Problem {

		/**
		 * paramters
		 */
		private int n;
		private int k;
		private ArrayList<Integer> t;
		private ArrayList<Integer> d;

		/**
		 * constructor
		 */
		Problem() {
			t = new ArrayList<Integer>();
			d = new ArrayList<Integer>();
			n = 0;
			k = 0;
		}

		/**
		 * standard input
		 */
		void input() {
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
			k = sc.nextInt();

			for (int i = 0; i < n; i++) {
				t.add(sc.nextInt());
				d.add(sc.nextInt());
			}
			sc.close();
		}

		/**
		 * Sushi
		 */
		public static class Sushi implements Comparable<Sushi>, Serializable {

			private static final long serialVersionUID = 7126883977005996870L;

			public int t;
			public int d;

			Sushi(int t, int d) {
				this.t = t;
				this.d = d;
			}

//            @Override
//            public int hashCode() {
//            	return Objects.hash(t,d);
//            }

			@Override
			public boolean equals(Object other) {
				if (other == this) {
					return true;
				}

				if (other instanceof Sushi) {
					Sushi that = (Sushi) other;
					return Objects.equals(that.d, this.d);
				}
				return false;
			}

			@Override
			public int compareTo(Sushi that) {
				Comparator<Integer> naturalOrder = Comparator.naturalOrder();
				return Objects.compare(this.d, that.d, naturalOrder);
			}

			@Override
			public String toString() {
				Integer[] params = { t, d };
				MessageFormat mf = new MessageFormat("({0},{1})");
				return mf.format(params);
			}
		}

		/**
		 * solver
		 */
		void solve() {
			PriorityQueue<Sushi> addCandidates = new PriorityQueue<>(Collections.reverseOrder());
			PriorityQueue<Sushi> delCandidates = new PriorityQueue<>();
			HashSet<Integer> hset = new HashSet<>();

			long a1 = 0; // sum of deliciousness
			long a2 = 0; // # kinds of toppings
			long ans = 0; // a1 + a2 * a2

			for (int i = 0; i < n; i++) {
				Sushi s = new Sushi(t.get(i), d.get(i));
				addCandidates.add(s);
			}

			for (int i = 0; i < k; i++) {
				Sushi s = addCandidates.poll();

				a1 += s.d;

				if (hset.contains(s.t)) {
					delCandidates.add(s);
				} else {
					a2++;
					hset.add(s.t);
				}
			}

			ans = a1 + a2 * a2;

			while (!addCandidates.isEmpty() || !delCandidates.isEmpty()) {

				long _ans = ans;

				Sushi deleted = delCandidates.poll();

				Sushi added = null;

				while (!addCandidates.isEmpty()) {
					Sushi s = addCandidates.peek();

					if (hset.contains(s.t)) {
						addCandidates.poll();
					} else {
						hset.add(s.t);
						added = s;
						break;
					}
				}

				if (added != null) {
					a1 += -deleted.d + added.d;
					a2++;
					_ans = a1 + a2 * a2;
					ans = Math.max(ans, _ans);
				}
			}

			System.out.println(ans);

		}

	}

	public static void main(String args[]) {

		Problem p = new Problem();

		p.input();

		p.solve();
	}
}
