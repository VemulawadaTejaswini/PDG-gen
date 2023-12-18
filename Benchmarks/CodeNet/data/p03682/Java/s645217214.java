import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	int N;
	int[]x;
	int[]y;
	int INF=Integer.MAX_VALUE/2;
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		x=new int[N];
		y=new int[N];
		Pair[] p1=new Pair[N];
		Pair[] p2=new Pair[N];
		
		ArrayList<Edge>[] list=new ArrayList[N];
		for(int i=0;i<N;i++){
			x[i]=sc.nextInt();
			y[i]=sc.nextInt();
			p1[i]=new Pair(i,x[i],y[i]);
			p2[i]=new Pair(i,y[i],x[i]);
			list[i]=new ArrayList<Edge>();
		}
		
		Arrays.sort(p1);
		Arrays.sort(p2);
		
		
		for(int i=0;i<N-1;i++){
				list[p1[i].id].add(new Edge(p1[i+1].id,p1[i+1].x-p1[i].x));
				list[p1[i+1].id].add(new Edge(p1[i].id,p1[i+1].x-p1[i].x));
				
				list[p2[i].id].add(new Edge(p2[i+1].id,p2[i+1].x-p2[i].x));
				list[p2[i+1].id].add(new Edge(p2[i].id,p2[i+1].x-p2[i].x));
		}
		
		//プリム法
		boolean[] used=new boolean[N];
		Queue<Edge> pq=new PriorityQueue<Edge>();
		pq.add(new Edge(0,0));
		int total=0;
		
		while(!pq.isEmpty()){
			Edge e=pq.poll();
			if(used[e.to]){
				continue;
			}
			used[e.to]=true;
			total+=e.cost;
			
			for(Edge e2: list[e.to]){
				pq.add(e2);
			}
		}
		System.out.println(total);
		
	}
	class Pair implements Comparable<Pair>{
		int id;
		int x;
		int y;
		
		Pair(int id,int x,int y){
			this.id=id;
			this.x=x;
			this.y=y;
		}
		
		@Override
		public int compareTo(Pair o){
			return this.x-o.x;
		}
	}
	
	class Edge implements Comparable<Edge>{
		int to;
		int cost;
		
		Edge(int to, int cost){
			this.to=to;
			this.cost=cost;
		}
		@Override
		public int compareTo(Edge e){
			return this.cost-e.cost;
		}
	}
}