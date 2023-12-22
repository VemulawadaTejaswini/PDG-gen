

import java.util.Scanner;

public class Main {
	public int n, w;
	public int[][] array;
	public int[][] dp;
	
	public static void main(String[] args){
		Main q2 = new Main();
		q2.solve();
	}
	
	public void solve(){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		w = sc.nextInt();
		array = new int[n][2];
		for(int i = 0;i < n;++i){
			int[] hoge = new int[2];
			hoge[0] = sc.nextInt();
			hoge[1] = sc.nextInt();
			array[i] = hoge;
		}
		dp = new int[n][w+1];
		System.out.println(calc(0, 0));
	}
	
	public int calc(int n, int w){
		if(n >= this.n) return 0;
		
		if(dp[n][w] > 0) return dp[n][w];
		
		if(w + array[n][1] > this.w){
			return dp[n][w] = calc(n+1, w);
		}else{
			return dp[n][w] = Math.max(calc(n+1, w+array[n][1]) + array[n][0], calc(n+1, w));
		}
	}
}