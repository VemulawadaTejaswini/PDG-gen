import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][] f = new char[H + 2][W + 2];
		for (int i = 0; i < H; ++i) {
			char[] row = sc.next().toCharArray();
			System.arraycopy(row, 0, f[H - i], 1, W);
		}
		ArrayList<State> states = new ArrayList<State>();
		for (int i = 1; i <= H; ++i) {
			for (int j = 1; j <= W; ++j) {
				if (f[i][j] == '#' && f[i - 1][j] != '#' && f[i][j + 1] != '#') {
					states.add(new State(Math.atan2(i - 1, j), 1));
				} else if (f[i][j] != '#' && f[i - 1][j] == '#' && f[i][j + 1] == '#') {
					states.add(new State(Math.atan2(i - 1, j), 1));
				} else if (f[i][j] == '#' && f[i + 1][j] != '#' && f[i][j - 1] != '#') {
					states.add(new State(Math.atan2(i, j - 1), -1));
				} else if (f[i][j] != '#' && f[i + 1][j] == '#' && f[i][j - 1] == '#') {
					states.add(new State(Math.atan2(i, j - 1), -1));
				}
			}
		}
		Collections.sort(states);
		int count = 1;
		int ans = 1;
		for (int i = 0; i < states.size();) {
			State st = states.get(i);
			while (i < states.size() && states.get(i).a - st.a < 1e-8) {
				count += states.get(i).add;
				++i;
			}
			ans = Math.max(ans, count);
		}
		System.out.println(ans);
	}

	static class State implements Comparable<State> {
		double a;
		int add;

		public State(double a, int add) {
			this.a = a;
			this.add = add;
		}

		public int compareTo(State o) {
			return Double.compare(this.a, o.a);
		}
	}

}