import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public final class Main {

	static final Scanner sc = new Scanner(System.in);
	static PrintWriter writer = new PrintWriter(System.out);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int Q = sc.nextInt();
		ArrayList<State> ss = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			int S = Integer.parseInt(sc.next());
			int T = Integer.parseInt(sc.next());
			int X = Integer.parseInt(sc.next());
			ss.add(new State(S - X, X, -2));
			ss.add(new State(T - X, X, -1));
		}
		for (int i = 0; i < Q; i++) {
			int D = Integer.parseInt(sc.next());
			ss.add(new State(D, 0, i));
		}
		Collections.sort(ss);
		int[] ans = new int[Q];
		TreeSet<Integer> stop = new TreeSet<>();
		for (int i = 0; i < ss.size(); i++) {
			State s = ss.get(i);
			if (s.v == -2) {
				stop.add(s.d);
			} else if (s.v == -1) {
				stop.remove(s.d);
			} else {
				ans[s.v] = stop.isEmpty() ? -1 : stop.first();
			}
		}
		for (int i = 0; i < Q; i++) {
			writer.println(ans[i]);
		}
		writer.flush();
	}

	static class State implements Comparable<State> {
		int t, d, v;

		State(int t, int d, int v) {
			this.t = t;
			this.d = d;
			this.v = v;
		}

		@Override
		public int compareTo(State o) {
			return Integer.compare(this.t, o.t);
		}
	}

}