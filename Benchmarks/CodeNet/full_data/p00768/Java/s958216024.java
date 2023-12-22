import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	int M, T, P, R;

	void run() {
		for (;;) {
			M = sc.nextInt();
			T = sc.nextInt();
			P = sc.nextInt();
			R = sc.nextInt();
			if ((M | T | P | R) == 0) {
				return;
			}
			Team[] team = new Team[T];
			for (int i = 0; i < T; i++) {
				Team t = new Team(i + 1);
				team[i] = t;
			}
			for (int i = 0; i < R; i++) {
				int m = sc.nextInt();
				int t = sc.nextInt();
				int p = sc.nextInt();
				int j = sc.nextInt();

				if (j != 0) {
					team[t - 1].wrong[p] += 20;
				} else {
					team[t - 1].time += m;
					team[t - 1].time += team[t - 1].wrong[p];
					team[t - 1].solve++;
				}
			}
			Arrays.sort(team);
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < T; i++) {
				sb.append(team[i].num);
				if (i != T - 1) {
					sb.append(team[i].solve == team[i + 1].solve
							&& team[i].time == team[i + 1].time ? "=" : ",");
				}
			}
			System.out.println(sb);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	class Team implements Comparable<Team> {
		int num;
		int solve;
		int time;
		int[] wrong;

		Team(int num) {
			this.num = num;
			wrong = new int[P + 1];
		}

		@Override
		public int compareTo(Team arg0) {
			if (arg0.solve != this.solve) {
				return arg0.solve - this.solve;
			} else if (arg0.time != this.time) {
				return this.time - arg0.time;
			} else {
				return arg0.num - this.num;
			}
		}
	}
}