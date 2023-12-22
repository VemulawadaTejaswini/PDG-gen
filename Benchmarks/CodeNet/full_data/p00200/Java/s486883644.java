import java.util.Arrays;
import java.util.Scanner;

public class Main {

	int m;				// 駅の数
	int[] station;	// 最小値保管配列
	
	// sからgまでtypeに関して最小値を生成する
	// 　ダイクストラアルゴリズム
	void Solve(int s, int g, int[][] type){
		station = new int[m+1];
		Arrays.fill(station, Integer.MAX_VALUE);
		boolean[] enter = new boolean[m+1];		// 頂点確定保管
		station[s] = 0;		// スタート地点からスタート地点まで0
		while(true){
			int idx = -1;		// 最小値のインデックス
			int min = Integer.MAX_VALUE;
			// 頂点確定の最小値探索
			for(int i=1;i<=m;i++){
				if(!enter[i] && station[i]<min){
					min = station[i];
					idx = i;
				}
			}
			// idxの更新がない、つまり次の頂点確定がない
			if(min==Integer.MAX_VALUE){
				break;
			}
			enter[idx] = true;		// 頂点確定
			if(enter[g]==true){		// ゴール頂点が確定
				break;
			}
			for(int i=1;i<=m;i++){
				// 遷移先が確定済みもしくは接続されていない
				if(enter[i]||type[idx][i]==Integer.MAX_VALUE){
					continue;
				}
				// 遷移先への値合計が最小値なら更新
				station[i] = Math.min(station[i], station[idx]+type[idx][i]);
			}
		}
	}
	
	void run(){
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		m = stdIn.nextInt();
		if((n|m)==0){
			return;
		}
		
		// init
		int[][] cost = new int[m+1][m+1];
		int[][] time = new int[m+1][m+1];
		for(int i=0;i<=m;i++){
			Arrays.fill(cost[i], Integer.MAX_VALUE);
			Arrays.fill(time[i], Integer.MAX_VALUE);
		}
		
		// input (line)
		for(int i=0;i<n;i++){
			int s = stdIn.nextInt();
			int g = stdIn.nextInt();
			cost[s][g] = stdIn.nextInt();
			cost[g][s] = cost[s][g];
			time[s][g] = stdIn.nextInt();
			time[g][s] = time[s][g];
		}
		
		// input (question)
		int k = stdIn.nextInt();
		for(int i=0;i<k;i++){
			int p = stdIn.nextInt();
			int q = stdIn.nextInt();
			int r = stdIn.nextInt();
			if(r<1){
				Solve(p,q,cost);
			}
			else{
				Solve(p,q,time);
			}
			System.out.println(station[q]);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}