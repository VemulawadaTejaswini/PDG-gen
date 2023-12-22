import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//My friends are small
public class Main{

	int n, W, MOD = 1000000007;
	int[] w;
//	int[][] dp;
	Map<Integer, Integer>[][] mem;
	
	int get(int k, int rest, int min){
		if(rest<0)return 0;
		if(k<0)return rest<min?1:0;
		if(mem[k][rest].containsKey(min))return mem[k][rest].get(min);
//		if(dp[k][rest]!=-1)return dp[k][rest];
		int res = (get(k-1, rest, w[k])+get(k-1, rest-w[k], min))%MOD;
		mem[k][rest].put(min, res);
		return res;
//		return dp[k][rest] = (get(k-1, rest, w[k])+get(k-1, rest-w[k], min))%MOD;
	}
	
	@SuppressWarnings("unchecked")
	void run(){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); W = sc.nextInt();
		w = new int[n];
		for(int i=0;i<n;i++)w[i]=sc.nextInt();
		Arrays.sort(w);
//		dp = new int[n][W+1];
//		for(int[]a:dp)Arrays.fill(a, -1);
		mem = new Map[n][W+1];
		for(int i=0;i<n;i++)for(int j=0;j<=W;j++)mem[i][j]=new HashMap<Integer, Integer>();
		System.out.println(get(n-1, W, 1<<29));
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}