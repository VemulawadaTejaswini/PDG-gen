
import java.util.*;


public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	long MOD = 1000000007;
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();

		//文字数 1つ前の文字, 2つ前の文字, 3つ前の文字 -> 条件を満たす文字列の数
		//A=0 C=1 G=2 T=3
		long dp[][][][] = new long[101][4][4][4];

		dp[0][3][3][3] = 1;

		for(int len=0; len<n; len++) {
			for(int c1=0; c1<4; c1++) {
				for(int c2=0; c2<4; c2++) {
					for(int c3=0; c3<4; c3++) {
						if(dp[len][c1][c2][c3]==0) continue;
						for(int nextc=0; nextc<4; nextc++) {
							if(nextc==1 && c1==2 && c2==0) continue;
							if(nextc==1 && c1==0 && c2==2) continue;
							if(nextc==2 && c1==1 && c2==0) continue;
							if(nextc==1 && c2==2 && c3==0) continue;
							if(nextc==1 && c1==2 && c3==0) continue;
							dp[len+1][nextc][c1][c2] += dp[len][c1][c2][c3];
							dp[len+1][nextc][c1][c2] %= MOD;
						}
					}
				}
			}
		}

		long ans = 0;
		for(int c1=0; c1<4; c1++) {
			for(int c2=0; c2<4; c2++) {
				for(int c3=0; c3<4; c3++) {
					ans += dp[n][c1][c2][c3];
					ans %= MOD;
				}
			}
		}
		System.out.println(ans);
		sc.close();
	}



}
