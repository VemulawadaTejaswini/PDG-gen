import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hp = sc.nextInt(), n = sc.nextInt();
		int[][] array = new int[n][2];
		for(int i=0;i<n;i++) {
			array[i][0]=sc.nextInt();
			array[i][1]=sc.nextInt();
		}
		int[] dp = new int[hp+1];
		dp[0]=0;
		for(int i=1;i<=hp;i++) dp[i]=1000000000;
		for(int i=1;i<=hp;i++) {
			int min = 1000000000;
			for(int j=0;j<n;j++) {
				if(i-array[j][0]>=0) {
					if(dp[i-array[j][0]]+array[j][1]<min) {
						min = dp[i-array[j][0]]+array[j][1];
					}
				}
			}
			dp[i]=min;
		}
		System.out.println(dp[hp]);
	}
}