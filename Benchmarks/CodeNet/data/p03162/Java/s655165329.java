import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[][] A = new int[N][3];
		for(int i = 0; i < N; i++) {
			A[i][0] = s.nextInt();
			A[i][1] = s.nextInt();
			A[i][2] = s.nextInt();
		}
		
		int[][] dp = new int[N][3];
		dp[0][0] = A[0][0];
		dp[0][1] = A[0][1];
		dp[0][2] = A[0][2];
		for(int i = 1; i < N; i++) {
			for(int k = 0; k < 3; k++) {
				dp[i][k] = Math.max(dp[i-1][(k+1)%3], dp[i-1][(k+2)%3]);
			}
		}
		int result = Math.max(dp[N-1][0], dp[N-1][1]);
		result = Math.max(dp[N-1][2], result);
      	System.out.println(result);
    {
}