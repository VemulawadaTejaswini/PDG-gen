import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	static class Team implements Comparable<Team> {
		int number;
		int corrects;
		boolean[] accepted;
		int[] worngs;
		int penalty;

		@Override
		public String toString() {
			return number + " " + corrects + " " + penalty;
		}

		@Override
		public int compareTo(Team arg0) {
			if (arg0.corrects != this.corrects) {
				return arg0.corrects < this.corrects ? -1 : 1;
			}

			if (arg0.penalty != this.penalty) {
				return arg0.penalty < this.penalty ? -1 : 1;
			}

			return arg0.number < this.number ? 1 : -1;
		}
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		while (true) {

			final int T = sc.nextInt();
			final int P = sc.nextInt();
			final int R = sc.nextInt();

			if(T == 0 && P == 0 && R == 0){
				return;
			}
			
			Team[] teams = new Team[T];
			for (int i = 0; i < T; i++) {
				teams[i] = new Team();
				teams[i].number = i + 1;
				teams[i].corrects = 0;
				teams[i].accepted = new boolean[P];
				teams[i].worngs = new int[P];
				teams[i].penalty = 0;
			}

			for (int i = 0; i < R; i++) {
				final int team = sc.nextInt() - 1;
				final int problem = sc.nextInt() - 1;
				final int time = sc.nextInt();
				String str = sc.next();

				if (teams[team].accepted[problem]) {
					continue;
				}

				if ("CORRECT".equals(str)) {
					teams[team].corrects++;
					teams[team].penalty += teams[team].worngs[problem] * 1200 + time;
					teams[team].accepted[problem] = true;
				} else {
					teams[team].worngs[problem]++;
				}
			}

			Arrays.sort(teams);

			for (Team t : teams) {
				System.out.println(t);
			}
		}

	}

}