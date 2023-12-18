
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int s[] = new int[n];
		for(int i=0; i<n; i++) {
			s[i]=sc.nextInt();
		}
		int MAX = 10005;
		boolean dp[][] = new boolean[n+1][MAX];
		for(int i=0; i<n; i++) {
			for(int j=0; j<MAX; j++) {
				dp[i][j] = false;
			}
		}
		dp[0][0]=true;
		for(int i=0; i<n; i++) {
			for(int j=0; j<MAX; j++) {
				if(!dp[i][j]) continue;
				dp[i+1][j+s[i]] = true;
				dp[i+1][j] = true;
			}
		}
		int ans = 0;
		for(int i=0; i<MAX; i++) {
			if(dp[n][i] && i%10 != 0) {
				ans = i;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}
