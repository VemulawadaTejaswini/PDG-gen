import java.util.Arrays;
import java.util.Scanner;

public class Main {
	int n, m;
	int[] coins;
	int[][][] dp;
	public static void main(String[] args){
		Main inst = new Main();
		inst.solve();
	}
	
	public void solve(){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		coins = new int[m];
		int[] temp = new int[m];
		dp = new int[m][n+1][n+1];
		for(int i = 0;i < m;++i){
			temp[i] = sc.nextInt();
		}
		Arrays.sort(temp);
		for(int i = 0;i < m;++i){
			coins[i] = temp[m - i - 1];
		}
		System.out.println(this.calc(0, 0, n));
	}
	
	public int calc(int step, int numCoin, int z){
		if(z == 0) return numCoin;
		if(step >= this.m){
			if(z == 0) return numCoin;
			return n;
		}
		
		if(dp[step][numCoin][z] > 0) return dp[step][numCoin][z];
		
		int fuga = Math.min(calc(step+1, numCoin + z/coins[step], z % coins[step]), calc(step+1, numCoin, z));
		dp[step][numCoin][z] = fuga;
		return fuga;
		
	}
}