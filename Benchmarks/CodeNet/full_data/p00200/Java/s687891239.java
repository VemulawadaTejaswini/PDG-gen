
import java.util.Scanner;

public class Main{
	int n,m,k;
	Edge edge[];
	int d[];
	int V,E;
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().run();
	}
	
	void run(){
		Scanner sc=new Scanner(System.in);
		while(true){
			E=sc.nextInt();
			V=sc.nextInt();
			if(E+V==0)break;
			edge=new Edge[E*2];
			d=new int[V];

			for(int i=0;i<E;i++){
				int a=sc.nextInt()-1;
				int b=sc.nextInt()-1;
				int cost=sc.nextInt();
				int time=sc.nextInt();
				edge[i*2]=new Edge(a,b,cost,time);
				edge[i*2+1]=new Edge(b,a,cost,time);
			}
			k=sc.nextInt();

			for(int i=0;i<k;i++){
				int p=sc.nextInt()-1;
				int q=sc.nextInt()-1;
				int r=sc.nextInt();
				solve(p,q,r);
			}
		}
	}
	int INF=Integer.MAX_VALUE;
	
	void solve(int p,int q,int r){
		for(int i=0;i<V;i++)d[i]=INF;
		d[p]=0;
		while(true){
			boolean update=false;
			for(int i=0;i<E*2;i++){
				Edge e=edge[i];
				if(r==0){
					if(d[e.from]!=INF&&d[e.to]>d[e.from]+e.cost){
						d[e.to]=d[e.from]+e.cost;
						update=true;
					}
				}else{
					if(d[e.from]!=INF&&d[e.to]>d[e.from]+e.time){
						d[e.to]=d[e.from]+e.time;
						update=true;
					}
				}
			}
			if(!update)break;
		}
		System.out.println(d[q]);
	}
	
	class Edge{
		int from,to,cost,time;
		
		Edge(int f,int t1,int c,int t2){
			from=f;to=t1;cost=c;time=t2;
		}
	}
}