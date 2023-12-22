import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String str[] = br.readLine().split(" ");
			int M = Integer.parseInt(str[0]);
			int T = Integer.parseInt(str[1]);
			int P = Integer.parseInt(str[2]);
			int R = Integer.parseInt(str[3]);

			if (M == 0 && T == 0 && P == 0 && R == 0)
				break;

			ArrayList<Team> teams = new ArrayList<>();
			for (int i = 0; i < T; i++) {
				teams.add(new Team(i + 1, P));
			}
			for (int i = 0; i < R; i++) {
				str = br.readLine().split(" ");
				int m = Integer.parseInt(str[0]);
				int t = Integer.parseInt(str[1]) - 1;
				int p = Integer.parseInt(str[2]) - 1;
				int j = Integer.parseInt(str[3]);
				teams.get(t).setJudge(m, p, j);
			}
			Collections.sort(teams);
			for (int i = 0; i < T; i++) {
				if (i != 0) {
					if (teams.get(i).answer != teams.get(i - 1).answer || teams.get(i).time != teams.get(i - 1).time) {
						System.out.print("," + teams.get(i).id);
					} else {
						System.out.print("=" + teams.get(i).id);
					}
				} else
					System.out.print(teams.get(i).id);
			}
			System.out.print("\n");
		}
	}
}

class Team implements Comparable<Team> {

	int id;
	int time;
	int answer;
	ArrayList<Integer> incorrect = new ArrayList<>();

	public Team(int id, int p) {
		this.id = id;
		time = 0;
		answer = 0;
		for (int i = 0; i < p; i++) {
			incorrect.add(0);
		}
	}

	public void setJudge(int time, int problem, int judge) {
		if (judge == 0) {
			int sum = time;
			for (int i = 0; i < incorrect.get(problem); i++) {
				sum += 20;
			}
			this.time += sum;
			this.answer++;
		} else
			incorrect.set(problem, incorrect.get(problem) + 1);
	}

	@Override
	public int compareTo(Team arg0) {
		if (this.answer > arg0.answer) {
			return -1;
		} else if (this.answer < arg0.answer) {
			return 1;
		} else {
			if (this.time < arg0.time) {
				return -1;
			} else if (this.time > arg0.time) {
				return 1;
			} else {
				if (this.id > arg0.id) {
					return -1;
				} else {
					return 1;
				}
			}
		}
	}
}

