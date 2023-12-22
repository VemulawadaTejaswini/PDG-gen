import java.util.LinkedList;
import java.util.Scanner;

class GraphDFS {
	private int totalVertex;
	private int [] discoverTime;
	private int [] finishTime;
	private int time=0;
	private LinkedList<LinkedList<Integer>> adjList;
	//adjacency list of edges
	public GraphDFS() { totalVertex = 0; }
	public void loadAdjList() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		discoverTime = new int[totalVertex];
		finishTime = new int[totalVertex];
		adjList = new LinkedList<LinkedList<Integer>>();
		for(int i = 0; i < totalVertex; i ++) {
			LinkedList<Integer> tmp = new LinkedList<Integer>();
			int idx1 = in.nextInt() - 1;
			int degree = in.nextInt();
			//System.out.println("mark idx1 = " + idx1 + " degree = " + degree);
			for(int j = 0; j < degree; j ++) {
				int idx2 = in.nextInt();
				tmp.add(idx2);
			}	
			adjList.add(tmp);
		}
		in.close();
	}
	public void runDFS(){
		for(int i=1; i<=totalVertex; i++) {
			if(discoverTime[i-1]==0)
				DFS(i);
		}
	}
	public void DFS(int v) {
		discoverTime[v-1] = ++time;
		LinkedList<Integer> neighbors = adjList.get(v-1);
	    for(int i = 0; i < neighbors.size(); i++) {
	        int v1 = neighbors.get(i);
	        if(discoverTime[v1-1] == 0) DFS(v1); //use recursion!
	    }
	    finishTime[v-1] = ++time;
	}
	
	public void printDFS(){
		for(int i=0; i<totalVertex; i++)
			System.out.println((i+1) + " " + discoverTime[i] + " " + finishTime[i]);
	}
}

public class Main {

	public static void main(String argv[]) {
		GraphDFS g = new GraphDFS();
		g.loadAdjList();
		g.runDFS();
		g.printDFS();
	}
}

