import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;
import java.util.Arrays; 

class GraphBFS {
	private int totalVertex;
	private LinkedList<LinkedList<Integer>> adjList;
	//adjacency list of edges
	public GraphBFS() { totalVertex = 0; }
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
				int idx2 = in.nextInt();
				tmp.add(idx2);
			}	
			adjList.add(tmp);
		}
		in.close();
	}
	
	public int[] BFS(int start){
		Queue<Integer> Q = new LinkedList<>();
		int [] Dist = new int [totalVertex];
		Arrays.fill(Dist, -1);
		Q.add(start);
		Dist[start-1] = 0;
		while(Q.size()>0){
			int v = Q.remove();
			Iterator<Integer> it = adjList.get(v-1).iterator();
		    while (it.hasNext()) {
		    	int tmp = it.next();
		    	if(Dist[tmp-1]==-1){
		    		Q.add(tmp);
		    		Dist[tmp-1] = Dist[v-1] + 1;
		    	}
		    }
		}
		return Dist;
	}
	public void printDist(int start){
		int[] Dist = BFS(start);
		for(int i=0; i<totalVertex; i++){
			System.out.println((i+1) + " " + Dist[i]);
		}
	}	
}


public class Main {

	public static void main(String argv[]) {
		GraphBFS g = new GraphBFS();
		g.loadAdjList();
		g.printDist(1);
	}
}
