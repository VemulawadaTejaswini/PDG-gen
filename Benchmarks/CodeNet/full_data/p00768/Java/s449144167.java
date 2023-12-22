import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int M = sc.nextInt();
			int T = sc.nextInt();
			int P = sc.nextInt();
			int R = sc.nextInt();
			if (M == 0)
				break;
			Team[] team = new Team[T];
			for (int i = 0; i < T; i++) {
				team[i] = new Team(i + 1, P);
			}
			for (int i = 0; i < R; i++) {
				int m = sc.nextInt();
				int t = sc.nextInt();
				int p = sc.nextInt();
				int j = sc.nextInt();
				if (j == 0) {
					team[t - 1].judge_true(p, m);
				} else {
					team[t - 1].judge_false(p);
				}
			}
			Arrays.sort(team);
			int prev_answer = -1;
			int prev_time = 0;
			for (Team t : team) {
				if (prev_answer == t.answer && prev_time == t.time)
					System.out.print("=");
				else if (prev_answer != -1)
					System.out.print(",");
				System.out.print(t.t);
				prev_answer = t.answer;
				prev_time = t.time;
			}
			System.out.println("");
		}
	}
}

class Team implements Comparable<Team> {
	int t;
	int p[];
	int time;
	int answer;

	Team(int t, int P) {
		this.answer = 0;
		this.time = 0;
		this.t = t;
		this.p = new int[P];
	}

	void judge_false(int no) {
		p[no - 1] += 20;
	}

	void judge_true(int no, int m) {
		time += m + p[no - 1];
		answer++;
	}

	@Override
	public int compareTo(Team o) {
		if (answer == o.answer) {
			if (time == o.time) {
				if (t == o.t)
					return 0;
				else if (t < o.t)
					return 1;
				else
					return -1;
			} else if (time > o.time)
				return 1;
			else
				return -1;
		} else if (answer < o.answer)
			return 1;
		else
			return -1;
	}
}