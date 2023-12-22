/**
 * ICPC Ranking
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
			int M, T, P, R;
			StringTokenizer st = new StringTokenizer(line);
			M = parseInt(st.nextToken());
			T = parseInt(st.nextToken());
			P = parseInt(st.nextToken());
			R = parseInt(st.nextToken());
			if ((M | T | P | R) == 0) break;

			Team[] teams = new Team[T + 1];
			for (int i = 0; i <= T; i++) {
				teams[i] = new Team(i, P);
			}
			teams[0].passed = -1;

			for (int i = 0; i < R; i++) {
				int m, t, p, j;
				st = new StringTokenizer(br.readLine());
				m = parseInt(st.nextToken());
				t = parseInt(st.nextToken());
				p = parseInt(st.nextToken());
				j = parseInt(st.nextToken());
				teams[t].submit(m, p, j);
			}
			Arrays.sort(teams);

			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < T; i++) {
				if (i == 0) {
					sb.append(teams[i].id);
				} else {
					if (teams[i - 1].passed == teams[i].passed && teams[i - 1].elapsed == teams[i].elapsed) {
						sb.append("=" + teams[i].id);
					} else {
						sb.append("," + teams[i].id);
					}
				}
			}
			System.out.println(sb.toString());
		} //end while
	} //end main
}

class Team implements Comparable<Team> {
	int id;
	int elapsed = 0;
	int passed = 0;
	int[] penalty;

	Team(int id, int problem) {
		this.id = id;
		penalty = new int[problem + 1];
	}

	void submit(int m, int p, int j) {
		if (j == 0) {
			elapsed += m + penalty[p] * 20;
			passed++;
		} else {
			penalty[p]++;
		}
	}

	public String toString() {
		return String.format("%d,%d,%d", id, passed, elapsed);
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
				ret = -(this.id - o.id);
			}
		}
		return ret;
	}
}