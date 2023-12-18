import java.util.*;

public class Main {	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		final int LEN = 51;
		
		long dp[][] = new long[LEN][LEN*LEN];
		dp[0][0] = 1;
		
		for (int i = 1; i <= N; i++) {
	      int x = sc.nextInt();
	      for (int j = i - 1; j >= 0; j--) {
		    for (int k = 0; k <= LEN*j; k++) {
              dp[j + 1][k + x] += dp[j][k];
			}
	      }
		}
		long ans = 0;
		for (int i = 1; i <= N; i++) {
          ans += dp[i][i*A];
        }
		System.out.println(ans);
	}
}