
import java.util.*;

public class Main {

	// data representation
	// int of vertices
	static int v;
	// the graph
	static int[][] graph;
	// int[] that's gonna represent the mst
	static int[] mst;
	// boolean of vertices that have been visited
	static boolean[] visited;
	
	
	public static void prim() {
		
		
		//pick a vertex
		mst[0] = 0;
		
		for(int i = 0; i < v; i++) {
			int u = minVertex();
			//set that this vertex has been visited
			visited[u] = true;
			
			// go through all the edges that is connected to and find the least cost
			// check that there is a connection ( no -1) and that it has not been visited yet
			// also check that the path is less costly than the one exisiting in MST now
			for(int j = 0; j < v; j++) {
				if(graph[u][j] != -1 && !visited[j] && graph[u][j] < mst[j] ){
					mst[j] = graph[u][j];
				}
			}
		}
		
		//now sum it all up and print it out
		int sum = 0;
		for(int i = 0; i < v; i++) {
			sum += mst[i];
		}
		System.out.println(sum);
		
	}
	
	public static int minVertex() {
		int min = 0;
		// the biggest a number can be is 2000
		int limit = 2001;
		
		for(int i = 0; i < v; i++) {
			if(visited[i] == false && mst[i] < limit) {
				limit = mst[i];
				min = i;
			}
		}
		
		return min;
	}
	
	public static void main(String[] args) {
		
		//Set up Scanner
		Scanner in = new Scanner(System.in);
		
		//First int is the number of vertices
		v = in.nextInt();
		
		//To represent graph given
		graph = new int[v][v];
		
		//fill in the graph with adjanceny matrix given
		for (int i = 0; i < v; i++) {
			for(int j = 0; j < v; j++) {
				graph[i][j] = in.nextInt();
			}
		}
		//close the scanner
		in.close();
		
		// initialize all vertices to say they have not been visited
		// initialize mst to infinity
		mst = new int[v];
		visited = new boolean[v];
		
		for(int i = 0; i < v; i++) {
			mst[i] = 9999999;
			visited[i] = false;
		}
				
		//call the algorithim here
		prim();
		

	}	
}

