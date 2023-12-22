import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			if(n == 0) break;
			
			boolean[][] jud = new boolean[n][31];
			for(int i=0; i<n; i++) {
				int f = sc.nextInt();
				while(f-- != 0) {
					jud[i][sc.nextInt()] = true;
				}
			}
			int[][] dp = new int[n][31];
			for(int i=0; i<n; i++) {
				dp[i][0] = 1<<i;
			}
			int z = -1;
			for(int j=1; j<=30; j++) {
				if(z != -1) break;
				for(int i=0; i<n; i++) {
					if(!jud[i][j]) {
						dp[i][j] = dp[i][j-1];
						continue;
					}
					for(int k=0; k<n; k++) {
						if(!jud[k][j]) continue;
						dp[i][j] = dp[k][j-1];
					}
					if(dp[i][j] == (1<<n)-1) {
						z = j;
						break;
					}
				}
			}
			System.out.println(z);
		}
	}
}
