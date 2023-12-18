import java.util.Scanner;


public class Main {
	static int N;
	static long ans;
	static int[] S;
	static long[] memo;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			 N = sc.nextInt();
			 S = new int[N];

			 for(int i = 0 ; i < N ; i++){
				 S[i] = sc.nextInt();
			 }
		sc.close();

		memo = new long[N];

		memo[0] = 0;
		memo[1] = Math.abs(S[1] - S[0]);

		System.out.println(dp(S,memo,N));


	}

	static long dp(int[] S,long[] memo,int n){
		if(n==1){
			return 0;
		}

		else if(n==2){
			return Math.abs(S[1] - S[0]);
		}


		else{
		for(n = 3; n <= N; n++){
				ans = Math.min(Math.abs(S[n-1]-S[n-2]) +memo[n-2],Math.abs(S[n-1]-S[n-3]) + memo[n-3]);
				memo[n-1] = ans;
		}
		/*
		else if(n <= N){
			if(memo[N-1] != 0){
				ans = Math.min(Math.abs(S[N-1]-S[N-2]) +memo[N-1],Math.abs(S[N-1]-S[N-3]) + memo[N-2]);
			}
			else{
				memo[N-1] = dp(S,memo,N-1);
				memo[N-2] = dp(S,memo,N-2);
				ans = Math.min(Math.abs(S[N-1]-S[N-2]) +dp(S,memo,N-1),Math.abs(S[N-1]-S[N-3])+dp(S,memo,N-2));
			}
		}*/
		}

		return ans;
	}
}