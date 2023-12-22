
//template code, C343, 2019
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
	
	public void BFS(int vertex) {
        boolean visited[] = new boolean[totalVertex];
        int distance = 0;
        int[] dist = new int[totalVertex];
        
        LinkedList<Integer> queue = new LinkedList<Integer>(); 
        
        visited[vertex]=true; 
        queue.add(vertex); 
        dist[vertex] = distance;
        
        while (queue.size() != 0) { 
            vertex = queue.poll(); 
             
            
            
            Iterator<Integer> i = adjList.get(vertex).listIterator(); 
            while (i.hasNext()) { 
                int n = i.next(); 
                if (!visited[n]) { 
                    visited[n] = true;
                    dist[n] = dist[vertex] + 1;
                    queue.add(n); 
                } 
            }
        }
        
        for (int i = 0; i < dist.length; i++) {	
        	if (visited[i] == false) {
        		System.out.print((i + 1) + " " + -1 + "\n");
        	} else {
        		System.out.print((i + 1) + " " + dist[i] + "\n");
        	}
        }
	}
	
}

//change class name GraphRepresentation to Main() for submission to AIZU
public class Main {
	public static void main(String argv[]) {
		Graph g = new Graph();
		g.loadAdjList();
		
//		g.printAdjMatrix();
		g.BFS(0);
	}
}

