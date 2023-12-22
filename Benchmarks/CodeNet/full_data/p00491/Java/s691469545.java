
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;
	int MOD = 10000;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), k = sc.nextInt();
		
		int[][][] dp = new int[n+1][4][3];
		int[] ks = new int[n+1];
		for(int i=0;i<k;i++) {
			int a = sc.nextInt(), b = sc.nextInt();
			for(int j=0;j<3;j++){
				ks[a] = b;
			}
		}
//		debug(ks);
		dp[0][0][0] = 1;
		for(int i=1;i<=n;i++) {
			if( ks[i] != 0) {
				for(int h=0;h<4;h++) {
					if( h != ks[i] ) for(int l=0;l<3;l++) 
						dp[i][ks[i]][1] = ( dp[i-1][h][l] + dp[i][ks[i]][1] ) % MOD;
					else for(int l=1;l<3;l++) 
						dp[i][ks[i]][l] = ( dp[i-1][ks[i]][l-1] + dp[i][ks[i]][l] ) % MOD;
				}
			}
			else {
				for(int j=1;j<4;j++) for(int h=0;h<4;h++) if( j != h ){
					for(int l=0;l<3;l++) dp[i][j][1] = ( dp[i-1][h][l] + dp[i][j][1] ) % MOD;
				}
				for(int j=1;j<4;j++) {
					for(int l=2;l<3;l++) dp[i][j][l] = ( dp[i-1][j][l-1] + dp[i][j][l] ) % MOD;
				}
			}
		}
//		for(int[][] a: dp) debug(a);
		int ans = 0;
		for(int i=0;i<4;i++) for(int j=0;j<3;j++) ans = (ans + dp[n][i][j]) % MOD;
		System.out.println(ans);
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}