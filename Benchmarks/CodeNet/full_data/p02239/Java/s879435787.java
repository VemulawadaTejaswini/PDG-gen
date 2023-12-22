import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Iterator;

class Graph {
	private int totalVertex;
	private LinkedList<LinkedList<Integer>> adjList;
	int[] discover;
	int[] finish;
	
	//adjacency list of edges
	public Graph() { 
			totalVertex = 0; 
		}
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
		
		for(int i = 0; i < adjMatrix.length; i++) {
			for(int j = 0; j < totalVertex ; j++) {
				adjMatrix[i][j] = 0;
			}
		}
		
		int z = 0;
		//int j = 0;
		
		for(LinkedList<Integer> ll: this.adjList) {
			for(Integer ele : ll) {
				adjMatrix[z][ele] = 1;
			}
			z++;
		}
		
		for(int m = 0; m < adjMatrix.length; m++) {
			for(int n = 0; n < totalVertex; n++) {
				if(n == totalVertex - 1) {
					System.out.println(adjMatrix[m][n]);
				}
				else {
					System.out.print(adjMatrix[m][n] + " ");
				}
				//System.out.print(adjMatrix[m][n] + " ");
			}
		}
	}
	
	public int DFS(int v, int time) {
	    
		if(discover[v] != 0) {
			return time;
		}
		else {
			discover[v] = time;
			for(Integer ele : this.adjList.get(v)) {
				time += 1;
				DFS(ele, time);
			}
			finish[v] = time;
		}
		
		return time;
	}
	
	public void BFS() {
		//int iter = 0;
		Queue<Integer> q = new LinkedList<>();
		q.add(0);
		int[] distances = new int[totalVertex];
		distances[0] = 0;
		for(int i = 1; i < distances.length; i++) {
			distances[i] = -1;
		}
		while(q.isEmpty() != true) {
			int u = q.remove();
			//System.out.println(u+1);
			//iter += 1;
			for(Integer ele : this.adjList.get(u)) {
				//System.out.println(u);
				if(distances[ele] == -1) {
					q.add(ele);
					distances[ele] = distances[u]+1;
				}
			}
		}
		
		for(int i = 0; i < distances.length; i++) {
			System.out.println(i + 1 + " " + distances[i]);
		}
	}
	
	public void searchGraph() {
		this.discover = new int[totalVertex];
		for(int i = 0; i < discover.length; i++) {
			discover[i] = 0;
		}
		this.finish = new int[totalVertex];
		for(int i = 0; i <finish.length; i++) {
			finish[i] = 0;
		}
		
		int dis_time = 1;
		
		for(LinkedList<Integer> ll: this.adjList) {
			for(Integer ele : ll) {
				DFS(ele, dis_time);
				dis_time++;
			}
		}
		
		
		for(int i = 1; i < totalVertex; i++) {
			System.out.println(i + " " + discover[i] + " " + finish[i]);
		}
	}
}

//change class name GraphRepresentation to Main() for submission to AIZU
class Main {
	public static void main(String argv[]) {
		Graph g = new Graph();
		g.loadAdjList();
		g.BFS();
		//g.printAdjMatrix();
		//g.searchGraph();
	}
}
