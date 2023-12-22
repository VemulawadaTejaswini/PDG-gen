public class Main {

	private java.util.Scanner sc;
	private java.io.PrintStream out;
	
	public Main(java.io.InputStream in, java.io.PrintStream out) {
		this.sc = new java.util.Scanner(in);
		this.out = out;
	}
	
	public void run() {
		for (;;) {
			final int M = sc.nextInt();
			final int T = sc.nextInt();
			final int P = sc.nextInt();
			final int R = sc.nextInt();
			if (M == 0 && T == 0 && P == 0 && R == 0)
				break ;
			
			final Team[] teams = new Team[T];
			for (int i = 0; i < T; ++i)
				teams[i] = new Team(i + 1, P);
			for (int i = 0; i < R; ++i) {
				final int m = sc.nextInt();
				final int t = sc.nextInt();
				final int p = sc.nextInt();
				final int j = sc.nextInt();
				if (j == 0)
					teams[t - 1].accept(m, p - 1);
				else
					teams[t - 1].reject(m, p - 1);
			}
			java.util.Arrays.sort(teams, (new java.util.Comparator<Team>() {
				@Override
				public int compare(Team o1, Team o2) {
					final int det = o1.compareTo(o2);
					if (det != 0) return -det;
					if (o2.id < o1.id) return -1;
					if (o1.id < o2.id) return 1;
					return 0;
				}
			}));
			for (int i = 0; i < T; ++i) {
				if (i > 0) {
					if (teams[i-1].equals(teams[i]))
						out.print('=');
					else
						out.print(',');
				}
				out.print(teams[i].id);
			}
			out.println();
		}
	}
	
	public static void main(String[] args) {
		(new Main(System.in, System.out)).run();
	}
	
	private static class Team implements Comparable<Team> {
		public final int id;
		private final boolean[] solved;
		private final int[] penalty;
		
		public Team(int id, int n) {
			this.id = id;
			this.solved = new boolean[n];
			this.penalty = new int[n];
		}
		
		public void accept(int m, int p) {
			this.solved[p] = true;
			this.penalty[p] += m;
		}
		
		public void reject(int m, int p) {
			this.penalty[p] += 20;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (obj == this) return true;
			if (!(obj instanceof Team)) return false;
			final Team o = (Team) obj;
			return this.getSolved() == o.getSolved() && this.getPenalty() == o.getPenalty();
		}

		@Override
		public int compareTo(Team o) {
			final int ss = this.getSolved();
			final int os = o.getSolved();
			if (ss < os) return -1;
			if (os < ss) return 1;
			final int sp = this.getPenalty();
			final int op = o.getPenalty();
			if (op < sp) return -1;
			if (sp < op) return 1;
			return 0;
		}
		
		private int getSolved() {
			int rval = 0;
			for (int i = 0; i < this.solved.length; ++i) {
				if (solved[i])
					++rval;
			}
			return rval;
		}
		
		private int getPenalty() {
			int rval = 0;
			for (int i = 0; i < this.solved.length; ++i) {
				if (this.solved[i])
					rval += this.penalty[i];
			}
			return rval;
		}
	}

}