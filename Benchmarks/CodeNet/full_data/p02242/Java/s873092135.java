import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	static class Vertex implements Comparable <Vertex> {
		int id, d0;
		Vertex(int vertex, int d0){
			this.id = vertex;
			this.d0 = d0;
		}
//		public boolean equals(Object v) {
//			return this.id == ((Vertex)v).id;
//		}
		public int compareTo(Vertex v) {
			return this.d0 - v.d0;
		}
	}
	
	static int inf = 100000000;
	public static void main(String args[]){
		try(Scanner sc=new Scanner(System.in)){
			int n = sc.nextInt();  //頂点数
			int[] d = new int[n];  //始点からの距離
			Arrays.fill(d, inf);
			d[0] = 0;
			int[][] length=new int[n][n];//各頂点ごとの距離
			for(int i=0; i<n; i++) {
				int u=sc.nextInt();
				int k=sc.nextInt();
				for(int j=0; j<k; j++){
					int v=sc.nextInt();
					int c=sc.nextInt();
					length[u][v]=c;
				}
			}
			PriorityQueue<Vertex> pq = new PriorityQueue<Vertex>();
			Vertex[] vs = new Vertex[n];
			for(int i=0; i<n; i++) {
				vs[i] = new Vertex(i, d[i]);
				pq.add(vs[i]);
			}
			Map<Integer, Integer> prev=new HashMap<>();
			prev.put(0, 0);
			while(!pq.isEmpty()) { 
				Vertex u = pq.remove();
				if(prev.containsKey(u.id)) {
					int keymin=Math.min(prev.get(u.id), u.d0);
					prev.remove(u.id);
					prev.put(u.id, keymin);
				}
				else {
					prev.put(u.id, u.d0);
				}//mapに小さい値のみいれる
				for(Vertex v: vs) {//vs要素をやっていく
					int alt =  d[u.id]+length[u.id][v.id]; 
					if(length[u.id][v.id] > 0 && d[v.id] > alt) {
						//pq.remove(v);//ここで要素を削除
						d[v.id] = alt;
						pq.add(new Vertex(v.id, alt));
					}
				}
			}
			for(int i=0; i<n; i++) {
				System.out.println(i + " " + prev.get(i));
			}
		}
	}
} 
