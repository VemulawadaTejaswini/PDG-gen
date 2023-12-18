import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
		}
		
		int[] dp = new int[H+1];
		final int MAX = 1000000000;
		Arrays.fill(dp, MAX);
		dp[H]=0;
		for(int i=H; i>0; i--) {
			if(dp[i]<MAX) {
				for(int j=0; j<N; j++) {
					int next = Math.max(0, i-A[j]);
					dp[next] = Math.min(dp[next], dp[i]+B[j]);
				}
			}
		}
		
		System.out.println(dp[0]);
	}

}

