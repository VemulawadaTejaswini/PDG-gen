import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
		}
		int[][] dp1 = new int[N+1][T+1];
		int[][] dp2 = new int[N+1][T+1];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < T; j++) {
				if(j+A[i] < T)
					dp1[i+1][j] = Math.max(dp1[i][j], dp1[i][j+A[i]]+B[i]);
				else
					dp1[i+1][j] = dp1[i][j];				
			}
		}
		for(int i = N; i > 0; i--) {
			for(int j = 0; j < T; j++) {
				if(j+A[i-1] < T)
					dp2[i-1][j] = Math.max(dp2[i][j], dp2[i][j+A[i-1]]+B[i-1]);
				else
					dp2[i-1][j] = dp2[i][j];				
			}
		}
		int ans = 0;
		for(int i = 0; i < N; i++)
			for(int j = 0; j < T; j++)
				ans = Math.max(ans, dp1[i][j]+dp2[i+1][T-1-j]+B[i]);
		System.out.println(ans);

	}

}