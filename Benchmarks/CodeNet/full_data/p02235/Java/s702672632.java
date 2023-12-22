import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int q = scan.nextInt();
		
		for(int i = 0; i < q; i++) {
			char[] x = scan.next().toCharArray();
			char[] y = scan.next().toCharArray();
			int[][] dp = new int[x.length+1][y.length+1];
			
			for(int j = 0; j < x.length; j++) 
				for(int k = 0; k < y.length; k++) 
					if(x[j] == y[k]) {
						dp[j+1][k+1] = dp[j][k]+1;
					}else {
						dp[j+1][k+1] = Math.max(dp[j+1][k], dp[j][k+1]);
					}
			
			System.out.println(dp[x.length][y.length]);
		}
		scan.close();
	}
}
