import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		Vertex[] graph=new Vertex[N+1];
		int[] distance=new int[N+1];
		int[] to=new int[N+1];	//頂点に入っていく矢印の数
		int[] ans=new int[N+1];
		for(int i=0; i<=N; i++) {
			graph[i]=new Vertex();
			distance[i]=0;
			to[i]=0;
			ans[i]=0;
		}
		for(int i=0; i<N+M-1; i++) {
			int graph_from=sc.nextInt();
			int graph_to=sc.nextInt();
			graph[graph_from].add(graph_to,1);
			to[graph_to]++;
			if(to[graph_to]==1) {
				ans[graph_to]=graph_from;		//確定候補は確定させておく（入ってくる矢印の数が1）
			}
			else if(to[graph_to]>1) {
				ans[graph_to]=0;		//入ってくる数が2以上なら実はまだ親が確定していないので、確定しないやつは確定権利を剥奪させる
			}
		}
		Queue<Integer> q=new LinkedList<Integer>();
		for(int i=0; i<=N; i++) {
			if(to[i]==0) {
				q.add(i);		//根の頂点をキューに追加する
			}
		}
		while(!q.isEmpty()) {
			int tansaku=q.poll();	//探索する頂点
			for(int i=0; i<graph[tansaku].size(); i++) {
				int mukau=graph[tansaku].getKey(i);	//どこに向かうかの情報を取得
				to[mukau]--;	//辺を調べたので 頂点の入ってくる数を減らす
				distance[mukau]=Math.max(distance[mukau], distance[tansaku]+1);		//最長を更新できるかを確認　できたらその矢印の出た頂点が親
				if(distance[mukau]==distance[tansaku]+1) {
					ans[mukau]=tansaku;	//最長を更新したら親を更新
				}
				if(to[mukau]==0) {	//入ってくる数が0ならキューに追加
					q.add(mukau);
				}
			}
		}
		for(int i=1; i<=N; i++) {
			System.out.println(ans[i]);
		}
		sc.close();
	}
	public static final class Pair<K, V> {		//powered by mikit
		public K key;
		public V value;
		public Pair(K key, V value) {
			this.key = key;
			this.value = value;
		}
		public static int getKey(Pair<Integer,Integer> a) {
			return a.key;
		}
	}
	public static class Vertex{		//今回は2つの頂点の矢印が向いている方のリストに矢印のソースが来る
		ArrayList <Pair<Integer,Integer>> rinsetu=new ArrayList<Pair<Integer,Integer>>();
		public void add(int V,int cost) {
			rinsetu.add(new Pair<Integer, Integer>(V,cost));
		}
		public int getKey(int i) {
			return Pair.getKey(rinsetu.get(i));	//Valueを取り出す
		}
		public int size() {		//次数（無向なら）　でていく数（有向なら）を返す
			return rinsetu.size();
		}
	}
}