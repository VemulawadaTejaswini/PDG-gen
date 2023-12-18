
import java.util.Scanner;
public class Main {

	static int r;
	static int s;
	static int p;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		r = sc.nextInt();
		s = sc.nextInt();
		p = sc.nextInt();
		
		char []hand = sc.next().toCharArray();
		
		int [][]dp = new int [n+1][2];
		
		for(int i = 0 ; i < n ;i++) {
			if(i - k < 0) {
				dp[i][1] += jdg(hand[i]);
			}
			else {
				if(hand[i] != hand[i-k]) {
					dp[i][1] += jdg(hand[i]) + Math.max(dp[i-k][0], dp[i-k][1]);
				}
				else{
					dp[i][1] += dp[i-k][0] + jdg(hand[i]);
					dp[i][0] += dp[i-k][1];
				}
			}
		}
		
		
		int ans = 0;
		
		for(int i = 0 ; i < k ;i++) {
			ans += Math.max(dp[n-1-i][0], dp[n-1-i][1]);
		}
		
		System.out.println(ans);
		
	}
	static int jdg(char k) {
		if(k == 'r') {
			return p;
		}
		if(k == 's') {
			return r;
		}
			return s;
	}
		

}
