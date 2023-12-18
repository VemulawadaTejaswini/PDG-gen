import java.util.*;

// ABC 48-C
// http://abc048.contest.atcoder.jp/tasks/arc064_a

public class Main {
	
	static int MOD = 1000000007;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		long[] candies = new long[n];
		long x = in.nextInt();
		
		for (int i = 0; i < n; i++) {
			candies[i] = in.nextInt();
		}
		
		int answer = 0;
		for (int i = 1; i < n; i++) {
			long sum = candies[i - 1] + candies[i];
			if (sum > x) {
				long diff = sum - x;
				answer += diff;
				if (diff <= candies[i]) {
					candies[i] -= diff;
				} else {
					candies[i] = 0;
				}
			}
		}
		
		System.out.println(answer);
	}
}