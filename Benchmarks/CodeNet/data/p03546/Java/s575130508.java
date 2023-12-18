
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int[][] c = new int[10][10];
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				c[i][j] = sc.nextInt();
			}
		}

		int end=1;
		int[] d = new int[10];
		dijkstra(c,end,d);
//		for(int i=0;i<10;i++){
//			System.out.println(d[i]);
//		}
		int max=0;
		int[][] a = new int[H][W];
		for(int i=0;i<H;i++){
			for(int j=0;j<W;j++){
				a[i][j] = sc.nextInt();
				if(a[i][j]==-1) continue;
				dijkstra(c,a[i][j],d);
				max=max+d[1];
			}
		}
		System.out.println(max);

	}
	 public static void dijkstra(int[][] map,int src,int[] distance) {
			int nTown = distance.length;
			boolean[] fixed = new boolean[nTown]; // 最短距離が確定したかどうか
			for (int i=0; i<nTown; i++) { // 各都市について初期化する
			    distance[i] = Integer.MAX_VALUE; // 最短距離の初期値は無限遠
			    fixed[i] = false;	// 最短距離はまだ確定していない
			}
			distance[src] = 0;	// 出発地点までの距離を0とする
			while (true) {
			    // 未確定の中で最も近い都市を求める
			    int marked = minIndex(distance,fixed);
			    if (marked < 0) return; // 全都市が確定した場合
			    if (distance[marked]==Integer.MAX_VALUE) return; // 非連結グラフ
			    fixed[marked] = true; // その都市までの最短距離は確定となる
			    for (int j=0; j<nTown; j++) { // 隣の都市(i)について
				if (map[marked][j]>0 && !fixed[j]) { // 未確定ならば
				    // 旗の都市を経由した距離を求める
				    int newDistance = distance[marked]+map[marked][j];
				    // 今までの距離よりも小さければ、それを覚える
				    if (newDistance < distance[j]) distance[j] = newDistance;
				}
			    }
			}
		    }
		    // まだ距離が確定していない都市の中で、もっとも近いものを探す
		    static int minIndex(int[] distance,boolean[] fixed) {
			int idx=0;
			for (; idx<fixed.length; idx++)	// 未確定の都市をどれか一つ探す
			    if (!fixed[idx]) break;
			if (idx == fixed.length) return -1; // 未確定の都市が存在しなければ-1
			for (int i=idx+1; i<fixed.length; i++) // 距離が小さいものを探す
			    if (!fixed[i] && distance[i]<distance[idx]) idx=i;
			return idx;
		    }








}
