import static java.lang.System.in;
import static java.lang.System.out;
import static java.lang.Math.*;
import java.util.*;


public class Aizu2021 {

	public static Scanner sc=new Scanner(in);
	
	static class Node{
		int id;
		int fp;
		boolean isC;
		List<Edge> link=new ArrayList<Edge>();
		
		Node(int _id,int _fp,boolean _isC){
			id=_id;
			fp=_fp;
			isC=_isC;
		}
	}
	
	static class Edge{
		Node f,t;
		int cost;
		Edge(Node _f,Node _t,int _cost){
			f=_f;t=_t;cost=_cost;
		}
	}
	
	static class Task implements Comparable<Task>{
		Node node;
		int time;
		Task(Node _node,int _time){
			node=_node;time=_time;
		}
		public int compareTo(Task arg0){
			return time-arg0.time;
		}
	}
	
	public static int[][] dijkstra(Node[][] graph,int s){
		int n=graph.length,M=graph[0].length-1;
		PriorityQueue<Task> que=new PriorityQueue<Task>();
		int[][] d=new int[n][M+1];
		for(int i=0;i<n;i++)
			Arrays.fill(d[i],1<<30);
		que.offer(new Task(graph[s][M],0));
		d[s][M]=0;
		while(!que.isEmpty()){
			Task di=que.poll();
			if(d[di.node.id][di.node.fp]<di.time)continue;
			for(Edge edge:di.node.link){
				if(d[edge.t.id][edge.t.fp]>d[di.node.id][di.node.fp]+edge.cost){
					d[edge.t.id][edge.t.fp]=d[di.node.id][di.node.fp]+edge.cost;
					que.offer(new Task(edge.t,d[di.node.id][di.node.fp]));
					
					//prev[edge.to]=di.id;
				}
			}
		}
		return d;
	}
	
	public void run(){
		while(true){
			int n=sc.nextInt(),m=sc.nextInt(),l=sc.nextInt(),
					k=sc.nextInt(),s=sc.nextInt(),e=sc.nextInt();
			if(n==0)return;
			
			boolean[] ccity=new boolean[n];
			for(int i=0;i<l;i++){
				int v=sc.nextInt();
				ccity[v]=true;
			}
			Node[][] nodes=new Node[n][m+1];
			for(int i=0;i<n;i++)for(int j=0;j<=m;j++)
				nodes[i][j]=new Node(i,j,ccity[i]);
			
			//normal link
			for(int i=0;i<k;i++){
				int x=sc.nextInt(),y=sc.nextInt(),t=sc.nextInt();
				for(int j=0;j<=m;j++){
					if(0<=j-t && j-t <=m){
						nodes[x][j].link.add(
								new Edge(nodes[x][j],nodes[y][j-t],t));
						nodes[y][j].link.add(
								new Edge(nodes[y][j],nodes[x][j-t],t));
					}
				}
			}
			
			//fp link
			for(int i=0;i<n;i++)if(ccity[i]){
				//link
				for(int j=0;j<m;j++){
					nodes[i][j].link.add(new Edge(nodes[i][j],nodes[i][j+1],1));
				}
			}

			int[][] dist=dijkstra(nodes,s);
			int res=Integer.MAX_VALUE;
			for(int i=0;i<=m;i++){
				res=min(res,dist[e][i]);
			}
			if(res==1<<30)
				ln("Help!");
			else
				ln(res);
		}
		
	}
	
	public static void main(String[] args) {
		new Aizu2021().run();
	}
	
	//output lib
	public static void ln(){
		out.println();
	}
	public static void pr(Object obj){
		out.print(str(obj));
	}
	public static void ln(Object obj){
		pr(obj);ln();
	}
	public static String str(Object obj){
		return obj.toString();
	}
	public static <E> String str(E[] obj){
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<obj.length;i++){
			sb.append(i==0?"":" ").append(obj[i]);
		}
		return sb.toString();
	}
	public static <E> String str(List<E> obj){
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<obj.size();i++){
			sb.append(i==0?"":" ").append(obj.get(i));
		}
		return sb.toString();
	}


}