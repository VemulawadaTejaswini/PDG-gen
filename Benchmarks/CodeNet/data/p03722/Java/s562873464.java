import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://abc061.contest.atcoder.jp/tasks/abc061_d
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		Node[] nodeList = new Node[N];
		Edge[] edgeList = new Edge[M];
		for(int i=0; i<N; i++) nodeList[i] = new Node(i);
		for(int i=0; i<M; i++){
			Node a = nodeList[Integer.parseInt(sc.next())-1];
			Node b = nodeList[Integer.parseInt(sc.next())-1];
			long c = Long.parseLong(sc.next());
			edgeList[i] = new Edge(a,b,-c);
		}
		sc.close();
		
		long cost = getSingleSourceMinimumCostByBellmanFordMethod(edgeList, nodeList, nodeList[0], nodeList[N-1]);

		System.out.println(cost == Long.MIN_VALUE ? "inf" : -cost);
	}
	
	static long getSingleSourceMinimumCostByBellmanFordMethod(Edge[] edgeList, Node[] nodeList, Node start, Node end){
		for(Node n: nodeList){
			n.cost = n == start ? 0 : Long.MAX_VALUE;
		}
		for(int i=0; i<nodeList.length-1; i++){
			for(Edge e: edgeList){
				if(e.from.cost < Long.MAX_VALUE && e.to.cost > e.from.cost + e.cost){
					e.to.cost = e.from.cost + e.cost;
				}
			}
		}
		for(int i=0; i<nodeList.length; i++){
			for(Edge e: edgeList){
				if(e.from.cost < Long.MAX_VALUE && e.to.cost > e.from.cost + e.cost){
					if(e.to == end) return Long.MIN_VALUE;
				}
			}
		}
		return end.cost;	
	}
	
	static class Node{
		int id;
		Map<Node,Long> neighbor = new HashMap<>();
		int status = -1;
		long cost;
		Node(int id){
			this.id = id;
		}
	}
	
	static class Edge{
		Node to;
		Node from;
		long cost;
		Edge(Node from, Node to, long cost){
			this.to = to;
			this.from = from;
			this.cost = cost;
		}
	}

}