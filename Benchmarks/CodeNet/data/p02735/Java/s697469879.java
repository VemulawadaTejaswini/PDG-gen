
import java.util.Scanner;

public class Main {

	public static void main (String[] args)  {

		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int w = sc.nextInt();
		boolean[][] field = new boolean[h][w];
		int[][] dp = new int[h][w];
		
		for (int i=0;i<h;i++) {
			String s = sc.next();
			for (int j=0;j<w;j++) {
				field[i][j]=(s.charAt(j)=='.');
			}
		}
		dp[0][0]=0;
		for (int j=1;j<h;j++) {
			dp[0][j]=dp[0][j-1]+(field[0][j-1]^field[0][j] ? 1 : 0);
		}
		
		for (int i=1;i<h;i++) {
			dp[i][0]=dp[i-1][0]+(field[i-1][0]^field[i][0] ? 1 : 0);
			for (int j=1;j<h;j++) {
				dp[i][j]=Math.min(dp[i-1][j]+(field[i-1][j]^field[i][j] ? 1 : 0),
						dp[i][j-1]+(field[i][j-1]^field[i][j] ? 1 : 0));
			}
		}
		System.out.println((dp[h-1][w-1]+ (field[0][0] ? 0 : 1) + (field[h-1][w-1] ? 0 : 1 ))/2);

	}




}
