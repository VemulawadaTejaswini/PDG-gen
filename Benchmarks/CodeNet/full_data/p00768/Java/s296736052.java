import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
	class Team implements Comparable<Team>{
		int id;
		int[] pena;
		int ac, score;

		Team(int id, int P) {
			this.id = id;
			this.pena = new int[P];
			this.ac = 0;
			this.score = 0;
		}

		@Override
		public int compareTo(Team o) {
			if (this.ac != o.ac) {
				return o.ac - this.ac;
			}
			if (this.score != o.score) {
				return this.score - o.score;
			}
			return o.id - this.id;
		}

		@Override
		public boolean equals(Object obj) {
			Team o = (Team)obj;
			return o.ac == this.ac && this.score == o.score;
		}
	}

	void run() {
		MyScanner sc = new MyScanner();

		while (true) {
			sc.nextInt();
			int T = sc.nextInt();
			int P = sc.nextInt();
			int Q = sc.nextInt();
			if ((T | P | Q) == 0) {
				break;
			}
			Team[] t = new Team[T];
			for (int i = 0; i < T; i++) {
				t[i] = new Team(i + 1, P);
			}

			for (int i = 0; i < Q; i++) {
				int time = sc.nextInt();
				int team = sc.nextInt() - 1;
				int prob = sc.nextInt() - 1;
				int judg = sc.nextInt();

				if (judg == 0) {
					t[team].score += time + t[team].pena[prob] * 20;
					t[team].ac++;
				} else {
					t[team].pena[prob]++;
				}
			}
			Arrays.sort(t);

			System.out.print(t[0].id);
			for (int i = 1; i < T; i++) {
				String tab = (t[i].equals(t[i - 1])) ? "=" : ",";
				System.out.print(tab + t[i].id);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public void mapDebug(int[][] a) {
		System.out.println("--------map display---------");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d ", a[i][j]);
			}
			System.out.println();
		}
		System.out.println("----------------------------" + '\n');
	}

	class MyScanner {
		int read() {
			try {
				return System.in.read();
			} catch (IOException e) {
				throw new InputMismatchException();
			}
		}

		boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		boolean isEndline(int c) {
			return c == '\n' || c == '\r' || c == -1;
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		int[] nextIntArray(int n) {
			int[] array = new int[n];
			for (int i = 0; i < n; i++)
				array[i] = nextInt();
			return array;
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		long[] nextLongArray(int n) {
			long[] array = new long[n];
			for (int i = 0; i < n; i++)
				array[i] = nextLong();
			return array;
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		double[] nextDoubleArray(int n) {
			double[] array = new double[n];
			for (int i = 0; i < n; i++)
				array[i] = nextDouble();
			return array;
		}

		String next() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isSpaceChar(c));
			return res.toString();
		}

		String[] nextStringArray(int n) {
			String[] array = new String[n];
			for (int i = 0; i < n; i++)
				array[i] = next();

			return array;
		}

		String nextLine() {
			int c = read();
			while (isEndline(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isEndline(c));
			return res.toString();
		}
	}
}