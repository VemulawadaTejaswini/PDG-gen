
import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char []n = sc.next().toCharArray();
		
		int m = n.length;
		
		int []a = new int [m+1];
		
		for(int i = 0 ; i < m ;i++) {
			a[i] = n[i] - '0';
		}

		int []dp = new int [m+1];
		dp[0] = 0;
		
		int cnt = 0;
		
		for(int i = 0 ; i < m ;i++) {
			if(cnt == 0) {
				if(a[i] >= 6) {
					dp[i+1] = dp[i] + (10 - a[i]);
					cnt = 1;
				}
				else {
					dp[i+1] = dp[i] + a[i];
				}
			}
			else {
				if(a[i] >= 6) {
					dp[i+1] = dp[i] + (9 - a[i]);
				}
				else {
					dp[i+1] = dp[i] + a[i];
					dp[i+1] += cnt;
					cnt = 0;
				}
			}
		}
		dp[m] += cnt;
		System.out.println(dp[m]);
	}

}
