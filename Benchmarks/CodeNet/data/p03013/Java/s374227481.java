import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] A = new int[M];
		for(int i = 0 ; i < M ; i++){
			A[i] = sc.nextInt();
		}
		sc.close();

		long INF = 1000000007;
		int[] B = new int[M+1];
		long[] dp = new long[N];
		boolean flag = true;

		dp[0] = 1;
		dp[1] = 1;


		B[0] = A[0]-1;
		if(A[0]-1 == 0){
			B[0] = 1;
		}
		B[M] = N-(A[M-1]+1);
		if(B[M] == 0){
			B[M] = 1;
		}
		for(int i = 0 ; i < M-1 ; i++){
			B[i+1] = (A[i+1]-1) - (A[i]+1);
			if(B[i+1]<0){
				flag = false;
				break;
			}
		}
		long ans = 1;
		if(flag){
			for(int i = 0 ; i <=M ; i++){
				//System.out.println(B[i]);
				if(dp[B[i]] != 0){
					ans *= dp[B[i]];
				}
				else{
					for(int j =2 ; j <= B[i] ; j++){
						dp[j] = (dp[j-1] + dp[j-2])%INF;
					}
					ans *= dp[B[i]];
				}
			}
			System.out.println(ans%INF);
		}
		else{
			System.out.println("0");
		}
	}
}