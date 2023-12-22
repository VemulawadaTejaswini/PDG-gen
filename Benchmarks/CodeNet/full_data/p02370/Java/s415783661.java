import java.io.*; 
import java.util.*; 
  
class Graph { 
    ArrayList<Integer> adjArr[];
  
    @SuppressWarnings("unchecked")
	Graph(int v) {
        adjArr = new ArrayList[v]; 
        for (int i=0; i < v; ++i) 
            adjArr[i] = new ArrayList<Integer>(); 
    } 
  
    // Add directed pair to graph
    void addToGraph(int id, int neighbor) { 
    	adjArr[id].add(neighbor); 
    	}
    
    // Topologically sorts adjacency list graph into a stack
    void topsort(int v, boolean visited[], Stack<Integer> stack) {  
        // Mark current as visited
    	visited[v] = true; 
        int i; 

        Iterator<Integer> it = adjArr[v].iterator(); 
        while (it.hasNext()) { 
            i = it.next(); 
            // Topsort through all unvisited adjacent vertices before adding to stack
            if (!visited[i]) 
                topsort(i, visited, stack); 
        } 
        stack.push(v); 
    }
}

public class Main {
  
    public static void main(String args[]) 
    { 
    	Scanner in = new  Scanner(System.in);

		int totalVertex = in.nextInt();
		Graph adj = new Graph(totalVertex);
		
		int totalConnections = in.nextInt();
		
		int id, neighbor;
		
		for (int i = 0; i < totalConnections; i++) {
			id = in.nextInt();
			neighbor = in.nextInt();
			adj.addToGraph(id, neighbor);
		}
		
		Stack<Integer> stack = new Stack<Integer>();
		
		boolean[] visited = new boolean[totalVertex];
		// Initialize visited array with false
		for(int i = 0; i < totalVertex; i++){
			visited[i] = false;
		}
		
		for(int i = 0; i < totalVertex; i++) {
			if(!visited[i]) {
				adj.topsort(i, visited, stack);
			}
		}
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
    }
}
