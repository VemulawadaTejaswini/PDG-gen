import java.util.Scanner;

class Main{


	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();

		long[][] dp = new long[n][n];
		for(int i= 0;i < n;i++){
			for(int j = 0;j < n;j++){
				dp[i][j] = 100000000000L;
			}
		}



		for(int i = 0;i < n-1;i++){
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			int c = sc.nextInt();


			dp[a][b] = c;
			dp[b][a] = c;

		}




		for(int k = 0;k <n;k++){
			for(int i = 0;i < n;i++){
				for(int j = 0;j < n;j++){
					dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k][j]);
				}
			}
		}

////		for(int i= 0;i < n;i++){
//			for(int j = 0;j < n;j++){
//				System.out.print(dp[i][j]);
//				
//			}System.out.println();
//		}


		int q = sc.nextInt();
		int k = sc.nextInt()-1;

		for(int i = 0;i <q;i++){
			int x = sc.nextInt()-1;
			int y = sc.nextInt()-1;

//			System.out.println(dp[x][k]);
//			System.out.println(dp[y][k]);

			System.out.println(dp[x][k]+dp[k][y]);
		}





	}
}
