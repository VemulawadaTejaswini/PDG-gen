
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
	void BFS() {
		
		int currNode = 0;
		boolean[] visited = new boolean[totalVertex];
		LinkedList<Integer> queue = new LinkedList<Integer>(); 
        visited[currNode]=true; 
        queue.add(currNode); 
        int[] numSteps = new int[totalVertex];
    	int x = 0;
        
        while (queue.size() != 0) 
        { 	
            currNode = queue.poll(); 
            //System.out.print(currNode+" "); 
  
            Iterator<Integer> i = adjList.get(currNode).listIterator(); 
            while (i.hasNext()) 
            { 
                int n = i.next(); 
                if (!visited[n]) 
                { 
                    visited[n] = true; 
                    queue.add(n); 
                    numSteps[n] = numSteps[currNode] + 1;
                } 
            }
        }
        for(int i = 0; i < numSteps.length; i++) {
        	if(numSteps[i] == 0 && i != 0) System.out.println(i+1 + " " + -1);
        	else System.out.println(i+1 + " " + numSteps[i]);
        	
        }
		
	}
	
}


public class Main {
	public static void main(String args[]) {
		Graph g = new Graph();
		g.loadAdjList();
		g.BFS();
	}
}
