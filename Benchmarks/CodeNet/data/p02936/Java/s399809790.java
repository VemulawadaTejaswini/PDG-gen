
import java.util.*;




// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail


public class Main {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        Graph graph = new Graph(n);
        for(int i=0;i<n-1;i++) {
        	int a = in.nextInt();
        	int b = in.nextInt();
        	graph.add(a, b);
        }
        for(int i=0;i<q;i++) {
        	int k = in.nextInt();
        	int value = in.nextInt();
        	graph.dfs(k, value);
        }
        for(int i=0;i<n;i++) {
        	System.out.print(graph.A[i]+" ");
        }
        		
        
    }
            
        


    
    
   
}

class Graph{
	private int vertex;
	int[] A;
	LinkedList<Integer> list[];
	public Graph(int vertex) {
		this.vertex = vertex;
		this.list = new LinkedList[vertex];
		for(int i=0;i<vertex;i++) {
			list[i] = new LinkedList<>();
		}
		this.A = new int[vertex];
	}
	
	
	public void add(int a,int b) {
		list[a-1].add(b-1);
		
	}
	public void query(int k,int value,boolean[] visited) {
		if(visited[k]) {
			return;
		}
		visited[k] = true;
		A[k]+=value;
		ListIterator<Integer> itr = list[k].listIterator();
		while(itr.hasNext()) {
			int n = itr.next();
			if(!visited[n]) {
				query(n, value, visited);
			}
		}
		
	}
	public void dfs(int k,int value) {
		boolean[] visited = new boolean[vertex];
		A[k-1]+=value;
		visited[k-1] = true;
		ListIterator<Integer> itr = list[k-1].listIterator();
		while(itr.hasNext()) {
			int n = itr.next();
			query(n, value,visited);
		}
		
		
	}
	public void print() {
		for(int i=0;i<vertex;i++) {
			System.out.print(i+"-->");
			ListIterator<Integer> itr = list[i].listIterator();
			while(itr.hasNext()) {
				int n = itr.next();
				System.out.print(n+" ");
			}
			System.out.println();
		}
	}
	
	
	
}
