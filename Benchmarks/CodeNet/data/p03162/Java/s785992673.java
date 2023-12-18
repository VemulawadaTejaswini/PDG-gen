import java.util.*;
public class Main {
   private static int p[][];
   private static int dp[][];
  public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();

        p = new int[n][3];
        dp = new int[n][3];

        for (int i = 0; i < n; i++) {
        for (int j = 0; j < 3; j++) {
          p[i][j] = sc.nextInt();
        }}

//3
//10 40 70
//20 50 80
//30 60 90
    	dp[0][0]=p[0][0];
    	dp[0][1]=p[0][1];
    	dp[0][2]=p[0][2];

    
		for (int i=1; i < n; i++) {
		for (int j=0; j < 3; j++) {
		for (int k=0; k < 3; k++) {
			if (j==k) continue;
			dp[i][k]=chmax(dp[i-1][j]+p[i][k],dp[i][k]);
		}}}
		System.out.println(chmax(chmax(dp[n-1][0],dp[n-1][1]),dp[n-1][2]));
	}

	private static int chmax(int i, int j) {
		return Math.max(i, j);
	}
}





