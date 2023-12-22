import java.util.Scanner;
public class Main {
    
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			while(sc.hasNext()) {
				int w = sc.nextInt();
				int h = sc.nextInt();
				if(w+h == 0) break;
				boolean[][] r = new boolean[h][w];
				int n = sc.nextInt();
				while(n-- != 0) {
					int a = sc.nextInt() - 1;
					int b = sc.nextInt() - 1;
					r[b][a] = true;
				}
				int[][] dp = new int[h][w];
				dp[0][0] = 1;
				for(int i=0; i<h; i++) {
					for(int j=0; j<w; j++) {
						if(r[i][j]) continue;
						if(i > 0) dp[i][j] += dp[i-1][j];
						if(j > 0) dp[i][j] += dp[i][j-1];
					}
				}
				System.out.println(dp[h-1][w-1]);
			}
		}
	}
}
