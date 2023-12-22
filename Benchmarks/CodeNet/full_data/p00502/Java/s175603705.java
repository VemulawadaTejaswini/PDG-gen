import java.util.Scanner;

public class Main{


	public static void main(String args[]){

		Scanner s=new Scanner(System.in);

		int d = s.nextInt();
		int n = s.nextInt();

		int[] temp  = new int[d];	//気温
		int[] a = new int[n];		//気温の範囲
		int[] b = new int[n];
		int[] c = new int[n];		//派手さ

		for(int i=0; i<d; i++) {
			temp[i] = s.nextInt();
		}

		for(int i=0; i<n; i++) {
			a[i] = s.nextInt();
			b[i] = s.nextInt();
			c[i] = s.nextInt();
		}

		int[][] dp = new int[d][n];	//初期化
		for(int i=0; i<d; i++) {
			for(int j=0; j<n; j++) {
				dp[i][j] = -1;
			}
		}

		//初日に着れる服
		for(int i=0; i<n; i++) {
			if(a[i] <= temp[0] && b[i] >= temp[0]) dp[0][i]=0;
		}


		for(int i=1; i<d; i++) {
			for(int j=0; j<n; j++) {

				if(a[j]<= temp[i] && b[j] >= temp[i]) {	//着る服
					for(int k=0; k<n; k++) {
						if(dp[i-1][k]<0)continue;		//前日に着た服かどうか
						dp[i][j] = Math.max(dp[i][j], dp[i-1][k]+Math.abs(c[j]-c[k]));	//前日どの服のときが一番最大か
					}
				}
			}
		}

		int ans = 0;
        for (int i = 0; i < n; ++i) {
            ans = Math.max(ans, dp[d - 1][i]);
        }
        System.out.println(ans);
	}
}

