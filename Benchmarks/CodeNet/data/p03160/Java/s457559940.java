import java.util.Scanner;

class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt(),i, h[] = new int[N];
		for(i=0;i<N;i++)h[i]=sc.nextInt();
		int dp[]=new int[N+1];
		dp[0]=0;
		dp[1]=Math.abs(h[1]-h[0]);
		for(i=2;i<N;i++) {
			dp[i]=Math.min(dp[i-1]+Math.abs(h[i]-h[i-1]), dp[i-2]+Math.abs(h[i]-h[i-2]));
		}
		System.out.println(dp[N-1]);
	}
}