import java.util.Scanner;

public class Main {

	/**
	 * problem solver
	 */
	public static class Problem {

		/**
		 * paramters
		 */
		private long r;
		private long d;
		private long x2000;

		/**
		 * constructor
		 */
		Problem() {
			r = 0;
			d = 0;
			x2000 = 0;
		}

		/**
		 * standard input
		 */
		void input() {
			Scanner sc = new Scanner(System.in);
			r = sc.nextInt();
			d = sc.nextInt();
			x2000 = sc.nextInt();
			sc.close();
		}

		/**
		 * solver
		 */
		void solve() {
			long x = x2000;
			
			for (int i=2001; i<=2010; i++) {
				x = r * x - d;
				System.out.println(x);
			}
		}

	}

	public static void main(String args[]) {

		Problem p = new Problem();

		p.input();

		p.solve();
	}
}
