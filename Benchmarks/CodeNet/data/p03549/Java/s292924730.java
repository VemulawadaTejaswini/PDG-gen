import java.util.Scanner;

public class Main {

	private static final int TIME_ALMOST_TLE = 1900;
	private static final int TIME_AC = 100;

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int M = sc.nextInt();

		int T = (N - M) * TIME_AC + M * TIME_ALMOST_TLE;

		int prec = 1;
		for (int i = 0; i < M; i++) {
			prec *= 2;
		}
		System.out.println(T * prec);
		sc.close();
	}

}