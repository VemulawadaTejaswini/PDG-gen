import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
	Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int M = s.nextInt();
		int[] c = new int[M];
		for(int i = 0; i < M; i++) {
			c[i] = s.nextInt();
		}
		
		int[] dp = new int[N+1];
		for(int i = 0; i < N + 1; i++) {
			dp[i] = 1000000;
		}
		dp[0] = 0;
		
		for(int i = 0; i < M; i++) {
			for(int j = c[i]; j < N + 1; j++ ) {
				dp[j] = Math.min(dp[j], dp[j-c[i]] + 1);
			}
		}
		
		System.out.println(dp[N]);	
    }
}
