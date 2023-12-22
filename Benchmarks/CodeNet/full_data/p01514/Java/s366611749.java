/**
 * You Are the Judge
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int T, P, R;
			StringTokenizer st = new StringTokenizer(line);
			T = parseInt(st.nextToken());
			P = parseInt(st.nextToken());
			R = parseInt(st.nextToken());
			if ((T | P | R) == 0) break;

			Team[] teams = new Team[T + 1];
			for (int i = 0; i <= T; i++) {
				teams[i] = new Team(i, P);
			}
			teams[0].passed = -1;

			for (int i = 0; i < R; i++) {
				int t, p, m;
				String j;
				st = new StringTokenizer(br.readLine());
				t = parseInt(st.nextToken());
				p = parseInt(st.nextToken());
				m = parseInt(st.nextToken());
				j = st.nextToken();
				teams[t].submit(m, p, j);
			}
			Arrays.sort(teams);

			for (int i = 0; i < T; i++) {
				System.out.println(teams[i].toString());
			}
		} //end while
	} //end main
}

class Team implements Comparable<Team> {
	int id;
	int elapsed = 0;
	int passed = 0;
	int[] penalty;

	Team(int id, int problems) {
		this.id = id;
		penalty = new int[problems + 1];
	}

	void submit(int m, int p, String j) {
		if (j.equals("CORRECT")) {
			elapsed += m + penalty[p] * 1200;
			passed++;
		} else {
			penalty[p]++;
		}
	}

	public String toString() {
		return String.format("%d %d %d", id, passed, elapsed);
	}

	@Override
	public int compareTo(Team o) {
		int ret = 0;
		if (this.passed != o.passed) {
			ret = -(this.passed - o.passed);
		} else {
			if (this.elapsed != o.elapsed) {
				ret = this.elapsed - o.elapsed;
			} else {
				ret = this.id - o.id;
			}
		}
		return ret;
	}
}