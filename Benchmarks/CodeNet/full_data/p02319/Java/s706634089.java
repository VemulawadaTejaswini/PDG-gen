import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		try(Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int W = sc.nextInt();
			int[] v = new int[N];
			int[] w = new int[N];
			// dp[value] = min weight
			int MAX = 0;
			for(int i=0; i<N; i++) {
				v[i] = sc.nextInt();
				w[i] = sc.nextInt();
				MAX += v[i];
			}
			int[] dp = new int[MAX+1];
			for(int i=0; i<MAX+1; i++) {
				dp[i] = Integer.MAX_VALUE;
			}
			dp[0] = 0;
			for(int j=0; j<N; j++) {
				for(int i=0; i<=MAX; i++) {
					if(dp[i] < Integer.MAX_VALUE && i+v[j]<=MAX) {
						dp[i+v[j]] = Math.min(dp[i] + w[j], dp[i+v[j]]);
					}
				}
			}
			for(int i=MAX; i>0; i--) {
				if(dp[i] <= W) {
					System.out.println(i);
					break;
				}
			}
		}
	}

}


