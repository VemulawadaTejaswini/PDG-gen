import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

class Graph {
	private int totalVertex;
	private LinkedList<LinkedList<Integer>> adjList;
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
	
	public void BFS() { BFS(0);
	// yuh} 
	}
	
	public void BFS(int n) {
		
		boolean[] visited = new boolean[totalVertex];
		int[] distance = new int[totalVertex];
		int len = 0;
		int currParent = 0;
		
		
		LinkedList<Integer> queue = new LinkedList<Integer>();
		LinkedList<Integer> parent = new LinkedList<Integer>();
		
		
		visited[n] = true;
		queue.add(n);
		parent.add(n);

		
		while (queue.size() != 0) {
			
			n = queue.poll();
			int p = parent.poll();
			
			len = distance[n] + 1;
			
			//System.out.print("parent node: " + p + ", current parent: " + currParent + ", ");
			
			
			
			//System.out.print(n+" ");
				
			Iterator<Integer> iter = adjList.get(n).listIterator();
			while (iter.hasNext()) {
				int x = iter.next();
								
				if (!visited[x] || len < distance[x]) {
					visited[x] = true;
					distance[x] = len;
					
					queue.add(x);
					parent.add(n);
				}
			}
		}	
	
		for (int i = 0; i < totalVertex; i++) {
			if (i != 0 && distance[i] == 0) {
				distance[i] = -1;
			}
			System.out.println("" + (i + 1) + " " + distance[i]);
		}
	
	
	
	}
}






public class Main {

	
	
	
	public static void main(String[] args) {
		
		Graph g = new Graph();
		g.loadAdjList();
		g.BFS();
		
	}
	
	
}


