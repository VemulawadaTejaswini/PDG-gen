import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		Set<Integer>move = new TreeSet<Integer>();
		long MOD = 998244353;	 
		for (int i = 0; i < K; i++) {
			int left = scanner.nextInt();
			int right = scanner.nextInt();
			for (int j = left; j <= right; j++) {
				move.add(j);
			}
		}

		long [] dp = new long[N+1];

		dp[1] = 1;

		for (int i = 1; i < N+1; i++) {
			for (Integer item : move) {
				if (i + item > N) {
					continue;
				}else{
					dp[i+item] += dp[i] % MOD;
				}
			}
		}

		System.out.println(dp[N] % MOD);

		scanner.close();
	}

}
