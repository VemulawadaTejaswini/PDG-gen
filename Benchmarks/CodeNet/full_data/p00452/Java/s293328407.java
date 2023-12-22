import java.util.Scanner;

//Darts
public class Main{

	void run(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if((n|m)==0)break;
			int[] p = new int[n];
			for(int i=0;i<n;i++)p[i]=sc.nextInt();
			int[][] dp = new int[4][n];
			int a = 0;
			for(int i=0;i<n;i++){
				dp[0][i]=p[i]>m?0:p[i];
				a = Math.max(a, dp[0][i]);
			}
			for(int i=1;i<4;i++){
				for(int j=0;j<n;j++){
					int x = 0;
					for(int k=0;k<n;k++){
						if(p[j]+dp[i-1][k]<=m)x=Math.max(x, p[j]+dp[i-1][k]);
					}
					dp[i][j] = x;
					a = Math.max(a, x);
				}
			}
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}