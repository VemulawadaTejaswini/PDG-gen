
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int n, k;
	int dp[][][];
	int[] sp;
	final int p = 10000;
	
	void run() {
		Scanner sc = new Scanner(System.in);
//		for(;;) {
			n = sc.nextInt();
			k = sc.nextInt();
//			if( (n|k) == 0 ) break;
			sp = new int[n+1];
			dp = new int[n+1][3][2];
			for(int i=0;i<k;i++) sp[ sc.nextInt() ] = sc.nextInt();
			dp[0][0][1] = dp[0][1][1] = dp[0][2][1] = 1;
//			dp[1][0][0] = dp[1][1][0] = dp[1][2][0] = -1;
			
			for(int i=1;i<=n;i++) {
				if(sp[i] != 0) {
					for(int j=0;j<3;j++) { 
						if( j != sp[i]-1 )
						for(int k=0;k<2;k++) {
							dp[i][ sp[i]-1 ][0] += dp[i-1][j][k];
						}
						else dp[i][ sp[i]-1 ][1] = dp[i-1][ sp[i]-1 ][0];
					}
				}
				else {
					for(int j=0;j<3;j++) {
						for(int k=1;k<=2;k++) for(int l=0;l<2;l++)
							dp[i][j][0] += dp[i-1][(j+k)%3][l];
						dp[i][j][1] = dp[i-1][j][0];
					}
				}
				for(int j=0;j<3;j++) for(int k=0;k<2;k++) {
					if( i == 1) dp[i][j][k] /= 2;
					dp[i][j][k] %= p;
				}
//				debug(dp[i]);
			}
			int sum = 0;
			for(int j=0;j<3;j++) for(int k=0;k<2;k++) {
				sum += dp[n][j][k];
			}
			System.out.println((sum) % p);
//		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}