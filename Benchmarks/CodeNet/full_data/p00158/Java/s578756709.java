import java.util.Scanner;
import java.util.Arrays;

public class Main {
	int[] memo;

	public static void main(String args[]) {
		new Main().run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);

		memo = new int[1000000+1];
		Arrays.fill(memo, -1);

		while(true) {
			int N = sc.nextInt();
			if(N == 0) break;
			System.out.println(solve(N));
		}
	}

	private int solve(int n) {
		int r = memo[n];
		if(r != -1) return r;

		if(n == 1) return 0;

		if(n % 2 == 0) return memo[n] = solve(n / 2) + 1;
		else return memo[n] = solve(3 * n + 1) + 1;
	}
}