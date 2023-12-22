//template code, C343, 2019
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.*;
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
	
	
	
	public void printDistance() {
		int[] distTo = new int[totalVertex];
		distTo[0]=0;
		for(int i=1; i<totalVertex;i++) {
			distTo[i]=-1;
		}
		LinkedList<Integer> q = new LinkedList<Integer>();
		q.add(0);
		ArrayList<Integer> seen = new ArrayList<>();
		seen.add(0);
		
		int incrementTimer=1;
		while(q.peek()!=null) {
			
			int cur=q.poll();
			for(int i =0; i<adjList.get(cur).size();i++) {
				
				if(!seen.contains(adjList.get(cur).get(i))){
					distTo[adjList.get(cur).get(i)]=distTo[cur]+1;
					seen.add(adjList.get(cur).get(i));
					q.add(adjList.get(cur).get(i));
				}
			}
		}
		
		for(int i=0; i<totalVertex;i++) {
			System.out.print((i+1)+" "+distTo[i]);
			if(i!=totalVertex) {
				System.out.println();
			}
		}
		
	}
	
	
	public void printAdjMatrix() {
		Integer[][] adjMatrix = new Integer[totalVertex][totalVertex];
		//complete the following
		
		
	}
}

//change class name GraphRepresentation to Main() for submission to AIZU
public class Main {
	public static void main(String argv[]) {
		Graph g = new Graph();
		g.loadAdjList();
		g.printDistance();
	}
}
