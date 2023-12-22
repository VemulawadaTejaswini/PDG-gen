import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner sc = new Scanner(System.in);
	int n, k, s;
	int[][][] memo;
	public void run(){
		while(true){
			n = sc.nextInt();
			k = sc.nextInt();
			s = sc.nextInt();
			if(n==0 && k==0 && s==0) break;
			memo = new int[n+2][k+1][s+1];
			int ans = calc(n+1, 0, s);
			System.out.println(ans);
		}
	}
	public int calc(int nc, int kc, int sum){
		if(memo[nc][kc][sum] != 0) return memo[nc][kc][sum];
		
		int ans = 0;
		
		if(kc == k){
			if(sum == 0) {
				memo[nc][kc][sum] = 1;
				return 1;
			}
			else {
				memo[nc][kc][sum] = 0;
				return 0;
			}
		}
		else {
			for(int i = nc-1; i > 0; i--){
				if(sum-i >= 0) ans += calc(i, kc+1, sum-i);
			}
			memo[nc][kc][sum] = ans;
			return ans;
		}
	}
	
	public static void main(String[] args){
		new Main().run();
	}
	
}