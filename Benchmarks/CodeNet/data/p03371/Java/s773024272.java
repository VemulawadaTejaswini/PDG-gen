import java.util.*;

public class Main {
	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int A = sc.nextInt();
		final int B = sc.nextInt();
		final int C = sc.nextInt();

		final int X = sc.nextInt();
		final int Y = sc.nextInt();

		long minCost = Long.MAX_VALUE;

		for (int i = 0, bound = Math.max(X, Y) * 2; i <= bound; i += 2) {
			long ab = i;
			long a = Math.max(X - i / 2, 0);
			long b = Math.max(Y - i / 2, 0);
			long cost = A * a + B * b + C * ab;
			minCost = Math.min(minCost, cost);
		}
		System.out.println(minCost);
		sc.close();

	}

}
