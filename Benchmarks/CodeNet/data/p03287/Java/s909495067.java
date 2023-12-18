import java.util.ArrayList;
import java.util.Scanner;

class Main{

	static char[][] map;
	static int H;
	static int W;
	static	int D ;
	static	int G ;
	static	int[] p;
	static	int[] c;
	static int ans = 0;
	static int N;
	static long M;
	static ArrayList<Integer> yakusu;

	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);			//文字の入力
		N = sc.nextInt();
		M = sc.nextLong();
		long[] A = new long[N+1];

		long[][] dp = new long[N+1][N+1];

		for(int i = 1;i < N+1;i++){
			A[i] = sc.nextLong();
		}
		for(int i = 1;i < N+1;i++){
			for(int j =i ;j < N+1;j++){
				dp[i][j] = dp[i][j-1]+A[j];
			}
		}

		for(int i = 1;i < N+1;i++){
			for(int j =i ;j < N+1;j++){
				if(dp[i][j] % M == 0){
//					System.out.println("i "+i + " j "+j);
//					System.out.println(dp[i][j]);

					ans++;
				}
			}
		}
		
		System.out.println(ans);





	}


}



