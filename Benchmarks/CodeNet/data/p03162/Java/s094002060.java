import java.util.Scanner;

class Main{
	static final long MOD = 1000000007;


	static long pow=1000000007;




	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int N =sc.nextInt();
		int[] a = new int[N];
		int[] b = new int[N];
		int[] c = new int[N];
		for(int i=0;i < N;i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();			
		}
		int[][] dp = new int[N][3];
		dp[0][0] = a[0];
		dp[0][1] = b[0];
		dp[0][2] = c[0];
		if(N==1){
			System.out.println(Math.max(dp[N-1][0], Math.max(dp[N-1][1], dp[N-1][2])));
			return;
		}
		dp[1][0] = Math.max(dp[0][0], Math.max(dp[0][1], dp[0][2]))+a[1];
		dp[1][1] = Math.max(dp[0][0], Math.max(dp[0][1], dp[0][2]))+b[1];
		dp[1][2] = Math.max(dp[0][0], Math.max(dp[0][1], dp[0][2]))+c[1];

		for(int i = 2;i<N;i++){
			dp[i][0] = Math.max(dp[i-1][1], dp[i-1][2]) + a[i]; 
			dp[i][1] = Math.max(dp[i-1][0], dp[i-1][2]) + b[i]; 
			dp[i][2] = Math.max(dp[i-1][0], dp[i-1][1]) + c[i]; 
					
			
		}

		System.out.println(Math.max(dp[N-1][0], Math.max(dp[N-1][1], dp[N-1][2])));

	}
}







class Pair implements Comparable{
	int from;		//p
	int end;		//y
	int num;
	int bango;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}

