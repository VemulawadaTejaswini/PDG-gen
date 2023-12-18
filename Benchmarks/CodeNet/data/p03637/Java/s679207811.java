import java.util.Scanner;

public class Main {

	private static final String YES = "Yes";
	private static final String NO = "No";

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		int[] a = new int[N];
		int zeroCnt = 0;
		int oneCnt = 0;
		int twoCnt = 0;

		for (int i = 0; i < N; i++) {
			int ai = sc.nextInt();
			a[i] = ai;
			if (ai % 4 == 0) {
				twoCnt++;
			} else if (ai % 2 == 0) {
				oneCnt++;
			} else {
				zeroCnt++;
			}
		}
		boolean ok;
		if (zeroCnt > 0) {
			ok = fourAdjacent(0, zeroCnt - 1, oneCnt, twoCnt);
		} else if (oneCnt > 0) {
			ok = fourAdjacent(1, zeroCnt, oneCnt - 1, twoCnt);
		} else {
			ok = fourAdjacent(2, zeroCnt, oneCnt, twoCnt-1);
		}
		if(ok) {
			System.out.println(YES);
		}
		else {
			System.out.println(NO);
		}
		sc.close();
	}

	private boolean fourAdjacent(int last, int zero, int one, int two) {
		if (zero == 0 && one == 0 && two == 0) {
			return true;
		}
		switch (last) {
		case 0:
			if (two > 0) {
				return fourAdjacent(2, zero, one, two - 1);
			} else {
				return false;
			}
		case 1:
			if (one > 0) {
				return fourAdjacent(1, zero, one - 1, two);
			} else if (two > 0) {
				return fourAdjacent(2, zero, one, two - 1);
			} else {
				return false;
			}
		case 2:
			if (zero > 0) {
				return fourAdjacent(0, zero - 1, one, two);
			} else if (one > 0) {
				return fourAdjacent(1, zero, one - 1, two);
			} else if (two > 0) {
				return fourAdjacent(2, zero, one, two - 1);
			} else {
				throw new RuntimeException("Not Reachable");
			}
		}
		return false;
	}

}
