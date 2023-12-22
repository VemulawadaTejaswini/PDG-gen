import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

class Graph2 {
	private int totalVertex;
	private int totalEdge;
	private int[][] adjList;
	private int[] inDegree;
	private int[] outDegree;
	private LinkedList<Integer> pre = new LinkedList<Integer>();
	private int[] visited;
	private LinkedList<Integer> post = new LinkedList<Integer>();
	//adjacency list of edges
	public Graph2() { 
		totalVertex = 0; 
		totalEdge = 0; 
		adjList = null;
		inDegree = outDegree = null;
	}
	//given graph is in edge list
	public void loadEdgeList() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		totalEdge = in.nextInt();
		adjList = new int[totalVertex][totalVertex];
		outDegree = new int[totalVertex];
		inDegree = new int[totalVertex];
		for(int i = 0; i < totalVertex; i ++) outDegree[i] = inDegree[i] = 0;
		for(int i = 0; i < totalEdge; i ++) {
			int u = in.nextInt();
			int v = in.nextInt();
			adjList[u][outDegree[u]] = v;
			outDegree[u] ++;
			inDegree[v] ++;
		}
		in.close();
		visited = new int[totalVertex];
		for(int i = 0; i < totalVertex; i ++) {
			visited[i] = 0;
		}
	}
	public void DFS(int s) {
		pre.add(s); //ordering of the vertices based on when they are "discovered"
		visited[s] = 1;
		for(int i = 0; i < outDegree[s]; i ++) {
			int w = adjList[s][i]; 
			//if(!pre.contains(w)) { //using this won't pass the last test case (time exceeds)
			if(visited[w] == 0) {
				DFS(w);
			}
		}
		post.add(s); //ordering of the vertices after completion of DFS
	}
	public LinkedList<Integer> topSortDFS() {
		for(int i = 0; i < totalVertex; i ++) {
			if(inDegree[i] == 0) DFS(i);
		}	
		LinkedList<Integer> s = new LinkedList<Integer>();
		Iterator<Integer> it = post.iterator();
		while(it.hasNext()) {
			int u = it.next();
			s.add(0, u);
		}
		return s;
	}
	public LinkedList<Integer> topSortQueue() {
		LinkedList<Integer> q = new LinkedList<Integer>();
		LinkedList<Integer> s = new LinkedList<Integer>();
		int i;
		for(i = 0; i < totalVertex; i ++) {
			if(inDegree[i] == 0) q.add(i);
		}
		while(!q.isEmpty()) {
			int u = q.remove(0); //take the first one
			s.add(u);
			for(i = 0; i < outDegree[u]; i ++) {
				int v = adjList[u][i];
				inDegree[v] --; 
				if(inDegree[v] <= 0) {
					q.add(v);
				}
			}
		}
		return s;
	}	
}

public class Main {
	public static void main(String argv[]) {
		Graph2 g = new Graph2();
		g.loadEdgeList();
		LinkedList<Integer> s = g.topSortDFS();
		//LinkedList<Integer> s = g.topSortQueue();
		Iterator<Integer> it = s.iterator();
		while(it.hasNext()) System.out.println(it.next());
	}
}
