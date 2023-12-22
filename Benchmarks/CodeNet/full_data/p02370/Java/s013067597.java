import java.io.*; 
import java.util.*; 
  
class Graph { 
	
    ArrayList<Integer> adjArr[];
  
	@SuppressWarnings("unchecked")
	Graph(int v) {
        adjArr = new ArrayList[v]; 
        for (int i=0; i <v; i++) 
            adjArr[i] = new ArrayList<Integer>(); 
    } 
  
 
    void addToGraph(int id, int neighbor) { 
    	adjArr[id].add(neighbor); 
    	}
    
 
    void topoSort(int v, boolean visited[], Stack<Integer> s) {  
      
    	visited[v] = true; 
        int i; 

        Iterator<Integer> next = adjArr[v].iterator(); 
        while (next.hasNext()) { 
            i = next.next(); 

            if (!visited[i]) 
            	topoSort(i, visited, s); 
        } 
        s.push(v); 
    }
}

public class Main{
  
    public static void main(String args[]) 
    { 
    	Scanner sc = new  Scanner(System.in);

		int totalVertex = sc.nextInt();
		Graph adj = new Graph(totalVertex);
		
		int total = sc.nextInt();
		
		int id;
		int neighbor;
		
		for (int j = 0; j < total; j++) {
			id = sc.nextInt();
			neighbor = sc.nextInt();
			adj.addToGraph(id, neighbor);
		}
		
		Stack<Integer> stack = new Stack<Integer>();
		
		boolean[] visited = new boolean[totalVertex];

		for(int k = 0; k < totalVertex; k++){
			visited[k] = false;
		}
		
		for(int l = 0; l < totalVertex; l++) {
			if(!visited[l]) {
				adj.topoSort(l, visited, stack);
			}
		}
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
    }
}
