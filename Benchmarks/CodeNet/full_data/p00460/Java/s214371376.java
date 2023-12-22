import java.util.Scanner;

//Bingo
public class Main{

	
	void run(){
		Scanner sc = new Scanner(System.in);
		int MOD = 100000;
//		long T = System.currentTimeMillis();
		
		for(;;){
			int N = sc.nextInt(), M = sc.nextInt(), S = sc.nextInt();
			if((N|M|S)==0)break;
			N*=N;
			int[][][] dp = new int[2][2001][3001];
//			for(int m=0;m<=M;m++)for(int s=0;s<=S;s++)dp[0][m][s] = 0;
			int X = 1;
			for(int x=1;x<=N;x++,X=1-X)for(int m=1;m<=M;m++)for(int s=1;s<=S;s++){
				dp[X][m][s] = 0;
				if(x==1){
					if(s<=m)dp[X][m][s]++;
				}
				else{
					dp[X][m][s]+=dp[X][m-1][s];
					if(s-m>=0)dp[X][m][s]+=dp[1-X][m-1][s-m];
				}
				if(MOD<=dp[X][m][s])dp[X][m][s]-=MOD;
			}
			System.out.println(dp[1-X][M][S]);
		}
//		System.out.println(System.currentTimeMillis()-T);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}