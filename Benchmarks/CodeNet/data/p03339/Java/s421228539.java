import java.util.*;

public class Main {
	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();

		final String S = sc.next();

		int[] wcnt = new int[N];
		int[] ecnt = new int[N];

		for (int i = 0; i < N - 1; i++) {
			wcnt[i + 1] = wcnt[i];
			if (S.charAt(i) == 'W') {
				wcnt[i + 1] += 1;
			}
			ecnt[N - 2 - i] = ecnt[N - 1 - i];
			if (S.charAt(N - i - 1) == 'E') {
				ecnt[N - 2 - i] += 1;
			}
		}

		int minTurn = N;
		for (int i = 0; i < N; i++) {
			minTurn = Math.min(minTurn, wcnt[i] + ecnt[i]);
		}
		System.out.println(minTurn);

		sc.close();
	}

}
