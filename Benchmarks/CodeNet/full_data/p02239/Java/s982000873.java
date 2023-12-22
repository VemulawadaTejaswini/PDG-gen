
import java.util.*;

public class Main {
	public static void main(String argv[]) {
		Graph g = new Graph();
		g.loadAdjList();
		for (int i = 0; i < g.adjList.size(); i++) {
			g.bfs(i);
		}
	}
}
//template code, C343, 2019


class Graph {
	private int totalVertex;
	LinkedList<LinkedList<Integer>> adjList;
	//adjacency list of edges
	public Graph() { totalVertex = 0; }
	public void loadAdjList() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		adjList = new LinkedList<LinkedList<Integer>>();
		for(int i = 0; i < totalVertex; i ++) {
			LinkedList<Integer> tmp = new LinkedList<Integer>();
			int idx1 = in.nextInt() - 1;
			int degree = in.nextInt();
			//System.out.println("mark idx1 = " + idx1 + " degree = " + degree);
			for(int j = 0; j < degree; j ++) {
				int idx2 = in.nextInt() - 1;
				tmp.add(idx2);
			}	
			adjList.add(tmp);
		}
		in.close();
	}
	
	public void bfs(int tgtIndex) {
		boolean[] visited = new boolean[adjList.size()];
		
		Queue<Integer> q = new LinkedList<>(); 
		q.add(0);
		
		int[] distances = new int[visited.length];
		
		int ct = 0;
		while (q.isEmpty() == false) {
			int tgt = q.remove();
			if (visited[tgt]) {
				continue;
			}
			
			if(tgt == tgtIndex) {
				System.out.println((tgtIndex + 1)+" "+distances[tgt]);
				return;
			}
			visited[tgt] = true;
			
			
			LinkedList<Integer> tgtList = adjList.get(tgt);
			for (int i = 0; i < tgtList.size(); i++) {
				int newitm = tgtList.get(i);
				
				if (visited[newitm] == false) {
					if (distances[newitm] > 0) {
						distances[newitm] = Integer.min(distances[newitm], distances[tgt] + 1);
					}else {

						distances[newitm] = distances[tgt] + 1;
					}
					q.add(newitm);
				}
				
				if (newitm == tgtIndex) {
					//we have the target and are done
					System.out.println((tgtIndex + 1)+" "+distances[newitm]);
					return;
				}
				
			}
			
		}
		System.out.println((tgtIndex + 1)+" "+-1);
		
	}
}


