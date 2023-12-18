import java.util.Scanner;

public class Main {
	static double N;
	static int K;
	static double ans;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		K = sc.nextInt();

		double prob = 1 / N;

		for (int point = 1; point <= N; point++) {
			dfs(point, 1/N);
		}

		System.out.println(ans);
	}

	private static void dfs(int point, double prob) {
		if (point >= K) {
			ans += prob;
			return;
		}

		dfs(point * 2, prob * 1/2);
	}

}