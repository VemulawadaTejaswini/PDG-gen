

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	int n, m;
	long[] coins;
	long[][] dp;
	public static void main(String[] args){
		Main inst = new Main();
		inst.solve();
	}
	
	public void solve(){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		coins = new long[m];
		long[] temp = new long[m];
		dp = new long[m][n+1];
		for(int i = 0;i < m;++i){
			temp[i] = sc.nextInt();
		}
		Arrays.sort(temp);
		for(int i = 0;i < m;++i){
			coins[i] = temp[m - i - 1];
		}
		System.out.println(this.calc(0, n));
	}
	
	//step?????????????????§?????????z????????£?????¨??????????°?????????°
	public long calc(int step, int z){
		if(step >= this.m-1){
			return z;
		}
		
		if(dp[step][z] > 0) return dp[step][z];
		
		long fuga = Math.min(calc(step+1, (int) (z % coins[step])) + (z/coins[step]), calc(step+1, z));
		dp[step][z] = fuga;
		return fuga;
		
	}
}