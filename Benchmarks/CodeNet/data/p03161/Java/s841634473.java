import java.util.*;
public class Main {
	private static int h[];
	private static int dp[][];

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int k = sc.nextInt();
        h = new int[n];
        dp = new int[n][k+1];

        for (int i = 0; i < n; i++) {
        	h[i] = sc.nextInt();
        }

		// 40 10 20 70 80 10 20 70 80 60
		dp[0][0] = 0;
		dp[1][0] = Math.abs(h[0] - h[1]);	//30
		dp[1][1] = Math.abs(h[0] - h[1]);	//30
		for (int i=2; i < n; i++) {
			for (int j=1;j <k+1;j++){
				if (i-j-1>=0) {
					dp[i][j]=aaaa(i,j);
                    if (j==1){
                      dp[i][0]=dp[i][j];
                    } else {
					dp[i][0]=Math.min(dp[i][0],dp[i][j]);
                    }
				}
			}
		}
		System.out.println(dp[n-1][0]);
	}

	private static int aaaa(int i, int j) {
		int a = Math.abs(h[i] - h[i-j]); //i = 2  50
		int b = Math.abs(h[i] - h[i-j-1]); //     30
		return Math.min(dp[i-2][0] + b, dp[i-1][0] + a);
	}
}

