import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	static int N, M;
	static int[] link, size;
	
	static class H implements Comparable<H>{
		int land, time;
		H(int land, int time){
			this.land=land;
			this.time=time;
		}
		public int compareTo(H s) {
			return s.time-this.time;//消える時間降順
		}
	}
	
	static class Edge implements Comparable<Edge>{
		int u, v, cost;
		Edge(int u, int v, int cost){
			this.u=u;
			this.v=v;
			this.cost=cost;
		}
		public int compareTo(Edge e){
			return this.cost-e.cost;
		}//辺の重さ昇順
	}
	
	static void init() {
		for(int i=0; i<N; i++) {
			link[i]=i;
			size[i]=1;
		}
	}
	static int find(int x) {
		while(x!=link[x]) x=link[x];
		return x;
	}
	static boolean same(int a, int b) {
		return find(a)==find(b);
	}
	static void unite(int a, int b) {
		a=find(a);
		b=find(b);
		if(size[a]<size[b]) {
			int k=a;
			a=b;
			b=k;
		}
		size[a]+=size[b];
		link[b]=a;
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				N=sc.nextInt();
				M=sc.nextInt();
				if(N+M==0) break;
				link=new int[N+1];
				size=new int[N+1];
				int[] ht=new int[N];
				H[] h=new H[N];
				Edge[] pq=new Edge[M];
				int[][] dis=new int[N+1][N+1];
				PriorityQueue<H> pq1=new PriorityQueue<>();
				for(int i=0; i<N; i++) {
					int time=sc.nextInt();
					ht[i]=time;
					h[i]=(new H(i, time));
				}
				for(int i=0; i<M; i++) {
					int a=sc.nextInt();
					int b=sc.nextInt();
					int c=sc.nextInt();
					pq[i]=(new Edge(a-1, b-1, c));
				}
				Arrays.sort(h);
				Arrays.sort(pq);
				init();
				int ans=0, count=0;
				for(int i=0; i<N; i++) {//時刻ごとに毎回minimum spanning tree
					int at=h[i].land;
					int now=h[i].time;
					if(i==N-1 || now!=h[i+1].time) {//次が同時に沈まないときそれまでのを処理しちゃう
						for(int j=0; j<M; j++) {
							int l=pq[j].u;
							int r=pq[j].v;
							if(ht[l]>=now && ht[r]>=now && !same(l, r)) {
								ans+=pq[j].cost;
								unite(l, r);
								//System.out.println(Arrays.toString(link));
								count++;
							}
						}
						if(count!=i) {//辺と(頂点-1)の数合わない＝やり直し
							count=0;
							ans=0;
							init();
						}
					}
				}
				System.out.println(ans);
			}

		}

	}
}
