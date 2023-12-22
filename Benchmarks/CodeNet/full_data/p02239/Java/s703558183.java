import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Main {
static class Graph {
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
	public void printAdjMatrix() {
		Integer[][] adjMatrix = new Integer[totalVertex][totalVertex];
		//complete the following
	}
	public void BFS(int s) 
	{
		boolean visited[] = new boolean[totalVertex]; 
        Queue<Integer> toVisit = new LinkedList<Integer>(); 
        visited[s]=true; 
        toVisit.add(s); 
        int[] dist = new int[totalVertex];
        for(int i = 0;i<dist.length;i++) {
        	dist[i]=-1;
        }
        dist[s]=0;
        
        while (!toVisit.isEmpty()) 
        { 
            int u = toVisit.poll(); 
            LinkedList<Integer> n = adjList.get(u);
            for(int i = 0 ; i<n.size();i++) {
            	int v = adjList.get(u).get(i);
            	if (!visited[v]) 
                { 
                    visited[v] = true; 
                    toVisit.add(v); 
                    dist[v]=dist[u]+1;
                } 
            } 
            
   
        }
        for(int i=0;i<totalVertex;i++) {
        	System.out.println(i+1+" "+dist[i]);
        }
		
	}
}
	public static void main(String argv[]) {
		Graph g = new Graph();
		g.loadAdjList();
		//g.printAdjMatrix();
		g.BFS(0);
	}
	
}
