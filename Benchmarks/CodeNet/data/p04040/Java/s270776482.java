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
			
			long[] dp = new long[w+1];
			dp[1] = 1;
			
			for(int i = 1; i<=h; i++){
				int jStart = 1;
				if(i >= a){
					jStart = b+1;
					dp[jStart - 1] = 0;
				}
				for(int j = jStart; j<=w; j++){
					dp[j] = (dp[j] + dp[j-1]) % 1000000007;
				}
			}
			
			System.out.println(dp[w]);
		}
	}
}
