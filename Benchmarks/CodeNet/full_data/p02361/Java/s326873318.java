
import java.util.*;

class Main {
	static final int INF = Integer.Max_VALUE/2;
	public static final Comparator<Node> COMPARATOR = new Comp();
	
	private static class Comp implements Comparator<Node>{
		public int compare(Node x,Node y){
			if(x.d>y.d){
			return 1;
			}
			else if(x.d<y.d){
			return -1;
			}
			return 0;
		}
	}
	
	static class Node{
		int id;
		int d;
		Node(int id,int d){
			this.id = id;
			this.d = d;
		}
	}
	
	
	static class Edge{
		int to;
		int cost;
		Edge(int to,int cost){
			this.to = to;
			this.cost = cost;
		}
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int V = stdIn.nextInt();
		int E = stdIn.nextInt();
		int r = stdIn.nextInt();
		
		ArrayList<ArrayList<Edge>> graph = new ArrayList<ArrayList<Edge>>(); 
		for(int i=0;i<V;i++){
			graph.add(new ArrayList<Edge>());
		}
		
		for(int i=0;i<E;i++){
			int s = stdIn.nextInt();
			int t = stdIn.nextInt();
			int d = stdIn.nextInt();
			Edge edge = new Edge(t,d);
			ArrayList<Edge> list = graph.get(s);
			list.add(edge);
		}
		
		PriorityQueue<Node> queue = new PriorityQueue<Node>(10,COMPARATOR);
		int[] d = new int[V];
		Arrays.fill(d,INF);
		d[r] = 0;
		Node node = new Node(r,0); 
		queue.add(node);
		
		while(!queue.isEmpty()){
			Node x = queue.poll();
			if(d[x.id]<x.d)
				continue;
			ArrayList<Edge> list = graph.get(x.id);
			for(int i=0;i<list.size();i++){
				Edge y = list.get(i);
				if(d[x.id]+y.cost<d[y.to]){
					d[y.to] = d[x.id] + y.cost;
					Node node_ = new Node(y.to,d[y.to]);
					queue.add(node_);
				}
			}
		}
		for(int i=0;i<V;i++){
			if(d[i]==INF){
				System.out.println("INF");
			}
			else{
				System.out.println(d[i]);
			}
		}
	}
}