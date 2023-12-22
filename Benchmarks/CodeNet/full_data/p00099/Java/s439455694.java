import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	class Team implements Comparable<Team>{
		int number;
		int score;

		Team(int number) {
			this.number = number;
		}

		void add(int k) {
			this.score += k;
		}

		@Override
		public int compareTo(Team o) {
			if (this.score != o.score) {
				return o.score - this.score;
			}
			return this.number - o.number;
		}
	}

	void run(){
		Scanner sc = new Scanner(System.in);
		int n, q;
		Team t[];
		TreeMap<Integer, Team> tm = new TreeMap<Integer, Team>();
		n = sc.nextInt();
		q = sc.nextInt();
		t = new Team[n];
		for (int i = 0; i < n; i++) {
			t[i] = new Team(i);
			tm.put(i, t[i]);
		}
		for (int i = 0; i < q; i++) {
			int a = sc.nextInt() - 1;
			int v = sc.nextInt();
			tm.get(a).add(v);
			Arrays.sort(t);
			System.out.println((t[0].number + 1) + " " + t[0].score);
		}
	}

	public static void main(String[] args){
		new Main().run();
	}
}