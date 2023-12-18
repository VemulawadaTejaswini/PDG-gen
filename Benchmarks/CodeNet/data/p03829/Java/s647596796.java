import java.util.*;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final long A = sc.nextLong();
		final long B = sc.nextLong();

		int[] towns = new int[N];
		towns[0] = sc.nextInt();
		long totalWork = 0;
		for (int i = 1; i < N; i++) {
			towns[i] = sc.nextInt();
			totalWork += Math.min((towns[i] - towns[i - 1]) * A, B);
		}
		System.out.println(totalWork);
		sc.close();
	}

}
