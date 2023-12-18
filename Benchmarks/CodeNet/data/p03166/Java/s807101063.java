import java.util.*;

public class Main {
	final int MOD = 100000000;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	final int LEN = 100000;
	Scanner sc = new Scanner(System.in);


	void doIt() {
		int N = sc.nextInt();
		int M = sc.nextInt();
		ArrayList<Integer>[] link = new ArrayList[N];
		for(int i = 0; i < N; i++) 
			link[i] = new ArrayList<>();
		for(int i = 0; i < M; i++) 
			link[sc.nextInt() - 1].add(sc.nextInt() - 1);
		int dp[] = new int[N];
		for(int i = 0; i < N; i++) {
			for(int j : link[i]) {
				dp[j] = dp[i] + 1;
			}
		}
		for(int i = 0; i < N; i++) {
			for(int j : link[i]) {
				dp[j] = Math.max(dp[j], dp[i] + 1);
				//System.out.println(dp[j]);
			}
		}
		int max = dp[0];
		for(int i = 1; i < N; i++) {
			max = Math.max(max, dp[i] + dp[0]);
		}
		System.out.println(max);
		//System.out.println(Arrays.toString(dp));
		
		
	}
	public static void main(String[] args) {
		new Main().doIt();
	}
}