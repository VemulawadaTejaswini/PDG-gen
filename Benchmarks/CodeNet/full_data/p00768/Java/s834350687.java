public class Main {
	
	public void run(java.util.Scanner sc, java.io.PrintStream out) {
		for (;;) {
			final int M = sc.nextInt();
			final int T = sc.nextInt();
			final int P = sc.nextInt();
			final int R = sc.nextInt();
			if (M == 0 && T == 0 && P == 0 && R == 0) break ;
			
			final Record[] records = new Record[R];
			for (int i = 0; i < R; ++i) {
				final int m = sc.nextInt();
				final int t = sc.nextInt();
				final int p = sc.nextInt();
				final int j = sc.nextInt();
				records[i] = new Record(m, t, p, j);
			}
			
			final Team[] teams = new Team[T];
			for (int i = 1; i <= T; ++i)
				teams[i - 1] = new Team(i);
			for (int i = 0; i < R; ++i) {
				if (records[i].status != 0)
					continue ;
				teams[records[i].team - 1].solved += 1;
				teams[records[i].team - 1].penalties += records[i].time;
				for (int j = 0; j < i; ++j) {
					if (records[j].team == records[i].team && records[j].problem == records[i].problem)
						teams[records[i].team - 1].penalties += 20;
				}
			}
			java.util.Arrays.sort(teams);
			out.print(teams[0].id);
			for (int i = 1; i < T; ++i) {
				if (teams[i - 1].solved == teams[i].solved && teams[i - 1].penalties == teams[i].penalties)
					out.print('=');
				else
					out.print(',');
				out.print(teams[i].id);
			}
			out.println();
		}
	}

	public static void main(String[] args) {
		(new Main()).run(new java.util.Scanner(System.in), System.out);
	}

	private static class Team implements Comparable<Team> {
		public final int id;
		public int solved;
		public int penalties;
		public Team(int id) {
			this.id = id;
			this.solved = 0;
			this.penalties = 0;
		}
		@Override
		public int compareTo(Team o) {
			if (this.solved > o.solved)
				return -1;
			else if (o.solved > this.solved)
				return 1;
			if (this.penalties < o.penalties)
				return -1;
			else if (o.penalties < this.penalties)
				return 1;
			if (this.id > o.id)
				return -1;
			else if (o.id > this.id)
				return 1;
			return 0;
		}
	}
	
	private static class Record {
		public final int time;
		public final int team;
		public final int problem;
		public final int status;
		public Record(int time, int team, int problem, int status) {
			this.time = time;
			this.team = team;
			this.problem = problem;
			this.status = status;
		}
	}
	
}