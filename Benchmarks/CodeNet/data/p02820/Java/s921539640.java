import java.util.Scanner;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int N = sc.nextInt();
		int K = sc.nextInt();
		int R = sc.nextInt();
		int S = sc.nextInt();
		int P = sc.nextInt();
		String T = sc.next();

		char[] pred = T.toCharArray();
		char[] player = new char[N];
		long score = 0;
		for (int i = 0; i < K; i++) {
			if (pred[i] == 'r'){
				score += P;
				player[i] = 'p';
			}else if (pred[i] == 's'){
				score += R;
				player[i] = 'r';
			}else {
				score += S;
				player[i] = 's';
			}
		}
		for (int i = K; i < pred.length; i++) {
			int s;
			if (pred[i] == 'r'){
				s =  P;
				player[i] = 'p';
			}else if (pred[i] == 's'){
				s =  R;
				player[i] = 'r';
			}else {
				s =  S;
				player[i] = 's';
			}
			if (player[i] == player[i - K]) {
				player[i] = 0;
			} else {
				score += s;
			}
		}
		System.out.println(score);
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}