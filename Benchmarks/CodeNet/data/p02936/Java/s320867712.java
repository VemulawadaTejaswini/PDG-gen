
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
        graph.dfs();
        for(int i=0;i<q;i++) {
        	int k = in.nextInt();
        	int value = in.nextInt();
        	graph.addValue(k, value);
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
	LinkedList<Integer> children[];
	public Graph(int vertex) {
		this.vertex = vertex;
		this.list = new LinkedList[vertex];
		this.children = new LinkedList[vertex];
		for(int i=0;i<vertex;i++) {
			list[i] = new LinkedList<>();
			children[i] = new LinkedList<>();
		}
		this.A = new int[vertex];
	}
	
	
	public void add(int a,int b) {
		list[a-1].add(b-1);
		
	}
	public void dfs_util(int i,int n,boolean[] visited) {
		if(visited[n]) {
			return;
		}
		visited[n] = true;
		
		
		ListIterator<Integer> itr = list[n].listIterator();
		while(itr.hasNext()) {
			int s = itr.next();
			if(!visited[s]) {
				children[i].add(s);
				
				dfs_util(i,s,visited);
			}
		}
		
	}
	public void dfs() {
		boolean[] visited = new boolean[vertex];
		
		for(int i=0;i<vertex;i++) {
			ListIterator<Integer> itr = list[i].listIterator();
			while(itr.hasNext()) {
				int n = itr.next();
				children[i].add(n);
				dfs_util(i,n,visited);
			}
			
		}
		
		
		
	}
	public void addValue(int k,int value) {
		ListIterator<Integer> itr = children[k-1].listIterator();
		A[k-1]+=value;
		while(itr.hasNext()) {
			int n = itr.next();
			A[n]+=value;
		}
	}
	
	
	
}
