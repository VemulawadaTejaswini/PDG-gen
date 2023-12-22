import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int N = sc.nextInt();
		int[] T = new int[D];
		for (int i = 0; i < D; i++) {
			T[i] = sc.nextInt();
		}
		int[] A = new int[N];
		int[] B = new int[N];
		int[] C = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
			C[i] = sc.nextInt();
		}
		int dp[][] = new int[D][N];
		for(int i=0;i<D;i++) {
			for(int j=0;j<N;j++) {
				if(A[j]<=T[i] && T[i]<=B[j]) {
					if(i!=0) {
						for(int k=0;k<N;k++) {
							if (dp[i-1][k]!=-1) {
								dp[i][j] = max(dp[i][j],dp[i-1][k]+diff(C[k],C[j]));
							}
						}
					}else{
						dp[i][j] = 0;
					}
				}else{
					dp[i][j] = -1;
				}
			}
		}
		int ans = 0;
		for(int i=0;i<N;i++) {
			ans = max(ans,dp[D-1][i]);
		}
		System.out.println(ans);
	}
	static private int max(int a, int b) {
		return a > b ? a : b;
	}
	static private int diff(int a,int b) {
		return a>b ? a-b:b-a;
	}
}