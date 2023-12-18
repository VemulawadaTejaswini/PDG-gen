import java.util.*;

class Main {
	public static void main(String[] args) {
		//Data import
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] h = new int[N];
		for (int i=0;i<N;i++) {
			h[i]=sc.nextInt();
		}

		int dp[] = new int[N];
		dp[1]=Math.abs(h[1]-h[0]);
		for (int i=0;i<N-2;i++) {
		dp[i+2]=Math.min(dp[i]+Math.abs(h[i+2]-h[i]),dp[i+1]+Math.abs(h[i+2]-h[i+1]));
		}
		System.out.println(dp[N-1]);
	}
}