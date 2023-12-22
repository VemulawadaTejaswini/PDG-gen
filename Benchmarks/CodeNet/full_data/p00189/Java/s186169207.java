
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Scanner;

/**
 * AIZU 0189
 */
public class Main {
	int[][] costs;
	HashMap<Integer, ArrayList<Integer>> directMovableMap;
	int townNum;

	private Main(){
		Scanner in = new Scanner(System.in);
		while(true){
			int n = in.nextInt();

			if(n==0)
				break;
			int limitTownNum = n+1; // 道に対して最大の街の数
			this.townNum = 0;
			costs = new int[limitTownNum][limitTownNum];
			// コストの初期化
			for(int i=0; i<limitTownNum; i++){
				Arrays.fill(costs[i], -1); // 未訪問地点への移動コストは-1を入れておく.
			}
			for(int i=0; i<limitTownNum; i++){
				costs[i][i] = 0; // 同じところへの移動コストは0
			}

			directMovableMap = new HashMap<Integer,ArrayList<Integer>>();
			for(int i=0; i<limitTownNum; i++){
				directMovableMap.put(i,new ArrayList<Integer>());
			}

			for(int i=0; i<n; i++){
				int a = in.nextInt();
				int b = in.nextInt();
				int c = in.nextInt();

				ArrayList<Integer> tmp = directMovableMap.get(a);
				tmp.add(b);
				directMovableMap.put(a, tmp);

				tmp = directMovableMap.get(b);
				tmp.add(a);
				directMovableMap.put(b, tmp);

				costs[a][b] = c;
				costs[b][a] = c;
				if(b>=this.townNum){
					this.townNum = b+1;
				}
			}
			solve();
		}
		in.close();
	}


	private void solve() {
		// 各地点間の最短距離の計算
		for(int i=0; i<townNum; i++){
			for(int j=0; j<townNum; j++){
				if(i<j && costs[i][j]<0){
					costs[i][j] = calcCost(i,j);
				}
			}
		}

		// 各地点への距離の総和が最小になる地点の計算
		int minDist = Integer.MAX_VALUE;
		int minDistPoint = -1;
		for(int i=0; i<townNum; i++){
			int dist = 0;
			for(int j=0; j<townNum; j++){
				int p1 = (i<j)?i:j;
				int p2 = (i<j)?j:i;
				dist+=costs[p1][p2];
			}
			if(dist<minDist){
				minDist=dist;
				minDistPoint = i;
			}
		}
		System.out.println(minDistPoint+" "+minDist);
	}

	/**
	 * ダイクストラ法による最短コストを計算して返す
	 * @param i 始点
	 * @param j 終点
	 * @return
	 */
	private int calcCost(int i, int j) {
		if(i==j) return 0;
		int[] costs = new int[townNum]; // iからの移動コスト
		BitSet isVisit = new BitSet(townNum); // 訪問状態の管理フラグセット
		Arrays.fill(costs, Integer.MAX_VALUE);
		costs[i] = 0;

		ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
		queue.add(i);
		while(!queue.isEmpty()){
			int now = (int) queue.pop();
			if(!isVisit.get(now) && directMovableMap.containsKey(now)){
				for(int transit : directMovableMap.get(now)){
					int[] points = {now, transit};
					Arrays.sort(points); // 昇順
					if(costs[transit]>costs[now]+this.costs[points[1]][points[0]]){
						costs[transit] = costs[now]+this.costs[points[1]][points[0]];
					}
					queue.add(transit);
				}
				isVisit.set(now,true);
			}
		}
		return costs[j];
	}

	public static void main(String[] args) {
		new Main();
	}

}