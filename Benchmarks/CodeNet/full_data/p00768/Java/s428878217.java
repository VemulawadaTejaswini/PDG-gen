import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int M, T, P, R;

	public static void main(String[] args) {
		while (true) {
			M = sc.nextInt();
			T = sc.nextInt();
			P = sc.nextInt();
			R = sc.nextInt();
			if (M == 0) break;
			Team[] teams = new Team[T];
			for (int i = 0; i < T; ++i) {
				teams[i] = new Team(i + 1);
			}
			for (int i = 0; i < R; ++i) {
				int m = sc.nextInt();
				int t = sc.nextInt();
				int p = sc.nextInt();
				int j = sc.nextInt();
				Team team = teams[t - 1];
				if (j == 0) {
					team.ac++;
					team.pena += m + team.submit[p - 1] * 20;
				} else {
					team.submit[p - 1]++;
				}
			}
			Arrays.sort(teams);
			for (int i = 0; i < T - 1; ++i) {
				System.out.print(teams[i].idx);
				System.out.print(teams[i].equiv(teams[i + 1]) ? '=' : ',');
			}
			System.out.println(teams[T - 1].idx);
		}
	}

	static class Team implements Comparable<Team> {
		int[] submit = new int[10];
		int ac, pena, idx;

		Team(int i) {
			idx = i;
		}

		public int compareTo(Team o) {
			if (this.ac != o.ac) {
				return o.ac - this.ac;
			}
			if (this.pena != o.pena) {
				return this.pena - o.pena;
			}
			return o.idx - this.idx;
		}

		boolean equiv(Team o) {
			return this.ac == o.ac && this.pena == o.pena;
		}
	}

}