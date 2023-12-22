import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		int l = sc.nextInt();
		int[] time = new int[n];
		Team[] team = new Team[n];
		for(int i=0;i<n;i++) {
			team[i] = new Team(i,0);
		}
		TreeSet<Team> ts = new TreeSet<Team>();
		int winner = 0;
		int tbef = 0;
		for(int i=0;i<=r;i++) {
			int d,t,x;
			if (i < r) {
				d = sc.nextInt()-1;
				t = sc.nextInt();
				x = sc.nextInt();
			}else{
				d = 0;
				t = l;
				x = 0;
			}
			ts.remove(team[d]);
			team[d].score += x;
			ts.add(team[d]);
			time[winner] += t - tbef;
			tbef = t;
			winner = ts.first().id;
		}
		int ans = 0;
		int max = 0;
		for(int i=0;i<n;i++) {
			if (time[i] > max) {
				max = time[i];
				ans = i;
			}
		}
		System.out.println(ans+1);
	}

	static class Team implements Comparable<Team>{
		int id, score;
		public Team(int id,int score) {
			this.id = id;
			this.score = score;
		}
		public boolean equals(Object o) {
			if (o instanceof Team) {
				Team t = (Team) o;
				return this.id == t.id;
			}
			return super.equals(o);
		}
		public int compareTo(Team o) {
			if (this.score != o.score) {
				return o.score-this.score;
			}
			return this.id-o.id;
		}
		public String toString() {
			return "[id:" + this.id + " ,score:" + this.score + "]";
		}
	}
}