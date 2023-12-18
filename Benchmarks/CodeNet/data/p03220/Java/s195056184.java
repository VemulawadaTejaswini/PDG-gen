import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	private void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int T = sc.nextInt();
		final int A = sc.nextInt();

		double min_dif = Double.MAX_VALUE;
		int ans = -1;

		for (int i = 0; i < N; i++) {
			int hi = sc.nextInt();
			double temp = T - hi * 0.006;
			double diff = Math.abs(A - temp);
			if (diff < min_dif) {
				min_dif = diff;
				ans = i + 1;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}
