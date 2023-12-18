import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://abc054.contest.atcoder.jp/tasks/abc054_d
 */
public class Main {

	static Drag[] drags;
	static int[][][] dp;
	static int SIZE = 400;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Ma = sc.nextInt();
		int Mb = sc.nextInt();
		drags = new Drag[N];
		for(int i=0; i<N; i++){
			drags[i] = new Drag(
				Integer.parseInt(sc.next()),
				Integer.parseInt(sc.next()),
				Integer.parseInt(sc.next())
			);
		}
		sc.close();
		dp = new int[drags.length][SIZE+1][SIZE+1];
		for(int i=0; i<N; i++){
			for(int a=0; a<=SIZE; a++){
				for(int b=0; b<=SIZE; b++){
					dp[i][a][b] = -1;
				}
			}
		}
		
		int ans = Integer.MAX_VALUE;
		for(int a=Ma; a<=400; a+=Ma){
			int b = (a/Ma)*Mb;
			if(b>400) break;
			ans = Math.min(ans, dfs(0,a,b));
		}
		System.out.println(ans>=Integer.MAX_VALUE/2 ? -1 : ans);
	}

	 
	static int dfs(int n, int a, int b) {
		if(a==0 && b==0){
			return 0;
		}else if(n==drags.length) {
			return Integer.MAX_VALUE/2;
		}else if (dp[n][a][b]>=0) {
			return dp[n][a][b];
		}
		int res;
		Drag d = drags[n];
		if(a-d.a<0 || b-d.b<0) {
			res = dfs(n+1, a, b);
		}else{
			res = Math.min(dfs(n+1, a, b), dfs(n+1, a-d.a, b-d.b)+d.c);
		}
		dp[n][a][b] = res;
		return res;
	}
	
	static String getKey(int n, int a, int b){
		return n+"."+a+"."+b;
	}
	
	static class Drag{
		int a;
		int b;
		int c;
		Drag(int a, int b, int c){
			this.a = a;
			this.b = b;
			this.c = c;
		}
	}

}
