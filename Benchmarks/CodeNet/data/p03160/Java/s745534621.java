import java.util.*;

public class Main {

	static int N;
	static int[] H;
	static int[] dp;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		H = new int[N+1];
		dp = new int[N];
		for(int i=0;i<N;i++){
			H[i] = sc.nextInt();
			dp[i] = -1;
		}
		sc.close();
		System.out.println(dfs(0));
	}
	// 今の場所からゴールまでの最小コストを返す
	static int dfs(int pos){
		// オーバーしていた場合は、十分大きいコストを返す
		if(pos>=N) return 99999999;
		// ゴールしていたらこれ以上のコストはかからないので0
		if(pos==N-1) return 0;
		// すでにdfs(pos)の結果を計算済みであればそれを返す
		if(dp[pos]!=-1) return dp[pos];
		// 途中であれば、1つ進む場合と2つ進む場合を比較し、
		// 今後の歩数が少なくて済む方を返す
		int step1 = dfs(pos+1) + Math.abs(H[pos+1]-H[pos]);
		int step2 = dfs(pos+2) + Math.abs(H[pos+2]-H[pos]);
		// 値を返す際に、dp配列に答えを保持する
		return dp[pos] = Math.min(step1, step2);
	}
}
