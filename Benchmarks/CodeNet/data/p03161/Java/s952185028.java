import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] h = new int[N];
		for (int i=0;i<N;i++) {
			h[i]=sc.nextInt();
		}

		int[] dp = new int[N];
		Arrays.fill(dp,Integer.MAX_VALUE);
		dp[0]=0;
		dp[1]=Math.abs(h[1]-h[0]);
		int c=0;
		for (int i=2;i<N;i++) {
			for (int k=1;k<=Math.min(i,K);k++) {
				dp[i] = Math.min(dp[i],dp[i-k]+Math.abs(h[i]-h[i-k]));
			}
		}
		System.out.println(dp[N-1]);
	}
}