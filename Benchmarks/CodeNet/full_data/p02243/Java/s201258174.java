import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	static final int MAX = 10000;
	static final int INF = 1 << 21;
	static final int WHITE = 0;
	static final int GRAY = 1;
	static final int BLACK = 2;
	static int n;
	// 重み付き隣接リスト
	static  Map<Integer, List<int[]>> adj = new HashMap<Integer, List<int[]>>();
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		for(int i = 0; i < n; i++) {
			int u = scan.nextInt();
			int k = scan.nextInt();
			List<int[]> list = new ArrayList<int[]>();
			for(int j = 0; j < k; j++) {
				int v = scan.nextInt();
				int c = scan.nextInt();
				int []pair = {v, c};
				list.add(pair);
			}
			adj.put(u, list);
		}
		scan.close();
		dijkstra();
	}
	static void dijkstra() {
		Queue<int[]> pq =
				new PriorityQueue<int[]>(new MyComparator ());
		int[]color = new int[MAX];
		int[]d = new int[MAX];
		for(int i = 0; i < n; i++) {
			d[i] = INF;
			color[i] = WHITE;
		}
		d[0] = 0;
		int[]n0 = {0, 0};
		pq.add(n0);
		color[0] = 0;
		while(!pq.isEmpty()) {
			int[]f = pq.poll();
			int u = f[1];
			color[u] = BLACK;
			// 最小値を取り出し、それが最短でなければ無視
			if(d[u] < f[0]) continue;

			for(int j = 0; j < adj.get(u).size(); j++) {
				int[]t = adj.get(u).get(j);
				int v = t[0];
				if(color[v] == BLACK) continue;
				if(d[v] > d[u] + t[1]) {
					d[v] = d[u] + t[1];
					int[]p = {d[v], v};
					pq.add(p);
					color[v] = GRAY;
				}
			}
		}
		for(int i = 0; i < n; i++) {
			if(d[i] == INF) {
				System.out.println(i + " " + -1);
			}else {
				System.out.println(i + " " + d[i]);
			}
		}
	}
	static class MyComparator implements Comparator<int[]> {
	    @Override
	    public int compare (int[] arg0, int[] arg1) {
	        int x = arg0[0];
	        int y = arg1[0];

	        if (x < y) {
	            return -1;
	        } else if (x > y) {
	            return 1;
	        } else{
	            return 0;
	        }
	    }
	}
}
