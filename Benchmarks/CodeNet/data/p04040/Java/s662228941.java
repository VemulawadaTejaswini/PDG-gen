import java.io.InputStreamReader;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(new InputStreamReader(System.in))){
			int h = scan.nextInt();
			int w = scan.nextInt();
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			a = h - a + 1;
			
			long[][] dp = new long[h+1][w+1];
			dp[1][1] = 1;
			
			for(int i = 1; i<=h; i++){
				for(int j = 1; j<=w; j++){
					if((i >= a && j <=b) || (i == 1 && j == 1)){
						continue;
					}
					dp[i][j] = (dp[i-1][j] + dp[i][j-1]) % 1000000007;
				}
			}
			
			
			System.out.println(dp[h][w]);

		}
	}
}
