import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];
		int b[] = new int[N];
		int c[] = new int[N];
		for(int n=0;n<N;n++){
			a[n] = sc.nextInt();
			b[n] = sc.nextInt();
			c[n] = sc.nextInt();
		}
		int dp[][] = new int[N][3];
		dp[0][0] = a[0];
		dp[0][1] = b[0];
		dp[0][2] = c[0];
		for(int n=1;n<N;n++){
			dp[n][0] = Math.max(dp[n-1][1],dp[n-1][2])+a[n];
			dp[n][1] = Math.max(dp[n-1][0],dp[n-1][2])+b[n];
			dp[n][2] = Math.max(dp[n-1][1],dp[n-1][0])+c[n];
		}
		System.out.println(max(dp[N-1]));
	}
	
	private static int max(int ar[]){
		int tmp=ar[0];
		for(int n=1;n<ar.length;n++){
			if(tmp<ar[n]) tmp = ar[n];
		}
		return tmp;
	}
}