import java.util.Arrays;
import java.util.Scanner;

public class Main {
	class Team implements Comparable<Team>{
		int id, s;
		int[] p;
		int ac;

		Team(int id, int pro) {
			this.id = id;
			this.p = new int[pro];
			this.s = 0;
			this.ac = 0;
		}

		@Override
		public int compareTo(Team o) {
			if (this.ac != o.ac)
				return o.ac - this.ac;
			return this.s - o.s;
		}
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int r = sc.nextInt();
			if ((n | m | r) == 0) {
				break;
			}

			Team[] t = new Team[n];
			for (int i = 0; i < n; i++) {
				t[i] = new Team(i, m);
			}

			for (int i = 0; i < r; i++) {
				int tid = sc.nextInt() - 1;
				int pid = sc.nextInt() - 1;
				int tim = sc.nextInt();
				String mes = sc.next();

				if (mes.equals("CORRECT")) {
					t[tid].ac++;
					t[tid].s += t[tid].p[pid]*1200 + tim;
				} else {
					t[tid].p[pid]++;
				}
			}

			Arrays.sort(t);
			for (int i = 0; i < n; i++) {
				int tid = t[i].id;
				int ac = t[i].ac;
				int pen = t[i].s;
				System.out.println(++tid + " " + ac + " " + pen);
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}