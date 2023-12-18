import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		int ar1 = 0,ar2=0;
		Graph g = new Graph(n);
		
		for(int i=0;i<m;i++) {
			ar1= in.nextInt();
			ar2= in.nextInt();
			g.addEdge(ar1-1,ar2-1);
		}
		
		System.out.println(g.getAns());
	}
}

class Graph{
	int N;
	ArrayList<Integer>[] listy;
	private boolean[] visited;
	private int[] val;
	Graph(int n){
		N=n;
		val = new int[n];
		visited = new boolean[n];
		listy = new ArrayList[n];
		for(int i=0;i<n;i++) {
			listy[i] = new ArrayList<Integer>();
		}
	}
	public int getAns() {
		for(int i=0;i<N;i++) {
			if(visited[i]!=true) {
				int x = DFS(i);
				val[i]=x;
			}
		}
		int maxy=-1;
		for(int i=0;i<N;i++) {
			maxy= Math.max(maxy,val[i]);
		}
		return maxy-1;
				
	}
	private int DFS(int i) {
		visited[i] = true;
		
		Iterator<Integer> x = listy[i].listIterator();
		int maxy=0;
		while(x.hasNext()) {
			int j = x.next();
//			System.out.println("Parent: " + (i+1) + " Son: "+(j+1));

			if(visited[j]!=true) {
				int cu = DFS(j);
				val[j] =cu;
			}
//			System.out.println("Value for "+ (j+1) + " is "+val[j]);
			maxy = Math.max(maxy, val[j]);
		}
		return maxy+1;
	}
	
	public void addEdge(int ar1, int ar2) {
		listy[ar1].add(ar2);
	}
}